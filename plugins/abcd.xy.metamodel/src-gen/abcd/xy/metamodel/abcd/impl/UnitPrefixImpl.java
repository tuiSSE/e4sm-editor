/**
 */
package abcd.xy.metamodel.abcd.impl;

import abcd.xy.metamodel.abcd.UnitPrefix;
import abcd.xy.metamodel.abcd.abcdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Prefix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.UnitPrefixImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.UnitPrefixImpl#getConversionFactor <em>Conversion Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitPrefixImpl extends MinimalEObjectImpl.Container implements UnitPrefix {
	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int CONVERSION_FACTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected int conversionFactor = CONVERSION_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitPrefixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return abcdPackage.Literals.UNIT_PREFIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.UNIT_PREFIX__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getConversionFactor() {
		return conversionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversionFactor(int newConversionFactor) {
		int oldConversionFactor = conversionFactor;
		conversionFactor = newConversionFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.UNIT_PREFIX__CONVERSION_FACTOR,
					oldConversionFactor, conversionFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case abcdPackage.UNIT_PREFIX__SYMBOL:
			return getSymbol();
		case abcdPackage.UNIT_PREFIX__CONVERSION_FACTOR:
			return getConversionFactor();
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
		case abcdPackage.UNIT_PREFIX__SYMBOL:
			setSymbol((String) newValue);
			return;
		case abcdPackage.UNIT_PREFIX__CONVERSION_FACTOR:
			setConversionFactor((Integer) newValue);
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
		case abcdPackage.UNIT_PREFIX__SYMBOL:
			setSymbol(SYMBOL_EDEFAULT);
			return;
		case abcdPackage.UNIT_PREFIX__CONVERSION_FACTOR:
			setConversionFactor(CONVERSION_FACTOR_EDEFAULT);
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
		case abcdPackage.UNIT_PREFIX__SYMBOL:
			return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
		case abcdPackage.UNIT_PREFIX__CONVERSION_FACTOR:
			return conversionFactor != CONVERSION_FACTOR_EDEFAULT;
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
		result.append(" (symbol: ");
		result.append(symbol);
		result.append(", conversionFactor: ");
		result.append(conversionFactor);
		result.append(')');
		return result.toString();
	}

} //UnitPrefixImpl
