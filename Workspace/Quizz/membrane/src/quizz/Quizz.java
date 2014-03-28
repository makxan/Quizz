/**
 */
package quizz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quizz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link quizz.Quizz#getEnd <em>End</em>}</li>
 *   <li>{@link quizz.Quizz#getStart <em>Start</em>}</li>
 *   <li>{@link quizz.Quizz#getQuestions <em>Questions</em>}</li>
 *   <li>{@link quizz.Quizz#getScore <em>Score</em>}</li>
 * </ul>
 * </p>
 *
 * @see quizz.QuizzPackage#getQuizz()
 * @model
 * @generated
 */
public interface Quizz extends EObject {
	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Endpoint)
	 * @see quizz.QuizzPackage#getQuizz_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Endpoint getEnd();

	/**
	 * Sets the value of the '{@link quizz.Quizz#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Endpoint value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Startpoint)
	 * @see quizz.QuizzPackage#getQuizz_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Startpoint getStart();

	/**
	 * Sets the value of the '{@link quizz.Quizz#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Startpoint value);

	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link quizz.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see quizz.QuizzPackage#getQuizz_Questions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestions();

	/**
	 * Returns the value of the '<em><b>Score</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' containment reference.
	 * @see #setScore(Scorecounter)
	 * @see quizz.QuizzPackage#getQuizz_Score()
	 * @model containment="true"
	 * @generated
	 */
	Scorecounter getScore();

	/**
	 * Sets the value of the '{@link quizz.Quizz#getScore <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' containment reference.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Scorecounter value);

} // Quizz
