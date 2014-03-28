/**
 */
package quizz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import quizz.Endpoint;
import quizz.QuizzPackage;
import quizz.Terminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link quizz.impl.EndpointImpl#getEterminal <em>Eterminal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndpointImpl extends EObjectImpl implements Endpoint {
	/**
	 * The cached value of the '{@link #getEterminal() <em>Eterminal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEterminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal eterminal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizzPackage.Literals.ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getEterminal() {
		return eterminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEterminal(Terminal newEterminal, NotificationChain msgs) {
		Terminal oldEterminal = eterminal;
		eterminal = newEterminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuizzPackage.ENDPOINT__ETERMINAL, oldEterminal, newEterminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEterminal(Terminal newEterminal) {
		if (newEterminal != eterminal) {
			NotificationChain msgs = null;
			if (eterminal != null)
				msgs = ((InternalEObject)eterminal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuizzPackage.ENDPOINT__ETERMINAL, null, msgs);
			if (newEterminal != null)
				msgs = ((InternalEObject)newEterminal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuizzPackage.ENDPOINT__ETERMINAL, null, msgs);
			msgs = basicSetEterminal(newEterminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizzPackage.ENDPOINT__ETERMINAL, newEterminal, newEterminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuizzPackage.ENDPOINT__ETERMINAL:
				return basicSetEterminal(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuizzPackage.ENDPOINT__ETERMINAL:
				return getEterminal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuizzPackage.ENDPOINT__ETERMINAL:
				setEterminal((Terminal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QuizzPackage.ENDPOINT__ETERMINAL:
				setEterminal((Terminal)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QuizzPackage.ENDPOINT__ETERMINAL:
				return eterminal != null;
		}
		return super.eIsSet(featureID);
	}

} //EndpointImpl
