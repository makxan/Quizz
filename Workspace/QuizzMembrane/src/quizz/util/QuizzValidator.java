/**
 */
package quizz.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import quizz.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see quizz.QuizzPackage
 * @generated
 */
public class QuizzValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QuizzValidator INSTANCE = new QuizzValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "quizz";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizzValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return QuizzPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case QuizzPackage.QUIZZ:
				return validateQuizz((Quizz)value, diagnostics, context);
			case QuizzPackage.QUESTION:
				return validateQuestion((Question)value, diagnostics, context);
			case QuizzPackage.MULTIPLE_CHOICE:
				return validateMultipleChoice((MultipleChoice)value, diagnostics, context);
			case QuizzPackage.FREE_TEXT:
				return validateFreeText((FreeText)value, diagnostics, context);
			case QuizzPackage.ANSWER:
				return validateAnswer((Answer)value, diagnostics, context);
			case QuizzPackage.ENDPOINT:
				return validateEndpoint((Endpoint)value, diagnostics, context);
			case QuizzPackage.STARTPOINT:
				return validateStartpoint((Startpoint)value, diagnostics, context);
			case QuizzPackage.SCORECOUNTER:
				return validateScorecounter((Scorecounter)value, diagnostics, context);
			case QuizzPackage.DESTINATION_TERMINAL:
				return validateDestinationTerminal((DestinationTerminal)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuizz(Quizz quizz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(quizz, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(quizz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(quizz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(quizz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(quizz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(quizz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(quizz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(quizz, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(quizz, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuizz_isNotUniqueQuestion(quizz, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuizz_noPathToEndpoint(quizz, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isNotUniqueQuestion constraint of '<em>Quizz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUIZZ__IS_NOT_UNIQUE_QUESTION__EEXPRESSION = "questions->isUnique(id)";

	/**
	 * Validates the isNotUniqueQuestion constraint of '<em>Quizz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuizz_isNotUniqueQuestion(Quizz quizz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(QuizzPackage.Literals.QUIZZ,
				 quizz,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isNotUniqueQuestion",
				 QUIZZ__IS_NOT_UNIQUE_QUESTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noPathToEndpoint constraint of '<em>Quizz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String QUIZZ__NO_PATH_TO_ENDPOINT__EEXPRESSION = "questions.oclAsType(MultipleChoice)->select((next = end))->size() > 0";

	/**
	 * Validates the noPathToEndpoint constraint of '<em>Quizz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuizz_noPathToEndpoint(Quizz quizz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(QuizzPackage.Literals.QUIZZ,
				 quizz,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noPathToEndpoint",
				 QUIZZ__NO_PATH_TO_ENDPOINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion(Question question, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(question, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoice(MultipleChoice multipleChoice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multipleChoice, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multipleChoice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multipleChoice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multipleChoice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multipleChoice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multipleChoice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multipleChoice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multipleChoice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multipleChoice, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoice_noRightAnswer(multipleChoice, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultipleChoice_isNotUniqueAnswer(multipleChoice, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noRightAnswer constraint of '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTIPLE_CHOICE__NO_RIGHT_ANSWER__EEXPRESSION = "answers->select((correct = true))->size() > 0";

	/**
	 * Validates the noRightAnswer constraint of '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoice_noRightAnswer(MultipleChoice multipleChoice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(QuizzPackage.Literals.MULTIPLE_CHOICE,
				 multipleChoice,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noRightAnswer",
				 MULTIPLE_CHOICE__NO_RIGHT_ANSWER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the isNotUniqueAnswer constraint of '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTIPLE_CHOICE__IS_NOT_UNIQUE_ANSWER__EEXPRESSION = "answers->isUnique(id)";

	/**
	 * Validates the isNotUniqueAnswer constraint of '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleChoice_isNotUniqueAnswer(MultipleChoice multipleChoice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(QuizzPackage.Literals.MULTIPLE_CHOICE,
				 multipleChoice,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isNotUniqueAnswer",
				 MULTIPLE_CHOICE__IS_NOT_UNIQUE_ANSWER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreeText(FreeText freeText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freeText, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswer(Answer answer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(answer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpoint(Endpoint endpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartpoint(Startpoint startpoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(startpoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScorecounter(Scorecounter scorecounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scorecounter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationTerminal(DestinationTerminal destinationTerminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(destinationTerminal, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //QuizzValidator
