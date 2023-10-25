/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.DataStore;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.Person;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.analysis.Parameter;
import e4sm.de.metamodel.e4sm.analysis.ParameterizableElement;
import e4sm.de.metamodel.e4sm.core.CorePackage;
import e4sm.de.metamodel.e4sm.core.DocumentableElement;
import e4sm.de.metamodel.e4sm.e4smPackage;
import e4sm.de.metamodel.e4sm.core.impl.NamedElementImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Package</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getSectors <em>Sectors</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getMainResponsible <em>Main Responsible</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getSpecifiesComponent <em>Specifies Component</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getDatastores <em>Datastores</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.PackageImpl#getSimulationDuration <em>Simulation Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements e4sm.de.metamodel.e4sm.Package {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

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
	 * The cached value of the '{@link #getMainResponsible() <em>Main Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainResponsible()
	 * @generated
	 * @ordered
	 */
	protected Person mainResponsible;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<e4sm.de.metamodel.e4sm.Package> packages;

	/**
	 * The cached value of the '{@link #getSpecifiesComponent() <em>Specifies Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiesComponent()
	 * @generated
	 * @ordered
	 */
	protected Component specifiesComponent;

	/**
	 * The cached value of the '{@link #getDatastores() <em>Datastores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastores()
	 * @generated
	 * @ordered
	 */
	protected EList<DataStore> datastores;

	/**
	 * The default value of the '{@link #getProcessingUnits() <em>Processing Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingUnits()
	 * @generated
	 * @ordered
	 */
	protected static final int PROCESSING_UNITS_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getProcessingUnits() <em>Processing Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingUnits()
	 * @generated
	 * @ordered
	 */
	protected int processingUnits = PROCESSING_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimulationDuration() <em>Simulation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int SIMULATION_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSimulationDuration() <em>Simulation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationDuration()
	 * @generated
	 * @ordered
	 */
	protected int simulationDuration = SIMULATION_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, e4smPackage.PACKAGE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PACKAGE__DOCUMENTATION, oldDocumentation,
					documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetMainResponsible() {
		return mainResponsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<e4sm.de.metamodel.e4sm.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<e4sm.de.metamodel.e4sm.Package>(e4sm.de.metamodel.e4sm.Package.class,
					this, e4smPackage.PACKAGE__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetSpecifiesComponent() {
		return specifiesComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataStore> getDatastores() {
		if (datastores == null) {
			datastores = new EObjectContainmentEList<DataStore>(DataStore.class, this, e4smPackage.PACKAGE__DATASTORES);
		}
		return datastores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProcessingUnits() {
		return processingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessingUnits(int newProcessingUnits) {
		int oldProcessingUnits = processingUnits;
		processingUnits = newProcessingUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PACKAGE__PROCESSING_UNITS,
					oldProcessingUnits, processingUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSimulationDuration() {
		return simulationDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimulationDuration(int newSimulationDuration) {
		int oldSimulationDuration = simulationDuration;
		simulationDuration = newSimulationDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.PACKAGE__SIMULATION_DURATION,
					oldSimulationDuration, simulationDuration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * returns the maximum flow value for the connectors in this package
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double getMaxFlow() {
		return this.getConnectors().stream().mapToDouble(c -> c.computeFlow()).max()
				.orElseThrow(NoSuchElementException::new);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Model getModel() {
		EObject parent = this.eContainer();
		while (parent != null && !(parent instanceof Model)) {
			parent = parent.eContainer();
		}
		return (Model) parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.PACKAGE__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case e4smPackage.PACKAGE__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case e4smPackage.PACKAGE__CONNECTORS:
			return ((InternalEList<?>) getConnectors()).basicRemove(otherEnd, msgs);
		case e4smPackage.PACKAGE__SECTORS:
			return ((InternalEList<?>) getSectors()).basicRemove(otherEnd, msgs);
		case e4smPackage.PACKAGE__PACKAGES:
			return ((InternalEList<?>) getPackages()).basicRemove(otherEnd, msgs);
		case e4smPackage.PACKAGE__SPECIFIES_COMPONENT:
			return basicSetSpecifiesComponent(null, msgs);
		case e4smPackage.PACKAGE__DATASTORES:
			return ((InternalEList<?>) getDatastores()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.PACKAGE__PARAMETERS:
			return getParameters();
		case e4smPackage.PACKAGE__DOCUMENTATION:
			return getDocumentation();
		case e4smPackage.PACKAGE__COMPONENTS:
			return getComponents();
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
		case e4smPackage.PACKAGE__SPECIFIES_COMPONENT:
			if (resolve)
				return getSpecifiesComponent();
			return basicGetSpecifiesComponent();
		case e4smPackage.PACKAGE__DATASTORES:
			return getDatastores();
		case e4smPackage.PACKAGE__PROCESSING_UNITS:
			return getProcessingUnits();
		case e4smPackage.PACKAGE__SIMULATION_DURATION:
			return getSimulationDuration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case e4smPackage.PACKAGE__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case e4smPackage.PACKAGE__DOCUMENTATION:
			setDocumentation((String) newValue);
			return;
		case e4smPackage.PACKAGE__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
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
		case e4smPackage.PACKAGE__SPECIFIES_COMPONENT:
			setSpecifiesComponent((Component) newValue);
			return;
		case e4smPackage.PACKAGE__DATASTORES:
			getDatastores().clear();
			getDatastores().addAll((Collection<? extends DataStore>) newValue);
			return;
		case e4smPackage.PACKAGE__PROCESSING_UNITS:
			setProcessingUnits((Integer) newValue);
			return;
		case e4smPackage.PACKAGE__SIMULATION_DURATION:
			setSimulationDuration((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case e4smPackage.PACKAGE__PARAMETERS:
			getParameters().clear();
			return;
		case e4smPackage.PACKAGE__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
		case e4smPackage.PACKAGE__COMPONENTS:
			getComponents().clear();
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
		case e4smPackage.PACKAGE__SPECIFIES_COMPONENT:
			setSpecifiesComponent((Component) null);
			return;
		case e4smPackage.PACKAGE__DATASTORES:
			getDatastores().clear();
			return;
		case e4smPackage.PACKAGE__PROCESSING_UNITS:
			setProcessingUnits(PROCESSING_UNITS_EDEFAULT);
			return;
		case e4smPackage.PACKAGE__SIMULATION_DURATION:
			setSimulationDuration(SIMULATION_DURATION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case e4smPackage.PACKAGE__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case e4smPackage.PACKAGE__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null
					: !DOCUMENTATION_EDEFAULT.equals(documentation);
		case e4smPackage.PACKAGE__COMPONENTS:
			return components != null && !components.isEmpty();
		case e4smPackage.PACKAGE__CONNECTORS:
			return connectors != null && !connectors.isEmpty();
		case e4smPackage.PACKAGE__SECTORS:
			return sectors != null && !sectors.isEmpty();
		case e4smPackage.PACKAGE__MAIN_RESPONSIBLE:
			return mainResponsible != null;
		case e4smPackage.PACKAGE__PACKAGES:
			return packages != null && !packages.isEmpty();
		case e4smPackage.PACKAGE__SPECIFIES_COMPONENT:
			return specifiesComponent != null;
		case e4smPackage.PACKAGE__DATASTORES:
			return datastores != null && !datastores.isEmpty();
		case e4smPackage.PACKAGE__PROCESSING_UNITS:
			return processingUnits != PROCESSING_UNITS_EDEFAULT;
		case e4smPackage.PACKAGE__SIMULATION_DURATION:
			return simulationDuration != SIMULATION_DURATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterizableElement.class) {
			switch (derivedFeatureID) {
			case e4smPackage.PACKAGE__PARAMETERS:
				return AnalysisPackage.PARAMETERIZABLE_ELEMENT__PARAMETERS;
			default:
				return -1;
			}
		}
		if (baseClass == DocumentableElement.class) {
			switch (derivedFeatureID) {
			case e4smPackage.PACKAGE__DOCUMENTATION:
				return CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterizableElement.class) {
			switch (baseFeatureID) {
			case AnalysisPackage.PARAMETERIZABLE_ELEMENT__PARAMETERS:
				return e4smPackage.PACKAGE__PARAMETERS;
			default:
				return -1;
			}
		}
		if (baseClass == DocumentableElement.class) {
			switch (baseFeatureID) {
			case CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION:
				return e4smPackage.PACKAGE__DOCUMENTATION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case e4smPackage.PACKAGE___GET_ALL_COMPONENTS:
			return getAllComponents();
		case e4smPackage.PACKAGE___GET_MAX_FLOW:
			return getMaxFlow();
		case e4smPackage.PACKAGE___GET_MODEL:
			return getModel();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", processingUnits: ");
		result.append(processingUnits);
		result.append(", simulationDuration: ");
		result.append(simulationDuration);
		result.append(')');
		return result.toString();
	}

} // PackageImpl
