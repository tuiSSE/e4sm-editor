/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.impl;

import de.ilmenau.tu.timenet.schema.eDSPN.DeterministicTransitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage;
import de.ilmenau.tu.timenet.schema.eDSPN.PreemptionPolicyType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deterministic Transition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.DeterministicTransitionTypeImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.DeterministicTransitionTypeImpl#getPreemptionPolicy <em>Preemption Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeterministicTransitionTypeImpl extends TransitionTypeImpl implements DeterministicTransitionType {
	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected String delay = DELAY_EDEFAULT;

	/**
	 * This is true if the Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delayESet;

	/**
	 * The default value of the '{@link #getPreemptionPolicy() <em>Preemption Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreemptionPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final PreemptionPolicyType PREEMPTION_POLICY_EDEFAULT = PreemptionPolicyType.PRD;

	/**
	 * The cached value of the '{@link #getPreemptionPolicy() <em>Preemption Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreemptionPolicy()
	 * @generated
	 * @ordered
	 */
	protected PreemptionPolicyType preemptionPolicy = PREEMPTION_POLICY_EDEFAULT;

	/**
	 * This is true if the Preemption Policy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preemptionPolicyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeterministicTransitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDSPNPackage.Literals.DETERMINISTIC_TRANSITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(String newDelay) {
		String oldDelay = delay;
		delay = newDelay;
		boolean oldDelayESet = delayESet;
		delayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE__DELAY,
					oldDelay, delay, !oldDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelay() {
		String oldDelay = delay;
		boolean oldDelayESet = delayESet;
		delay = DELAY_EDEFAULT;
		delayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE__DELAY,
					oldDelay, DELAY_EDEFAULT, oldDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelay() {
		return delayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreemptionPolicyType getPreemptionPolicy() {
		return preemptionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreemptionPolicy(PreemptionPolicyType newPreemptionPolicy) {
		PreemptionPolicyType oldPreemptionPolicy = preemptionPolicy;
		preemptionPolicy = newPreemptionPolicy == null ? PREEMPTION_POLICY_EDEFAULT : newPreemptionPolicy;
		boolean oldPreemptionPolicyESet = preemptionPolicyESet;
		preemptionPolicyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE__PREEMPTION_POLICY, oldPreemptionPolicy,
					preemptionPolicy, !oldPreemptionPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreemptionPolicy() {
		PreemptionPolicyType oldPreemptionPolicy = preemptionPolicy;
		boolean oldPreemptionPolicyESet = preemptionPolicyESet;
		preemptionPolicy = PREEMPTION_POLICY_EDEFAULT;
		preemptionPolicyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE__PREEMPTION_POLICY, oldPreemptionPolicy,
					PREEMPTION_POLICY_EDEFAULT, oldPreemptionPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreemptionPolicy() {
		return preemptionPolicyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE__DELAY:
			return getDelay();
		case EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE__PREEMPTION_POLICY:
			return getPreemptionPolicy();
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
		case EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE__DELAY:
			setDelay((String) newValue);
			return;
		case EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE__PREEMPTION_POLICY:
			setPreemptionPolicy((PreemptionPolicyType) newValue);
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
		case EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE__DELAY:
			unsetDelay();
			return;
		case EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE__PREEMPTION_POLICY:
			unsetPreemptionPolicy();
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
		case EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE__DELAY:
			return isSetDelay();
		case EDSPNPackage.DETERMINISTIC_TRANSITION_TYPE__PREEMPTION_POLICY:
			return isSetPreemptionPolicy();
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
		result.append(" (delay: ");
		if (delayESet)
			result.append(delay);
		else
			result.append("<unset>");
		result.append(", preemptionPolicy: ");
		if (preemptionPolicyESet)
			result.append(preemptionPolicy);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeterministicTransitionTypeImpl
