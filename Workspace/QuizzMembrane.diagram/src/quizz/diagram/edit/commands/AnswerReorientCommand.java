package quizz.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import quizz.Answer;
import quizz.DestinationTerminal;
import quizz.MultipleChoice;
import quizz.diagram.edit.policies.QuizzBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AnswerReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public AnswerReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Answer) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof MultipleChoice && newEnd instanceof MultipleChoice)) {
			return false;
		}
		DestinationTerminal target = getLink().getNext();
		return QuizzBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAnswer_4001(getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DestinationTerminal && newEnd instanceof DestinationTerminal)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof MultipleChoice)) {
			return false;
		}
		MultipleChoice source = (MultipleChoice) getLink().eContainer();
		return QuizzBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAnswer_4001(getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getAnswers().remove(getLink());
		getNewSource().getAnswers().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setNext(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Answer getLink() {
		return (Answer) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected MultipleChoice getOldSource() {
		return (MultipleChoice) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MultipleChoice getNewSource() {
		return (MultipleChoice) newEnd;
	}

	/**
	 * @generated
	 */
	protected DestinationTerminal getOldTarget() {
		return (DestinationTerminal) oldEnd;
	}

	/**
	 * @generated
	 */
	protected DestinationTerminal getNewTarget() {
		return (DestinationTerminal) newEnd;
	}
}
