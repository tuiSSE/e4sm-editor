/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Pin;
import e4sm.de.metamodel.e4sm.e4smPackage;

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
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
