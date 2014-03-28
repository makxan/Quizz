package quizz.diagram.providers;

import quizz.diagram.part.QuizzDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = QuizzDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			QuizzDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
