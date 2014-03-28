/**
 */
package quizz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import quizz.QuizzPackage;
import quizz.Startpoint;
import quizz.Terminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Startpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link quizz.impl.StartpointImpl#getSterminal <em>Sterminal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartpointImpl extends EObjectImpl implements Startpoint {
	/**
	 * The cached value of the '{@link #getSterminal() <em>Sterminal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSterminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal sterminal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizzPackage.Literals.STARTPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getSterminal() {
		return sterminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSterminal(Terminal newSterminal, NotificationChain msgs) {
		Terminal oldSterminal = sterminal;
		sterminal = newSterminal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuizzPackage.STARTPOINT__STERMINAL, oldSterminal, newSterminal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSterminal(Terminal newSterminal) {
		if (newSterminal != sterminal) {
			NotificationChain msgs = null;
			if (sterminal != null)
				msgs = ((InternalEObject)sterminal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuizzPackage.STARTPOINT__STERMINAL, null, msgs);
			if (newSterminal != null)
				msgs = ((InternalEObject)newSterminal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuizzPackage.STARTPOINT__STERMINAL, null, msgs);
			msgs = basicSetSterminal(newSterminal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizzPackage.STARTPOINT__STERMINAL, newSterminal, newSterminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuizzPackage.STARTPOINT__STERMINAL:
				return basicSetSterminal(null, msgs);
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
			case QuizzPackage.STARTPOINT__STERMINAL:
				return getSterminal();
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
			case QuizzPackage.STARTPOINT__STERMINAL:
				setSterminal((Terminal)newValue);
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
			case QuizzPackage.STARTPOINT__STERMINAL:
				setSterminal((Terminal)null);
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
			case QuizzPackage.STARTPOINT__STERMINAL:
				return sterminal != null;
		}
		return super.eIsSet(featureID);
	}

} //StartpointImpl
