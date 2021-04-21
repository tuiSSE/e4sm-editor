/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.PhysicalComponent;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getSoftwareComponents <em>Software Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getPhisicalComponents <em>Phisical Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getSectors <em>Sectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements e4sm.de.metamodel.e4sm.Package {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getSoftwareComponents() <em>Software Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareComponent> softwareComponents;

	/**
	 * The cached value of the '{@link #getPhisicalComponents() <em>Phisical Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhisicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> phisicalComponents;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

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
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, e4smPackage.PACKAGE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareComponent> getSoftwareComponents() {
		if (softwareComponents == null) {
			softwareComponents = new EObjectResolvingEList<SoftwareComponent>(SoftwareComponent.class, this,
					e4smPackage.PACKAGE__SOFTWARE_COMPONENTS);
		}
		return softwareComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalComponent> getPhisicalComponents() {
		if (phisicalComponents == null) {
			phisicalComponents = new EObjectResolvingEList<PhysicalComponent>(PhysicalComponent.class, this,
					e4smPackage.PACKAGE__PHISICAL_COMPONENTS);
		}
		return phisicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, e4smPackage.PACKAGE__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sector> getSectors() {
		if (sectors == null) {
			sectors = new EObjectContainmentEList<Sector>(Sector.class, this, e4smPackage.PACKAGE__SECTORS);
		}
		return sectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.PACKAGE__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case e4smPackage.PACKAGE__CONNECTORS:
			return ((InternalEList<?>) getConnectors()).basicRemove(otherEnd, msgs);
		case e4smPackage.PACKAGE__SECTORS:
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
		case e4smPackage.PACKAGE__COMPONENTS:
			return getComponents();
		case e4smPackage.PACKAGE__SOFTWARE_COMPONENTS:
			return getSoftwareComponents();
		case e4smPackage.PACKAGE__PHISICAL_COMPONENTS:
			return getPhisicalComponents();
		case e4smPackage.PACKAGE__CONNECTORS:
			return getConnectors();
		case e4smPackage.PACKAGE__SECTORS:
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
		case e4smPackage.PACKAGE__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case e4smPackage.PACKAGE__SOFTWARE_COMPONENTS:
			getSoftwareComponents().clear();
			getSoftwareComponents().addAll((Collection<? extends SoftwareComponent>) newValue);
			return;
		case e4smPackage.PACKAGE__PHISICAL_COMPONENTS:
			getPhisicalComponents().clear();
			getPhisicalComponents().addAll((Collection<? extends PhysicalComponent>) newValue);
			return;
		case e4smPackage.PACKAGE__CONNECTORS:
			getConnectors().clear();
			getConnectors().addAll((Collection<? extends Connector>) newValue);
			return;
		case e4smPackage.PACKAGE__SECTORS:
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
		case e4smPackage.PACKAGE__COMPONENTS:
			getComponents().clear();
			return;
		case e4smPackage.PACKAGE__SOFTWARE_COMPONENTS:
			getSoftwareComponents().clear();
			return;
		case e4smPackage.PACKAGE__PHISICAL_COMPONENTS:
			getPhisicalComponents().clear();
			return;
		case e4smPackage.PACKAGE__CONNECTORS:
			getConnectors().clear();
			return;
		case e4smPackage.PACKAGE__SECTORS:
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
		case e4smPackage.PACKAGE__COMPONENTS:
			return components != null && !components.isEmpty();
		case e4smPackage.PACKAGE__SOFTWARE_COMPONENTS:
			return softwareComponents != null && !softwareComponents.isEmpty();
		case e4smPackage.PACKAGE__PHISICAL_COMPONENTS:
			return phisicalComponents != null && !phisicalComponents.isEmpty();
		case e4smPackage.PACKAGE__CONNECTORS:
			return connectors != null && !connectors.isEmpty();
		case e4smPackage.PACKAGE__SECTORS:
			return sectors != null && !sectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
