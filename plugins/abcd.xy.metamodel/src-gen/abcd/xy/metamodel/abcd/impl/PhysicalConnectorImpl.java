/**
 */
package abcd.xy.metamodel.abcd.impl;

import abcd.xy.metamodel.abcd.PhysicalConnector;
import abcd.xy.metamodel.abcd.abcdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PhysicalConnectorImpl#getMinSpeed <em>Min Speed</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.impl.PhysicalConnectorImpl#getMaxSpeed <em>Max Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalConnectorImpl extends ConnectorImpl implements PhysicalConnector {
	/**
	 * The cached value of the '{@link #getMinSpeed() <em>Min Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSpeed()
	 * @generated
	 * @ordered
	 */
	protected Object minSpeed;

	/**
	 * The cached value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected Object maxSpeed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return abcdPackage.Literals.PHYSICAL_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMinSpeed() {
		return minSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinSpeed(Object newMinSpeed) {
		Object oldMinSpeed = minSpeed;
		minSpeed = newMinSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.PHYSICAL_CONNECTOR__MIN_SPEED,
					oldMinSpeed, minSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSpeed(Object newMaxSpeed) {
		Object oldMaxSpeed = maxSpeed;
		maxSpeed = newMaxSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, abcdPackage.PHYSICAL_CONNECTOR__MAX_SPEED,
					oldMaxSpeed, maxSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case abcdPackage.PHYSICAL_CONNECTOR__MIN_SPEED:
			return getMinSpeed();
		case abcdPackage.PHYSICAL_CONNECTOR__MAX_SPEED:
			return getMaxSpeed();
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
		case abcdPackage.PHYSICAL_CONNECTOR__MIN_SPEED:
			setMinSpeed(newValue);
			return;
		case abcdPackage.PHYSICAL_CONNECTOR__MAX_SPEED:
			setMaxSpeed(newValue);
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
		case abcdPackage.PHYSICAL_CONNECTOR__MIN_SPEED:
			setMinSpeed((Object) null);
			return;
		case abcdPackage.PHYSICAL_CONNECTOR__MAX_SPEED:
			setMaxSpeed((Object) null);
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
		case abcdPackage.PHYSICAL_CONNECTOR__MIN_SPEED:
			return minSpeed != null;
		case abcdPackage.PHYSICAL_CONNECTOR__MAX_SPEED:
			return maxSpeed != null;
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
		result.append(" (minSpeed: ");
		result.append(minSpeed);
		result.append(", maxSpeed: ");
		result.append(maxSpeed);
		result.append(')');
		return result.toString();
	}

} //PhysicalConnectorImpl
