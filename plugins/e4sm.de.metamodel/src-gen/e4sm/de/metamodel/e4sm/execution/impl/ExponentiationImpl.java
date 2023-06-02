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
	 * @generated not
	 */
	@Override
	public String toString() {
		if (this.right == null) {
			return this.left.toString();
		}
		if (this.right instanceof LiteralInteger) {
			int exp = ((LiteralInteger) this.right).getValue();
			if (exp == 0) {
				return "1";
			}
			if (exp > 0) {
				var result = "(";
				for (int i = 0; i < exp; i++) {
					result += "(" + this.left.toString() + ")";
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
					result += "(" + this.left.toString() + ")";
					if (i + 1 < exp) {
						result += " * ";
					}
				}
				result += ")";
				return result;
			}
		}
		// This won't work on TimeNET:
		return "(" + this.left.toString() + ")" + "^" + this.right.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public boolean isRealOperation() {
		if (this.right != null) {
			return true;
		}
		return false;
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
