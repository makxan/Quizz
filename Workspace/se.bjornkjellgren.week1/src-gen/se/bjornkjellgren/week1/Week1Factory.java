/**
 */
package se.bjornkjellgren.week1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.bjornkjellgren.week1.Week1Package
 * @generated
 */
public interface Week1Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Week1Factory eINSTANCE = se.bjornkjellgren.week1.impl.Week1FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Week1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Week1</em>'.
   * @generated
   */
  Week1 createWeek1();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Week1Package getWeek1Package();

} //Week1Factory
