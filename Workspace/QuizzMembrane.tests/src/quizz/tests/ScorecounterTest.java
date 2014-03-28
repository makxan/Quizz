/**
 */
package quizz.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import quizz.QuizzFactory;
import quizz.Scorecounter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scorecounter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScorecounterTest extends TestCase {

	/**
	 * The fixture for this Scorecounter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Scorecounter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScorecounterTest.class);
	}

	/**
	 * Constructs a new Scorecounter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScorecounterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Scorecounter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Scorecounter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Scorecounter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Scorecounter getFixture() {
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
		setFixture(QuizzFactory.eINSTANCE.createScorecounter());
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

} //ScorecounterTest
