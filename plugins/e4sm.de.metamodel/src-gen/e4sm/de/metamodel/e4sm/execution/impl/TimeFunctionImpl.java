/**
 */
package e4sm.de.metamodel.e4sm.execution.impl;

import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
import e4sm.de.metamodel.e4sm.execution.Expression;
import e4sm.de.metamodel.e4sm.execution.TimeFunction;
import e4sm.de.metamodel.e4sm.execution.TimeFunctions;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.TimeFunctionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.TimeFunctionImpl#getPar1 <em>Par1</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.TimeFunctionImpl#getPar2 <em>Par2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeFunctionImpl extends MinimalEObjectImpl.Container implements TimeFunction {
	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final TimeFunctions FUNCTION_EDEFAULT = TimeFunctions.DET;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected TimeFunctions function = FUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPar1() <em>Par1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPar1()
	 * @generated
	 * @ordered
	 */
	protected Expression par1;

	/**
	 * The cached value of the '{@link #getPar2() <em>Par2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPar2()
	 * @generated
	 * @ordered
	 */
	protected Expression par2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.TIME_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeFunctions getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(TimeFunctions newFunction) {
		TimeFunctions oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.TIME_FUNCTION__FUNCTION, oldFunction,
					function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getPar1() {
		return par1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPar1(Expression newPar1, NotificationChain msgs) {
		Expression oldPar1 = par1;
		par1 = newPar1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExecutionPackage.TIME_FUNCTION__PAR1, oldPar1, newPar1);
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
	public void setPar1(Expression newPar1) {
		if (newPar1 != par1) {
			NotificationChain msgs = null;
			if (par1 != null)
				msgs = ((InternalEObject) par1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExecutionPackage.TIME_FUNCTION__PAR1, null, msgs);
			if (newPar1 != null)
				msgs = ((InternalEObject) newPar1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExecutionPackage.TIME_FUNCTION__PAR1, null, msgs);
			msgs = basicSetPar1(newPar1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.TIME_FUNCTION__PAR1, newPar1,
					newPar1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getPar2() {
		return par2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPar2(Expression newPar2, NotificationChain msgs) {
		Expression oldPar2 = par2;
		par2 = newPar2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ExecutionPackage.TIME_FUNCTION__PAR2, oldPar2, newPar2);
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
	public void setPar2(Expression newPar2) {
		if (newPar2 != par2) {
			NotificationChain msgs = null;
			if (par2 != null)
				msgs = ((InternalEObject) par2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ExecutionPackage.TIME_FUNCTION__PAR2, null, msgs);
			if (newPar2 != null)
				msgs = ((InternalEObject) newPar2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ExecutionPackage.TIME_FUNCTION__PAR2, null, msgs);
			msgs = basicSetPar2(newPar2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.TIME_FUNCTION__PAR2, newPar2,
					newPar2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getString() {
		if (function != null) {
			var res = function.toString() + "(" + par1.toString();

			if (par2 != null) {
				res += ", " + par2.toString();
			}
			;
			res += ")";
			return res;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExecutionPackage.TIME_FUNCTION__PAR1:
			return basicSetPar1(null, msgs);
		case ExecutionPackage.TIME_FUNCTION__PAR2:
			return basicSetPar2(null, msgs);
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
		case ExecutionPackage.TIME_FUNCTION__FUNCTION:
			return getFunction();
		case ExecutionPackage.TIME_FUNCTION__PAR1:
			return getPar1();
		case ExecutionPackage.TIME_FUNCTION__PAR2:
			return getPar2();
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
		case ExecutionPackage.TIME_FUNCTION__FUNCTION:
			setFunction((TimeFunctions) newValue);
			return;
		case ExecutionPackage.TIME_FUNCTION__PAR1:
			setPar1((Expression) newValue);
			return;
		case ExecutionPackage.TIME_FUNCTION__PAR2:
			setPar2((Expression) newValue);
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
		case ExecutionPackage.TIME_FUNCTION__FUNCTION:
			setFunction(FUNCTION_EDEFAULT);
			return;
		case ExecutionPackage.TIME_FUNCTION__PAR1:
			setPar1((Expression) null);
			return;
		case ExecutionPackage.TIME_FUNCTION__PAR2:
			setPar2((Expression) null);
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
		case ExecutionPackage.TIME_FUNCTION__FUNCTION:
			return function != FUNCTION_EDEFAULT;
		case ExecutionPackage.TIME_FUNCTION__PAR1:
			return par1 != null;
		case ExecutionPackage.TIME_FUNCTION__PAR2:
			return par2 != null;
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
		case ExecutionPackage.TIME_FUNCTION___GET_STRING:
			return getString();
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
		result.append(" (function: ");
		result.append(function);
		result.append(')');
		return result.toString();
	}

} //TimeFunctionImpl
