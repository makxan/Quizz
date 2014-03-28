/**
 */
package quizz.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import quizz.QuizzFactory;
import quizz.Startpoint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Startpoint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StartpointTest extends TestCase {

	/**
	 * The fixture for this Startpoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Startpoint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StartpointTest.class);
	}

	/**
	 * Constructs a new Startpoint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartpointTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Startpoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Startpoint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Startpoint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Startpoint getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizzFactory.eINSTANCE.createStartpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StartpointTest
