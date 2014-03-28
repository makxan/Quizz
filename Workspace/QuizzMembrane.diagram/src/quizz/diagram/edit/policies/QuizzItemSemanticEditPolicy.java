package quizz.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import quizz.diagram.edit.commands.EndpointCreateCommand;
import quizz.diagram.edit.commands.FreeTextCreateCommand;
import quizz.diagram.edit.commands.MultipleChoiceCreateCommand;
import quizz.diagram.edit.commands.ScorecounterCreateCommand;
import quizz.diagram.edit.commands.StartpointCreateCommand;
import quizz.diagram.providers.QuizzElementTypes;

/**
 * @generated
 */
public class QuizzItemSemanticEditPolicy extends
		QuizzBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public QuizzItemSemanticEditPolicy() {
		super(QuizzElementTypes.Quizz_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (QuizzElementTypes.MultipleChoice_2001 == req.getElementType()) {
			return getGEFWrapper(new StartpointCreateCommand(req));
		}
		if (QuizzElementTypes.Startpoint_2002 == req.getElementType()) {
			return getGEFWrapper(new ScorecounterCreateCommand(req));
		}
		if (QuizzElementTypes.Endpoint_2003 == req.getElementType()) {
			return getGEFWrapper(new EndpointCreateCommand(req));
		}
		if (QuizzElementTypes.Scorecounter_2004 == req.getElementType()) {
			return getGEFWrapper(new MultipleChoiceCreateCommand(req));
		}
		if (QuizzElementTypes.FreeText_2005 == req.getElementType()) {
			return getGEFWrapper(new FreeTextCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
