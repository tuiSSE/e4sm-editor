/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.E4SMElementType;
import e4sm.de.metamodel.e4sm.Parameter;
import e4sm.de.metamodel.e4sm.ParameterDefinition;
import e4sm.de.metamodel.e4sm.ParameterType;
import e4sm.de.metamodel.e4sm.ParametrisableElement;
import e4sm.de.metamodel.e4sm.UnitOfMeasurement;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterDefinitionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterDefinitionImpl#getMustBeDefinedOn <em>Must Be Defined On</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterDefinitionImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterDefinitionImpl#getCanBeDefinedOn <em>Can Be Defined On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterDefinitionImpl extends NamedElementImpl implements ParameterDefinition {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterType TYPE_EDEFAULT = ParameterType.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitOfMeasurement UNIT_EDEFAULT = UnitOfMeasurement.NONE;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitOfMeasurement unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMustBeDefinedOn() <em>Must Be Defined On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustBeDefinedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<ParametrisableElement> mustBeDefinedOn;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCanBeDefinedOn() <em>Can Be Defined On</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanBeDefinedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<E4SMElementType> canBeDefinedOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.PARAMETER_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ParameterType newType) {
		ParameterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PARAMETER_DEFINITION__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectWithInverseResolvingEList<Parameter>(Parameter.class, this,
					e4smPackage.PARAMETER_DEFINITION__PARAMETERS, e4smPackage.PARAMETER__PARAMETER_DEFINITION);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitOfMeasurement getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(UnitOfMeasurement newUnit) {
		UnitOfMeasurement oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PARAMETER_DEFINITION__UNIT, oldUnit,
					unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<E4SMElementType> getCanBeDefinedOn() {
		if (canBeDefinedOn == null) {
			canBeDefinedOn = new EDataTypeUniqueEList<E4SMElementType>(E4SMElementType.class, this,
					e4smPackage.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON);
		}
		return canBeDefinedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParametrisableElement> getMustBeDefinedOn() {
		if (mustBeDefinedOn == null) {
			mustBeDefinedOn = new EObjectResolvingEList<ParametrisableElement>(ParametrisableElement.class, this,
					e4smPackage.PARAMETER_DEFINITION__MUST_BE_DEFINED_ON);
		}
		return mustBeDefinedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PARAMETER_DEFINITION__DEFAULT_VALUE,
					oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.PARAMETER_DEFINITION__PARAMETERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParameters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.PARAMETER_DEFINITION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
		case e4smPackage.PARAMETER_DEFINITION__TYPE:
			return getType();
		case e4smPackage.PARAMETER_DEFINITION__PARAMETERS:
			return getParameters();
		case e4smPackage.PARAMETER_DEFINITION__UNIT:
			return getUnit();
		case e4smPackage.PARAMETER_DEFINITION__MUST_BE_DEFINED_ON:
			return getMustBeDefinedOn();
		case e4smPackage.PARAMETER_DEFINITION__DEFAULT_VALUE:
			return getDefaultValue();
		case e4smPackage.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON:
			return getCanBeDefinedOn();
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
		case e4smPackage.PARAMETER_DEFINITION__TYPE:
			setType((ParameterType) newValue);
			return;
		case e4smPackage.PARAMETER_DEFINITION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case e4smPackage.PARAMETER_DEFINITION__UNIT:
			setUnit((UnitOfMeasurement) newValue);
			return;
		case e4smPackage.PARAMETER_DEFINITION__MUST_BE_DEFINED_ON:
			getMustBeDefinedOn().clear();
			getMustBeDefinedOn().addAll((Collection<? extends ParametrisableElement>) newValue);
			return;
		case e4smPackage.PARAMETER_DEFINITION__DEFAULT_VALUE:
			setDefaultValue((String) newValue);
			return;
		case e4smPackage.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON:
			getCanBeDefinedOn().clear();
			getCanBeDefinedOn().addAll((Collection<? extends E4SMElementType>) newValue);
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
		case e4smPackage.PARAMETER_DEFINITION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case e4smPackage.PARAMETER_DEFINITION__PARAMETERS:
			getParameters().clear();
			return;
		case e4smPackage.PARAMETER_DEFINITION__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case e4smPackage.PARAMETER_DEFINITION__MUST_BE_DEFINED_ON:
			getMustBeDefinedOn().clear();
			return;
		case e4smPackage.PARAMETER_DEFINITION__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
			return;
		case e4smPackage.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON:
			getCanBeDefinedOn().clear();
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
		case e4smPackage.PARAMETER_DEFINITION__TYPE:
			return type != TYPE_EDEFAULT;
		case e4smPackage.PARAMETER_DEFINITION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case e4smPackage.PARAMETER_DEFINITION__UNIT:
			return unit != UNIT_EDEFAULT;
		case e4smPackage.PARAMETER_DEFINITION__MUST_BE_DEFINED_ON:
			return mustBeDefinedOn != null && !mustBeDefinedOn.isEmpty();
		case e4smPackage.PARAMETER_DEFINITION__DEFAULT_VALUE:
			return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
		case e4smPackage.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON:
			return canBeDefinedOn != null && !canBeDefinedOn.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", unit: ");
		result.append(unit);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", canBeDefinedOn: ");
		result.append(canBeDefinedOn);
		result.append(')');
		return result.toString();
	}

} //ParameterDefinitionImpl
