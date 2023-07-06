/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.impl;

import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage;
import de.ilmenau.tu.timenet.schema.eDSPN.LabelType;
import de.ilmenau.tu.timenet.schema.eDSPN.PlaceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.PlaceTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.PlaceTypeImpl#getInitialMarking <em>Initial Marking</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceTypeImpl extends NodeTypeImpl implements PlaceType {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected LabelType label;

	/**
	 * The default value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_MARKING_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected String initialMarking = INITIAL_MARKING_EDEFAULT;

	/**
	 * This is true if the Initial Marking attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initialMarkingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDSPNPackage.Literals.PLACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelType getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(LabelType newLabel, NotificationChain msgs) {
		LabelType oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EDSPNPackage.PLACE_TYPE__LABEL, oldLabel, newLabel);
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
	public void setLabel(LabelType newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject) label).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EDSPNPackage.PLACE_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject) newLabel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EDSPNPackage.PLACE_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.PLACE_TYPE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialMarking() {
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialMarking(String newInitialMarking) {
		String oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		boolean oldInitialMarkingESet = initialMarkingESet;
		initialMarkingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDSPNPackage.PLACE_TYPE__INITIAL_MARKING,
					oldInitialMarking, initialMarking, !oldInitialMarkingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitialMarking() {
		String oldInitialMarking = initialMarking;
		boolean oldInitialMarkingESet = initialMarkingESet;
		initialMarking = INITIAL_MARKING_EDEFAULT;
		initialMarkingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDSPNPackage.PLACE_TYPE__INITIAL_MARKING,
					oldInitialMarking, INITIAL_MARKING_EDEFAULT, oldInitialMarkingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitialMarking() {
		return initialMarkingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDSPNPackage.PLACE_TYPE__LABEL:
			return basicSetLabel(null, msgs);
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
		case EDSPNPackage.PLACE_TYPE__LABEL:
			return getLabel();
		case EDSPNPackage.PLACE_TYPE__INITIAL_MARKING:
			return getInitialMarking();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EDSPNPackage.PLACE_TYPE__LABEL:
			setLabel((LabelType) newValue);
			return;
		case EDSPNPackage.PLACE_TYPE__INITIAL_MARKING:
			setInitialMarking((String) newValue);
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
		case EDSPNPackage.PLACE_TYPE__LABEL:
			setLabel((LabelType) null);
			return;
		case EDSPNPackage.PLACE_TYPE__INITIAL_MARKING:
			unsetInitialMarking();
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
		case EDSPNPackage.PLACE_TYPE__LABEL:
			return label != null;
		case EDSPNPackage.PLACE_TYPE__INITIAL_MARKING:
			return isSetInitialMarking();
		}
		return super.eIsSet(featureID);
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
		result.append(" (initialMarking: ");
		if (initialMarkingESet)
			result.append(initialMarking);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PlaceTypeImpl
