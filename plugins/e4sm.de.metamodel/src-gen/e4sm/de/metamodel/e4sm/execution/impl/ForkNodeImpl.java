/**
 */
package e4sm.de.metamodel.e4sm.execution.impl;

import e4sm.de.metamodel.e4sm.execution.ConnectableNode;
import e4sm.de.metamodel.e4sm.execution.DelayableElement;
import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
import e4sm.de.metamodel.e4sm.execution.ForkNode;

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
 * An implementation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.ForkNodeImpl#getTimeFunction <em>Time Function</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.ForkNodeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.ForkNodeImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForkNodeImpl extends ExecutionElementImpl implements ForkNode {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ConnectableNode source;
	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectableNode> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.FORK_NODE;
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
					ExecutionPackage.FORK_NODE__TIME_FUNCTION, oldTimeFunction, newTimeFunction);
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
						EOPPOSITE_FEATURE_BASE - ExecutionPackage.FORK_NODE__TIME_FUNCTION, null, msgs);
			if (newTimeFunction != null)
				msgs = ((InternalEObject) newTimeFunction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExecutionPackage.FORK_NODE__TIME_FUNCTION, null, msgs);
			msgs = basicSetTimeFunction(newTimeFunction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.FORK_NODE__TIME_FUNCTION,
					newTimeFunction, newTimeFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectableNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (ConnectableNode) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionPackage.FORK_NODE__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ConnectableNode newSource) {
		ConnectableNode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.FORK_NODE__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConnectableNode> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<ConnectableNode>(ConnectableNode.class, this,
					ExecutionPackage.FORK_NODE__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExecutionPackage.FORK_NODE__TIME_FUNCTION:
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
		case ExecutionPackage.FORK_NODE__TIME_FUNCTION:
			return getTimeFunction();
		case ExecutionPackage.FORK_NODE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ExecutionPackage.FORK_NODE__TARGETS:
			return getTargets();
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
		case ExecutionPackage.FORK_NODE__TIME_FUNCTION:
			setTimeFunction((TimeFunction) newValue);
			return;
		case ExecutionPackage.FORK_NODE__SOURCE:
			setSource((ConnectableNode) newValue);
			return;
		case ExecutionPackage.FORK_NODE__TARGETS:
			getTargets().clear();
			getTargets().addAll((Collection<? extends ConnectableNode>) newValue);
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
		case ExecutionPackage.FORK_NODE__TIME_FUNCTION:
			setTimeFunction((TimeFunction) null);
			return;
		case ExecutionPackage.FORK_NODE__SOURCE:
			setSource((ConnectableNode) null);
			return;
		case ExecutionPackage.FORK_NODE__TARGETS:
			getTargets().clear();
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
		case ExecutionPackage.FORK_NODE__TIME_FUNCTION:
			return timeFunction != null;
		case ExecutionPackage.FORK_NODE__SOURCE:
			return source != null;
		case ExecutionPackage.FORK_NODE__TARGETS:
			return targets != null && !targets.isEmpty();
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
			case ExecutionPackage.FORK_NODE__TIME_FUNCTION:
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
				return ExecutionPackage.FORK_NODE__TIME_FUNCTION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ForkNodeImpl
