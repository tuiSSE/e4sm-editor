/**
 */
package e4sm.de.metamodel.e4sm.analysis.impl;

import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.analysis.Parameter;
import e4sm.de.metamodel.e4sm.analysis.ParameterDefinition;
import e4sm.de.metamodel.e4sm.core.ValueSpecification;
import e4sm.de.metamodel.e4sm.core.Variant;
import e4sm.de.metamodel.e4sm.core.impl.ElementImpl;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterImpl#getParameterDefinition <em>Parameter Definition</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterImpl#getAppliesOnlyOnVariants <em>Applies Only On Variants</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterImpl#getDoesNotApplyOnVariants <em>Does Not Apply On Variants</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterImpl#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends ElementImpl implements Parameter {
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
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification currentValue;

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
		return AnalysisPackage.Literals.PARAMETER;
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
							AnalysisPackage.PARAMETER__PARAMETER_DEFINITION, oldParameterDefinition,
							parameterDefinition));
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
					AnalysisPackage.PARAMETER__PARAMETER_DEFINITION, oldParameterDefinition, newParameterDefinition);
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
						AnalysisPackage.PARAMETER_DEFINITION__PARAMETERS, ParameterDefinition.class, msgs);
			if (newParameterDefinition != null)
				msgs = ((InternalEObject) newParameterDefinition).eInverseAdd(this,
						AnalysisPackage.PARAMETER_DEFINITION__PARAMETERS, ParameterDefinition.class, msgs);
			msgs = basicSetParameterDefinition(newParameterDefinition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.PARAMETER__PARAMETER_DEFINITION,
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
					AnalysisPackage.PARAMETER__APPLIES_ONLY_ON_VARIANTS);
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
					AnalysisPackage.PARAMETER__DOES_NOT_APPLY_ON_VARIANTS);
		}
		return doesNotApplyOnVariants;
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
					AnalysisPackage.PARAMETER__INITIAL_VALUE, oldInitialValue, newInitialValue);
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
						EOPPOSITE_FEATURE_BASE - AnalysisPackage.PARAMETER__INITIAL_VALUE, null, msgs);
			if (newInitialValue != null)
				msgs = ((InternalEObject) newInitialValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AnalysisPackage.PARAMETER__INITIAL_VALUE, null, msgs);
			msgs = basicSetInitialValue(newInitialValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.PARAMETER__INITIAL_VALUE,
					newInitialValue, newInitialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification getCurrentValue() {
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentValue(ValueSpecification newCurrentValue, NotificationChain msgs) {
		ValueSpecification oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AnalysisPackage.PARAMETER__CURRENT_VALUE, oldCurrentValue, newCurrentValue);
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
	public void setCurrentValue(ValueSpecification newCurrentValue) {
		if (newCurrentValue != currentValue) {
			NotificationChain msgs = null;
			if (currentValue != null)
				msgs = ((InternalEObject) currentValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AnalysisPackage.PARAMETER__CURRENT_VALUE, null, msgs);
			if (newCurrentValue != null)
				msgs = ((InternalEObject) newCurrentValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AnalysisPackage.PARAMETER__CURRENT_VALUE, null, msgs);
			msgs = basicSetCurrentValue(newCurrentValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.PARAMETER__CURRENT_VALUE,
					newCurrentValue, newCurrentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isValid() {
		//Check that it has a type
		final ParameterDefinition pd = this.getParameterDefinition();
		if (pd.getType() != null) {
			EObject container = this.eContainer();
			boolean shallNotPassed = parameterDefinition.getShallNotBeDefinedOn().stream().allMatch(e -> {
				return (!e.isSuperTypeOf(container.eClass()));
			});
			if (!shallNotPassed) {
				return false;
			}
			//TODO, check other things, that the values and types are Ok.
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AnalysisPackage.PARAMETER__PARAMETER_DEFINITION:
			if (parameterDefinition != null)
				msgs = ((InternalEObject) parameterDefinition).eInverseRemove(this,
						AnalysisPackage.PARAMETER_DEFINITION__PARAMETERS, ParameterDefinition.class, msgs);
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
		case AnalysisPackage.PARAMETER__PARAMETER_DEFINITION:
			return basicSetParameterDefinition(null, msgs);
		case AnalysisPackage.PARAMETER__INITIAL_VALUE:
			return basicSetInitialValue(null, msgs);
		case AnalysisPackage.PARAMETER__CURRENT_VALUE:
			return basicSetCurrentValue(null, msgs);
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
		case AnalysisPackage.PARAMETER__PARAMETER_DEFINITION:
			if (resolve)
				return getParameterDefinition();
			return basicGetParameterDefinition();
		case AnalysisPackage.PARAMETER__APPLIES_ONLY_ON_VARIANTS:
			return getAppliesOnlyOnVariants();
		case AnalysisPackage.PARAMETER__DOES_NOT_APPLY_ON_VARIANTS:
			return getDoesNotApplyOnVariants();
		case AnalysisPackage.PARAMETER__INITIAL_VALUE:
			return getInitialValue();
		case AnalysisPackage.PARAMETER__CURRENT_VALUE:
			return getCurrentValue();
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
		case AnalysisPackage.PARAMETER__PARAMETER_DEFINITION:
			setParameterDefinition((ParameterDefinition) newValue);
			return;
		case AnalysisPackage.PARAMETER__APPLIES_ONLY_ON_VARIANTS:
			getAppliesOnlyOnVariants().clear();
			getAppliesOnlyOnVariants().addAll((Collection<? extends Variant>) newValue);
			return;
		case AnalysisPackage.PARAMETER__DOES_NOT_APPLY_ON_VARIANTS:
			getDoesNotApplyOnVariants().clear();
			getDoesNotApplyOnVariants().addAll((Collection<? extends Variant>) newValue);
			return;
		case AnalysisPackage.PARAMETER__INITIAL_VALUE:
			setInitialValue((ValueSpecification) newValue);
			return;
		case AnalysisPackage.PARAMETER__CURRENT_VALUE:
			setCurrentValue((ValueSpecification) newValue);
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
		case AnalysisPackage.PARAMETER__PARAMETER_DEFINITION:
			setParameterDefinition((ParameterDefinition) null);
			return;
		case AnalysisPackage.PARAMETER__APPLIES_ONLY_ON_VARIANTS:
			getAppliesOnlyOnVariants().clear();
			return;
		case AnalysisPackage.PARAMETER__DOES_NOT_APPLY_ON_VARIANTS:
			getDoesNotApplyOnVariants().clear();
			return;
		case AnalysisPackage.PARAMETER__INITIAL_VALUE:
			setInitialValue((ValueSpecification) null);
			return;
		case AnalysisPackage.PARAMETER__CURRENT_VALUE:
			setCurrentValue((ValueSpecification) null);
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
		case AnalysisPackage.PARAMETER__PARAMETER_DEFINITION:
			return parameterDefinition != null;
		case AnalysisPackage.PARAMETER__APPLIES_ONLY_ON_VARIANTS:
			return appliesOnlyOnVariants != null && !appliesOnlyOnVariants.isEmpty();
		case AnalysisPackage.PARAMETER__DOES_NOT_APPLY_ON_VARIANTS:
			return doesNotApplyOnVariants != null && !doesNotApplyOnVariants.isEmpty();
		case AnalysisPackage.PARAMETER__INITIAL_VALUE:
			return initialValue != null;
		case AnalysisPackage.PARAMETER__CURRENT_VALUE:
			return currentValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AnalysisPackage.PARAMETER___IS_VALID:
			return isValid();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ParameterImpl
