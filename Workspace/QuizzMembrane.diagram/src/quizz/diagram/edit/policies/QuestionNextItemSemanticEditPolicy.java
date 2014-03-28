package quizz.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import quizz.diagram.providers.QuizzElementTypes;

/**
 * @generated
 */
public class QuestionNextItemSemanticEditPolicy extends
		QuizzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public QuestionNextItemSemanticEditPolicy() {
		super(QuizzElementTypes.StartpointNext_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
