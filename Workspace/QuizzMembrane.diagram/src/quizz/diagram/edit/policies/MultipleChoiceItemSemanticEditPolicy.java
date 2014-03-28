package quizz.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import quizz.diagram.edit.commands.AnswerCreateCommand;
import quizz.diagram.edit.commands.AnswerReorientCommand;
import quizz.diagram.edit.commands.QuestionNextCreateCommand;
import quizz.diagram.edit.commands.QuestionNextReorientCommand;
import quizz.diagram.edit.commands.StartpointNextCreateCommand;
import quizz.diagram.edit.commands.StartpointNextReorientCommand;
import quizz.diagram.edit.parts.AnswerEditPart;
import quizz.diagram.edit.parts.QuestionNextEditPart;
import quizz.diagram.edit.parts.StartpointNextEditPart;
import quizz.diagram.part.QuizzVisualIDRegistry;
import quizz.diagram.providers.QuizzElementTypes;

/**
 * @generated
 */
public class MultipleChoiceItemSemanticEditPolicy extends
		QuizzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MultipleChoiceItemSemanticEditPolicy() {
		super(QuizzElementTypes.Scorecounter_2004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

}
