/**
 */
package de.ilmenau.tu.timenet.schema.scpn.impl;

import de.ilmenau.tu.timenet.schema.scpn.ReplicationType;
import de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType;
import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substitution Transition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.SubstitutionTransitionTypeImpl#getNet <em>Net</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.SubstitutionTransitionTypeImpl#getReplication <em>Replication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstitutionTransitionTypeImpl extends TransitionTypeImpl implements SubstitutionTransitionType {
	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected EList<ReplicationType> net;

	/**
	 * The default value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger REPLICATION_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected BigInteger replication = REPLICATION_EDEFAULT;

	/**
	 * This is true if the Replication attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean replicationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstitutionTransitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scpnPackage.Literals.SUBSTITUTION_TRANSITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReplicationType> getNet() {
		if (net == null) {
			net = new EObjectContainmentEList<ReplicationType>(ReplicationType.class, this,
					scpnPackage.SUBSTITUTION_TRANSITION_TYPE__NET);
		}
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getReplication() {
		return replication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplication(BigInteger newReplication) {
		BigInteger oldReplication = replication;
		replication = newReplication;
		boolean oldReplicationESet = replicationESet;
		replicationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.SUBSTITUTION_TRANSITION_TYPE__REPLICATION,
					oldReplication, replication, !oldReplicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetReplication() {
		BigInteger oldReplication = replication;
		boolean oldReplicationESet = replicationESet;
		replication = REPLICATION_EDEFAULT;
		replicationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					scpnPackage.SUBSTITUTION_TRANSITION_TYPE__REPLICATION, oldReplication, REPLICATION_EDEFAULT,
					oldReplicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetReplication() {
		return replicationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case scpnPackage.SUBSTITUTION_TRANSITION_TYPE__NET:
			return ((InternalEList<?>) getNet()).basicRemove(otherEnd, msgs);
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
		case scpnPackage.SUBSTITUTION_TRANSITION_TYPE__NET:
			return getNet();
		case scpnPackage.SUBSTITUTION_TRANSITION_TYPE__REPLICATION:
			return getReplication();
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
		case scpnPackage.SUBSTITUTION_TRANSITION_TYPE__NET:
			getNet().clear();
			getNet().addAll((Collection<? extends ReplicationType>) newValue);
			return;
		case scpnPackage.SUBSTITUTION_TRANSITION_TYPE__REPLICATION:
			setReplication((BigInteger) newValue);
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
		case scpnPackage.SUBSTITUTION_TRANSITION_TYPE__NET:
			getNet().clear();
			return;
		case scpnPackage.SUBSTITUTION_TRANSITION_TYPE__REPLICATION:
			unsetReplication();
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
		case scpnPackage.SUBSTITUTION_TRANSITION_TYPE__NET:
			return net != null && !net.isEmpty();
		case scpnPackage.SUBSTITUTION_TRANSITION_TYPE__REPLICATION:
			return isSetReplication();
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
		result.append(" (replication: ");
		if (replicationESet)
			result.append(replication);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SubstitutionTransitionTypeImpl
