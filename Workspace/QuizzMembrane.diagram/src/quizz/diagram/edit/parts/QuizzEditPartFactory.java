package quizz.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import quizz.diagram.part.QuizzVisualIDRegistry;

/**
 * @generated
 */
public class QuizzEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (QuizzVisualIDRegistry.getVisualID(view)) {

			case QuizzEditPart.VISUAL_ID:
				return new QuizzEditPart(view);

			case StartpointEditPart.VISUAL_ID:
				return new StartpointEditPart(view);

			case MultipleChoiceTitleEditPart.VISUAL_ID:
				return new MultipleChoiceTitleEditPart(view);

			case ScorecounterEditPart.VISUAL_ID:
				return new ScorecounterEditPart(view);

			case EndpointEditPart.VISUAL_ID:
				return new EndpointEditPart(view);

			case MultipleChoiceEditPart.VISUAL_ID:
				return new MultipleChoiceEditPart(view);

			case ScorecounterUsernameEditPart.VISUAL_ID:
				return new ScorecounterUsernameEditPart(view);

			case FreeTextEditPart.VISUAL_ID:
				return new FreeTextEditPart(view);

			case FreeTextTitleEditPart.VISUAL_ID:
				return new FreeTextTitleEditPart(view);

			case AnswerEditPart.VISUAL_ID:
				return new AnswerEditPart(view);

			case StartpointNextEditPart.VISUAL_ID:
				return new StartpointNextEditPart(view);

			case QuestionNextEditPart.VISUAL_ID:
				return new QuestionNextEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
