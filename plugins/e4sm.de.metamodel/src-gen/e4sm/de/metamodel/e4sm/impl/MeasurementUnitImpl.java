/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.MeasurementUnit;
import e4sm.de.metamodel.e4sm.UnitConversion;
import e4sm.de.metamodel.e4sm.e4smPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.MeasurementUnitImpl#getUnitConversion <em>Unit Conversion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementUnitImpl extends MinimalEObjectImpl.Container implements MeasurementUnit {
	/**
	 * The cached value of the '{@link #getUnitConversion() <em>Unit Conversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitConversion()
	 * @generated
	 * @ordered
	 */
	protected UnitConversion unitConversion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.MEASUREMENT_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitConversion getUnitConversion() {
		return unitConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitConversion(UnitConversion newUnitConversion, NotificationChain msgs) {
		UnitConversion oldUnitConversion = unitConversion;
		unitConversion = newUnitConversion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					e4smPackage.MEASUREMENT_UNIT__UNIT_CONVERSION, oldUnitConversion, newUnitConversion);
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
	public void setUnitConversion(UnitConversion newUnitConversion) {
		if (newUnitConversion != unitConversion) {
			NotificationChain msgs = null;
			if (unitConversion != null)
				msgs = ((InternalEObject) unitConversion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - e4smPackage.MEASUREMENT_UNIT__UNIT_CONVERSION, null, msgs);
			if (newUnitConversion != null)
				msgs = ((InternalEObject) newUnitConversion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - e4smPackage.MEASUREMENT_UNIT__UNIT_CONVERSION, null, msgs);
			msgs = basicSetUnitConversion(newUnitConversion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.MEASUREMENT_UNIT__UNIT_CONVERSION,
					newUnitConversion, newUnitConversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.MEASUREMENT_UNIT__UNIT_CONVERSION:
			return basicSetUnitConversion(null, msgs);
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
		case e4smPackage.MEASUREMENT_UNIT__UNIT_CONVERSION:
			return getUnitConversion();
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
		case e4smPackage.MEASUREMENT_UNIT__UNIT_CONVERSION:
			setUnitConversion((UnitConversion) newValue);
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
		case e4smPackage.MEASUREMENT_UNIT__UNIT_CONVERSION:
			setUnitConversion((UnitConversion) null);
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
		case e4smPackage.MEASUREMENT_UNIT__UNIT_CONVERSION:
			return unitConversion != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasurementUnitImpl
