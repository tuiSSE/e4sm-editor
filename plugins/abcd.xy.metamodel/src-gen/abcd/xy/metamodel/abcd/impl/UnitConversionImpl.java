/**
 */
package abcd.xy.metamodel.abcd.impl;

import abcd.xy.metamodel.abcd.MeasurementUnit;
import abcd.xy.metamodel.abcd.UnitConversion;
import abcd.xy.metamodel.abcd.abcdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.UnitConversionImpl#getReferenceUnit <em>Reference Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitConversionImpl extends MinimalEObjectImpl.Container implements UnitConversion {
	/**
	 * The cached value of the '{@link #getReferenceUnit() <em>Reference Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceUnit()
	 * @generated
	 * @ordered
	 */
	protected MeasurementUnit referenceUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return abcdPackage.Literals.UNIT_CONVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementUnit getReferenceUnit() {
		if (referenceUnit != null && referenceUnit.eIsProxy()) {
			InternalEObject oldReferenceUnit = (InternalEObject) referenceUnit;
			referenceUnit = (MeasurementUnit) eResolveProxy(oldReferenceUnit);
			if (referenceUnit != oldReferenceUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							abcdPackage.UNIT_CONVERSION__REFERENCE_UNIT, oldReferenceUnit, referenceUnit));
			}
		}
		return referenceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnit basicGetReferenceUnit() {
		return referenceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceUnit(MeasurementUnit newReferenceUnit) {
		MeasurementUnit oldReferenceUnit = referenceUnit;
		referenceUnit = newReferenceUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.UNIT_CONVERSION__REFERENCE_UNIT,
					oldReferenceUnit, referenceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case abcdPackage.UNIT_CONVERSION__REFERENCE_UNIT:
			if (resolve)
				return getReferenceUnit();
			return basicGetReferenceUnit();
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
		case abcdPackage.UNIT_CONVERSION__REFERENCE_UNIT:
			setReferenceUnit((MeasurementUnit) newValue);
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
		case abcdPackage.UNIT_CONVERSION__REFERENCE_UNIT:
			setReferenceUnit((MeasurementUnit) null);
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
		case abcdPackage.UNIT_CONVERSION__REFERENCE_UNIT:
			return referenceUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //UnitConversionImpl
