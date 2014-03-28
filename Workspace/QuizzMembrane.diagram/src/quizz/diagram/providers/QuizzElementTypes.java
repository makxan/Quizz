package quizz.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import quizz.QuizzPackage;
import quizz.diagram.edit.parts.AnswerEditPart;
import quizz.diagram.edit.parts.EndpointEditPart;
import quizz.diagram.edit.parts.FreeTextEditPart;
import quizz.diagram.edit.parts.MultipleChoiceEditPart;
import quizz.diagram.edit.parts.QuestionNextEditPart;
import quizz.diagram.edit.parts.QuizzEditPart;
import quizz.diagram.edit.parts.ScorecounterEditPart;
import quizz.diagram.edit.parts.StartpointEditPart;
import quizz.diagram.edit.parts.StartpointNextEditPart;
import quizz.diagram.part.QuizzDiagramEditorPlugin;

/**
 * @generated
 */
public class QuizzElementTypes {

	/**
	 * @generated
	 */
	private QuizzElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Quizz_1000 = getElementType("QuizzMembrane.diagram.Quizz_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultipleChoice_2001 = getElementType("QuizzMembrane.diagram.MultipleChoice_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Startpoint_2002 = getElementType("QuizzMembrane.diagram.Startpoint_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FreeText_2005 = getElementType("QuizzMembrane.diagram.FreeText_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Endpoint_2003 = getElementType("QuizzMembrane.diagram.Endpoint_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Scorecounter_2004 = getElementType("QuizzMembrane.diagram.Scorecounter_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Answer_4001 = getElementType("QuizzMembrane.diagram.Answer_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType QuestionNext_4002 = getElementType("QuizzMembrane.diagram.QuestionNext_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StartpointNext_4003 = getElementType("QuizzMembrane.diagram.StartpointNext_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return QuizzDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Quizz_1000, QuizzPackage.eINSTANCE.getQuizz());

			elements.put(MultipleChoice_2001,
					QuizzPackage.eINSTANCE.getMultipleChoice());

			elements.put(Startpoint_2002,
					QuizzPackage.eINSTANCE.getStartpoint());

			elements.put(Endpoint_2003, QuizzPackage.eINSTANCE.getEndpoint());

			elements.put(Scorecounter_2004,
					QuizzPackage.eINSTANCE.getScorecounter());

			elements.put(FreeText_2005, QuizzPackage.eINSTANCE.getFreeText());

			elements.put(Answer_4001, QuizzPackage.eINSTANCE.getAnswer());

			elements.put(QuestionNext_4002,
					QuizzPackage.eINSTANCE.getQuestion_Next());

			elements.put(StartpointNext_4003,
					QuizzPackage.eINSTANCE.getStartpoint_Next());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Quizz_1000);
			KNOWN_ELEMENT_TYPES.add(MultipleChoice_2001);
			KNOWN_ELEMENT_TYPES.add(Startpoint_2002);
			KNOWN_ELEMENT_TYPES.add(Endpoint_2003);
			KNOWN_ELEMENT_TYPES.add(Scorecounter_2004);
			KNOWN_ELEMENT_TYPES.add(FreeText_2005);
			KNOWN_ELEMENT_TYPES.add(Answer_4001);
			KNOWN_ELEMENT_TYPES.add(QuestionNext_4002);
			KNOWN_ELEMENT_TYPES.add(StartpointNext_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case QuizzEditPart.VISUAL_ID:
			return Quizz_1000;
		case StartpointEditPart.VISUAL_ID:
			return MultipleChoice_2001;
		case ScorecounterEditPart.VISUAL_ID:
			return Startpoint_2002;
		case EndpointEditPart.VISUAL_ID:
			return Endpoint_2003;
		case MultipleChoiceEditPart.VISUAL_ID:
			return Scorecounter_2004;
		case FreeTextEditPart.VISUAL_ID:
			return FreeText_2005;
		case AnswerEditPart.VISUAL_ID:
			return Answer_4001;
		case StartpointNextEditPart.VISUAL_ID:
			return QuestionNext_4002;
		case QuestionNextEditPart.VISUAL_ID:
			return StartpointNext_4003;
		}
		return null;
	}

}
