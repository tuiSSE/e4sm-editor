/**
 */
package e4sm.de.metamodel.e4sm.execution.impl;

import e4sm.de.metamodel.e4sm.execution.Addition;
import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Addition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.AdditionImpl#isAddition <em>Addition</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.AdditionImpl#isSubtraction <em>Subtraction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionImpl extends BinaryExpressionImpl implements Addition {
	/**
	 * The default value of the '{@link #isAddition() <em>Addition</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAddition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADDITION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAddition() <em>Addition</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAddition()
	 * @generated
	 * @ordered
	 */
	protected boolean addition = ADDITION_EDEFAULT;
	/**
	 * The default value of the '{@link #isSubtraction() <em>Subtraction</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSubtraction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUBTRACTION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isSubtraction() <em>Subtraction</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSubtraction()
	 * @generated
	 * @ordered
	 */
	protected boolean subtraction = SUBTRACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.ADDITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAddition() {
		return addition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddition(boolean newAddition) {
		boolean oldAddition = addition;
		addition = newAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.ADDITION__ADDITION, oldAddition,
					addition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSubtraction() {
		return subtraction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtraction(boolean newSubtraction) {
		boolean oldSubtraction = subtraction;
		subtraction = newSubtraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.ADDITION__SUBTRACTION,
					oldSubtraction, subtraction));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRealOperation() {
		return this.isAddition() || this.isSubtraction();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExecutionPackage.ADDITION__ADDITION:
			return isAddition();
		case ExecutionPackage.ADDITION__SUBTRACTION:
			return isSubtraction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ExecutionPackage.ADDITION__ADDITION:
			setAddition((Boolean) newValue);
			return;
		case ExecutionPackage.ADDITION__SUBTRACTION:
			setSubtraction((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ExecutionPackage.ADDITION__ADDITION:
			setAddition(ADDITION_EDEFAULT);
			return;
		case ExecutionPackage.ADDITION__SUBTRACTION:
			setSubtraction(SUBTRACTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ExecutionPackage.ADDITION__ADDITION:
			return addition != ADDITION_EDEFAULT;
		case ExecutionPackage.ADDITION__SUBTRACTION:
			return subtraction != SUBTRACTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ExecutionPackage.ADDITION___IS_REAL_OPERATION:
			return isRealOperation();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (isRealOperation()) {
			return "( " + left.toString() + (addition ? " + " : " - ") + right.toString() + " )";
		}
		return left.toString();
	}

} // AdditionImpl
