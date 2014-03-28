/**
 */
package se.bjornkjellgren.week1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.bjornkjellgren.week1.Week1Factory
 * @model kind="package"
 * @generated
 */
public interface Week1Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "week1";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bjornkjellgren.se/Week1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "week1";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Week1Package eINSTANCE = se.bjornkjellgren.week1.impl.Week1PackageImpl.init();

  /**
   * The meta object id for the '{@link se.bjornkjellgren.week1.impl.Week1Impl <em>Week1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see se.bjornkjellgren.week1.impl.Week1Impl
   * @see se.bjornkjellgren.week1.impl.Week1PackageImpl#getWeek1()
   * @generated
   */
  int WEEK1 = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEK1__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Week1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEEK1_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link se.bjornkjellgren.week1.Week1 <em>Week1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Week1</em>'.
   * @see se.bjornkjellgren.week1.Week1
   * @generated
   */
  EClass getWeek1();

  /**
   * Returns the meta object for the attribute list '{@link se.bjornkjellgren.week1.Week1#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Elements</em>'.
   * @see se.bjornkjellgren.week1.Week1#getElements()
   * @see #getWeek1()
   * @generated
   */
  EAttribute getWeek1_Elements();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Week1Factory getWeek1Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link se.bjornkjellgren.week1.impl.Week1Impl <em>Week1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see se.bjornkjellgren.week1.impl.Week1Impl
     * @see se.bjornkjellgren.week1.impl.Week1PackageImpl#getWeek1()
     * @generated
     */
    EClass WEEK1 = eINSTANCE.getWeek1();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEEK1__ELEMENTS = eINSTANCE.getWeek1_Elements();

  }

} //Week1Package
