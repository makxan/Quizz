/**
 */
package quizz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link quizz.Endpoint#getEterminal <em>Eterminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see quizz.QuizzPackage#getEndpoint()
 * @model
 * @generated
 */
public interface Endpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Eterminal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eterminal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eterminal</em>' containment reference.
	 * @see #setEterminal(Terminal)
	 * @see quizz.QuizzPackage#getEndpoint_Eterminal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Terminal getEterminal();

	/**
	 * Sets the value of the '{@link quizz.Endpoint#getEterminal <em>Eterminal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eterminal</em>' containment reference.
	 * @see #getEterminal()
	 * @generated
	 */
	void setEterminal(Terminal value);

} // Endpoint
