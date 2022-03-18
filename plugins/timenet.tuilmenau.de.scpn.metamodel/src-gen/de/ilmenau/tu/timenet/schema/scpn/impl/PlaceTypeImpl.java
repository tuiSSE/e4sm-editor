/**
 */
package de.ilmenau.tu.timenet.schema.scpn.impl;

import de.ilmenau.tu.timenet.schema.scpn.LabelType;
import de.ilmenau.tu.timenet.schema.scpn.PlaceType;
import de.ilmenau.tu.timenet.schema.scpn.QueueType;
import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

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
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.PlaceTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.PlaceTypeImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.PlaceTypeImpl#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.PlaceTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.PlaceTypeImpl#getQueue <em>Queue</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.PlaceTypeImpl#getTokentype <em>Tokentype</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.PlaceTypeImpl#isWatch <em>Watch</em>}</li>
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
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITY_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected String capacity = CAPACITY_EDEFAULT;

	/**
	 * This is true if the Capacity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capacityESet;

	/**
	 * The default value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_MARKING_EDEFAULT = null;

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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueue() <em>Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected static final QueueType QUEUE_EDEFAULT = QueueType.RANDOM;

	/**
	 * The cached value of the '{@link #getQueue() <em>Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected QueueType queue = QUEUE_EDEFAULT;

	/**
	 * This is true if the Queue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queueESet;

	/**
	 * The default value of the '{@link #getTokentype() <em>Tokentype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokentype()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKENTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokentype() <em>Tokentype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokentype()
	 * @generated
	 * @ordered
	 */
	protected String tokentype = TOKENTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isWatch() <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWatch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WATCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWatch() <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWatch()
	 * @generated
	 * @ordered
	 */
	protected boolean watch = WATCH_EDEFAULT;

	/**
	 * This is true if the Watch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean watchESet;

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
		return scpnPackage.Literals.PLACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
					scpnPackage.PLACE_TYPE__LABEL, oldLabel, newLabel);
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
	public void setLabel(LabelType newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject) label).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - scpnPackage.PLACE_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject) newLabel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - scpnPackage.PLACE_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.PLACE_TYPE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(String newCapacity) {
		String oldCapacity = capacity;
		capacity = newCapacity;
		boolean oldCapacityESet = capacityESet;
		capacityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.PLACE_TYPE__CAPACITY, oldCapacity,
					capacity, !oldCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCapacity() {
		String oldCapacity = capacity;
		boolean oldCapacityESet = capacityESet;
		capacity = CAPACITY_EDEFAULT;
		capacityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scpnPackage.PLACE_TYPE__CAPACITY, oldCapacity,
					CAPACITY_EDEFAULT, oldCapacityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCapacity() {
		return capacityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialMarking() {
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialMarking(String newInitialMarking) {
		String oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.PLACE_TYPE__INITIAL_MARKING,
					oldInitialMarking, initialMarking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.PLACE_TYPE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueueType getQueue() {
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueue(QueueType newQueue) {
		QueueType oldQueue = queue;
		queue = newQueue == null ? QUEUE_EDEFAULT : newQueue;
		boolean oldQueueESet = queueESet;
		queueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.PLACE_TYPE__QUEUE, oldQueue, queue,
					!oldQueueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetQueue() {
		QueueType oldQueue = queue;
		boolean oldQueueESet = queueESet;
		queue = QUEUE_EDEFAULT;
		queueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scpnPackage.PLACE_TYPE__QUEUE, oldQueue,
					QUEUE_EDEFAULT, oldQueueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetQueue() {
		return queueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTokentype() {
		return tokentype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokentype(String newTokentype) {
		String oldTokentype = tokentype;
		tokentype = newTokentype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.PLACE_TYPE__TOKENTYPE, oldTokentype,
					tokentype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWatch() {
		return watch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWatch(boolean newWatch) {
		boolean oldWatch = watch;
		watch = newWatch;
		boolean oldWatchESet = watchESet;
		watchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.PLACE_TYPE__WATCH, oldWatch, watch,
					!oldWatchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWatch() {
		boolean oldWatch = watch;
		boolean oldWatchESet = watchESet;
		watch = WATCH_EDEFAULT;
		watchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scpnPackage.PLACE_TYPE__WATCH, oldWatch,
					WATCH_EDEFAULT, oldWatchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWatch() {
		return watchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case scpnPackage.PLACE_TYPE__LABEL:
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
		case scpnPackage.PLACE_TYPE__LABEL:
			return getLabel();
		case scpnPackage.PLACE_TYPE__CAPACITY:
			return getCapacity();
		case scpnPackage.PLACE_TYPE__INITIAL_MARKING:
			return getInitialMarking();
		case scpnPackage.PLACE_TYPE__PATH:
			return getPath();
		case scpnPackage.PLACE_TYPE__QUEUE:
			return getQueue();
		case scpnPackage.PLACE_TYPE__TOKENTYPE:
			return getTokentype();
		case scpnPackage.PLACE_TYPE__WATCH:
			return isWatch();
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
		case scpnPackage.PLACE_TYPE__LABEL:
			setLabel((LabelType) newValue);
			return;
		case scpnPackage.PLACE_TYPE__CAPACITY:
			setCapacity((String) newValue);
			return;
		case scpnPackage.PLACE_TYPE__INITIAL_MARKING:
			setInitialMarking((String) newValue);
			return;
		case scpnPackage.PLACE_TYPE__PATH:
			setPath((String) newValue);
			return;
		case scpnPackage.PLACE_TYPE__QUEUE:
			setQueue((QueueType) newValue);
			return;
		case scpnPackage.PLACE_TYPE__TOKENTYPE:
			setTokentype((String) newValue);
			return;
		case scpnPackage.PLACE_TYPE__WATCH:
			setWatch((Boolean) newValue);
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
		case scpnPackage.PLACE_TYPE__LABEL:
			setLabel((LabelType) null);
			return;
		case scpnPackage.PLACE_TYPE__CAPACITY:
			unsetCapacity();
			return;
		case scpnPackage.PLACE_TYPE__INITIAL_MARKING:
			setInitialMarking(INITIAL_MARKING_EDEFAULT);
			return;
		case scpnPackage.PLACE_TYPE__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case scpnPackage.PLACE_TYPE__QUEUE:
			unsetQueue();
			return;
		case scpnPackage.PLACE_TYPE__TOKENTYPE:
			setTokentype(TOKENTYPE_EDEFAULT);
			return;
		case scpnPackage.PLACE_TYPE__WATCH:
			unsetWatch();
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
		case scpnPackage.PLACE_TYPE__LABEL:
			return label != null;
		case scpnPackage.PLACE_TYPE__CAPACITY:
			return isSetCapacity();
		case scpnPackage.PLACE_TYPE__INITIAL_MARKING:
			return INITIAL_MARKING_EDEFAULT == null ? initialMarking != null
					: !INITIAL_MARKING_EDEFAULT.equals(initialMarking);
		case scpnPackage.PLACE_TYPE__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case scpnPackage.PLACE_TYPE__QUEUE:
			return isSetQueue();
		case scpnPackage.PLACE_TYPE__TOKENTYPE:
			return TOKENTYPE_EDEFAULT == null ? tokentype != null : !TOKENTYPE_EDEFAULT.equals(tokentype);
		case scpnPackage.PLACE_TYPE__WATCH:
			return isSetWatch();
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
		result.append(" (capacity: ");
		if (capacityESet)
			result.append(capacity);
		else
			result.append("<unset>");
		result.append(", initialMarking: ");
		result.append(initialMarking);
		result.append(", path: ");
		result.append(path);
		result.append(", queue: ");
		if (queueESet)
			result.append(queue);
		else
			result.append("<unset>");
		result.append(", tokentype: ");
		result.append(tokentype);
		result.append(", watch: ");
		if (watchESet)
			result.append(watch);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PlaceTypeImpl
