/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.QueueType;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.InputPinImpl#getQueueType <em>Queue Type</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.InputPinImpl#getCollect <em>Collect</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.InputPinImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputPinImpl extends PinImpl implements InputPin {
	/**
	 * The default value of the '{@link #getQueueType() <em>Queue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueType()
	 * @generated
	 * @ordered
	 */
	protected static final QueueType QUEUE_TYPE_EDEFAULT = QueueType.FIFO;
	/**
	 * The cached value of the '{@link #getQueueType() <em>Queue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueType()
	 * @generated
	 * @ordered
	 */
	protected QueueType queueType = QUEUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollect() <em>Collect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollect()
	 * @generated
	 * @ordered
	 */
	protected static final int COLLECT_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getCollect() <em>Collect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollect()
	 * @generated
	 * @ordered
	 */
	protected int collect = COLLECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.INPUT_PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueueType getQueueType() {
		return queueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueType(QueueType newQueueType) {
		QueueType oldQueueType = queueType;
		queueType = newQueueType == null ? QUEUE_TYPE_EDEFAULT : newQueueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.INPUT_PIN__QUEUE_TYPE, oldQueueType,
					queueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCollect() {
		return collect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollect(int newCollect) {
		int oldCollect = collect;
		collect = newCollect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.INPUT_PIN__COLLECT, oldCollect, collect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, e4smPackage.INPUT_PIN__OPTIONAL, oldOptional,
					optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String computeName() {
		if (this.getName() != null && !this.getName().isBlank()) {
			return this.getName();
		}
		var container = ((Component) this.eContainer());
		return container.getName() + "_in_" + container.getPins().indexOf(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case e4smPackage.INPUT_PIN__QUEUE_TYPE:
			return getQueueType();
		case e4smPackage.INPUT_PIN__COLLECT:
			return getCollect();
		case e4smPackage.INPUT_PIN__OPTIONAL:
			return isOptional();
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
		case e4smPackage.INPUT_PIN__QUEUE_TYPE:
			setQueueType((QueueType) newValue);
			return;
		case e4smPackage.INPUT_PIN__COLLECT:
			setCollect((Integer) newValue);
			return;
		case e4smPackage.INPUT_PIN__OPTIONAL:
			setOptional((Boolean) newValue);
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
		case e4smPackage.INPUT_PIN__QUEUE_TYPE:
			setQueueType(QUEUE_TYPE_EDEFAULT);
			return;
		case e4smPackage.INPUT_PIN__COLLECT:
			setCollect(COLLECT_EDEFAULT);
			return;
		case e4smPackage.INPUT_PIN__OPTIONAL:
			setOptional(OPTIONAL_EDEFAULT);
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
		case e4smPackage.INPUT_PIN__QUEUE_TYPE:
			return queueType != QUEUE_TYPE_EDEFAULT;
		case e4smPackage.INPUT_PIN__COLLECT:
			return collect != COLLECT_EDEFAULT;
		case e4smPackage.INPUT_PIN__OPTIONAL:
			return optional != OPTIONAL_EDEFAULT;
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
		case e4smPackage.INPUT_PIN___COMPUTE_NAME:
			return computeName();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (queueType: ");
		result.append(queueType);
		result.append(", collect: ");
		result.append(collect);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //InputPinImpl
