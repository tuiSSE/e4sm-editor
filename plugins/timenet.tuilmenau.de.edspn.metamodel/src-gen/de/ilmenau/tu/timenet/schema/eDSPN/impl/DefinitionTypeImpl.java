/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.impl;

import de.ilmenau.tu.timenet.schema.eDSPN.AddDataType;
import de.ilmenau.tu.timenet.schema.eDSPN.DefTypeType;
import de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.DefinitionTypeImpl#getAdditionalData <em>Additional Data</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.DefinitionTypeImpl#getDefType <em>Def Type</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.DefinitionTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.DefinitionTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionTypeImpl extends TextTypeImpl implements DefinitionType {
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
	 * The default value of the '{@link #getDefType() <em>Def Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefType()
	 * @generated
	 * @ordered
	 */
	protected static final DefTypeType DEF_TYPE_EDEFAULT = DefTypeType.INT;

	/**
	 * The cached value of the '{@link #getDefType() <em>Def Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefType()
	 * @generated
	 * @ordered
	 */
	protected DefTypeType defType = DEF_TYPE_EDEFAULT;

	/**
	 * This is true if the Def Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defTypeESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDSPNPackage.Literals.DEFINITION_TYPE;
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
					EDSPNPackage.DEFINITION_TYPE__ADDITIONAL_DATA, oldAdditionalData, newAdditionalData);
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
						EOPPOSITE_FEATURE_BASE - EDSPNPackage.DEFINITION_TYPE__ADDITIONAL_DATA, null, msgs);
			if (newAdditionalData != null)
				msgs = ((InternalEObject) newAdditionalData).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EDSPNPackage.DEFINITION_TYPE__ADDITIONAL_DATA, null, msgs);
			msgs = basicSetAdditionalData(newAdditionalData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.DEFINITION_TYPE__ADDITIONAL_DATA,
					newAdditionalData, newAdditionalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefTypeType getDefType() {
		return defType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefType(DefTypeType newDefType) {
		DefTypeType oldDefType = defType;
		defType = newDefType == null ? DEF_TYPE_EDEFAULT : newDefType;
		boolean oldDefTypeESet = defTypeESet;
		defTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.DEFINITION_TYPE__DEF_TYPE, oldDefType,
					defType, !oldDefTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefType() {
		DefTypeType oldDefType = defType;
		boolean oldDefTypeESet = defTypeESet;
		defType = DEF_TYPE_EDEFAULT;
		defTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDSPNPackage.DEFINITION_TYPE__DEF_TYPE, oldDefType,
					DEF_TYPE_EDEFAULT, oldDefTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefType() {
		return defTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.DEFINITION_TYPE__EXPRESSION,
					oldExpression, expression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.DEFINITION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDSPNPackage.DEFINITION_TYPE__ADDITIONAL_DATA:
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
		case EDSPNPackage.DEFINITION_TYPE__ADDITIONAL_DATA:
			return getAdditionalData();
		case EDSPNPackage.DEFINITION_TYPE__DEF_TYPE:
			return getDefType();
		case EDSPNPackage.DEFINITION_TYPE__EXPRESSION:
			return getExpression();
		case EDSPNPackage.DEFINITION_TYPE__NAME:
			return getName();
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
		case EDSPNPackage.DEFINITION_TYPE__ADDITIONAL_DATA:
			setAdditionalData((AddDataType) newValue);
			return;
		case EDSPNPackage.DEFINITION_TYPE__DEF_TYPE:
			setDefType((DefTypeType) newValue);
			return;
		case EDSPNPackage.DEFINITION_TYPE__EXPRESSION:
			setExpression((String) newValue);
			return;
		case EDSPNPackage.DEFINITION_TYPE__NAME:
			setName((String) newValue);
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
		case EDSPNPackage.DEFINITION_TYPE__ADDITIONAL_DATA:
			setAdditionalData((AddDataType) null);
			return;
		case EDSPNPackage.DEFINITION_TYPE__DEF_TYPE:
			unsetDefType();
			return;
		case EDSPNPackage.DEFINITION_TYPE__EXPRESSION:
			setExpression(EXPRESSION_EDEFAULT);
			return;
		case EDSPNPackage.DEFINITION_TYPE__NAME:
			setName(NAME_EDEFAULT);
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
		case EDSPNPackage.DEFINITION_TYPE__ADDITIONAL_DATA:
			return additionalData != null;
		case EDSPNPackage.DEFINITION_TYPE__DEF_TYPE:
			return isSetDefType();
		case EDSPNPackage.DEFINITION_TYPE__EXPRESSION:
			return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		case EDSPNPackage.DEFINITION_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (defType: ");
		if (defTypeESet)
			result.append(defType);
		else
			result.append("<unset>");
		result.append(", expression: ");
		result.append(expression);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DefinitionTypeImpl
