/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.impl;

import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage;
import de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immediate Transition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.ImmediateTransitionTypeImpl#getEnablingFunction <em>Enabling Function</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.ImmediateTransitionTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.ImmediateTransitionTypeImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmediateTransitionTypeImpl extends TransitionTypeImpl implements ImmediateTransitionType {
	/**
	 * The default value of the '{@link #getEnablingFunction() <em>Enabling Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablingFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLING_FUNCTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEnablingFunction() <em>Enabling Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablingFunction()
	 * @generated
	 * @ordered
	 */
	protected String enablingFunction = ENABLING_FUNCTION_EDEFAULT;

	/**
	 * This is true if the Enabling Function attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enablingFunctionESet;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String WEIGHT_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected String weight = WEIGHT_EDEFAULT;

	/**
	 * This is true if the Weight attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean weightESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmediateTransitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDSPNPackage.Literals.IMMEDIATE_TRANSITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnablingFunction() {
		return enablingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnablingFunction(String newEnablingFunction) {
		String oldEnablingFunction = enablingFunction;
		enablingFunction = newEnablingFunction;
		boolean oldEnablingFunctionESet = enablingFunctionESet;
		enablingFunctionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__ENABLING_FUNCTION, oldEnablingFunction, enablingFunction,
					!oldEnablingFunctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnablingFunction() {
		String oldEnablingFunction = enablingFunction;
		boolean oldEnablingFunctionESet = enablingFunctionESet;
		enablingFunction = ENABLING_FUNCTION_EDEFAULT;
		enablingFunctionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__ENABLING_FUNCTION, oldEnablingFunction,
					ENABLING_FUNCTION_EDEFAULT, oldEnablingFunctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnablingFunction() {
		return enablingFunctionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		boolean oldPriorityESet = priorityESet;
		priorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__PRIORITY,
					oldPriority, priority, !oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriority() {
		String oldPriority = priority;
		boolean oldPriorityESet = priorityESet;
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__PRIORITY,
					oldPriority, PRIORITY_EDEFAULT, oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(String newWeight) {
		String oldWeight = weight;
		weight = newWeight;
		boolean oldWeightESet = weightESet;
		weightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__WEIGHT,
					oldWeight, weight, !oldWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWeight() {
		String oldWeight = weight;
		boolean oldWeightESet = weightESet;
		weight = WEIGHT_EDEFAULT;
		weightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__WEIGHT,
					oldWeight, WEIGHT_EDEFAULT, oldWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWeight() {
		return weightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__ENABLING_FUNCTION:
			return getEnablingFunction();
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__PRIORITY:
			return getPriority();
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__WEIGHT:
			return getWeight();
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
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__ENABLING_FUNCTION:
			setEnablingFunction((String) newValue);
			return;
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__PRIORITY:
			setPriority((String) newValue);
			return;
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__WEIGHT:
			setWeight((String) newValue);
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
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__ENABLING_FUNCTION:
			unsetEnablingFunction();
			return;
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__PRIORITY:
			unsetPriority();
			return;
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__WEIGHT:
			unsetWeight();
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
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__ENABLING_FUNCTION:
			return isSetEnablingFunction();
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__PRIORITY:
			return isSetPriority();
		case EDSPNPackage.IMMEDIATE_TRANSITION_TYPE__WEIGHT:
			return isSetWeight();
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
		result.append(" (enablingFunction: ");
		if (enablingFunctionESet)
			result.append(enablingFunction);
		else
			result.append("<unset>");
		result.append(", priority: ");
		if (priorityESet)
			result.append(priority);
		else
			result.append("<unset>");
		result.append(", weight: ");
		if (weightESet)
			result.append(weight);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ImmediateTransitionTypeImpl
