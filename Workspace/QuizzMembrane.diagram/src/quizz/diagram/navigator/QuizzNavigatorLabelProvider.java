package quizz.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import quizz.Answer;
import quizz.Quizz;
import quizz.diagram.edit.parts.AnswerEditPart;
import quizz.diagram.edit.parts.EndpointEditPart;
import quizz.diagram.edit.parts.FreeTextEditPart;
import quizz.diagram.edit.parts.FreeTextTitleEditPart;
import quizz.diagram.edit.parts.MultipleChoiceEditPart;
import quizz.diagram.edit.parts.MultipleChoiceTitleEditPart;
import quizz.diagram.edit.parts.QuestionNextEditPart;
import quizz.diagram.edit.parts.QuizzEditPart;
import quizz.diagram.edit.parts.ScorecounterEditPart;
import quizz.diagram.edit.parts.ScorecounterUsernameEditPart;
import quizz.diagram.edit.parts.StartpointEditPart;
import quizz.diagram.edit.parts.StartpointNextEditPart;
import quizz.diagram.part.QuizzDiagramEditorPlugin;
import quizz.diagram.part.QuizzVisualIDRegistry;
import quizz.diagram.providers.QuizzElementTypes;
import quizz.diagram.providers.QuizzParserProvider;

/**
 * @generated
 */
public class QuizzNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		QuizzDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		QuizzDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof QuizzNavigatorItem
				&& !isOwnView(((QuizzNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof QuizzNavigatorGroup) {
			QuizzNavigatorGroup group = (QuizzNavigatorGroup) element;
			return QuizzDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof QuizzNavigatorItem) {
			QuizzNavigatorItem navigatorItem = (QuizzNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (QuizzVisualIDRegistry.getVisualID(view)) {
		case QuestionNextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://quizz/1.0?Startpoint?next", QuizzElementTypes.StartpointNext_4003); //$NON-NLS-1$
		case EndpointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://quizz/1.0?Endpoint", QuizzElementTypes.Endpoint_2003); //$NON-NLS-1$
		case StartpointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://quizz/1.0?MultipleChoice", QuizzElementTypes.MultipleChoice_2001); //$NON-NLS-1$
		case ScorecounterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://quizz/1.0?Startpoint", QuizzElementTypes.Startpoint_2002); //$NON-NLS-1$
		case MultipleChoiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://quizz/1.0?Scorecounter", QuizzElementTypes.Scorecounter_2004); //$NON-NLS-1$
		case FreeTextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://quizz/1.0?FreeText", QuizzElementTypes.FreeText_2005); //$NON-NLS-1$
		case QuizzEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://quizz/1.0?Quizz", QuizzElementTypes.Quizz_1000); //$NON-NLS-1$
		case AnswerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://quizz/1.0?Answer", QuizzElementTypes.Answer_4001); //$NON-NLS-1$
		case StartpointNextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://quizz/1.0?Question?next", QuizzElementTypes.QuestionNext_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = QuizzDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& QuizzElementTypes.isKnownElementType(elementType)) {
			image = QuizzElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof QuizzNavigatorGroup) {
			QuizzNavigatorGroup group = (QuizzNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof QuizzNavigatorItem) {
			QuizzNavigatorItem navigatorItem = (QuizzNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (QuizzVisualIDRegistry.getVisualID(view)) {
		case QuestionNextEditPart.VISUAL_ID:
			return getStartpointNext_4003Text(view);
		case EndpointEditPart.VISUAL_ID:
			return getEndpoint_2003Text(view);
		case StartpointEditPart.VISUAL_ID:
			return getMultipleChoice_2001Text(view);
		case ScorecounterEditPart.VISUAL_ID:
			return getStartpoint_2002Text(view);
		case MultipleChoiceEditPart.VISUAL_ID:
			return getScorecounter_2004Text(view);
		case FreeTextEditPart.VISUAL_ID:
			return getFreeText_2005Text(view);
		case QuizzEditPart.VISUAL_ID:
			return getQuizz_1000Text(view);
		case AnswerEditPart.VISUAL_ID:
			return getAnswer_4001Text(view);
		case StartpointNextEditPart.VISUAL_ID:
			return getQuestionNext_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getStartpointNext_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAnswer_4001Text(View view) {
		Answer domainModelElement = (Answer) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			QuizzDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQuestionNext_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getQuizz_1000Text(View view) {
		Quizz domainModelElement = (Quizz) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			QuizzDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEndpoint_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMultipleChoice_2001Text(View view) {
		IParser parser = QuizzParserProvider.getParser(
				QuizzElementTypes.MultipleChoice_2001,
				view.getElement() != null ? view.getElement() : view,
				QuizzVisualIDRegistry
						.getType(MultipleChoiceTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuizzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStartpoint_2002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getScorecounter_2004Text(View view) {
		IParser parser = QuizzParserProvider.getParser(
				QuizzElementTypes.Scorecounter_2004,
				view.getElement() != null ? view.getElement() : view,
				QuizzVisualIDRegistry
						.getType(ScorecounterUsernameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuizzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFreeText_2005Text(View view) {
		IParser parser = QuizzParserProvider.getParser(
				QuizzElementTypes.FreeText_2005,
				view.getElement() != null ? view.getElement() : view,
				QuizzVisualIDRegistry.getType(FreeTextTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			QuizzDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return QuizzEditPart.MODEL_ID.equals(QuizzVisualIDRegistry
				.getModelID(view));
	}

}
