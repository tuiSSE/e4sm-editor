/**
 */
package e4sm.de.metamodel.e4sm.security.impl;

import e4sm.de.metamodel.e4sm.security.CVE;
import e4sm.de.metamodel.e4sm.security.CWE;
import e4sm.de.metamodel.e4sm.security.KnownSecurityThreats;
import e4sm.de.metamodel.e4sm.security.SecurityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Known Security Threats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.KnownSecurityThreatsImpl#getCves <em>Cves</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.KnownSecurityThreatsImpl#getCwes <em>Cwes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnownSecurityThreatsImpl extends MinimalEObjectImpl.Container implements KnownSecurityThreats {
	/**
	 * The cached value of the '{@link #getCves() <em>Cves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCves()
	 * @generated
	 * @ordered
	 */
	protected EList<CVE> cves;

	/**
	 * The cached value of the '{@link #getCwes() <em>Cwes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCwes()
	 * @generated
	 * @ordered
	 */
	protected EList<CWE> cwes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnownSecurityThreatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.KNOWN_SECURITY_THREATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CVE> getCves() {
		if (cves == null) {
			cves = new EObjectContainmentEList<CVE>(CVE.class, this, SecurityPackage.KNOWN_SECURITY_THREATS__CVES);
		}
		return cves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CWE> getCwes() {
		if (cwes == null) {
			cwes = new EObjectContainmentEList<CWE>(CWE.class, this, SecurityPackage.KNOWN_SECURITY_THREATS__CWES);
		}
		return cwes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SecurityPackage.KNOWN_SECURITY_THREATS__CVES:
			return ((InternalEList<?>) getCves()).basicRemove(otherEnd, msgs);
		case SecurityPackage.KNOWN_SECURITY_THREATS__CWES:
			return ((InternalEList<?>) getCwes()).basicRemove(otherEnd, msgs);
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
		case SecurityPackage.KNOWN_SECURITY_THREATS__CVES:
			return getCves();
		case SecurityPackage.KNOWN_SECURITY_THREATS__CWES:
			return getCwes();
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
		case SecurityPackage.KNOWN_SECURITY_THREATS__CVES:
			getCves().clear();
			getCves().addAll((Collection<? extends CVE>) newValue);
			return;
		case SecurityPackage.KNOWN_SECURITY_THREATS__CWES:
			getCwes().clear();
			getCwes().addAll((Collection<? extends CWE>) newValue);
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
		case SecurityPackage.KNOWN_SECURITY_THREATS__CVES:
			getCves().clear();
			return;
		case SecurityPackage.KNOWN_SECURITY_THREATS__CWES:
			getCwes().clear();
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
		case SecurityPackage.KNOWN_SECURITY_THREATS__CVES:
			return cves != null && !cves.isEmpty();
		case SecurityPackage.KNOWN_SECURITY_THREATS__CWES:
			return cwes != null && !cwes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KnownSecurityThreatsImpl
