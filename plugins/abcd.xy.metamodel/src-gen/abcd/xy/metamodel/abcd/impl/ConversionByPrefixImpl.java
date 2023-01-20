/**
 */
package abcd.xy.metamodel.abcd.impl;

import abcd.xy.metamodel.abcd.ConversionByPrefix;
import abcd.xy.metamodel.abcd.UnitPrefix;
import abcd.xy.metamodel.abcd.abcdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion By Prefix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ConversionByPrefixImpl#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.ConversionByPrefixImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConversionByPrefixImpl extends UnitConversionImpl implements ConversionByPrefix {
	/**
	 * The default value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float CONVERSION_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected float conversionFactor = CONVERSION_FACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected UnitPrefix prefix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversionByPrefixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return abcdPackage.Literals.CONVERSION_BY_PREFIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getConversionFactor() {
		return conversionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversionFactor(float newConversionFactor) {
		float oldConversionFactor = conversionFactor;
		conversionFactor = newConversionFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.CONVERSION_BY_PREFIX__CONVERSION_FACTOR,
					oldConversionFactor, conversionFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitPrefix getPrefix() {
		if (prefix != null && prefix.eIsProxy()) {
			InternalEObject oldPrefix = (InternalEObject) prefix;
			prefix = (UnitPrefix) eResolveProxy(oldPrefix);
			if (prefix != oldPrefix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, abcdPackage.CONVERSION_BY_PREFIX__PREFIX,
							oldPrefix, prefix));
			}
		}
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitPrefix basicGetPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(UnitPrefix newPrefix) {
		UnitPrefix oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.CONVERSION_BY_PREFIX__PREFIX, oldPrefix,
					prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case abcdPackage.CONVERSION_BY_PREFIX__CONVERSION_FACTOR:
			return getConversionFactor();
		case abcdPackage.CONVERSION_BY_PREFIX__PREFIX:
			if (resolve)
				return getPrefix();
			return basicGetPrefix();
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
		case abcdPackage.CONVERSION_BY_PREFIX__CONVERSION_FACTOR:
			setConversionFactor((Float) newValue);
			return;
		case abcdPackage.CONVERSION_BY_PREFIX__PREFIX:
			setPrefix((UnitPrefix) newValue);
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
		case abcdPackage.CONVERSION_BY_PREFIX__CONVERSION_FACTOR:
			setConversionFactor(CONVERSION_FACTOR_EDEFAULT);
			return;
		case abcdPackage.CONVERSION_BY_PREFIX__PREFIX:
			setPrefix((UnitPrefix) null);
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
		case abcdPackage.CONVERSION_BY_PREFIX__CONVERSION_FACTOR:
			return conversionFactor != CONVERSION_FACTOR_EDEFAULT;
		case abcdPackage.CONVERSION_BY_PREFIX__PREFIX:
			return prefix != null;
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
		result.append(" (conversionFactor: ");
		result.append(conversionFactor);
		result.append(')');
		return result.toString();
	}

} //ConversionByPrefixImpl
