/**
 */
package e4sm.de.metamodel.e4sm.security.impl;

import e4sm.de.metamodel.e4sm.security.SecurityGoal;
import e4sm.de.metamodel.e4sm.security.SecurityPackage;
import e4sm.de.metamodel.e4sm.security.ThreatCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threat Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.ThreatConditionImpl#getSecurityGoals <em>Security Goals</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.ThreatConditionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreatConditionImpl extends MinimalEObjectImpl.Container implements ThreatCondition {
	/**
	 * The cached value of the '{@link #getSecurityGoals() <em>Security Goals</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGoals()
	 * @generated
	 * @ordered
	 */
	protected SecurityGoal securityGoals;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreatConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.THREAT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGoal getSecurityGoals() {
		if (securityGoals != null && securityGoals.eIsProxy()) {
			InternalEObject oldSecurityGoals = (InternalEObject) securityGoals;
			securityGoals = (SecurityGoal) eResolveProxy(oldSecurityGoals);
			if (securityGoals != oldSecurityGoals) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SecurityPackage.THREAT_CONDITION__SECURITY_GOALS, oldSecurityGoals, securityGoals));
			}
		}
		return securityGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityGoal basicGetSecurityGoals() {
		return securityGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGoals(SecurityGoal newSecurityGoals) {
		SecurityGoal oldSecurityGoals = securityGoals;
		securityGoals = newSecurityGoals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.THREAT_CONDITION__SECURITY_GOALS,
					oldSecurityGoals, securityGoals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.THREAT_CONDITION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SecurityPackage.THREAT_CONDITION__SECURITY_GOALS:
			if (resolve)
				return getSecurityGoals();
			return basicGetSecurityGoals();
		case SecurityPackage.THREAT_CONDITION__DESCRIPTION:
			return getDescription();
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
		case SecurityPackage.THREAT_CONDITION__SECURITY_GOALS:
			setSecurityGoals((SecurityGoal) newValue);
			return;
		case SecurityPackage.THREAT_CONDITION__DESCRIPTION:
			setDescription((String) newValue);
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
		case SecurityPackage.THREAT_CONDITION__SECURITY_GOALS:
			setSecurityGoals((SecurityGoal) null);
			return;
		case SecurityPackage.THREAT_CONDITION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case SecurityPackage.THREAT_CONDITION__SECURITY_GOALS:
			return securityGoals != null;
		case SecurityPackage.THREAT_CONDITION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ThreatConditionImpl
