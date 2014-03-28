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
public class EndpointItemSemanticEditPolicy extends
		QuizzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EndpointItemSemanticEditPolicy() {
		super(QuizzElementTypes.Endpoint_2003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (QuizzVisualIDRegistry.getVisualID(incomingLink) == AnswerEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (QuizzVisualIDRegistry.getVisualID(incomingLink) == StartpointNextEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (QuizzVisualIDRegistry.getVisualID(incomingLink) == QuestionNextEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
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

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (QuizzElementTypes.Answer_4001 == req.getElementType()) {
			return null;
		}
		if (QuizzElementTypes.QuestionNext_4002 == req.getElementType()) {
			return null;
		}
		if (QuizzElementTypes.StartpointNext_4003 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (QuizzElementTypes.Answer_4001 == req.getElementType()) {
			return getGEFWrapper(new AnswerCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (QuizzElementTypes.QuestionNext_4002 == req.getElementType()) {
			return getGEFWrapper(new StartpointNextCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (QuizzElementTypes.StartpointNext_4003 == req.getElementType()) {
			return getGEFWrapper(new QuestionNextCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case AnswerEditPart.VISUAL_ID:
			return getGEFWrapper(new AnswerReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case StartpointNextEditPart.VISUAL_ID:
			return getGEFWrapper(new StartpointNextReorientCommand(req));
		case QuestionNextEditPart.VISUAL_ID:
			return getGEFWrapper(new QuestionNextReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}