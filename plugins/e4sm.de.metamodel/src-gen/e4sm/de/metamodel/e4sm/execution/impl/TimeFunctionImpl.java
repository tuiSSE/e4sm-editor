/**
 */
package e4sm.de.metamodel.e4sm.execution.impl;

import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
import e4sm.de.metamodel.e4sm.execution.TimeFunction;
import e4sm.de.metamodel.e4sm.execution.TimeFunctions;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

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
	 * The default value of the '{@link #getPar1() <em>Par1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPar1()
	 * @generated
	 * @ordered
	 */
	protected static final double PAR1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPar1() <em>Par1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPar1()
	 * @generated
	 * @ordered
	 */
	protected double par1 = PAR1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPar2() <em>Par2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPar2()
	 * @generated
	 * @ordered
	 */
	protected static final double PAR2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPar2() <em>Par2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPar2()
	 * @generated
	 * @ordered
	 */
	protected double par2 = PAR2_EDEFAULT;

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
	public double getPar1() {
		return par1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPar1(double newPar1) {
		double oldPar1 = par1;
		par1 = newPar1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.TIME_FUNCTION__PAR1, oldPar1, par1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPar2() {
		return par2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPar2(double newPar2) {
		double oldPar2 = par2;
		par2 = newPar2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.TIME_FUNCTION__PAR2, oldPar2, par2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getString() {
		if (function != null) {
			var res = function.toString() + "(" + Double.toString(par1);

			if (par2 > 0) {
				res += ", " + Double.toString(par2);
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
			setPar1((Double) newValue);
			return;
		case ExecutionPackage.TIME_FUNCTION__PAR2:
			setPar2((Double) newValue);
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
			setPar1(PAR1_EDEFAULT);
			return;
		case ExecutionPackage.TIME_FUNCTION__PAR2:
			setPar2(PAR2_EDEFAULT);
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
			return par1 != PAR1_EDEFAULT;
		case ExecutionPackage.TIME_FUNCTION__PAR2:
			return par2 != PAR2_EDEFAULT;
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
		result.append(", par1: ");
		result.append(par1);
		result.append(", par2: ");
		result.append(par2);
		result.append(')');
		return result.toString();
	}

} //TimeFunctionImpl
