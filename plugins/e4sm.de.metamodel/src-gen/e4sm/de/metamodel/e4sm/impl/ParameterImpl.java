/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Parameter;
import e4sm.de.metamodel.e4sm.ParameterDefinition;
import e4sm.de.metamodel.e4sm.ValueSpecification;
import e4sm.de.metamodel.e4sm.Variant;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterImpl#getParameterDefinition <em>Parameter Definition</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterImpl#getAppliesOnlyOnVariants <em>Applies Only On Variants</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterImpl#getDoesNotApplyOnVariants <em>Does Not Apply On Variants</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends ElementImpl implements Parameter {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterDefinition() <em>Parameter Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDefinition()
	 * @generated
	 * @ordered
	 */
	protected ParameterDefinition parameterDefinition;

	/**
	 * The cached value of the '{@link #getAppliesOnlyOnVariants() <em>Applies Only On Variants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesOnlyOnVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Variant> appliesOnlyOnVariants;

	/**
	 * The cached value of the '{@link #getDoesNotApplyOnVariants() <em>Does Not Apply On Variants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoesNotApplyOnVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Variant> doesNotApplyOnVariants;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification initialValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		// TODO: implement this method to return the 'Value' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		// TODO: implement this method to set the 'Value' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialValue(ValueSpecification newInitialValue, NotificationChain msgs) {
		ValueSpecification oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					e4smPackage.PARAMETER__INITIAL_VALUE, oldInitialValue, newInitialValue);
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
	public void setInitialValue(ValueSpecification newInitialValue) {
		if (newInitialValue != initialValue) {
			NotificationChain msgs = null;
			if (initialValue != null)
				msgs = ((InternalEObject) initialValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - e4smPackage.PARAMETER__INITIAL_VALUE, null, msgs);
			if (newInitialValue != null)
				msgs = ((InternalEObject) newInitialValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - e4smPackage.PARAMETER__INITIAL_VALUE, null, msgs);
			msgs = basicSetInitialValue(newInitialValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PARAMETER__INITIAL_VALUE, newInitialValue,
					newInitialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDefinition getParameterDefinition() {
		if (parameterDefinition != null && parameterDefinition.eIsProxy()) {
			InternalEObject oldParameterDefinition = (InternalEObject) parameterDefinition;
			parameterDefinition = (ParameterDefinition) eResolveProxy(oldParameterDefinition);
			if (parameterDefinition != oldParameterDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							e4smPackage.PARAMETER__PARAMETER_DEFINITION, oldParameterDefinition, parameterDefinition));
			}
		}
		return parameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinition basicGetParameterDefinition() {
		return parameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterDefinition(ParameterDefinition newParameterDefinition,
			NotificationChain msgs) {
		ParameterDefinition oldParameterDefinition = parameterDefinition;
		parameterDefinition = newParameterDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					e4smPackage.PARAMETER__PARAMETER_DEFINITION, oldParameterDefinition, newParameterDefinition);
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
	public void setParameterDefinition(ParameterDefinition newParameterDefinition) {
		if (newParameterDefinition != parameterDefinition) {
			NotificationChain msgs = null;
			if (parameterDefinition != null)
				msgs = ((InternalEObject) parameterDefinition).eInverseRemove(this,
						e4smPackage.PARAMETER_DEFINITION__PARAMETERS, ParameterDefinition.class, msgs);
			if (newParameterDefinition != null)
				msgs = ((InternalEObject) newParameterDefinition).eInverseAdd(this,
						e4smPackage.PARAMETER_DEFINITION__PARAMETERS, ParameterDefinition.class, msgs);
			msgs = basicSetParameterDefinition(newParameterDefinition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PARAMETER__PARAMETER_DEFINITION,
					newParameterDefinition, newParameterDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variant> getAppliesOnlyOnVariants() {
		if (appliesOnlyOnVariants == null) {
			appliesOnlyOnVariants = new EObjectResolvingEList<Variant>(Variant.class, this,
					e4smPackage.PARAMETER__APPLIES_ONLY_ON_VARIANTS);
		}
		return appliesOnlyOnVariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variant> getDoesNotApplyOnVariants() {
		if (doesNotApplyOnVariants == null) {
			doesNotApplyOnVariants = new EObjectResolvingEList<Variant>(Variant.class, this,
					e4smPackage.PARAMETER__DOES_NOT_APPLY_ON_VARIANTS);
		}
		return doesNotApplyOnVariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.PARAMETER__PARAMETER_DEFINITION:
			if (parameterDefinition != null)
				msgs = ((InternalEObject) parameterDefinition).eInverseRemove(this,
						e4smPackage.PARAMETER_DEFINITION__PARAMETERS, ParameterDefinition.class, msgs);
			return basicSetParameterDefinition((ParameterDefinition) otherEnd, msgs);
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
		case e4smPackage.PARAMETER__PARAMETER_DEFINITION:
			return basicSetParameterDefinition(null, msgs);
		case e4smPackage.PARAMETER__INITIAL_VALUE:
			return basicSetInitialValue(null, msgs);
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
		case e4smPackage.PARAMETER__VALUE:
			return getValue();
		case e4smPackage.PARAMETER__PARAMETER_DEFINITION:
			if (resolve)
				return getParameterDefinition();
			return basicGetParameterDefinition();
		case e4smPackage.PARAMETER__APPLIES_ONLY_ON_VARIANTS:
			return getAppliesOnlyOnVariants();
		case e4smPackage.PARAMETER__DOES_NOT_APPLY_ON_VARIANTS:
			return getDoesNotApplyOnVariants();
		case e4smPackage.PARAMETER__INITIAL_VALUE:
			return getInitialValue();
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
		case e4smPackage.PARAMETER__VALUE:
			setValue((String) newValue);
			return;
		case e4smPackage.PARAMETER__PARAMETER_DEFINITION:
			setParameterDefinition((ParameterDefinition) newValue);
			return;
		case e4smPackage.PARAMETER__APPLIES_ONLY_ON_VARIANTS:
			getAppliesOnlyOnVariants().clear();
			getAppliesOnlyOnVariants().addAll((Collection<? extends Variant>) newValue);
			return;
		case e4smPackage.PARAMETER__DOES_NOT_APPLY_ON_VARIANTS:
			getDoesNotApplyOnVariants().clear();
			getDoesNotApplyOnVariants().addAll((Collection<? extends Variant>) newValue);
			return;
		case e4smPackage.PARAMETER__INITIAL_VALUE:
			setInitialValue((ValueSpecification) newValue);
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
		case e4smPackage.PARAMETER__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case e4smPackage.PARAMETER__PARAMETER_DEFINITION:
			setParameterDefinition((ParameterDefinition) null);
			return;
		case e4smPackage.PARAMETER__APPLIES_ONLY_ON_VARIANTS:
			getAppliesOnlyOnVariants().clear();
			return;
		case e4smPackage.PARAMETER__DOES_NOT_APPLY_ON_VARIANTS:
			getDoesNotApplyOnVariants().clear();
			return;
		case e4smPackage.PARAMETER__INITIAL_VALUE:
			setInitialValue((ValueSpecification) null);
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
		case e4smPackage.PARAMETER__VALUE:
			return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
		case e4smPackage.PARAMETER__PARAMETER_DEFINITION:
			return parameterDefinition != null;
		case e4smPackage.PARAMETER__APPLIES_ONLY_ON_VARIANTS:
			return appliesOnlyOnVariants != null && !appliesOnlyOnVariants.isEmpty();
		case e4smPackage.PARAMETER__DOES_NOT_APPLY_ON_VARIANTS:
			return doesNotApplyOnVariants != null && !doesNotApplyOnVariants.isEmpty();
		case e4smPackage.PARAMETER__INITIAL_VALUE:
			return initialValue != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterImpl
