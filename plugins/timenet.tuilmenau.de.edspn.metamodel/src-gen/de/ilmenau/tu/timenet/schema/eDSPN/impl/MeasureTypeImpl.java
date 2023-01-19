/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.impl;

import de.ilmenau.tu.timenet.schema.eDSPN.AddDataType;
import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage;
import de.ilmenau.tu.timenet.schema.eDSPN.MeasureType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.MeasureTypeImpl#getAdditionalData <em>Additional Data</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.MeasureTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.MeasureTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.MeasureTypeImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureTypeImpl extends TextTypeImpl implements MeasureType {
	/**
	 * The cached value of the '{@link #getAdditionalData() <em>Additional Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalData()
	 * @generated
	 * @ordered
	 */
	protected AddDataType additionalData;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String result = RESULT_EDEFAULT;

	/**
	 * This is true if the Result attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDSPNPackage.Literals.MEASURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddDataType getAdditionalData() {
		return additionalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalData(AddDataType newAdditionalData, NotificationChain msgs) {
		AddDataType oldAdditionalData = additionalData;
		additionalData = newAdditionalData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EDSPNPackage.MEASURE_TYPE__ADDITIONAL_DATA, oldAdditionalData, newAdditionalData);
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
	public void setAdditionalData(AddDataType newAdditionalData) {
		if (newAdditionalData != additionalData) {
			NotificationChain msgs = null;
			if (additionalData != null)
				msgs = ((InternalEObject) additionalData).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EDSPNPackage.MEASURE_TYPE__ADDITIONAL_DATA, null, msgs);
			if (newAdditionalData != null)
				msgs = ((InternalEObject) newAdditionalData).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EDSPNPackage.MEASURE_TYPE__ADDITIONAL_DATA, null, msgs);
			msgs = basicSetAdditionalData(newAdditionalData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.MEASURE_TYPE__ADDITIONAL_DATA,
					newAdditionalData, newAdditionalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.MEASURE_TYPE__EXPRESSION, oldExpression,
					expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.MEASURE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult) {
		String oldResult = result;
		result = newResult;
		boolean oldResultESet = resultESet;
		resultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.MEASURE_TYPE__RESULT, oldResult, result,
					!oldResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResult() {
		String oldResult = result;
		boolean oldResultESet = resultESet;
		result = RESULT_EDEFAULT;
		resultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDSPNPackage.MEASURE_TYPE__RESULT, oldResult,
					RESULT_EDEFAULT, oldResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResult() {
		return resultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDSPNPackage.MEASURE_TYPE__ADDITIONAL_DATA:
			return basicSetAdditionalData(null, msgs);
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
		case EDSPNPackage.MEASURE_TYPE__ADDITIONAL_DATA:
			return getAdditionalData();
		case EDSPNPackage.MEASURE_TYPE__EXPRESSION:
			return getExpression();
		case EDSPNPackage.MEASURE_TYPE__NAME:
			return getName();
		case EDSPNPackage.MEASURE_TYPE__RESULT:
			return getResult();
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
		case EDSPNPackage.MEASURE_TYPE__ADDITIONAL_DATA:
			setAdditionalData((AddDataType) newValue);
			return;
		case EDSPNPackage.MEASURE_TYPE__EXPRESSION:
			setExpression((String) newValue);
			return;
		case EDSPNPackage.MEASURE_TYPE__NAME:
			setName((String) newValue);
			return;
		case EDSPNPackage.MEASURE_TYPE__RESULT:
			setResult((String) newValue);
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
		case EDSPNPackage.MEASURE_TYPE__ADDITIONAL_DATA:
			setAdditionalData((AddDataType) null);
			return;
		case EDSPNPackage.MEASURE_TYPE__EXPRESSION:
			setExpression(EXPRESSION_EDEFAULT);
			return;
		case EDSPNPackage.MEASURE_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDSPNPackage.MEASURE_TYPE__RESULT:
			unsetResult();
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
		case EDSPNPackage.MEASURE_TYPE__ADDITIONAL_DATA:
			return additionalData != null;
		case EDSPNPackage.MEASURE_TYPE__EXPRESSION:
			return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		case EDSPNPackage.MEASURE_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDSPNPackage.MEASURE_TYPE__RESULT:
			return isSetResult();
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(", name: ");
		result.append(name);
		result.append(", result: ");
		if (resultESet)
			result.append(result);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MeasureTypeImpl
