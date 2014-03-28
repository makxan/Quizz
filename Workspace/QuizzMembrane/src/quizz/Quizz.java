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
 *   <li>{@link quizz.Quizz#getName <em>Name</em>}</li>
 *   <li>{@link quizz.Quizz#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see quizz.QuizzPackage#getQuizz()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isNotUniqueQuestion noPathToEndpoint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot isNotUniqueQuestion='questions->isUnique(id)' noPathToEndpoint='questions.oclAsType(MultipleChoice)->select((next = end))->size() > 0'"
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
	 * @model containment="true" required="true"
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

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see quizz.QuizzPackage#getQuizz_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link quizz.Quizz#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see quizz.QuizzPackage#getQuizz_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link quizz.Quizz#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Quizz
