/**
 */
package abcd.xy.metamodel.abcd.impl;

import abcd.xy.metamodel.abcd.Component;
import abcd.xy.metamodel.abcd.ComponentFiringStrategy;
import abcd.xy.metamodel.abcd.DataStore;
import abcd.xy.metamodel.abcd.core.NamedElement;
import abcd.xy.metamodel.abcd.Person;
import abcd.xy.metamodel.abcd.Pin;
import abcd.xy.metamodel.abcd.analysis.AnalysisPackage;
import abcd.xy.metamodel.abcd.analysis.Parameter;
import abcd.xy.metamodel.abcd.analysis.ParameterizableElement;
import abcd.xy.metamodel.abcd.core.CorePackage;
import abcd.xy.metamodel.abcd.core.DocumentableElement;
import abcd.xy.metamodel.abcd.abcdPackage;
import abcd.xy.metamodel.abcd.execution.DelayableElement;
import abcd.xy.metamodel.abcd.execution.Execution;
import abcd.xy.metamodel.abcd.execution.ExecutionPackage;
import abcd.xy.metamodel.abcd.execution.TimeFunction;
import abcd.xy.metamodel.abcd.core.impl.NamedElementImpl;
import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ComponentImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ComponentImpl#getTimeFunction <em>Time Function</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ComponentImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ComponentImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ComponentImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ComponentImpl#getMainResponsible <em>Main Responsible</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ComponentImpl#getSpecifiedInPackage <em>Specified In Package</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ComponentImpl#getExecution <em>Execution</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ComponentImpl#getFiringStrategy <em>Firing Strategy</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ComponentImpl#getDatastores <em>Datastores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends NamedElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getTimeFunction() <em>Time Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFunction()
	 * @generated
	 * @ordered
	 */
	protected TimeFunction timeFunction;

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
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected EList<Pin> pins;

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
	 * The cached value of the '{@link #getSpecifiedInPackage() <em>Specified In Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiedInPackage()
	 * @generated
	 * @ordered
	 */
	protected abcd.xy.metamodel.abcd.Package specifiedInPackage;

	/**
	 * The cached value of the '{@link #getExecution() <em>Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected Execution execution;

	/**
	 * The default value of the '{@link #getFiringStrategy() <em>Firing Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiringStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentFiringStrategy FIRING_STRATEGY_EDEFAULT = ComponentFiringStrategy.AND;

	/**
	 * The cached value of the '{@link #getFiringStrategy() <em>Firing Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiringStrategy()
	 * @generated
	 * @ordered
	 */
	protected ComponentFiringStrategy firingStrategy = FIRING_STRATEGY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return abcdPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					abcdPackage.COMPONENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeFunction getTimeFunction() {
		return timeFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeFunction(TimeFunction newTimeFunction, NotificationChain msgs) {
		TimeFunction oldTimeFunction = timeFunction;
		timeFunction = newTimeFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					abcdPackage.COMPONENT__TIME_FUNCTION, oldTimeFunction, newTimeFunction);
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
	public void setTimeFunction(TimeFunction newTimeFunction) {
		if (newTimeFunction != timeFunction) {
			NotificationChain msgs = null;
			if (timeFunction != null)
				msgs = ((InternalEObject) timeFunction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - abcdPackage.COMPONENT__TIME_FUNCTION, null, msgs);
			if (newTimeFunction != null)
				msgs = ((InternalEObject) newTimeFunction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - abcdPackage.COMPONENT__TIME_FUNCTION, null, msgs);
			msgs = basicSetTimeFunction(newTimeFunction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.COMPONENT__TIME_FUNCTION, newTimeFunction,
					newTimeFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.COMPONENT__DOCUMENTATION,
					oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this,
					abcdPackage.COMPONENT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pin> getPins() {
		if (pins == null) {
			pins = new EObjectContainmentEList<Pin>(Pin.class, this, abcdPackage.COMPONENT__PINS);
		}
		return pins;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, abcdPackage.COMPONENT__MAIN_RESPONSIBLE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.COMPONENT__MAIN_RESPONSIBLE,
					oldMainResponsible, mainResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public abcd.xy.metamodel.abcd.Package getSpecifiedInPackage() {
		if (specifiedInPackage != null && specifiedInPackage.eIsProxy()) {
			InternalEObject oldSpecifiedInPackage = (InternalEObject) specifiedInPackage;
			specifiedInPackage = (abcd.xy.metamodel.abcd.Package) eResolveProxy(oldSpecifiedInPackage);
			if (specifiedInPackage != oldSpecifiedInPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							abcdPackage.COMPONENT__SPECIFIED_IN_PACKAGE, oldSpecifiedInPackage, specifiedInPackage));
			}
		}
		return specifiedInPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abcd.xy.metamodel.abcd.Package basicGetSpecifiedInPackage() {
		return specifiedInPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecifiedInPackage(abcd.xy.metamodel.abcd.Package newSpecifiedInPackage,
			NotificationChain msgs) {
		abcd.xy.metamodel.abcd.Package oldSpecifiedInPackage = specifiedInPackage;
		specifiedInPackage = newSpecifiedInPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					abcdPackage.COMPONENT__SPECIFIED_IN_PACKAGE, oldSpecifiedInPackage, newSpecifiedInPackage);
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
	public void setSpecifiedInPackage(abcd.xy.metamodel.abcd.Package newSpecifiedInPackage) {
		if (newSpecifiedInPackage != specifiedInPackage) {
			NotificationChain msgs = null;
			if (specifiedInPackage != null)
				msgs = ((InternalEObject) specifiedInPackage).eInverseRemove(this,
						abcdPackage.PACKAGE__SPECIFIES_COMPONENT, abcd.xy.metamodel.abcd.Package.class, msgs);
			if (newSpecifiedInPackage != null)
				msgs = ((InternalEObject) newSpecifiedInPackage).eInverseAdd(this,
						abcdPackage.PACKAGE__SPECIFIES_COMPONENT, abcd.xy.metamodel.abcd.Package.class, msgs);
			msgs = basicSetSpecifiedInPackage(newSpecifiedInPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.COMPONENT__SPECIFIED_IN_PACKAGE,
					newSpecifiedInPackage, newSpecifiedInPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Execution getExecution() {
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecution(Execution newExecution, NotificationChain msgs) {
		Execution oldExecution = execution;
		execution = newExecution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					abcdPackage.COMPONENT__EXECUTION, oldExecution, newExecution);
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
	public void setExecution(Execution newExecution) {
		if (newExecution != execution) {
			NotificationChain msgs = null;
			if (execution != null)
				msgs = ((InternalEObject) execution).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - abcdPackage.COMPONENT__EXECUTION, null, msgs);
			if (newExecution != null)
				msgs = ((InternalEObject) newExecution).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - abcdPackage.COMPONENT__EXECUTION, null, msgs);
			msgs = basicSetExecution(newExecution, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.COMPONENT__EXECUTION, newExecution,
					newExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentFiringStrategy getFiringStrategy() {
		return firingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiringStrategy(ComponentFiringStrategy newFiringStrategy) {
		ComponentFiringStrategy oldFiringStrategy = firingStrategy;
		firingStrategy = newFiringStrategy == null ? FIRING_STRATEGY_EDEFAULT : newFiringStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.COMPONENT__FIRING_STRATEGY,
					oldFiringStrategy, firingStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataStore> getDatastores() {
		if (datastores == null) {
			datastores = new EObjectContainmentEList<DataStore>(DataStore.class, this,
					abcdPackage.COMPONENT__DATASTORES);
		}
		return datastores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person computeMainResponsible() {
		Person resp = this.getMainResponsible();
		if (resp != null) {
			return resp;
		}
		NamedElement c = (NamedElement) this.eContainer();
		if (!(c instanceof Component)) {
			return null;
		}
		return ((Component) c).getMainResponsible();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void newOperation2() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case abcdPackage.COMPONENT__SPECIFIED_IN_PACKAGE:
			if (specifiedInPackage != null)
				msgs = ((InternalEObject) specifiedInPackage).eInverseRemove(this,
						abcdPackage.PACKAGE__SPECIFIES_COMPONENT, abcd.xy.metamodel.abcd.Package.class, msgs);
			return basicSetSpecifiedInPackage((abcd.xy.metamodel.abcd.Package) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case abcdPackage.COMPONENT__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case abcdPackage.COMPONENT__TIME_FUNCTION:
			return basicSetTimeFunction(null, msgs);
		case abcdPackage.COMPONENT__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case abcdPackage.COMPONENT__PINS:
			return ((InternalEList<?>) getPins()).basicRemove(otherEnd, msgs);
		case abcdPackage.COMPONENT__SPECIFIED_IN_PACKAGE:
			return basicSetSpecifiedInPackage(null, msgs);
		case abcdPackage.COMPONENT__EXECUTION:
			return basicSetExecution(null, msgs);
		case abcdPackage.COMPONENT__DATASTORES:
			return ((InternalEList<?>) getDatastores()).basicRemove(otherEnd, msgs);
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
		case abcdPackage.COMPONENT__PARAMETERS:
			return getParameters();
		case abcdPackage.COMPONENT__TIME_FUNCTION:
			return getTimeFunction();
		case abcdPackage.COMPONENT__DOCUMENTATION:
			return getDocumentation();
		case abcdPackage.COMPONENT__COMPONENTS:
			return getComponents();
		case abcdPackage.COMPONENT__PINS:
			return getPins();
		case abcdPackage.COMPONENT__MAIN_RESPONSIBLE:
			if (resolve)
				return getMainResponsible();
			return basicGetMainResponsible();
		case abcdPackage.COMPONENT__SPECIFIED_IN_PACKAGE:
			if (resolve)
				return getSpecifiedInPackage();
			return basicGetSpecifiedInPackage();
		case abcdPackage.COMPONENT__EXECUTION:
			return getExecution();
		case abcdPackage.COMPONENT__FIRING_STRATEGY:
			return getFiringStrategy();
		case abcdPackage.COMPONENT__DATASTORES:
			return getDatastores();
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
		case abcdPackage.COMPONENT__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case abcdPackage.COMPONENT__TIME_FUNCTION:
			setTimeFunction((TimeFunction) newValue);
			return;
		case abcdPackage.COMPONENT__DOCUMENTATION:
			setDocumentation((String) newValue);
			return;
		case abcdPackage.COMPONENT__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case abcdPackage.COMPONENT__PINS:
			getPins().clear();
			getPins().addAll((Collection<? extends Pin>) newValue);
			return;
		case abcdPackage.COMPONENT__MAIN_RESPONSIBLE:
			setMainResponsible((Person) newValue);
			return;
		case abcdPackage.COMPONENT__SPECIFIED_IN_PACKAGE:
			setSpecifiedInPackage((abcd.xy.metamodel.abcd.Package) newValue);
			return;
		case abcdPackage.COMPONENT__EXECUTION:
			setExecution((Execution) newValue);
			return;
		case abcdPackage.COMPONENT__FIRING_STRATEGY:
			setFiringStrategy((ComponentFiringStrategy) newValue);
			return;
		case abcdPackage.COMPONENT__DATASTORES:
			getDatastores().clear();
			getDatastores().addAll((Collection<? extends DataStore>) newValue);
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
		case abcdPackage.COMPONENT__PARAMETERS:
			getParameters().clear();
			return;
		case abcdPackage.COMPONENT__TIME_FUNCTION:
			setTimeFunction((TimeFunction) null);
			return;
		case abcdPackage.COMPONENT__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
		case abcdPackage.COMPONENT__COMPONENTS:
			getComponents().clear();
			return;
		case abcdPackage.COMPONENT__PINS:
			getPins().clear();
			return;
		case abcdPackage.COMPONENT__MAIN_RESPONSIBLE:
			setMainResponsible((Person) null);
			return;
		case abcdPackage.COMPONENT__SPECIFIED_IN_PACKAGE:
			setSpecifiedInPackage((abcd.xy.metamodel.abcd.Package) null);
			return;
		case abcdPackage.COMPONENT__EXECUTION:
			setExecution((Execution) null);
			return;
		case abcdPackage.COMPONENT__FIRING_STRATEGY:
			setFiringStrategy(FIRING_STRATEGY_EDEFAULT);
			return;
		case abcdPackage.COMPONENT__DATASTORES:
			getDatastores().clear();
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
		case abcdPackage.COMPONENT__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case abcdPackage.COMPONENT__TIME_FUNCTION:
			return timeFunction != null;
		case abcdPackage.COMPONENT__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null
					: !DOCUMENTATION_EDEFAULT.equals(documentation);
		case abcdPackage.COMPONENT__COMPONENTS:
			return components != null && !components.isEmpty();
		case abcdPackage.COMPONENT__PINS:
			return pins != null && !pins.isEmpty();
		case abcdPackage.COMPONENT__MAIN_RESPONSIBLE:
			return mainResponsible != null;
		case abcdPackage.COMPONENT__SPECIFIED_IN_PACKAGE:
			return specifiedInPackage != null;
		case abcdPackage.COMPONENT__EXECUTION:
			return execution != null;
		case abcdPackage.COMPONENT__FIRING_STRATEGY:
			return firingStrategy != FIRING_STRATEGY_EDEFAULT;
		case abcdPackage.COMPONENT__DATASTORES:
			return datastores != null && !datastores.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterizableElement.class) {
			switch (derivedFeatureID) {
			case abcdPackage.COMPONENT__PARAMETERS:
				return AnalysisPackage.PARAMETERIZABLE_ELEMENT__PARAMETERS;
			default:
				return -1;
			}
		}
		if (baseClass == DelayableElement.class) {
			switch (derivedFeatureID) {
			case abcdPackage.COMPONENT__TIME_FUNCTION:
				return ExecutionPackage.DELAYABLE_ELEMENT__TIME_FUNCTION;
			default:
				return -1;
			}
		}
		if (baseClass == DocumentableElement.class) {
			switch (derivedFeatureID) {
			case abcdPackage.COMPONENT__DOCUMENTATION:
				return CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterizableElement.class) {
			switch (baseFeatureID) {
			case AnalysisPackage.PARAMETERIZABLE_ELEMENT__PARAMETERS:
				return abcdPackage.COMPONENT__PARAMETERS;
			default:
				return -1;
			}
		}
		if (baseClass == DelayableElement.class) {
			switch (baseFeatureID) {
			case ExecutionPackage.DELAYABLE_ELEMENT__TIME_FUNCTION:
				return abcdPackage.COMPONENT__TIME_FUNCTION;
			default:
				return -1;
			}
		}
		if (baseClass == DocumentableElement.class) {
			switch (baseFeatureID) {
			case CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION:
				return abcdPackage.COMPONENT__DOCUMENTATION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case abcdPackage.COMPONENT___COMPUTE_MAIN_RESPONSIBLE:
			return computeMainResponsible();
		case abcdPackage.COMPONENT___NEW_OPERATION2:
			newOperation2();
			return null;
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
		result.append(", firingStrategy: ");
		result.append(firingStrategy);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
