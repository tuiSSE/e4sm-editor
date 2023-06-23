/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.SecurityThreatsImport;
import e4sm.de.metamodel.e4sm.e4smPackage;

import e4sm.de.metamodel.e4sm.security.KnownSecurityThreats;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Threats Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.SecurityThreatsImportImpl#getSecurityThreat <em>Security Threat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityThreatsImportImpl extends MinimalEObjectImpl.Container implements SecurityThreatsImport {
	/**
	 * The cached value of the '{@link #getSecurityThreat() <em>Security Threat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityThreat()
	 * @generated
	 * @ordered
	 */
	protected KnownSecurityThreats securityThreat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityThreatsImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.SECURITY_THREATS_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KnownSecurityThreats getSecurityThreat() {
		if (securityThreat != null && securityThreat.eIsProxy()) {
			InternalEObject oldSecurityThreat = (InternalEObject) securityThreat;
			securityThreat = (KnownSecurityThreats) eResolveProxy(oldSecurityThreat);
			if (securityThreat != oldSecurityThreat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							e4smPackage.SECURITY_THREATS_IMPORT__SECURITY_THREAT, oldSecurityThreat, securityThreat));
			}
		}
		return securityThreat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnownSecurityThreats basicGetSecurityThreat() {
		return securityThreat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityThreat(KnownSecurityThreats newSecurityThreat) {
		KnownSecurityThreats oldSecurityThreat = securityThreat;
		securityThreat = newSecurityThreat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.SECURITY_THREATS_IMPORT__SECURITY_THREAT,
					oldSecurityThreat, securityThreat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.SECURITY_THREATS_IMPORT__SECURITY_THREAT:
			if (resolve)
				return getSecurityThreat();
			return basicGetSecurityThreat();
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
		case e4smPackage.SECURITY_THREATS_IMPORT__SECURITY_THREAT:
			setSecurityThreat((KnownSecurityThreats) newValue);
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
		case e4smPackage.SECURITY_THREATS_IMPORT__SECURITY_THREAT:
			setSecurityThreat((KnownSecurityThreats) null);
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
		case e4smPackage.SECURITY_THREATS_IMPORT__SECURITY_THREAT:
			return securityThreat != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityThreatsImportImpl
