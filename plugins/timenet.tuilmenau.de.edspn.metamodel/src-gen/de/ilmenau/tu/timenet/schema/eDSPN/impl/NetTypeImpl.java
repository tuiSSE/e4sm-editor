/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.impl;

import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage;
import de.ilmenau.tu.timenet.schema.eDSPN.NetType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.NetTypeImpl#isGridActive <em>Grid Active</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.NetTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.NetTypeImpl#getNetclass <em>Netclass</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.NetTypeImpl#isSharpEdges <em>Sharp Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetTypeImpl extends MinimalEObjectImpl.Container implements NetType {
	/**
	 * The default value of the '{@link #isGridActive() <em>Grid Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGridActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRID_ACTIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGridActive() <em>Grid Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGridActive()
	 * @generated
	 * @ordered
	 */
	protected boolean gridActive = GRID_ACTIVE_EDEFAULT;

	/**
	 * This is true if the Grid Active attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gridActiveESet;

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
	 * The default value of the '{@link #getNetclass() <em>Netclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetclass()
	 * @generated
	 * @ordered
	 */
	protected static final String NETCLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetclass() <em>Netclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetclass()
	 * @generated
	 * @ordered
	 */
	protected String netclass = NETCLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isSharpEdges() <em>Sharp Edges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSharpEdges()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHARP_EDGES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSharpEdges() <em>Sharp Edges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSharpEdges()
	 * @generated
	 * @ordered
	 */
	protected boolean sharpEdges = SHARP_EDGES_EDEFAULT;

	/**
	 * This is true if the Sharp Edges attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sharpEdgesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDSPNPackage.Literals.NET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGridActive() {
		return gridActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridActive(boolean newGridActive) {
		boolean oldGridActive = gridActive;
		gridActive = newGridActive;
		boolean oldGridActiveESet = gridActiveESet;
		gridActiveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.NET_TYPE__GRID_ACTIVE, oldGridActive,
					gridActive, !oldGridActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGridActive() {
		boolean oldGridActive = gridActive;
		boolean oldGridActiveESet = gridActiveESet;
		gridActive = GRID_ACTIVE_EDEFAULT;
		gridActiveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDSPNPackage.NET_TYPE__GRID_ACTIVE, oldGridActive,
					GRID_ACTIVE_EDEFAULT, oldGridActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGridActive() {
		return gridActiveESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.NET_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetclass() {
		return netclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetclass(String newNetclass) {
		String oldNetclass = netclass;
		netclass = newNetclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.NET_TYPE__NETCLASS, oldNetclass,
					netclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSharpEdges() {
		return sharpEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharpEdges(boolean newSharpEdges) {
		boolean oldSharpEdges = sharpEdges;
		sharpEdges = newSharpEdges;
		boolean oldSharpEdgesESet = sharpEdgesESet;
		sharpEdgesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.NET_TYPE__SHARP_EDGES, oldSharpEdges,
					sharpEdges, !oldSharpEdgesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSharpEdges() {
		boolean oldSharpEdges = sharpEdges;
		boolean oldSharpEdgesESet = sharpEdgesESet;
		sharpEdges = SHARP_EDGES_EDEFAULT;
		sharpEdgesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDSPNPackage.NET_TYPE__SHARP_EDGES, oldSharpEdges,
					SHARP_EDGES_EDEFAULT, oldSharpEdgesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSharpEdges() {
		return sharpEdgesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDSPNPackage.NET_TYPE__GRID_ACTIVE:
			return isGridActive();
		case EDSPNPackage.NET_TYPE__ID:
			return getId();
		case EDSPNPackage.NET_TYPE__NETCLASS:
			return getNetclass();
		case EDSPNPackage.NET_TYPE__SHARP_EDGES:
			return isSharpEdges();
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
		case EDSPNPackage.NET_TYPE__GRID_ACTIVE:
			setGridActive((Boolean) newValue);
			return;
		case EDSPNPackage.NET_TYPE__ID:
			setId((String) newValue);
			return;
		case EDSPNPackage.NET_TYPE__NETCLASS:
			setNetclass((String) newValue);
			return;
		case EDSPNPackage.NET_TYPE__SHARP_EDGES:
			setSharpEdges((Boolean) newValue);
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
		case EDSPNPackage.NET_TYPE__GRID_ACTIVE:
			unsetGridActive();
			return;
		case EDSPNPackage.NET_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case EDSPNPackage.NET_TYPE__NETCLASS:
			setNetclass(NETCLASS_EDEFAULT);
			return;
		case EDSPNPackage.NET_TYPE__SHARP_EDGES:
			unsetSharpEdges();
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
		case EDSPNPackage.NET_TYPE__GRID_ACTIVE:
			return isSetGridActive();
		case EDSPNPackage.NET_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case EDSPNPackage.NET_TYPE__NETCLASS:
			return NETCLASS_EDEFAULT == null ? netclass != null : !NETCLASS_EDEFAULT.equals(netclass);
		case EDSPNPackage.NET_TYPE__SHARP_EDGES:
			return isSetSharpEdges();
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
		result.append(" (gridActive: ");
		if (gridActiveESet)
			result.append(gridActive);
		else
			result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", netclass: ");
		result.append(netclass);
		result.append(", sharpEdges: ");
		if (sharpEdgesESet)
			result.append(sharpEdges);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NetTypeImpl
