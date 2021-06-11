/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.PhysicalComponent;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.SectorImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.SectorImpl#getSectors <em>Sectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectorImpl extends NamedElementImpl implements Sector {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> components;

	/**
	 * The cached value of the '{@link #getSectors() <em>Sectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sector> sectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.SECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<PhysicalComponent>(PhysicalComponent.class, this,
					e4smPackage.SECTOR__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sector> getSectors() {
		if (sectors == null) {
			sectors = new EObjectContainmentEList<Sector>(Sector.class, this, e4smPackage.SECTOR__SECTORS);
		}
		return sectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getAllComponents() {
		EList<Component> res = ECollections.newBasicEList(this.getComponents());
		this.getSectors().forEach(s -> {
			res.addAll(s.getAllComponents());
		});
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.SECTOR__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case e4smPackage.SECTOR__SECTORS:
			return ((InternalEList<?>) getSectors()).basicRemove(otherEnd, msgs);
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
		case e4smPackage.SECTOR__COMPONENTS:
			return getComponents();
		case e4smPackage.SECTOR__SECTORS:
			return getSectors();
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
		case e4smPackage.SECTOR__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends PhysicalComponent>) newValue);
			return;
		case e4smPackage.SECTOR__SECTORS:
			getSectors().clear();
			getSectors().addAll((Collection<? extends Sector>) newValue);
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
		case e4smPackage.SECTOR__COMPONENTS:
			getComponents().clear();
			return;
		case e4smPackage.SECTOR__SECTORS:
			getSectors().clear();
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
		case e4smPackage.SECTOR__COMPONENTS:
			return components != null && !components.isEmpty();
		case e4smPackage.SECTOR__SECTORS:
			return sectors != null && !sectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case e4smPackage.SECTOR___GET_ALL_COMPONENTS:
			return getAllComponents();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SectorImpl
