/**
 */
package de.ilmenau.tu.timenet.schema.scpn.impl;

import de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType;
import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Transition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TimedTransitionTypeImpl#getTimeFunction <em>Time Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedTransitionTypeImpl extends TransitionTypeImpl implements TimedTransitionType {
	/**
	 * The default value of the '{@link #getTimeFunction() <em>Time Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_FUNCTION_EDEFAULT = "EXP(1.0)";

	/**
	 * The cached value of the '{@link #getTimeFunction() <em>Time Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFunction()
	 * @generated
	 * @ordered
	 */
	protected String timeFunction = TIME_FUNCTION_EDEFAULT;

	/**
	 * This is true if the Time Function attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeFunctionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedTransitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scpnPackage.Literals.TIMED_TRANSITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeFunction() {
		return timeFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeFunction(String newTimeFunction) {
		String oldTimeFunction = timeFunction;
		timeFunction = newTimeFunction;
		boolean oldTimeFunctionESet = timeFunctionESet;
		timeFunctionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TIMED_TRANSITION_TYPE__TIME_FUNCTION,
					oldTimeFunction, timeFunction, !oldTimeFunctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTimeFunction() {
		String oldTimeFunction = timeFunction;
		boolean oldTimeFunctionESet = timeFunctionESet;
		timeFunction = TIME_FUNCTION_EDEFAULT;
		timeFunctionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scpnPackage.TIMED_TRANSITION_TYPE__TIME_FUNCTION,
					oldTimeFunction, TIME_FUNCTION_EDEFAULT, oldTimeFunctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTimeFunction() {
		return timeFunctionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case scpnPackage.TIMED_TRANSITION_TYPE__TIME_FUNCTION:
			return getTimeFunction();
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
		case scpnPackage.TIMED_TRANSITION_TYPE__TIME_FUNCTION:
			setTimeFunction((String) newValue);
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
		case scpnPackage.TIMED_TRANSITION_TYPE__TIME_FUNCTION:
			unsetTimeFunction();
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
		case scpnPackage.TIMED_TRANSITION_TYPE__TIME_FUNCTION:
			return isSetTimeFunction();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (timeFunction: ");
		if (timeFunctionESet)
			result.append(timeFunction);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimedTransitionTypeImpl
