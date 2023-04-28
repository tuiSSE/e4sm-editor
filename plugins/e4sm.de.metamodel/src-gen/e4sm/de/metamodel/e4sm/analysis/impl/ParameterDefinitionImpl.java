/**
 */
package e4sm.de.metamodel.e4sm.analysis.impl;

import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.analysis.Parameter;
import e4sm.de.metamodel.e4sm.analysis.ParameterDefinition;
import e4sm.de.metamodel.e4sm.core.CorePackage;
import e4sm.de.metamodel.e4sm.core.DocumentableElement;
import e4sm.de.metamodel.e4sm.core.UnitOfMeasurement;
import e4sm.de.metamodel.e4sm.core.ValueSpecification;
import e4sm.de.metamodel.e4sm.core.impl.TypedElementImpl;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterDefinitionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterDefinitionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterDefinitionImpl#getMustBeDefinedOn <em>Must Be Defined On</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterDefinitionImpl#getCanBeDefinedOn <em>Can Be Defined On</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterDefinitionImpl#getShallNotBeDefinedOn <em>Shall Not Be Defined On</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterDefinitionImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterDefinitionImpl extends TypedElementImpl implements ParameterDefinition {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

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
	protected EList<EClass> mustBeDefinedOn;

	/**
	 * The cached value of the '{@link #getCanBeDefinedOn() <em>Can Be Defined On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanBeDefinedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> canBeDefinedOn;

	/**
	 * The cached value of the '{@link #getShallNotBeDefinedOn() <em>Shall Not Be Defined On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShallNotBeDefinedOn()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> shallNotBeDefinedOn;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification defaultValue;

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
		return AnalysisPackage.Literals.PARAMETER_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.PARAMETER_DEFINITION__DOCUMENTATION,
					oldDocumentation, documentation));
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
					AnalysisPackage.PARAMETER_DEFINITION__PARAMETERS, AnalysisPackage.PARAMETER__PARAMETER_DEFINITION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.PARAMETER_DEFINITION__UNIT, oldUnit,
					unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getMustBeDefinedOn() {
		if (mustBeDefinedOn == null) {
			mustBeDefinedOn = new EObjectResolvingEList<EClass>(EClass.class, this,
					AnalysisPackage.PARAMETER_DEFINITION__MUST_BE_DEFINED_ON);
		}
		return mustBeDefinedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getCanBeDefinedOn() {
		if (canBeDefinedOn == null) {
			canBeDefinedOn = new EObjectResolvingEList<EClass>(EClass.class, this,
					AnalysisPackage.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON);
		}
		return canBeDefinedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getShallNotBeDefinedOn() {
		if (shallNotBeDefinedOn == null) {
			shallNotBeDefinedOn = new EObjectResolvingEList<EClass>(EClass.class, this,
					AnalysisPackage.PARAMETER_DEFINITION__SHALL_NOT_BE_DEFINED_ON);
		}
		return shallNotBeDefinedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(ValueSpecification newDefaultValue, NotificationChain msgs) {
		ValueSpecification oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AnalysisPackage.PARAMETER_DEFINITION__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
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
	public void setDefaultValue(ValueSpecification newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject) defaultValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AnalysisPackage.PARAMETER_DEFINITION__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject) newDefaultValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AnalysisPackage.PARAMETER_DEFINITION__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.PARAMETER_DEFINITION__DEFAULT_VALUE,
					newDefaultValue, newDefaultValue));
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
		case AnalysisPackage.PARAMETER_DEFINITION__PARAMETERS:
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
		case AnalysisPackage.PARAMETER_DEFINITION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case AnalysisPackage.PARAMETER_DEFINITION__DEFAULT_VALUE:
			return basicSetDefaultValue(null, msgs);
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
		case AnalysisPackage.PARAMETER_DEFINITION__DOCUMENTATION:
			return getDocumentation();
		case AnalysisPackage.PARAMETER_DEFINITION__PARAMETERS:
			return getParameters();
		case AnalysisPackage.PARAMETER_DEFINITION__UNIT:
			return getUnit();
		case AnalysisPackage.PARAMETER_DEFINITION__MUST_BE_DEFINED_ON:
			return getMustBeDefinedOn();
		case AnalysisPackage.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON:
			return getCanBeDefinedOn();
		case AnalysisPackage.PARAMETER_DEFINITION__SHALL_NOT_BE_DEFINED_ON:
			return getShallNotBeDefinedOn();
		case AnalysisPackage.PARAMETER_DEFINITION__DEFAULT_VALUE:
			return getDefaultValue();
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
		case AnalysisPackage.PARAMETER_DEFINITION__DOCUMENTATION:
			setDocumentation((String) newValue);
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__UNIT:
			setUnit((UnitOfMeasurement) newValue);
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__MUST_BE_DEFINED_ON:
			getMustBeDefinedOn().clear();
			getMustBeDefinedOn().addAll((Collection<? extends EClass>) newValue);
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON:
			getCanBeDefinedOn().clear();
			getCanBeDefinedOn().addAll((Collection<? extends EClass>) newValue);
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__SHALL_NOT_BE_DEFINED_ON:
			getShallNotBeDefinedOn().clear();
			getShallNotBeDefinedOn().addAll((Collection<? extends EClass>) newValue);
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__DEFAULT_VALUE:
			setDefaultValue((ValueSpecification) newValue);
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
		case AnalysisPackage.PARAMETER_DEFINITION__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__PARAMETERS:
			getParameters().clear();
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__MUST_BE_DEFINED_ON:
			getMustBeDefinedOn().clear();
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON:
			getCanBeDefinedOn().clear();
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__SHALL_NOT_BE_DEFINED_ON:
			getShallNotBeDefinedOn().clear();
			return;
		case AnalysisPackage.PARAMETER_DEFINITION__DEFAULT_VALUE:
			setDefaultValue((ValueSpecification) null);
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
		case AnalysisPackage.PARAMETER_DEFINITION__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null
					: !DOCUMENTATION_EDEFAULT.equals(documentation);
		case AnalysisPackage.PARAMETER_DEFINITION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case AnalysisPackage.PARAMETER_DEFINITION__UNIT:
			return unit != UNIT_EDEFAULT;
		case AnalysisPackage.PARAMETER_DEFINITION__MUST_BE_DEFINED_ON:
			return mustBeDefinedOn != null && !mustBeDefinedOn.isEmpty();
		case AnalysisPackage.PARAMETER_DEFINITION__CAN_BE_DEFINED_ON:
			return canBeDefinedOn != null && !canBeDefinedOn.isEmpty();
		case AnalysisPackage.PARAMETER_DEFINITION__SHALL_NOT_BE_DEFINED_ON:
			return shallNotBeDefinedOn != null && !shallNotBeDefinedOn.isEmpty();
		case AnalysisPackage.PARAMETER_DEFINITION__DEFAULT_VALUE:
			return defaultValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DocumentableElement.class) {
			switch (derivedFeatureID) {
			case AnalysisPackage.PARAMETER_DEFINITION__DOCUMENTATION:
				return CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DocumentableElement.class) {
			switch (baseFeatureID) {
			case CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION:
				return AnalysisPackage.PARAMETER_DEFINITION__DOCUMENTATION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //ParameterDefinitionImpl
