package quizz.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import quizz.diagram.part.QuizzVisualIDRegistry;

/**
 * @generated
 */
public class QuizzNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof QuizzNavigatorItem) {
			QuizzNavigatorItem item = (QuizzNavigatorItem) element;
			return QuizzVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
