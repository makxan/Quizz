package quizz.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import quizz.diagram.providers.QuizzElementTypes;

/**
 * @generated
 */
public class QuizzPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createQuizz1Group());
	}

	/**
	 * Creates "quizz" palette tool group
	 * @generated
	 */
	private PaletteContainer createQuizz1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Quizz1Group_title);
		paletteContainer.setId("createQuizz1Group"); //$NON-NLS-1$
		paletteContainer.add(createMultipleChoice1CreationTool());
		paletteContainer.add(createStartpoint2CreationTool());
		paletteContainer.add(createEndpoint3CreationTool());
		paletteContainer.add(createScorecounter4CreationTool());
		paletteContainer.add(createFreeText5CreationTool());
		paletteContainer.add(createAnswer6CreationTool());
		paletteContainer.add(createNext7CreationTool());
		paletteContainer.add(createNextStartpoint8CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultipleChoice1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MultipleChoice1CreationTool_title,
				Messages.MultipleChoice1CreationTool_desc,
				Collections
						.singletonList(QuizzElementTypes.MultipleChoice_2001));
		entry.setId("createMultipleChoice1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuizzElementTypes
				.getImageDescriptor(QuizzElementTypes.MultipleChoice_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStartpoint2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Startpoint2CreationTool_title,
				Messages.Startpoint2CreationTool_desc,
				Collections.singletonList(QuizzElementTypes.Startpoint_2002));
		entry.setId("createStartpoint2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuizzElementTypes
				.getImageDescriptor(QuizzElementTypes.Startpoint_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEndpoint3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Endpoint3CreationTool_title,
				Messages.Endpoint3CreationTool_desc,
				Collections.singletonList(QuizzElementTypes.Endpoint_2003));
		entry.setId("createEndpoint3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuizzElementTypes
				.getImageDescriptor(QuizzElementTypes.Endpoint_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScorecounter4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Scorecounter4CreationTool_title,
				Messages.Scorecounter4CreationTool_desc,
				Collections.singletonList(QuizzElementTypes.Scorecounter_2004));
		entry.setId("createScorecounter4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuizzElementTypes
				.getImageDescriptor(QuizzElementTypes.Scorecounter_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFreeText5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FreeText5CreationTool_title,
				Messages.FreeText5CreationTool_desc,
				Collections.singletonList(QuizzElementTypes.FreeText_2005));
		entry.setId("createFreeText5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuizzElementTypes
				.getImageDescriptor(QuizzElementTypes.FreeText_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnswer6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Answer6CreationTool_title,
				Messages.Answer6CreationTool_desc,
				Collections.singletonList(QuizzElementTypes.Answer_4001));
		entry.setId("createAnswer6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuizzElementTypes
				.getImageDescriptor(QuizzElementTypes.Answer_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNext7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Next7CreationTool_title,
				Messages.Next7CreationTool_desc,
				Collections.singletonList(QuizzElementTypes.QuestionNext_4002));
		entry.setId("createNext7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuizzElementTypes
				.getImageDescriptor(QuizzElementTypes.QuestionNext_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNextStartpoint8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.NextStartpoint8CreationTool_title,
				Messages.NextStartpoint8CreationTool_desc,
				Collections
						.singletonList(QuizzElementTypes.StartpointNext_4003));
		entry.setId("createNextStartpoint8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(QuizzElementTypes
				.getImageDescriptor(QuizzElementTypes.StartpointNext_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
