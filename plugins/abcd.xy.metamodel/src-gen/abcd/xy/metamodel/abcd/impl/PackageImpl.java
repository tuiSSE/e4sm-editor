/**
 */
package abcd.xy.metamodel.abcd.impl;

import abcd.xy.metamodel.abcd.Component;
import abcd.xy.metamodel.abcd.Connector;
import abcd.xy.metamodel.abcd.DataStore;
import abcd.xy.metamodel.abcd.Person;
import abcd.xy.metamodel.abcd.PhysicalComponent;
import abcd.xy.metamodel.abcd.Sector;
import abcd.xy.metamodel.abcd.SoftwareComponent;
import abcd.xy.metamodel.abcd.analysis.AnalysisPackage;
import abcd.xy.metamodel.abcd.analysis.Parameter;
import abcd.xy.metamodel.abcd.analysis.ParameterizableElement;
import abcd.xy.metamodel.abcd.core.CorePackage;
import abcd.xy.metamodel.abcd.core.DocumentableElement;
import abcd.xy.metamodel.abcd.abcdPackage;
import abcd.xy.metamodel.abcd.core.impl.NamedElementImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PackageImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PackageImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PackageImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PackageImpl#getSoftwareComponents <em>Software Components</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PackageImpl#getPhysicalComponents <em>Physical Components</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PackageImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PackageImpl#getSectors <em>Sectors</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PackageImpl#getMainResponsible <em>Main Responsible</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PackageImpl#getSpecifiesComponent <em>Specifies Component</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PackageImpl#getDatastores <em>Datastores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements abcd.xy.metamodel.abcd.Package {
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
	protected EList<abcd.xy.metamodel.abcd.Package> packages;

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
		return abcdPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, abcdPackage.PACKAGE__PARAMETERS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.PACKAGE__DOCUMENTATION, oldDocumentation,
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
			components = new EObjectContainmentEList<Component>(Component.class, this, abcdPackage.PACKAGE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc --> Returns all software components directly contained by
	 * this package (subsets components) <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<SoftwareComponent> getSoftwareComponents() {
		return ECollections.toEList(this.getComponents().stream().filter(c -> c instanceof SoftwareComponent)
				.map(e -> (SoftwareComponent) e).toList());
	}

	/**
	 * <!-- begin-user-doc --> Returns all physical components directly contained by
	 * this package (subsets components) <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<PhysicalComponent> getPhysicalComponents() {
		return ECollections.toEList(this.getComponents().stream().filter(c -> c instanceof PhysicalComponent)
				.map(e -> (PhysicalComponent) e).toList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, abcdPackage.PACKAGE__CONNECTORS);
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
			sectors = new EObjectContainmentEList<Sector>(Sector.class, this, abcdPackage.PACKAGE__SECTORS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, abcdPackage.PACKAGE__MAIN_RESPONSIBLE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.PACKAGE__MAIN_RESPONSIBLE,
					oldMainResponsible, mainResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<abcd.xy.metamodel.abcd.Package> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<abcd.xy.metamodel.abcd.Package>(abcd.xy.metamodel.abcd.Package.class,
					this, abcdPackage.PACKAGE__PACKAGES);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, abcdPackage.PACKAGE__SPECIFIES_COMPONENT,
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
					abcdPackage.PACKAGE__SPECIFIES_COMPONENT, oldSpecifiesComponent, newSpecifiesComponent);
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
						abcdPackage.COMPONENT__SPECIFIED_IN_PACKAGE, Component.class, msgs);
			if (newSpecifiesComponent != null)
				msgs = ((InternalEObject) newSpecifiesComponent).eInverseAdd(this,
						abcdPackage.COMPONENT__SPECIFIED_IN_PACKAGE, Component.class, msgs);
			msgs = basicSetSpecifiesComponent(newSpecifiesComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.PACKAGE__SPECIFIES_COMPONENT,
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
			datastores = new EObjectContainmentEList<DataStore>(DataStore.class, this, abcdPackage.PACKAGE__DATASTORES);
		}
		return datastores;
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
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case abcdPackage.PACKAGE__SPECIFIES_COMPONENT:
			if (specifiesComponent != null)
				msgs = ((InternalEObject) specifiesComponent).eInverseRemove(this,
						abcdPackage.COMPONENT__SPECIFIED_IN_PACKAGE, Component.class, msgs);
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
		case abcdPackage.PACKAGE__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case abcdPackage.PACKAGE__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case abcdPackage.PACKAGE__CONNECTORS:
			return ((InternalEList<?>) getConnectors()).basicRemove(otherEnd, msgs);
		case abcdPackage.PACKAGE__SECTORS:
			return ((InternalEList<?>) getSectors()).basicRemove(otherEnd, msgs);
		case abcdPackage.PACKAGE__PACKAGES:
			return ((InternalEList<?>) getPackages()).basicRemove(otherEnd, msgs);
		case abcdPackage.PACKAGE__SPECIFIES_COMPONENT:
			return basicSetSpecifiesComponent(null, msgs);
		case abcdPackage.PACKAGE__DATASTORES:
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
		case abcdPackage.PACKAGE__PARAMETERS:
			return getParameters();
		case abcdPackage.PACKAGE__DOCUMENTATION:
			return getDocumentation();
		case abcdPackage.PACKAGE__COMPONENTS:
			return getComponents();
		case abcdPackage.PACKAGE__SOFTWARE_COMPONENTS:
			return getSoftwareComponents();
		case abcdPackage.PACKAGE__PHYSICAL_COMPONENTS:
			return getPhysicalComponents();
		case abcdPackage.PACKAGE__CONNECTORS:
			return getConnectors();
		case abcdPackage.PACKAGE__SECTORS:
			return getSectors();
		case abcdPackage.PACKAGE__MAIN_RESPONSIBLE:
			if (resolve)
				return getMainResponsible();
			return basicGetMainResponsible();
		case abcdPackage.PACKAGE__PACKAGES:
			return getPackages();
		case abcdPackage.PACKAGE__SPECIFIES_COMPONENT:
			if (resolve)
				return getSpecifiesComponent();
			return basicGetSpecifiesComponent();
		case abcdPackage.PACKAGE__DATASTORES:
			return getDatastores();
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
		case abcdPackage.PACKAGE__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case abcdPackage.PACKAGE__DOCUMENTATION:
			setDocumentation((String) newValue);
			return;
		case abcdPackage.PACKAGE__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case abcdPackage.PACKAGE__SOFTWARE_COMPONENTS:
			getSoftwareComponents().clear();
			getSoftwareComponents().addAll((Collection<? extends SoftwareComponent>) newValue);
			return;
		case abcdPackage.PACKAGE__CONNECTORS:
			getConnectors().clear();
			getConnectors().addAll((Collection<? extends Connector>) newValue);
			return;
		case abcdPackage.PACKAGE__SECTORS:
			getSectors().clear();
			getSectors().addAll((Collection<? extends Sector>) newValue);
			return;
		case abcdPackage.PACKAGE__MAIN_RESPONSIBLE:
			setMainResponsible((Person) newValue);
			return;
		case abcdPackage.PACKAGE__PACKAGES:
			getPackages().clear();
			getPackages().addAll((Collection<? extends abcd.xy.metamodel.abcd.Package>) newValue);
			return;
		case abcdPackage.PACKAGE__SPECIFIES_COMPONENT:
			setSpecifiesComponent((Component) newValue);
			return;
		case abcdPackage.PACKAGE__DATASTORES:
			getDatastores().clear();
			getDatastores().addAll((Collection<? extends DataStore>) newValue);
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
		case abcdPackage.PACKAGE__PARAMETERS:
			getParameters().clear();
			return;
		case abcdPackage.PACKAGE__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
		case abcdPackage.PACKAGE__COMPONENTS:
			getComponents().clear();
			return;
		case abcdPackage.PACKAGE__SOFTWARE_COMPONENTS:
			getSoftwareComponents().clear();
			return;
		case abcdPackage.PACKAGE__CONNECTORS:
			getConnectors().clear();
			return;
		case abcdPackage.PACKAGE__SECTORS:
			getSectors().clear();
			return;
		case abcdPackage.PACKAGE__MAIN_RESPONSIBLE:
			setMainResponsible((Person) null);
			return;
		case abcdPackage.PACKAGE__PACKAGES:
			getPackages().clear();
			return;
		case abcdPackage.PACKAGE__SPECIFIES_COMPONENT:
			setSpecifiesComponent((Component) null);
			return;
		case abcdPackage.PACKAGE__DATASTORES:
			getDatastores().clear();
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
		case abcdPackage.PACKAGE__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case abcdPackage.PACKAGE__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null
					: !DOCUMENTATION_EDEFAULT.equals(documentation);
		case abcdPackage.PACKAGE__COMPONENTS:
			return components != null && !components.isEmpty();
		case abcdPackage.PACKAGE__SOFTWARE_COMPONENTS:
			return !getSoftwareComponents().isEmpty();
		case abcdPackage.PACKAGE__PHYSICAL_COMPONENTS:
			return !getPhysicalComponents().isEmpty();
		case abcdPackage.PACKAGE__CONNECTORS:
			return connectors != null && !connectors.isEmpty();
		case abcdPackage.PACKAGE__SECTORS:
			return sectors != null && !sectors.isEmpty();
		case abcdPackage.PACKAGE__MAIN_RESPONSIBLE:
			return mainResponsible != null;
		case abcdPackage.PACKAGE__PACKAGES:
			return packages != null && !packages.isEmpty();
		case abcdPackage.PACKAGE__SPECIFIES_COMPONENT:
			return specifiesComponent != null;
		case abcdPackage.PACKAGE__DATASTORES:
			return datastores != null && !datastores.isEmpty();
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
			case abcdPackage.PACKAGE__PARAMETERS:
				return AnalysisPackage.PARAMETERIZABLE_ELEMENT__PARAMETERS;
			default:
				return -1;
			}
		}
		if (baseClass == DocumentableElement.class) {
			switch (derivedFeatureID) {
			case abcdPackage.PACKAGE__DOCUMENTATION:
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
				return abcdPackage.PACKAGE__PARAMETERS;
			default:
				return -1;
			}
		}
		if (baseClass == DocumentableElement.class) {
			switch (baseFeatureID) {
			case CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION:
				return abcdPackage.PACKAGE__DOCUMENTATION;
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
		case abcdPackage.PACKAGE___GET_ALL_COMPONENTS:
			return getAllComponents();
		case abcdPackage.PACKAGE___GET_MAX_FLOW:
			return getMaxFlow();
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
		result.append(')');
		return result.toString();
	}

} // PackageImpl
