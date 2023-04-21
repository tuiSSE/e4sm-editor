/**
 */
package e4sm.de.metamodel.e4sm.execution.impl;

import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
import e4sm.de.metamodel.e4sm.execution.Multiplication;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Multiplication</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.MultiplicationImpl#isMultiplication <em>Multiplication</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.impl.MultiplicationImpl#isDivision <em>Division</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicationImpl extends BinaryExpressionImpl implements Multiplication {
	/**
	 * The default value of the '{@link #isMultiplication() <em>Multiplication</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isMultiplication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLICATION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isMultiplication() <em>Multiplication</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMultiplication()
	 * @generated
	 * @ordered
	 */
	protected boolean multiplication = MULTIPLICATION_EDEFAULT;
	/**
	 * The default value of the '{@link #isDivision() <em>Division</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDivision()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIVISION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDivision() <em>Division</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDivision()
	 * @generated
	 * @ordered
	 */
	protected boolean division = DIVISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.MULTIPLICATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultiplication() {
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplication(boolean newMultiplication) {
		boolean oldMultiplication = multiplication;
		multiplication = newMultiplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.MULTIPLICATION__MULTIPLICATION,
					oldMultiplication, multiplication));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDivision() {
		return division;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDivision(boolean newDivision) {
		boolean oldDivision = division;
		division = newDivision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.MULTIPLICATION__DIVISION,
					oldDivision, division));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRealOperation() {
		return this.isMultiplication() || this.isDivision();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ExecutionPackage.MULTIPLICATION__MULTIPLICATION:
			return isMultiplication();
		case ExecutionPackage.MULTIPLICATION__DIVISION:
			return isDivision();
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
		case ExecutionPackage.MULTIPLICATION__MULTIPLICATION:
			setMultiplication((Boolean) newValue);
			return;
		case ExecutionPackage.MULTIPLICATION__DIVISION:
			setDivision((Boolean) newValue);
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
		case ExecutionPackage.MULTIPLICATION__MULTIPLICATION:
			setMultiplication(MULTIPLICATION_EDEFAULT);
			return;
		case ExecutionPackage.MULTIPLICATION__DIVISION:
			setDivision(DIVISION_EDEFAULT);
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
		case ExecutionPackage.MULTIPLICATION__MULTIPLICATION:
			return multiplication != MULTIPLICATION_EDEFAULT;
		case ExecutionPackage.MULTIPLICATION__DIVISION:
			return division != DIVISION_EDEFAULT;
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
		case ExecutionPackage.MULTIPLICATION___IS_REAL_OPERATION:
			return isRealOperation();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public String toString() {
		if (isRealOperation()) {
			return "(" + left.toString() + (multiplication ? " * " : " / ") + right.toString() + ")";
		}
		return left.toString();
	}

} // MultiplicationImpl
