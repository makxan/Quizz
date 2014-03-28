package quizz.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import quizz.diagram.providers.QuizzElementTypes;

/**
 * @generated
 */
public class StartpointNextItemSemanticEditPolicy extends
		QuizzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StartpointNextItemSemanticEditPolicy() {
		super(QuizzElementTypes.QuestionNext_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
