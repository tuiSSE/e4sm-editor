/**
 */
package e4sm.de.metamodel.e4sm.execution.impl;

import e4sm.de.metamodel.e4sm.core.AttributeSpecification;
import e4sm.de.metamodel.e4sm.execution.BinaryExpression;
import e4sm.de.metamodel.e4sm.execution.ExecutionElement;
import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
import e4sm.de.metamodel.e4sm.execution.Expression;
import e4sm.de.metamodel.e4sm.execution.InputPinAttributeReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Pin Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.InputPinAttributeReferenceImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputPinAttributeReferenceImpl extends InputPinReferenceImpl implements InputPinAttributeReference {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected AttributeSpecification attribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPinAttributeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.INPUT_PIN_ATTRIBUTE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeSpecification getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject) attribute;
			attribute = (AttributeSpecification) eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExecutionPackage.INPUT_PIN_ATTRIBUTE_REFERENCE__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSpecification basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribute(AttributeSpecification newAttribute) {
		AttributeSpecification oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExecutionPackage.INPUT_PIN_ATTRIBUTE_REFERENCE__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExecutionPackage.INPUT_PIN_ATTRIBUTE_REFERENCE__ATTRIBUTE:
			if (resolve)
				return getAttribute();
			return basicGetAttribute();
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
		case ExecutionPackage.INPUT_PIN_ATTRIBUTE_REFERENCE__ATTRIBUTE:
			setAttribute((AttributeSpecification) newValue);
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
		case ExecutionPackage.INPUT_PIN_ATTRIBUTE_REFERENCE__ATTRIBUTE:
			setAttribute((AttributeSpecification) null);
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
		case ExecutionPackage.INPUT_PIN_ATTRIBUTE_REFERENCE__ATTRIBUTE:
			return attribute != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ExecutionElement getActualParent() {
		var c = this.eContainer();
		if (c instanceof BinaryExpression) {
			BinaryExpression b = (BinaryExpression) c;
			if (b.isRealOperation()) {
				return b;
			}
			return b.getActualParent();
		}
		if (c instanceof Expression) {
			Expression e = (Expression) c;
			return e.getActualParent();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Expression getTangibleChild() {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return inputPin.getName() + "." + attribute.getName();
	}

} //InputPinAttributeReferenceImpl
