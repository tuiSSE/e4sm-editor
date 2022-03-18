/**
 */
package de.ilmenau.tu.timenet.schema.scpn.impl;

import de.ilmenau.tu.timenet.schema.scpn.LabelType;
import de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType;
import de.ilmenau.tu.timenet.schema.scpn.ParameterValueType;
import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Instance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ModuleInstanceTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ModuleInstanceTypeImpl#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ModuleInstanceTypeImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ModuleInstanceTypeImpl#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleInstanceTypeImpl extends NodeTypeImpl implements ModuleInstanceType {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected LabelType label;

	/**
	 * The cached value of the '{@link #getParameterValue() <em>Parameter Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValueType> parameterValue;

	/**
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected String implementation = IMPLEMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected String module = MODULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleInstanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scpnPackage.Literals.MODULE_INSTANCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(LabelType newLabel, NotificationChain msgs) {
		LabelType oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					scpnPackage.MODULE_INSTANCE_TYPE__LABEL, oldLabel, newLabel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(LabelType newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject) label).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - scpnPackage.MODULE_INSTANCE_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject) newLabel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - scpnPackage.MODULE_INSTANCE_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.MODULE_INSTANCE_TYPE__LABEL, newLabel,
					newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterValueType> getParameterValue() {
		if (parameterValue == null) {
			parameterValue = new EObjectContainmentEList<ParameterValueType>(ParameterValueType.class, this,
					scpnPackage.MODULE_INSTANCE_TYPE__PARAMETER_VALUE);
		}
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementation(String newImplementation) {
		String oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.MODULE_INSTANCE_TYPE__IMPLEMENTATION,
					oldImplementation, implementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModule(String newModule) {
		String oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.MODULE_INSTANCE_TYPE__MODULE, oldModule,
					module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case scpnPackage.MODULE_INSTANCE_TYPE__LABEL:
			return basicSetLabel(null, msgs);
		case scpnPackage.MODULE_INSTANCE_TYPE__PARAMETER_VALUE:
			return ((InternalEList<?>) getParameterValue()).basicRemove(otherEnd, msgs);
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
		case scpnPackage.MODULE_INSTANCE_TYPE__LABEL:
			return getLabel();
		case scpnPackage.MODULE_INSTANCE_TYPE__PARAMETER_VALUE:
			return getParameterValue();
		case scpnPackage.MODULE_INSTANCE_TYPE__IMPLEMENTATION:
			return getImplementation();
		case scpnPackage.MODULE_INSTANCE_TYPE__MODULE:
			return getModule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case scpnPackage.MODULE_INSTANCE_TYPE__LABEL:
			setLabel((LabelType) newValue);
			return;
		case scpnPackage.MODULE_INSTANCE_TYPE__PARAMETER_VALUE:
			getParameterValue().clear();
			getParameterValue().addAll((Collection<? extends ParameterValueType>) newValue);
			return;
		case scpnPackage.MODULE_INSTANCE_TYPE__IMPLEMENTATION:
			setImplementation((String) newValue);
			return;
		case scpnPackage.MODULE_INSTANCE_TYPE__MODULE:
			setModule((String) newValue);
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
		case scpnPackage.MODULE_INSTANCE_TYPE__LABEL:
			setLabel((LabelType) null);
			return;
		case scpnPackage.MODULE_INSTANCE_TYPE__PARAMETER_VALUE:
			getParameterValue().clear();
			return;
		case scpnPackage.MODULE_INSTANCE_TYPE__IMPLEMENTATION:
			setImplementation(IMPLEMENTATION_EDEFAULT);
			return;
		case scpnPackage.MODULE_INSTANCE_TYPE__MODULE:
			setModule(MODULE_EDEFAULT);
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
		case scpnPackage.MODULE_INSTANCE_TYPE__LABEL:
			return label != null;
		case scpnPackage.MODULE_INSTANCE_TYPE__PARAMETER_VALUE:
			return parameterValue != null && !parameterValue.isEmpty();
		case scpnPackage.MODULE_INSTANCE_TYPE__IMPLEMENTATION:
			return IMPLEMENTATION_EDEFAULT == null ? implementation != null
					: !IMPLEMENTATION_EDEFAULT.equals(implementation);
		case scpnPackage.MODULE_INSTANCE_TYPE__MODULE:
			return MODULE_EDEFAULT == null ? module != null : !MODULE_EDEFAULT.equals(module);
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
		result.append(" (implementation: ");
		result.append(implementation);
		result.append(", module: ");
		result.append(module);
		result.append(')');
		return result.toString();
	}

} //ModuleInstanceTypeImpl
