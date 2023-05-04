/**
 */
package e4sm.de.metamodel.e4sm.security.impl;

import e4sm.de.metamodel.e4sm.Component;

import e4sm.de.metamodel.e4sm.security.AssetDefinition;
import e4sm.de.metamodel.e4sm.security.SecurityGoal;
import e4sm.de.metamodel.e4sm.security.SecurityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.AssetDefinitionImpl#getSecurityGoals <em>Security Goals</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.security.impl.AssetDefinitionImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetDefinitionImpl extends MinimalEObjectImpl.Container implements AssetDefinition {
	/**
	 * The cached value of the '{@link #getSecurityGoals() <em>Security Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGoal> securityGoals;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.ASSET_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityGoal> getSecurityGoals() {
		if (securityGoals == null) {
			securityGoals = new EObjectContainmentEList<SecurityGoal>(SecurityGoal.class, this,
					SecurityPackage.ASSET_DEFINITION__SECURITY_GOALS);
		}
		return securityGoals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (Component) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SecurityPackage.ASSET_DEFINITION__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.ASSET_DEFINITION__COMPONENT,
					oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SecurityPackage.ASSET_DEFINITION__SECURITY_GOALS:
			return ((InternalEList<?>) getSecurityGoals()).basicRemove(otherEnd, msgs);
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
		case SecurityPackage.ASSET_DEFINITION__SECURITY_GOALS:
			return getSecurityGoals();
		case SecurityPackage.ASSET_DEFINITION__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
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
		case SecurityPackage.ASSET_DEFINITION__SECURITY_GOALS:
			getSecurityGoals().clear();
			getSecurityGoals().addAll((Collection<? extends SecurityGoal>) newValue);
			return;
		case SecurityPackage.ASSET_DEFINITION__COMPONENT:
			setComponent((Component) newValue);
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
		case SecurityPackage.ASSET_DEFINITION__SECURITY_GOALS:
			getSecurityGoals().clear();
			return;
		case SecurityPackage.ASSET_DEFINITION__COMPONENT:
			setComponent((Component) null);
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
		case SecurityPackage.ASSET_DEFINITION__SECURITY_GOALS:
			return securityGoals != null && !securityGoals.isEmpty();
		case SecurityPackage.ASSET_DEFINITION__COMPONENT:
			return component != null;
		}
		return super.eIsSet(featureID);
	}

} //AssetDefinitionImpl
