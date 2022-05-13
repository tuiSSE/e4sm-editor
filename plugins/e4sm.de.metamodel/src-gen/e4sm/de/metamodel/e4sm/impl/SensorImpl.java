/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.e4smPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.SensorImpl#getTimeFunctionDeprecated <em>Time Function Deprecated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends PhysicalComponentImpl implements Sensor {
	/**
	 * The default value of the '{@link #getTimeFunctionDeprecated() <em>Time Function Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFunctionDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_FUNCTION_DEPRECATED_EDEFAULT = "EXP(1.0)";
	/**
	 * The cached value of the '{@link #getTimeFunctionDeprecated() <em>Time Function Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFunctionDeprecated()
	 * @generated
	 * @ordered
	 */
	protected String timeFunctionDeprecated = TIME_FUNCTION_DEPRECATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeFunctionDeprecated() {
		return timeFunctionDeprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeFunctionDeprecated(String newTimeFunctionDeprecated) {
		String oldTimeFunctionDeprecated = timeFunctionDeprecated;
		timeFunctionDeprecated = newTimeFunctionDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.SENSOR__TIME_FUNCTION_DEPRECATED,
					oldTimeFunctionDeprecated, timeFunctionDeprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.SENSOR__TIME_FUNCTION_DEPRECATED:
			return getTimeFunctionDeprecated();
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
		case e4smPackage.SENSOR__TIME_FUNCTION_DEPRECATED:
			setTimeFunctionDeprecated((String) newValue);
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
		case e4smPackage.SENSOR__TIME_FUNCTION_DEPRECATED:
			setTimeFunctionDeprecated(TIME_FUNCTION_DEPRECATED_EDEFAULT);
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
		case e4smPackage.SENSOR__TIME_FUNCTION_DEPRECATED:
			return TIME_FUNCTION_DEPRECATED_EDEFAULT == null ? timeFunctionDeprecated != null
					: !TIME_FUNCTION_DEPRECATED_EDEFAULT.equals(timeFunctionDeprecated);
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
		result.append(" (timeFunctionDeprecated: ");
		result.append(timeFunctionDeprecated);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
