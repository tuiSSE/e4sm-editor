/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.impl;

import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage;
import de.ilmenau.tu.timenet.schema.eDSPN.HandleType;
import de.ilmenau.tu.timenet.schema.eDSPN.InhibitType;
import de.ilmenau.tu.timenet.schema.eDSPN.InscriptionType;

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
 * An implementation of the model object '<em><b>Inhibit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.InhibitTypeImpl#getInscription <em>Inscription</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.InhibitTypeImpl#getHandle <em>Handle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InhibitTypeImpl extends ConnectorTypeImpl implements InhibitType {
	/**
	 * The cached value of the '{@link #getInscription() <em>Inscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInscription()
	 * @generated
	 * @ordered
	 */
	protected InscriptionType inscription;

	/**
	 * The cached value of the '{@link #getHandle() <em>Handle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected EList<HandleType> handle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InhibitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDSPNPackage.Literals.INHIBIT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InscriptionType getInscription() {
		return inscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInscription(InscriptionType newInscription, NotificationChain msgs) {
		InscriptionType oldInscription = inscription;
		inscription = newInscription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EDSPNPackage.INHIBIT_TYPE__INSCRIPTION, oldInscription, newInscription);
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
	public void setInscription(InscriptionType newInscription) {
		if (newInscription != inscription) {
			NotificationChain msgs = null;
			if (inscription != null)
				msgs = ((InternalEObject) inscription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EDSPNPackage.INHIBIT_TYPE__INSCRIPTION, null, msgs);
			if (newInscription != null)
				msgs = ((InternalEObject) newInscription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EDSPNPackage.INHIBIT_TYPE__INSCRIPTION, null, msgs);
			msgs = basicSetInscription(newInscription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.INHIBIT_TYPE__INSCRIPTION,
					newInscription, newInscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HandleType> getHandle() {
		if (handle == null) {
			handle = new EObjectContainmentEList<HandleType>(HandleType.class, this, EDSPNPackage.INHIBIT_TYPE__HANDLE);
		}
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDSPNPackage.INHIBIT_TYPE__INSCRIPTION:
			return basicSetInscription(null, msgs);
		case EDSPNPackage.INHIBIT_TYPE__HANDLE:
			return ((InternalEList<?>) getHandle()).basicRemove(otherEnd, msgs);
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
		case EDSPNPackage.INHIBIT_TYPE__INSCRIPTION:
			return getInscription();
		case EDSPNPackage.INHIBIT_TYPE__HANDLE:
			return getHandle();
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
		case EDSPNPackage.INHIBIT_TYPE__INSCRIPTION:
			setInscription((InscriptionType) newValue);
			return;
		case EDSPNPackage.INHIBIT_TYPE__HANDLE:
			getHandle().clear();
			getHandle().addAll((Collection<? extends HandleType>) newValue);
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
		case EDSPNPackage.INHIBIT_TYPE__INSCRIPTION:
			setInscription((InscriptionType) null);
			return;
		case EDSPNPackage.INHIBIT_TYPE__HANDLE:
			getHandle().clear();
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
		case EDSPNPackage.INHIBIT_TYPE__INSCRIPTION:
			return inscription != null;
		case EDSPNPackage.INHIBIT_TYPE__HANDLE:
			return handle != null && !handle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InhibitTypeImpl
