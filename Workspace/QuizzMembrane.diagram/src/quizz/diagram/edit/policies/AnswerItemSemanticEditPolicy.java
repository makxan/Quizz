package quizz.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import quizz.diagram.providers.QuizzElementTypes;

/**
 * @generated
 */
public class AnswerItemSemanticEditPolicy extends
		QuizzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AnswerItemSemanticEditPolicy() {
		super(QuizzElementTypes.Answer_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
