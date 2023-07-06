/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.DynamicRange;
import e4sm.de.metamodel.e4sm.e4smPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.DynamicRangeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.DynamicRangeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.DynamicRangeImpl#getSizeFactor <em>Size Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicRangeImpl extends DataSizeImpl implements DynamicRange {
	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeFactor() <em>Size Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSizeFactor() <em>Size Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeFactor()
	 * @generated
	 * @ordered
	 */
	protected double sizeFactor = SIZE_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.DYNAMIC_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.DYNAMIC_RANGE__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.DYNAMIC_RANGE__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSizeFactor() {
		return sizeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeFactor(double newSizeFactor) {
		double oldSizeFactor = sizeFactor;
		sizeFactor = newSizeFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.DYNAMIC_RANGE__SIZE_FACTOR, oldSizeFactor,
					sizeFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.DYNAMIC_RANGE__MIN:
			return getMin();
		case e4smPackage.DYNAMIC_RANGE__MAX:
			return getMax();
		case e4smPackage.DYNAMIC_RANGE__SIZE_FACTOR:
			return getSizeFactor();
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
		case e4smPackage.DYNAMIC_RANGE__MIN:
			setMin((Integer) newValue);
			return;
		case e4smPackage.DYNAMIC_RANGE__MAX:
			setMax((Integer) newValue);
			return;
		case e4smPackage.DYNAMIC_RANGE__SIZE_FACTOR:
			setSizeFactor((Double) newValue);
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
		case e4smPackage.DYNAMIC_RANGE__MIN:
			setMin(MIN_EDEFAULT);
			return;
		case e4smPackage.DYNAMIC_RANGE__MAX:
			setMax(MAX_EDEFAULT);
			return;
		case e4smPackage.DYNAMIC_RANGE__SIZE_FACTOR:
			setSizeFactor(SIZE_FACTOR_EDEFAULT);
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
		case e4smPackage.DYNAMIC_RANGE__MIN:
			return min != MIN_EDEFAULT;
		case e4smPackage.DYNAMIC_RANGE__MAX:
			return max != MAX_EDEFAULT;
		case e4smPackage.DYNAMIC_RANGE__SIZE_FACTOR:
			return sizeFactor != SIZE_FACTOR_EDEFAULT;
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
		result.append(" (min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", sizeFactor: ");
		result.append(sizeFactor);
		result.append(')');
		return result.toString();
	}

} //DynamicRangeImpl
