/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.impl;

import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage;
import de.ilmenau.tu.timenet.schema.eDSPN.GraphicsType;
import de.ilmenau.tu.timenet.schema.eDSPN.NodeType;
import de.ilmenau.tu.timenet.schema.eDSPN.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.NodeTypeImpl#getGraphics <em>Graphics</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.NodeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.NodeTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeTypeImpl extends MinimalEObjectImpl.Container implements NodeType {
	/**
	 * The cached value of the '{@link #getGraphics() <em>Graphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphics()
	 * @generated
	 * @ordered
	 */
	protected GraphicsType graphics;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.NODE;

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
	protected NodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDSPNPackage.Literals.NODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsType getGraphics() {
		return graphics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphics(GraphicsType newGraphics, NotificationChain msgs) {
		GraphicsType oldGraphics = graphics;
		graphics = newGraphics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EDSPNPackage.NODE_TYPE__GRAPHICS, oldGraphics, newGraphics);
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
	public void setGraphics(GraphicsType newGraphics) {
		if (newGraphics != graphics) {
			NotificationChain msgs = null;
			if (graphics != null)
				msgs = ((InternalEObject) graphics).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EDSPNPackage.NODE_TYPE__GRAPHICS, null, msgs);
			if (newGraphics != null)
				msgs = ((InternalEObject) newGraphics).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EDSPNPackage.NODE_TYPE__GRAPHICS, null, msgs);
			msgs = basicSetGraphics(newGraphics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.NODE_TYPE__GRAPHICS, newGraphics,
					newGraphics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.NODE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.NODE_TYPE__TYPE, oldType, type,
					!oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		Type oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDSPNPackage.NODE_TYPE__TYPE, oldType,
					TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDSPNPackage.NODE_TYPE__GRAPHICS:
			return basicSetGraphics(null, msgs);
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
		case EDSPNPackage.NODE_TYPE__GRAPHICS:
			return getGraphics();
		case EDSPNPackage.NODE_TYPE__ID:
			return getId();
		case EDSPNPackage.NODE_TYPE__TYPE:
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
		case EDSPNPackage.NODE_TYPE__GRAPHICS:
			setGraphics((GraphicsType) newValue);
			return;
		case EDSPNPackage.NODE_TYPE__ID:
			setId((String) newValue);
			return;
		case EDSPNPackage.NODE_TYPE__TYPE:
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
		case EDSPNPackage.NODE_TYPE__GRAPHICS:
			setGraphics((GraphicsType) null);
			return;
		case EDSPNPackage.NODE_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case EDSPNPackage.NODE_TYPE__TYPE:
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
		case EDSPNPackage.NODE_TYPE__GRAPHICS:
			return graphics != null;
		case EDSPNPackage.NODE_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case EDSPNPackage.NODE_TYPE__TYPE:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		if (typeESet)
			result.append(type);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NodeTypeImpl
