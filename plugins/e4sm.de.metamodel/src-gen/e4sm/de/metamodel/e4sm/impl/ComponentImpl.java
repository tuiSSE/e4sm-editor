/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Person;
import e4sm.de.metamodel.e4sm.Pin;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ComponentImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ComponentImpl#getContainedBy <em>Contained By</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ComponentImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ComponentImpl#getMainResponsible <em>Main Responsible</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.ComponentImpl#getSpecifiedInPackage <em>Specified In Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends NamedElementImpl implements Component {
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
	protected e4sm.de.metamodel.e4sm.Package specifiedInPackage;

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
		return e4smPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentWithInverseEList<Component>(Component.class, this,
					e4smPackage.COMPONENT__COMPONENTS, e4smPackage.COMPONENT__CONTAINED_BY);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getContainedBy() {
		if (eContainerFeatureID() != e4smPackage.COMPONENT__CONTAINED_BY)
			return null;
		return (Component) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainedBy(Component newContainedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newContainedBy, e4smPackage.COMPONENT__CONTAINED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainedBy(Component newContainedBy) {
		if (newContainedBy != eInternalContainer()
				|| (eContainerFeatureID() != e4smPackage.COMPONENT__CONTAINED_BY && newContainedBy != null)) {
			if (EcoreUtil.isAncestor(this, newContainedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainedBy != null)
				msgs = ((InternalEObject) newContainedBy).eInverseAdd(this, e4smPackage.COMPONENT__COMPONENTS,
						Component.class, msgs);
			msgs = basicSetContainedBy(newContainedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.COMPONENT__CONTAINED_BY, newContainedBy,
					newContainedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Pin> getPins() {
		if (pins == null) {
			pins = new EObjectContainmentEList<Pin>(Pin.class, this, e4smPackage.COMPONENT__PINS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, e4smPackage.COMPONENT__MAIN_RESPONSIBLE,
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
	public NotificationChain basicSetMainResponsible(Person newMainResponsible, NotificationChain msgs) {
		Person oldMainResponsible = mainResponsible;
		mainResponsible = newMainResponsible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					e4smPackage.COMPONENT__MAIN_RESPONSIBLE, oldMainResponsible, newMainResponsible);
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
	public void setMainResponsible(Person newMainResponsible) {
		if (newMainResponsible != mainResponsible) {
			NotificationChain msgs = null;
			if (mainResponsible != null)
				msgs = ((InternalEObject) mainResponsible).eInverseRemove(this,
						e4smPackage.PERSON__RESPONSIBLE_FOR_COMPONENTS, Person.class, msgs);
			if (newMainResponsible != null)
				msgs = ((InternalEObject) newMainResponsible).eInverseAdd(this,
						e4smPackage.PERSON__RESPONSIBLE_FOR_COMPONENTS, Person.class, msgs);
			msgs = basicSetMainResponsible(newMainResponsible, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.COMPONENT__MAIN_RESPONSIBLE,
					newMainResponsible, newMainResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public e4sm.de.metamodel.e4sm.Package getSpecifiedInPackage() {
		if (specifiedInPackage != null && specifiedInPackage.eIsProxy()) {
			InternalEObject oldSpecifiedInPackage = (InternalEObject) specifiedInPackage;
			specifiedInPackage = (e4sm.de.metamodel.e4sm.Package) eResolveProxy(oldSpecifiedInPackage);
			if (specifiedInPackage != oldSpecifiedInPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							e4smPackage.COMPONENT__SPECIFIED_IN_PACKAGE, oldSpecifiedInPackage, specifiedInPackage));
			}
		}
		return specifiedInPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public e4sm.de.metamodel.e4sm.Package basicGetSpecifiedInPackage() {
		return specifiedInPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecifiedInPackage(e4sm.de.metamodel.e4sm.Package newSpecifiedInPackage,
			NotificationChain msgs) {
		e4sm.de.metamodel.e4sm.Package oldSpecifiedInPackage = specifiedInPackage;
		specifiedInPackage = newSpecifiedInPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					e4smPackage.COMPONENT__SPECIFIED_IN_PACKAGE, oldSpecifiedInPackage, newSpecifiedInPackage);
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
	public void setSpecifiedInPackage(e4sm.de.metamodel.e4sm.Package newSpecifiedInPackage) {
		if (newSpecifiedInPackage != specifiedInPackage) {
			NotificationChain msgs = null;
			if (specifiedInPackage != null)
				msgs = ((InternalEObject) specifiedInPackage).eInverseRemove(this,
						e4smPackage.PACKAGE__SPECIFIES_COMPONENT, e4sm.de.metamodel.e4sm.Package.class, msgs);
			if (newSpecifiedInPackage != null)
				msgs = ((InternalEObject) newSpecifiedInPackage).eInverseAdd(this,
						e4smPackage.PACKAGE__SPECIFIES_COMPONENT, e4sm.de.metamodel.e4sm.Package.class, msgs);
			msgs = basicSetSpecifiedInPackage(newSpecifiedInPackage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.COMPONENT__SPECIFIED_IN_PACKAGE,
					newSpecifiedInPackage, newSpecifiedInPackage));
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
		Component c = this.getContainedBy();
		if (c == null) {
			return null;
		}
		return c.getMainResponsible();
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
		case e4smPackage.COMPONENT__COMPONENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getComponents()).basicAdd(otherEnd, msgs);
		case e4smPackage.COMPONENT__CONTAINED_BY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetContainedBy((Component) otherEnd, msgs);
		case e4smPackage.COMPONENT__MAIN_RESPONSIBLE:
			if (mainResponsible != null)
				msgs = ((InternalEObject) mainResponsible).eInverseRemove(this,
						e4smPackage.PERSON__RESPONSIBLE_FOR_COMPONENTS, Person.class, msgs);
			return basicSetMainResponsible((Person) otherEnd, msgs);
		case e4smPackage.COMPONENT__SPECIFIED_IN_PACKAGE:
			if (specifiedInPackage != null)
				msgs = ((InternalEObject) specifiedInPackage).eInverseRemove(this,
						e4smPackage.PACKAGE__SPECIFIES_COMPONENT, e4sm.de.metamodel.e4sm.Package.class, msgs);
			return basicSetSpecifiedInPackage((e4sm.de.metamodel.e4sm.Package) otherEnd, msgs);
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
		case e4smPackage.COMPONENT__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case e4smPackage.COMPONENT__CONTAINED_BY:
			return basicSetContainedBy(null, msgs);
		case e4smPackage.COMPONENT__PINS:
			return ((InternalEList<?>) getPins()).basicRemove(otherEnd, msgs);
		case e4smPackage.COMPONENT__MAIN_RESPONSIBLE:
			return basicSetMainResponsible(null, msgs);
		case e4smPackage.COMPONENT__SPECIFIED_IN_PACKAGE:
			return basicSetSpecifiedInPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case e4smPackage.COMPONENT__CONTAINED_BY:
			return eInternalContainer().eInverseRemove(this, e4smPackage.COMPONENT__COMPONENTS, Component.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.COMPONENT__COMPONENTS:
			return getComponents();
		case e4smPackage.COMPONENT__CONTAINED_BY:
			return getContainedBy();
		case e4smPackage.COMPONENT__PINS:
			return getPins();
		case e4smPackage.COMPONENT__MAIN_RESPONSIBLE:
			if (resolve)
				return getMainResponsible();
			return basicGetMainResponsible();
		case e4smPackage.COMPONENT__SPECIFIED_IN_PACKAGE:
			if (resolve)
				return getSpecifiedInPackage();
			return basicGetSpecifiedInPackage();
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
		case e4smPackage.COMPONENT__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case e4smPackage.COMPONENT__CONTAINED_BY:
			setContainedBy((Component) newValue);
			return;
		case e4smPackage.COMPONENT__PINS:
			getPins().clear();
			getPins().addAll((Collection<? extends Pin>) newValue);
			return;
		case e4smPackage.COMPONENT__MAIN_RESPONSIBLE:
			setMainResponsible((Person) newValue);
			return;
		case e4smPackage.COMPONENT__SPECIFIED_IN_PACKAGE:
			setSpecifiedInPackage((e4sm.de.metamodel.e4sm.Package) newValue);
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
		case e4smPackage.COMPONENT__COMPONENTS:
			getComponents().clear();
			return;
		case e4smPackage.COMPONENT__CONTAINED_BY:
			setContainedBy((Component) null);
			return;
		case e4smPackage.COMPONENT__PINS:
			getPins().clear();
			return;
		case e4smPackage.COMPONENT__MAIN_RESPONSIBLE:
			setMainResponsible((Person) null);
			return;
		case e4smPackage.COMPONENT__SPECIFIED_IN_PACKAGE:
			setSpecifiedInPackage((e4sm.de.metamodel.e4sm.Package) null);
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
		case e4smPackage.COMPONENT__COMPONENTS:
			return components != null && !components.isEmpty();
		case e4smPackage.COMPONENT__CONTAINED_BY:
			return getContainedBy() != null;
		case e4smPackage.COMPONENT__PINS:
			return pins != null && !pins.isEmpty();
		case e4smPackage.COMPONENT__MAIN_RESPONSIBLE:
			return mainResponsible != null;
		case e4smPackage.COMPONENT__SPECIFIED_IN_PACKAGE:
			return specifiedInPackage != null;
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
		case e4smPackage.COMPONENT___COMPUTE_MAIN_RESPONSIBLE:
			return computeMainResponsible();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComponentImpl
