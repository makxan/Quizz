/**
 */
package quizz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scorecounter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link quizz.Scorecounter#getScore <em>Score</em>}</li>
 * </ul>
 * </p>
 *
 * @see quizz.QuizzPackage#getScorecounter()
 * @model
 * @generated
 */
public interface Scorecounter extends EObject {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(int)
	 * @see quizz.QuizzPackage#getScorecounter_Score()
	 * @model required="true"
	 * @generated
	 */
	int getScore();

	/**
	 * Sets the value of the '{@link quizz.Scorecounter#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(int value);

} // Scorecounter
