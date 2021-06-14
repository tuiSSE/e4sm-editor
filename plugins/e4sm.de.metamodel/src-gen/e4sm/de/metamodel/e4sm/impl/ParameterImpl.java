/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Parameter;
import e4sm.de.metamodel.e4sm.ParameterDefinition;
import e4sm.de.metamodel.e4sm.e4smPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ParameterImpl#getParameterDefinition <em>Parameter Definition</em>}</li>
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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected String initialValue = INITIAL_VALUE_EDEFAULT;

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
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PARAMETER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialValue(String newInitialValue) {
		String oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PARAMETER__INITIAL_VALUE, oldInitialValue,
					initialValue));
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
		case e4smPackage.PARAMETER__INITIAL_VALUE:
			return getInitialValue();
		case e4smPackage.PARAMETER__PARAMETER_DEFINITION:
			if (resolve)
				return getParameterDefinition();
			return basicGetParameterDefinition();
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
		case e4smPackage.PARAMETER__VALUE:
			setValue((String) newValue);
			return;
		case e4smPackage.PARAMETER__INITIAL_VALUE:
			setInitialValue((String) newValue);
			return;
		case e4smPackage.PARAMETER__PARAMETER_DEFINITION:
			setParameterDefinition((ParameterDefinition) newValue);
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
		case e4smPackage.PARAMETER__INITIAL_VALUE:
			setInitialValue(INITIAL_VALUE_EDEFAULT);
			return;
		case e4smPackage.PARAMETER__PARAMETER_DEFINITION:
			setParameterDefinition((ParameterDefinition) null);
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
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case e4smPackage.PARAMETER__INITIAL_VALUE:
			return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
		case e4smPackage.PARAMETER__PARAMETER_DEFINITION:
			return parameterDefinition != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", initialValue: ");
		result.append(initialValue);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
