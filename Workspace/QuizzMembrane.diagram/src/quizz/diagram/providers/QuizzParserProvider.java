package quizz.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import quizz.QuizzPackage;
import quizz.diagram.edit.parts.FreeTextTitleEditPart;
import quizz.diagram.edit.parts.MultipleChoiceTitleEditPart;
import quizz.diagram.edit.parts.ScorecounterUsernameEditPart;
import quizz.diagram.parsers.MessageFormatParser;
import quizz.diagram.part.QuizzVisualIDRegistry;

/**
 * @generated
 */
public class QuizzParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser multipleChoiceTitle_5001Parser;

	/**
	 * @generated
	 */
	private IParser getMultipleChoiceTitle_5001Parser() {
		if (multipleChoiceTitle_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { QuizzPackage.eINSTANCE
					.getQuestion_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			multipleChoiceTitle_5001Parser = parser;
		}
		return multipleChoiceTitle_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser scorecounterUsername_5002Parser;

	/**
	 * @generated
	 */
	private IParser getScorecounterUsername_5002Parser() {
		if (scorecounterUsername_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { QuizzPackage.eINSTANCE
					.getScorecounter_Username() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scorecounterUsername_5002Parser = parser;
		}
		return scorecounterUsername_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser freeTextTitle_5003Parser;

	/**
	 * @generated
	 */
	private IParser getFreeTextTitle_5003Parser() {
		if (freeTextTitle_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { QuizzPackage.eINSTANCE
					.getQuestion_Title() };
			MessageFormatParser parser = new MessageFormatParser(features);
			freeTextTitle_5003Parser = parser;
		}
		return freeTextTitle_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MultipleChoiceTitleEditPart.VISUAL_ID:
			return getMultipleChoiceTitle_5001Parser();
		case ScorecounterUsernameEditPart.VISUAL_ID:
			return getScorecounterUsername_5002Parser();
		case FreeTextTitleEditPart.VISUAL_ID:
			return getFreeTextTitle_5003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(QuizzVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(QuizzVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (QuizzElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
