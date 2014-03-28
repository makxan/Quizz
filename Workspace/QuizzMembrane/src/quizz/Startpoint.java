/**
 */
package quizz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Startpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link quizz.Startpoint#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see quizz.QuizzPackage#getStartpoint()
 * @model
 * @generated
 */
public interface Startpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(DestinationTerminal)
	 * @see quizz.QuizzPackage#getStartpoint_Next()
	 * @model required="true"
	 * @generated
	 */
	DestinationTerminal getNext();

	/**
	 * Sets the value of the '{@link quizz.Startpoint#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(DestinationTerminal value);

} // Startpoint
