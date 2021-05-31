/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.Person;
import e4sm.de.metamodel.e4sm.PhysicalComponent;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Package</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getComponents
 * <em>Components</em>}</li>
 * <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getSoftwareComponents
 * <em>Software Components</em>}</li>
 * <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getPhysicalComponents
 * <em>Physical Components</em>}</li>
 * <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getConnectors
 * <em>Connectors</em>}</li>
 * <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getSectors
 * <em>Sectors</em>}</li>
 * <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getMainResponsible
 * <em>Main Responsible</em>}</li>
 * <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getPackages
 * <em>Packages</em>}</li>
 * <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getContainedBy
 * <em>Contained By</em>}</li>
 * <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getSpecifiesComponent
 * <em>Specifies Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements e4sm.de.metamodel.e4sm.Package {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getSoftwareComponents() <em>Software
	 * Components</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getSoftwareComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareComponent> softwareComponents;

	/**
	 * The cached value of the '{@link #getPhysicalComponents() <em>Physical
	 * Components</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getPhysicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> physicalComponents;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getSectors() <em>Sectors</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sector> sectors;

	/**
	 * The cached value of the '{@link #getMainResponsible() <em>Main
	 * Responsible</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMainResponsible()
	 * @generated
	 * @ordered
	 */
	protected Person mainResponsible;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<e4sm.de.metamodel.e4sm.Package> packages;

	/**
	 * The cached value of the '{@link #getSpecifiesComponent() <em>Specifies
	 * Component</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSpecifiesComponent()
	 * @generated
	 * @ordered
	 */
	protected Component specifiesComponent;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, e4smPackage.PACKAGE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<SoftwareComponent> getSoftwareComponents() {
		if (softwareComponents == null) {
			softwareComponents = new EObjectResolvingEList<SoftwareComponent>(SoftwareComponent.class, this,
					e4smPackage.PACKAGE__SOFTWARE_COMPONENTS);
		}
		return softwareComponents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<PhysicalComponent> getPhysicalComponents() {
		if (physicalComponents == null) {
			physicalComponents = new EObjectResolvingEList<PhysicalComponent>(PhysicalComponent.class, this,
					e4smPackage.PACKAGE__PHYSICAL_COMPONENTS);
		}
		return physicalComponents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, e4smPackage.PACKAGE__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Sector> getSectors() {
		if (sectors == null) {
			sectors = new EObjectContainmentEList<Sector>(Sector.class, this, e4smPackage.PACKAGE__SECTORS);
		}
		return sectors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Person getMainResponsible() {
		if (mainResponsible != null && mainResponsible.eIsProxy()) {
			InternalEObject oldMainResponsible = (InternalEObject) mainResponsible;
			mainResponsible = (Person) eResolveProxy(oldMainResponsible);
			if (mainResponsible != oldMainResponsible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, e4smPackage.PACKAGE__MAIN_RESPONSIBLE,
							oldMainResponsible, mainResponsible));
			}
		}
		return mainResponsible;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Person basicGetMainResponsible() {
		return mainResponsible;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMainResponsible(Person newMainResponsible) {
		Person oldMainResponsible = mainResponsible;
		mainResponsible = newMainResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PACKAGE__MAIN_RESPONSIBLE,
					oldMainResponsible, mainResponsible));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<e4sm.de.metamodel.e4sm.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentWithInverseEList<e4sm.de.metamodel.e4sm.Package>(
					e4sm.de.metamodel.e4sm.Package.class, this, e4smPackage.PACKAGE__PACKAGES,
					e4smPackage.PACKAGE__CONTAINED_BY);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public e4sm.de.metamodel.e4sm.Package getContainedBy() {
		if (eContainerFeatureID() != e4smPackage.PACKAGE__CONTAINED_BY)
			return null;
		return (e4sm.de.metamodel.e4sm.Package) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContainedBy(e4sm.de.metamodel.e4sm.Package newContainedBy,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainedBy, e4smPackage.PACKAGE__CONTAINED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setContainedBy(e4sm.de.metamodel.e4sm.Package newContainedBy) {
		if (newContainedBy != eInternalContainer()
				|| (eContainerFeatureID() != e4smPackage.PACKAGE__CONTAINED_BY && newContainedBy != null)) {
			if (EcoreUtil.isAncestor(this, newContainedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainedBy != null)
				msgs = ((InternalEObject) newContainedBy).eInverseAdd(this, e4smPackage.PACKAGE__PACKAGES,
						e4sm.de.metamodel.e4sm.Package.class, msgs);
			msgs = basicSetContainedBy(newContainedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PACKAGE__CONTAINED_BY, newContainedBy,
					newContainedBy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Component getSpecifiesComponent() {
		if (specifiesComponent != null && specifiesComponent.eIsProxy()) {
			InternalEObject oldSpecifiesComponent = (InternalEObject) specifiesComponent;
			specifiesComponent = (Component) eResolveProxy(oldSpecifiesComponent);
			if (specifiesComponent != oldSpecifiesComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, e4smPackage.PACKAGE__SPECIFIES_COMPONENT,
							oldSpecifiesComponent, specifiesComponent));
			}
		}
		return specifiesComponent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Component basicGetSpecifiesComponent() {
		return specifiesComponent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSpecifiesComponent(Component newSpecifiesComponent, NotificationChain msgs) {
		Component oldSpecifiesComponent = specifiesComponent;
		specifiesComponent = newSpecifiesComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					e4smPackage.PACKAGE__SPECIFIES_COMPONENT, oldSpecifiesComponent, newSpecifiesComponent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSpecifiesComponent(Component newSpecifiesComponent) {
		if (newSpecifiesComponent != specifiesComponent) {
			NotificationChain msgs = null;
			if (specifiesComponent != null)
				msgs = ((InternalEObject) specifiesComponent).eInverseRemove(this,
						e4smPackage.COMPONENT__SPECIFIED_IN_PACKAGE, Component.class, msgs);
			if (newSpecifiesComponent != null)
				msgs = ((InternalEObject) newSpecifiesComponent).eInverseAdd(this,
						e4smPackage.COMPONENT__SPECIFIED_IN_PACKAGE, Component.class, msgs);
			msgs = basicSetSpecifiesComponent(newSpecifiesComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PACKAGE__SPECIFIES_COMPONENT,
					newSpecifiesComponent, newSpecifiesComponent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Component> getAllComponents() {
		// Get all components which are contained directly in this package
		EList<Component> res = ECollections.newBasicEList(this.getComponents());

		// Look into sectors
		this.getSectors().forEach(s -> {
			res.addAll(s.getAllComponents());
		});

		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.PACKAGE__PACKAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPackages()).basicAdd(otherEnd, msgs);
		case e4smPackage.PACKAGE__CONTAINED_BY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainedBy((e4sm.de.metamodel.e4sm.Package) otherEnd, msgs);
		case e4smPackage.PACKAGE__SPECIFIES_COMPONENT:
			if (specifiesComponent != null)
				msgs = ((InternalEObject) specifiesComponent).eInverseRemove(this,
						e4smPackage.COMPONENT__SPECIFIED_IN_PACKAGE, Component.class, msgs);
			return basicSetSpecifiesComponent((Component) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		case e4smPackage.PACKAGE__PACKAGES:
			return ((InternalEList<?>) getPackages()).basicRemove(otherEnd, msgs);
		case e4smPackage.PACKAGE__CONTAINED_BY:
			return basicSetContainedBy(null, msgs);
		case e4smPackage.PACKAGE__SPECIFIES_COMPONENT:
			return basicSetSpecifiesComponent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case e4smPackage.PACKAGE__CONTAINED_BY:
			return eInternalContainer().eInverseRemove(this, e4smPackage.PACKAGE__PACKAGES,
					e4sm.de.metamodel.e4sm.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.PACKAGE__COMPONENTS:
			return getComponents();
		case e4smPackage.PACKAGE__SOFTWARE_COMPONENTS:
			return getSoftwareComponents();
		case e4smPackage.PACKAGE__PHYSICAL_COMPONENTS:
			return getPhysicalComponents();
		case e4smPackage.PACKAGE__CONNECTORS:
			return getConnectors();
		case e4smPackage.PACKAGE__SECTORS:
			return getSectors();
		case e4smPackage.PACKAGE__MAIN_RESPONSIBLE:
			if (resolve)
				return getMainResponsible();
			return basicGetMainResponsible();
		case e4smPackage.PACKAGE__PACKAGES:
			return getPackages();
		case e4smPackage.PACKAGE__CONTAINED_BY:
			return getContainedBy();
		case e4smPackage.PACKAGE__SPECIFIES_COMPONENT:
			if (resolve)
				return getSpecifiesComponent();
			return basicGetSpecifiesComponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		case e4smPackage.PACKAGE__PHYSICAL_COMPONENTS:
			getPhysicalComponents().clear();
			getPhysicalComponents().addAll((Collection<? extends PhysicalComponent>) newValue);
			return;
		case e4smPackage.PACKAGE__CONNECTORS:
			getConnectors().clear();
			getConnectors().addAll((Collection<? extends Connector>) newValue);
			return;
		case e4smPackage.PACKAGE__SECTORS:
			getSectors().clear();
			getSectors().addAll((Collection<? extends Sector>) newValue);
			return;
		case e4smPackage.PACKAGE__MAIN_RESPONSIBLE:
			setMainResponsible((Person) newValue);
			return;
		case e4smPackage.PACKAGE__PACKAGES:
			getPackages().clear();
			getPackages().addAll((Collection<? extends e4sm.de.metamodel.e4sm.Package>) newValue);
			return;
		case e4smPackage.PACKAGE__CONTAINED_BY:
			setContainedBy((e4sm.de.metamodel.e4sm.Package) newValue);
			return;
		case e4smPackage.PACKAGE__SPECIFIES_COMPONENT:
			setSpecifiesComponent((Component) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		case e4smPackage.PACKAGE__PHYSICAL_COMPONENTS:
			getPhysicalComponents().clear();
			return;
		case e4smPackage.PACKAGE__CONNECTORS:
			getConnectors().clear();
			return;
		case e4smPackage.PACKAGE__SECTORS:
			getSectors().clear();
			return;
		case e4smPackage.PACKAGE__MAIN_RESPONSIBLE:
			setMainResponsible((Person) null);
			return;
		case e4smPackage.PACKAGE__PACKAGES:
			getPackages().clear();
			return;
		case e4smPackage.PACKAGE__CONTAINED_BY:
			setContainedBy((e4sm.de.metamodel.e4sm.Package) null);
			return;
		case e4smPackage.PACKAGE__SPECIFIES_COMPONENT:
			setSpecifiesComponent((Component) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case e4smPackage.PACKAGE__COMPONENTS:
			return components != null && !components.isEmpty();
		case e4smPackage.PACKAGE__SOFTWARE_COMPONENTS:
			return softwareComponents != null && !softwareComponents.isEmpty();
		case e4smPackage.PACKAGE__PHYSICAL_COMPONENTS:
			return physicalComponents != null && !physicalComponents.isEmpty();
		case e4smPackage.PACKAGE__CONNECTORS:
			return connectors != null && !connectors.isEmpty();
		case e4smPackage.PACKAGE__SECTORS:
			return sectors != null && !sectors.isEmpty();
		case e4smPackage.PACKAGE__MAIN_RESPONSIBLE:
			return mainResponsible != null;
		case e4smPackage.PACKAGE__PACKAGES:
			return packages != null && !packages.isEmpty();
		case e4smPackage.PACKAGE__CONTAINED_BY:
			return getContainedBy() != null;
		case e4smPackage.PACKAGE__SPECIFIES_COMPONENT:
			return specifiesComponent != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case e4smPackage.PACKAGE___GET_ALL_COMPONENTS:
			return getAllComponents();
		}
		return super.eInvoke(operationID, arguments);
	}

} // PackageImpl
