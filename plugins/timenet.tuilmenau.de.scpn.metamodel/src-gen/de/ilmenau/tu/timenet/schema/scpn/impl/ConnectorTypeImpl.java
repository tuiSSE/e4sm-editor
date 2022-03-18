/**
 */
package de.ilmenau.tu.timenet.schema.scpn.impl;

import de.ilmenau.tu.timenet.schema.scpn.ConnectorType;
import de.ilmenau.tu.timenet.schema.scpn.Type;
import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ConnectorTypeImpl#getFromNode <em>From Node</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ConnectorTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ConnectorTypeImpl#getToNode <em>To Node</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ConnectorTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorTypeImpl extends MinimalEObjectImpl.Container implements ConnectorType {
	/**
	 * The default value of the '{@link #getFromNode() <em>From Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromNode()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromNode() <em>From Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromNode()
	 * @generated
	 * @ordered
	 */
	protected String fromNode = FROM_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getToNode() <em>To Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNode()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToNode() <em>To Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNode()
	 * @generated
	 * @ordered
	 */
	protected String toNode = TO_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.CONNECTOR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scpnPackage.Literals.CONNECTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromNode() {
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromNode(String newFromNode) {
		String oldFromNode = fromNode;
		fromNode = newFromNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.CONNECTOR_TYPE__FROM_NODE, oldFromNode,
					fromNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.CONNECTOR_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToNode() {
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToNode(String newToNode) {
		String oldToNode = toNode;
		toNode = newToNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.CONNECTOR_TYPE__TO_NODE, oldToNode,
					toNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.CONNECTOR_TYPE__TYPE, oldType, type,
					!oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		Type oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scpnPackage.CONNECTOR_TYPE__TYPE, oldType,
					TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case scpnPackage.CONNECTOR_TYPE__FROM_NODE:
			return getFromNode();
		case scpnPackage.CONNECTOR_TYPE__ID:
			return getId();
		case scpnPackage.CONNECTOR_TYPE__TO_NODE:
			return getToNode();
		case scpnPackage.CONNECTOR_TYPE__TYPE:
			return getType();
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
		case scpnPackage.CONNECTOR_TYPE__FROM_NODE:
			setFromNode((String) newValue);
			return;
		case scpnPackage.CONNECTOR_TYPE__ID:
			setId((String) newValue);
			return;
		case scpnPackage.CONNECTOR_TYPE__TO_NODE:
			setToNode((String) newValue);
			return;
		case scpnPackage.CONNECTOR_TYPE__TYPE:
			setType((Type) newValue);
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
		case scpnPackage.CONNECTOR_TYPE__FROM_NODE:
			setFromNode(FROM_NODE_EDEFAULT);
			return;
		case scpnPackage.CONNECTOR_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case scpnPackage.CONNECTOR_TYPE__TO_NODE:
			setToNode(TO_NODE_EDEFAULT);
			return;
		case scpnPackage.CONNECTOR_TYPE__TYPE:
			unsetType();
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
		case scpnPackage.CONNECTOR_TYPE__FROM_NODE:
			return FROM_NODE_EDEFAULT == null ? fromNode != null : !FROM_NODE_EDEFAULT.equals(fromNode);
		case scpnPackage.CONNECTOR_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case scpnPackage.CONNECTOR_TYPE__TO_NODE:
			return TO_NODE_EDEFAULT == null ? toNode != null : !TO_NODE_EDEFAULT.equals(toNode);
		case scpnPackage.CONNECTOR_TYPE__TYPE:
			return isSetType();
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
		result.append(" (fromNode: ");
		result.append(fromNode);
		result.append(", id: ");
		result.append(id);
		result.append(", toNode: ");
		result.append(toNode);
		result.append(", type: ");
		if (typeESet)
			result.append(type);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConnectorTypeImpl
