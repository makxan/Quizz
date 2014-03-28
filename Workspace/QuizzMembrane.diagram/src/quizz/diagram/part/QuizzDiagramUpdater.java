package quizz.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import quizz.Answer;
import quizz.DestinationTerminal;
import quizz.Endpoint;
import quizz.FreeText;
import quizz.MultipleChoice;
import quizz.Question;
import quizz.Quizz;
import quizz.QuizzPackage;
import quizz.Scorecounter;
import quizz.Startpoint;
import quizz.diagram.edit.parts.AnswerEditPart;
import quizz.diagram.edit.parts.EndpointEditPart;
import quizz.diagram.edit.parts.FreeTextEditPart;
import quizz.diagram.edit.parts.MultipleChoiceEditPart;
import quizz.diagram.edit.parts.QuestionNextEditPart;
import quizz.diagram.edit.parts.QuizzEditPart;
import quizz.diagram.edit.parts.ScorecounterEditPart;
import quizz.diagram.edit.parts.StartpointEditPart;
import quizz.diagram.edit.parts.StartpointNextEditPart;
import quizz.diagram.providers.QuizzElementTypes;

/**
 * @generated
 */
public class QuizzDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<QuizzNodeDescriptor> getSemanticChildren(View view) {
		switch (QuizzVisualIDRegistry.getVisualID(view)) {
		case QuizzEditPart.VISUAL_ID:
			return getQuizz_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzNodeDescriptor> getQuizz_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Quizz modelElement = (Quizz) view.getElement();
		LinkedList<QuizzNodeDescriptor> result = new LinkedList<QuizzNodeDescriptor>();
		for (Iterator<?> it = modelElement.getQuestions().iterator(); it
				.hasNext();) {
			Question childElement = (Question) it.next();
			int visualID = QuizzVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StartpointEditPart.VISUAL_ID) {
				result.add(new QuizzNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FreeTextEditPart.VISUAL_ID) {
				result.add(new QuizzNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Startpoint childElement = modelElement.getStart();
			int visualID = QuizzVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ScorecounterEditPart.VISUAL_ID) {
				result.add(new QuizzNodeDescriptor(childElement, visualID));
			}
		}
		{
			Endpoint childElement = modelElement.getEnd();
			int visualID = QuizzVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EndpointEditPart.VISUAL_ID) {
				result.add(new QuizzNodeDescriptor(childElement, visualID));
			}
		}
		{
			Scorecounter childElement = modelElement.getScore();
			int visualID = QuizzVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultipleChoiceEditPart.VISUAL_ID) {
				result.add(new QuizzNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getContainedLinks(View view) {
		switch (QuizzVisualIDRegistry.getVisualID(view)) {
		case QuizzEditPart.VISUAL_ID:
			return getQuizz_1000ContainedLinks(view);
		case StartpointEditPart.VISUAL_ID:
			return getMultipleChoice_2001ContainedLinks(view);
		case ScorecounterEditPart.VISUAL_ID:
			return getStartpoint_2002ContainedLinks(view);
		case EndpointEditPart.VISUAL_ID:
			return getEndpoint_2003ContainedLinks(view);
		case MultipleChoiceEditPart.VISUAL_ID:
			return getScorecounter_2004ContainedLinks(view);
		case FreeTextEditPart.VISUAL_ID:
			return getFreeText_2005ContainedLinks(view);
		case AnswerEditPart.VISUAL_ID:
			return getAnswer_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getIncomingLinks(View view) {
		switch (QuizzVisualIDRegistry.getVisualID(view)) {
		case StartpointEditPart.VISUAL_ID:
			return getMultipleChoice_2001IncomingLinks(view);
		case ScorecounterEditPart.VISUAL_ID:
			return getStartpoint_2002IncomingLinks(view);
		case EndpointEditPart.VISUAL_ID:
			return getEndpoint_2003IncomingLinks(view);
		case MultipleChoiceEditPart.VISUAL_ID:
			return getScorecounter_2004IncomingLinks(view);
		case FreeTextEditPart.VISUAL_ID:
			return getFreeText_2005IncomingLinks(view);
		case AnswerEditPart.VISUAL_ID:
			return getAnswer_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getOutgoingLinks(View view) {
		switch (QuizzVisualIDRegistry.getVisualID(view)) {
		case StartpointEditPart.VISUAL_ID:
			return getMultipleChoice_2001OutgoingLinks(view);
		case ScorecounterEditPart.VISUAL_ID:
			return getStartpoint_2002OutgoingLinks(view);
		case EndpointEditPart.VISUAL_ID:
			return getEndpoint_2003OutgoingLinks(view);
		case MultipleChoiceEditPart.VISUAL_ID:
			return getScorecounter_2004OutgoingLinks(view);
		case FreeTextEditPart.VISUAL_ID:
			return getFreeText_2005OutgoingLinks(view);
		case AnswerEditPart.VISUAL_ID:
			return getAnswer_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getQuizz_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getMultipleChoice_2001ContainedLinks(
			View view) {
		MultipleChoice modelElement = (MultipleChoice) view.getElement();
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Answer_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_Next_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getStartpoint_2002ContainedLinks(
			View view) {
		Startpoint modelElement = (Startpoint) view.getElement();
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Startpoint_Next_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getFreeText_2005ContainedLinks(
			View view) {
		FreeText modelElement = (FreeText) view.getElement();
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_Next_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getEndpoint_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getScorecounter_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getAnswer_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getMultipleChoice_2001IncomingLinks(
			View view) {
		MultipleChoice modelElement = (MultipleChoice) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Answer_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Question_Next_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Startpoint_Next_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getStartpoint_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getFreeText_2005IncomingLinks(
			View view) {
		FreeText modelElement = (FreeText) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Answer_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Question_Next_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Startpoint_Next_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getEndpoint_2003IncomingLinks(
			View view) {
		Endpoint modelElement = (Endpoint) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Answer_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Question_Next_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Startpoint_Next_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getScorecounter_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getAnswer_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getMultipleChoice_2001OutgoingLinks(
			View view) {
		MultipleChoice modelElement = (MultipleChoice) view.getElement();
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Answer_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_Next_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getStartpoint_2002OutgoingLinks(
			View view) {
		Startpoint modelElement = (Startpoint) view.getElement();
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Startpoint_Next_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getFreeText_2005OutgoingLinks(
			View view) {
		FreeText modelElement = (FreeText) view.getElement();
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Question_Next_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getEndpoint_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getScorecounter_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<QuizzLinkDescriptor> getAnswer_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<QuizzLinkDescriptor> getContainedTypeModelFacetLinks_Answer_4001(
			MultipleChoice container) {
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		for (Iterator<?> links = container.getAnswers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Answer) {
				continue;
			}
			Answer link = (Answer) linkObject;
			if (AnswerEditPart.VISUAL_ID != QuizzVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			DestinationTerminal dst = link.getNext();
			result.add(new QuizzLinkDescriptor(container, dst, link,
					QuizzElementTypes.Answer_4001, AnswerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuizzLinkDescriptor> getIncomingTypeModelFacetLinks_Answer_4001(
			DestinationTerminal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != QuizzPackage.eINSTANCE
					.getAnswer_Next()
					|| false == setting.getEObject() instanceof Answer) {
				continue;
			}
			Answer link = (Answer) setting.getEObject();
			if (AnswerEditPart.VISUAL_ID != QuizzVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof MultipleChoice) {
				continue;
			}
			MultipleChoice container = (MultipleChoice) link.eContainer();
			result.add(new QuizzLinkDescriptor(container, target, link,
					QuizzElementTypes.Answer_4001, AnswerEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuizzLinkDescriptor> getIncomingFeatureModelFacetLinks_Question_Next_4002(
			DestinationTerminal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == QuizzPackage.eINSTANCE
					.getQuestion_Next()) {
				result.add(new QuizzLinkDescriptor(setting.getEObject(),
						target, QuizzElementTypes.QuestionNext_4002,
						StartpointNextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuizzLinkDescriptor> getIncomingFeatureModelFacetLinks_Startpoint_Next_4003(
			DestinationTerminal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == QuizzPackage.eINSTANCE
					.getStartpoint_Next()) {
				result.add(new QuizzLinkDescriptor(setting.getEObject(),
						target, QuizzElementTypes.StartpointNext_4003,
						QuestionNextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuizzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Question_Next_4002(
			Question source) {
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		DestinationTerminal destination = source.getNext();
		if (destination == null) {
			return result;
		}
		result.add(new QuizzLinkDescriptor(source, destination,
				QuizzElementTypes.QuestionNext_4002,
				StartpointNextEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<QuizzLinkDescriptor> getOutgoingFeatureModelFacetLinks_Startpoint_Next_4003(
			Startpoint source) {
		LinkedList<QuizzLinkDescriptor> result = new LinkedList<QuizzLinkDescriptor>();
		DestinationTerminal destination = source.getNext();
		if (destination == null) {
			return result;
		}
		result.add(new QuizzLinkDescriptor(source, destination,
				QuizzElementTypes.StartpointNext_4003,
				QuestionNextEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<QuizzNodeDescriptor> getSemanticChildren(View view) {
			return QuizzDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<QuizzLinkDescriptor> getContainedLinks(View view) {
			return QuizzDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<QuizzLinkDescriptor> getIncomingLinks(View view) {
			return QuizzDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<QuizzLinkDescriptor> getOutgoingLinks(View view) {
			return QuizzDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
