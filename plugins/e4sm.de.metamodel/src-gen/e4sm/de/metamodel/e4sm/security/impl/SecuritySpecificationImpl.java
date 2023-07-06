/**
 */
package e4sm.de.metamodel.e4sm.security.impl;

import e4sm.de.metamodel.e4sm.security.AssetDefinition;
import e4sm.de.metamodel.e4sm.security.AttackSurface;
import e4sm.de.metamodel.e4sm.security.SecurityPackage;
import e4sm.de.metamodel.e4sm.security.SecuritySpecification;
import e4sm.de.metamodel.e4sm.security.ThreatCondition;

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
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.SecuritySpecificationImpl#getAssetDefinitions <em>Asset Definitions</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.SecuritySpecificationImpl#getThreatConditions <em>Threat Conditions</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.SecuritySpecificationImpl#getAttackSurfaces <em>Attack Surfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecuritySpecificationImpl extends MinimalEObjectImpl.Container implements SecuritySpecification {
	/**
	 * The cached value of the '{@link #getAssetDefinitions() <em>Asset Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetDefinition> assetDefinitions;

	/**
	 * The cached value of the '{@link #getThreatConditions() <em>Threat Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreatConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ThreatCondition> threatConditions;

	/**
	 * The cached value of the '{@link #getAttackSurfaces() <em>Attack Surfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackSurfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<AttackSurface> attackSurfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.SECURITY_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssetDefinition> getAssetDefinitions() {
		if (assetDefinitions == null) {
			assetDefinitions = new EObjectContainmentEList<AssetDefinition>(AssetDefinition.class, this,
					SecurityPackage.SECURITY_SPECIFICATION__ASSET_DEFINITIONS);
		}
		return assetDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ThreatCondition> getThreatConditions() {
		if (threatConditions == null) {
			threatConditions = new EObjectContainmentEList<ThreatCondition>(ThreatCondition.class, this,
					SecurityPackage.SECURITY_SPECIFICATION__THREAT_CONDITIONS);
		}
		return threatConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttackSurface> getAttackSurfaces() {
		if (attackSurfaces == null) {
			attackSurfaces = new EObjectContainmentEList<AttackSurface>(AttackSurface.class, this,
					SecurityPackage.SECURITY_SPECIFICATION__ATTACK_SURFACES);
		}
		return attackSurfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SecurityPackage.SECURITY_SPECIFICATION__ASSET_DEFINITIONS:
			return ((InternalEList<?>) getAssetDefinitions()).basicRemove(otherEnd, msgs);
		case SecurityPackage.SECURITY_SPECIFICATION__THREAT_CONDITIONS:
			return ((InternalEList<?>) getThreatConditions()).basicRemove(otherEnd, msgs);
		case SecurityPackage.SECURITY_SPECIFICATION__ATTACK_SURFACES:
			return ((InternalEList<?>) getAttackSurfaces()).basicRemove(otherEnd, msgs);
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
		case SecurityPackage.SECURITY_SPECIFICATION__ASSET_DEFINITIONS:
			return getAssetDefinitions();
		case SecurityPackage.SECURITY_SPECIFICATION__THREAT_CONDITIONS:
			return getThreatConditions();
		case SecurityPackage.SECURITY_SPECIFICATION__ATTACK_SURFACES:
			return getAttackSurfaces();
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
		case SecurityPackage.SECURITY_SPECIFICATION__ASSET_DEFINITIONS:
			getAssetDefinitions().clear();
			getAssetDefinitions().addAll((Collection<? extends AssetDefinition>) newValue);
			return;
		case SecurityPackage.SECURITY_SPECIFICATION__THREAT_CONDITIONS:
			getThreatConditions().clear();
			getThreatConditions().addAll((Collection<? extends ThreatCondition>) newValue);
			return;
		case SecurityPackage.SECURITY_SPECIFICATION__ATTACK_SURFACES:
			getAttackSurfaces().clear();
			getAttackSurfaces().addAll((Collection<? extends AttackSurface>) newValue);
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
		case SecurityPackage.SECURITY_SPECIFICATION__ASSET_DEFINITIONS:
			getAssetDefinitions().clear();
			return;
		case SecurityPackage.SECURITY_SPECIFICATION__THREAT_CONDITIONS:
			getThreatConditions().clear();
			return;
		case SecurityPackage.SECURITY_SPECIFICATION__ATTACK_SURFACES:
			getAttackSurfaces().clear();
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
		case SecurityPackage.SECURITY_SPECIFICATION__ASSET_DEFINITIONS:
			return assetDefinitions != null && !assetDefinitions.isEmpty();
		case SecurityPackage.SECURITY_SPECIFICATION__THREAT_CONDITIONS:
			return threatConditions != null && !threatConditions.isEmpty();
		case SecurityPackage.SECURITY_SPECIFICATION__ATTACK_SURFACES:
			return attackSurfaces != null && !attackSurfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecuritySpecificationImpl
