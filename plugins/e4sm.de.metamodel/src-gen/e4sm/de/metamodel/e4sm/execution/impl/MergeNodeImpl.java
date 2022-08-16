/**
 */
package e4sm.de.metamodel.e4sm.execution.impl;

import e4sm.de.metamodel.e4sm.execution.ConnectableNode;
import e4sm.de.metamodel.e4sm.execution.DelayableElement;
import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
import e4sm.de.metamodel.e4sm.execution.MergeNode;

import e4sm.de.metamodel.e4sm.execution.TimeFunction;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.MergeNodeImpl#getTimeFunction <em>Time Function</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.MergeNodeImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.MergeNodeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeNodeImpl extends ExecutionElementImpl implements MergeNode {
	/**
	 * The cached value of the '{@link #getTimeFunction() <em>Time Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFunction()
	 * @generated
	 * @ordered
	 */
	protected TimeFunction timeFunction;
	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectableNode> sources;
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ConnectableNode target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.MERGE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeFunction getTimeFunction() {
		return timeFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeFunction(TimeFunction newTimeFunction, NotificationChain msgs) {
		TimeFunction oldTimeFunction = timeFunction;
		timeFunction = newTimeFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExecutionPackage.MERGE_NODE__TIME_FUNCTION, oldTimeFunction, newTimeFunction);
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
	public void setTimeFunction(TimeFunction newTimeFunction) {
		if (newTimeFunction != timeFunction) {
			NotificationChain msgs = null;
			if (timeFunction != null)
				msgs = ((InternalEObject) timeFunction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExecutionPackage.MERGE_NODE__TIME_FUNCTION, null, msgs);
			if (newTimeFunction != null)
				msgs = ((InternalEObject) newTimeFunction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExecutionPackage.MERGE_NODE__TIME_FUNCTION, null, msgs);
			msgs = basicSetTimeFunction(newTimeFunction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.MERGE_NODE__TIME_FUNCTION,
					newTimeFunction, newTimeFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectableNode> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<ConnectableNode>(ConnectableNode.class, this,
					ExecutionPackage.MERGE_NODE__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectableNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (ConnectableNode) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionPackage.MERGE_NODE__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ConnectableNode newTarget) {
		ConnectableNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.MERGE_NODE__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExecutionPackage.MERGE_NODE__TIME_FUNCTION:
			return basicSetTimeFunction(null, msgs);
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
		case ExecutionPackage.MERGE_NODE__TIME_FUNCTION:
			return getTimeFunction();
		case ExecutionPackage.MERGE_NODE__SOURCES:
			return getSources();
		case ExecutionPackage.MERGE_NODE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExecutionPackage.MERGE_NODE__TIME_FUNCTION:
			setTimeFunction((TimeFunction) newValue);
			return;
		case ExecutionPackage.MERGE_NODE__SOURCES:
			getSources().clear();
			getSources().addAll((Collection<? extends ConnectableNode>) newValue);
			return;
		case ExecutionPackage.MERGE_NODE__TARGET:
			setTarget((ConnectableNode) newValue);
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
		case ExecutionPackage.MERGE_NODE__TIME_FUNCTION:
			setTimeFunction((TimeFunction) null);
			return;
		case ExecutionPackage.MERGE_NODE__SOURCES:
			getSources().clear();
			return;
		case ExecutionPackage.MERGE_NODE__TARGET:
			setTarget((ConnectableNode) null);
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
		case ExecutionPackage.MERGE_NODE__TIME_FUNCTION:
			return timeFunction != null;
		case ExecutionPackage.MERGE_NODE__SOURCES:
			return sources != null && !sources.isEmpty();
		case ExecutionPackage.MERGE_NODE__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DelayableElement.class) {
			switch (derivedFeatureID) {
			case ExecutionPackage.MERGE_NODE__TIME_FUNCTION:
				return ExecutionPackage.DELAYABLE_ELEMENT__TIME_FUNCTION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DelayableElement.class) {
			switch (baseFeatureID) {
			case ExecutionPackage.DELAYABLE_ELEMENT__TIME_FUNCTION:
				return ExecutionPackage.MERGE_NODE__TIME_FUNCTION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MergeNodeImpl
