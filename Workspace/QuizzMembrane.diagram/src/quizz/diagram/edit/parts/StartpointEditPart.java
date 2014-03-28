package quizz.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import quizz.diagram.edit.policies.StartpointItemSemanticEditPolicy;
import quizz.diagram.part.QuizzVisualIDRegistry;
import quizz.diagram.providers.QuizzElementTypes;

/**
 * @generated
 */
public class StartpointEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public StartpointEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new StartpointItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new MultipleChoiceFigure();
	}

	/**
	 * @generated
	 */
	public MultipleChoiceFigure getPrimaryShape() {
		return (MultipleChoiceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MultipleChoiceTitleEditPart) {
			((MultipleChoiceTitleEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMultipleChoiceTitleFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MultipleChoiceTitleEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(QuizzVisualIDRegistry
				.getType(MultipleChoiceTitleEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(QuizzElementTypes.Answer_4001);
		types.add(QuizzElementTypes.QuestionNext_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof quizz.diagram.edit.parts.StartpointEditPart) {
			types.add(QuizzElementTypes.Answer_4001);
		}
		if (targetEditPart instanceof EndpointEditPart) {
			types.add(QuizzElementTypes.Answer_4001);
		}
		if (targetEditPart instanceof FreeTextEditPart) {
			types.add(QuizzElementTypes.Answer_4001);
		}
		if (targetEditPart instanceof quizz.diagram.edit.parts.StartpointEditPart) {
			types.add(QuizzElementTypes.QuestionNext_4002);
		}
		if (targetEditPart instanceof EndpointEditPart) {
			types.add(QuizzElementTypes.QuestionNext_4002);
		}
		if (targetEditPart instanceof FreeTextEditPart) {
			types.add(QuizzElementTypes.QuestionNext_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == QuizzElementTypes.Answer_4001) {
			types.add(QuizzElementTypes.MultipleChoice_2001);
			types.add(QuizzElementTypes.Endpoint_2003);
			types.add(QuizzElementTypes.FreeText_2005);
		} else if (relationshipType == QuizzElementTypes.QuestionNext_4002) {
			types.add(QuizzElementTypes.MultipleChoice_2001);
			types.add(QuizzElementTypes.Endpoint_2003);
			types.add(QuizzElementTypes.FreeText_2005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(QuizzElementTypes.Answer_4001);
		types.add(QuizzElementTypes.QuestionNext_4002);
		types.add(QuizzElementTypes.StartpointNext_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == QuizzElementTypes.Answer_4001) {
			types.add(QuizzElementTypes.MultipleChoice_2001);
		} else if (relationshipType == QuizzElementTypes.QuestionNext_4002) {
			types.add(QuizzElementTypes.MultipleChoice_2001);
			types.add(QuizzElementTypes.FreeText_2005);
		} else if (relationshipType == QuizzElementTypes.StartpointNext_4003) {
			types.add(QuizzElementTypes.Startpoint_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class MultipleChoiceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMultipleChoiceTitleFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMultipleChoiceTextFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMultipleChoiceIdFigure;

		/**
		 * @generated
		 */
		public MultipleChoiceFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMultipleChoiceTitleFigure = new WrappingLabel();

			fFigureMultipleChoiceTitleFigure.setText("<...>");

			this.add(fFigureMultipleChoiceTitleFigure);

			fFigureMultipleChoiceTextFigure = new WrappingLabel();

			fFigureMultipleChoiceTextFigure.setText("<...>");

			this.add(fFigureMultipleChoiceTextFigure);

			fFigureMultipleChoiceIdFigure = new WrappingLabel();

			fFigureMultipleChoiceIdFigure.setText("<...>");

			this.add(fFigureMultipleChoiceIdFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMultipleChoiceTitleFigure() {
			return fFigureMultipleChoiceTitleFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMultipleChoiceTextFigure() {
			return fFigureMultipleChoiceTextFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMultipleChoiceIdFigure() {
			return fFigureMultipleChoiceIdFigure;
		}

	}

}
