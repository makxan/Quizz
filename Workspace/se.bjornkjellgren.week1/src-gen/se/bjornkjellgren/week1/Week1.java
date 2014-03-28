/**
 */
package se.bjornkjellgren.week1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Week1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link se.bjornkjellgren.week1.Week1#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see se.bjornkjellgren.week1.Week1Package#getWeek1()
 * @model
 * @generated
 */
public interface Week1 extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' attribute list.
   * @see se.bjornkjellgren.week1.Week1Package#getWeek1_Elements()
   * @model unique="false"
   * @generated
   */
  EList<String> getElements();

} // Week1
