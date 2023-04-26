/**
 */
package e4sm.de.metamodel.e4sm.execution.impl;

import e4sm.de.metamodel.e4sm.core.LiteralInteger;
import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
import e4sm.de.metamodel.e4sm.execution.Exponentiation;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Exponentiation</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ExponentiationImpl extends BinaryExpressionImpl implements Exponentiation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExponentiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.EXPONENTIATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (right instanceof LiteralInteger) {
			int exp = ((LiteralInteger) right).getValue();
			if (exp == 0) {
				return "1";
			}
			if (exp > 0) {
				var result = "(";
				for (int i = 0; i < exp; i++) {
					result += "(" + left.toString() + ")";
					if (i + 1 < exp) {
						result += " * ";
					}
				}
				result += ")";
				return result;
			}
			if (exp < 0) {
				var result = "1.0 / (";
				for (int i = 0; i < exp; i++) {
					result += "(" + left.toString() + ")";
					if (i + 1 < exp) {
						result += " * ";
					}
				}
				result += ")";
				return result;
			}
		}
		// This won't work on TimeNET:
		return "(" + left.toString() + ")" + "^" + right.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRealOperation() {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ExecutionPackage.EXPONENTIATION___TO_STRING:
			return toString();
		case ExecutionPackage.EXPONENTIATION___IS_REAL_OPERATION:
			return isRealOperation();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ExponentiationImpl
