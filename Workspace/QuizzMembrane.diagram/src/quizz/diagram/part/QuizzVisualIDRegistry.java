package quizz.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import quizz.Quizz;
import quizz.QuizzPackage;
import quizz.diagram.edit.parts.AnswerEditPart;
import quizz.diagram.edit.parts.EndpointEditPart;
import quizz.diagram.edit.parts.FreeTextEditPart;
import quizz.diagram.edit.parts.FreeTextTitleEditPart;
import quizz.diagram.edit.parts.MultipleChoiceEditPart;
import quizz.diagram.edit.parts.MultipleChoiceTitleEditPart;
import quizz.diagram.edit.parts.QuizzEditPart;
import quizz.diagram.edit.parts.ScorecounterEditPart;
import quizz.diagram.edit.parts.ScorecounterUsernameEditPart;
import quizz.diagram.edit.parts.StartpointEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class QuizzVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "QuizzMembrane.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (QuizzEditPart.MODEL_ID.equals(view.getType())) {
				return QuizzEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return quizz.diagram.part.QuizzVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				QuizzDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (QuizzPackage.eINSTANCE.getQuizz().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Quizz) domainElement)) {
			return QuizzEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = quizz.diagram.part.QuizzVisualIDRegistry
				.getModelID(containerView);
		if (!QuizzEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (QuizzEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = quizz.diagram.part.QuizzVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = QuizzEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case QuizzEditPart.VISUAL_ID:
			if (QuizzPackage.eINSTANCE.getMultipleChoice().isSuperTypeOf(
					domainElement.eClass())) {
				return StartpointEditPart.VISUAL_ID;
			}
			if (QuizzPackage.eINSTANCE.getStartpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return ScorecounterEditPart.VISUAL_ID;
			}
			if (QuizzPackage.eINSTANCE.getEndpoint().isSuperTypeOf(
					domainElement.eClass())) {
				return EndpointEditPart.VISUAL_ID;
			}
			if (QuizzPackage.eINSTANCE.getScorecounter().isSuperTypeOf(
					domainElement.eClass())) {
				return MultipleChoiceEditPart.VISUAL_ID;
			}
			if (QuizzPackage.eINSTANCE.getFreeText().isSuperTypeOf(
					domainElement.eClass())) {
				return FreeTextEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = quizz.diagram.part.QuizzVisualIDRegistry
				.getModelID(containerView);
		if (!QuizzEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (QuizzEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = quizz.diagram.part.QuizzVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = QuizzEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case QuizzEditPart.VISUAL_ID:
			if (StartpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScorecounterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndpointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultipleChoiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FreeTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StartpointEditPart.VISUAL_ID:
			if (MultipleChoiceTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultipleChoiceEditPart.VISUAL_ID:
			if (ScorecounterUsernameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FreeTextEditPart.VISUAL_ID:
			if (FreeTextTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (QuizzPackage.eINSTANCE.getAnswer().isSuperTypeOf(
				domainElement.eClass())) {
			return AnswerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Quizz element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case QuizzEditPart.VISUAL_ID:
			return false;
		case StartpointEditPart.VISUAL_ID:
		case ScorecounterEditPart.VISUAL_ID:
		case EndpointEditPart.VISUAL_ID:
		case MultipleChoiceEditPart.VISUAL_ID:
		case FreeTextEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return quizz.diagram.part.QuizzVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return quizz.diagram.part.QuizzVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return quizz.diagram.part.QuizzVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return quizz.diagram.part.QuizzVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return quizz.diagram.part.QuizzVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return quizz.diagram.part.QuizzVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
