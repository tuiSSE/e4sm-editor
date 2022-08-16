/**
 */
package e4sm.de.metamodel.e4sm.core.impl;

import e4sm.de.metamodel.e4sm.core.CorePackage;
import e4sm.de.metamodel.e4sm.core.LiteralInteger;
import e4sm.de.metamodel.e4sm.core.ValueSpecification;
import e4sm.de.metamodel.e4sm.execution.BinaryExpression;
import e4sm.de.metamodel.e4sm.execution.ExecutionElement;
import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
import e4sm.de.metamodel.e4sm.execution.Expression;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Value
 * Specification</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ValueSpecificationImpl extends TypedElementImpl implements ValueSpecification {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.VALUE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean booleanValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int integerValue() {
		if (this instanceof LiteralInteger) {
			return ((LiteralInteger) this).getValue();
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isComputable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Prints "<LiteralType>", without the trailing "Impl".
	 * Subclasses add " (value: #)" at the end
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		String name = this.getClass().getName();
		return "<" + name.substring(name.lastIndexOf('.') + 1, name.length() - 4) + ">";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Expression getTangibleChild() {
		// a Value specification is always tangible
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ExecutionElement getActualParent() {
		var c = this.eContainer();
		if (c instanceof BinaryExpression) {
			BinaryExpression b = (BinaryExpression) c;
			if (b.isRealOperation()) {
				return b;
			}
			return b.getActualParent();
		}
		if (c instanceof Expression) {
			Expression e = (Expression) c;
			return e.getActualParent();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ExecutionElement.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseOperationID) {
			case ExecutionPackage.EXPRESSION___GET_TANGIBLE_CHILD:
				return CorePackage.VALUE_SPECIFICATION___GET_TANGIBLE_CHILD;
			case ExecutionPackage.EXPRESSION___GET_ACTUAL_PARENT:
				return CorePackage.VALUE_SPECIFICATION___GET_ACTUAL_PARENT;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case CorePackage.VALUE_SPECIFICATION___BOOLEAN_VALUE:
			return booleanValue();
		case CorePackage.VALUE_SPECIFICATION___INTEGER_VALUE:
			return integerValue();
		case CorePackage.VALUE_SPECIFICATION___IS_COMPUTABLE:
			return isComputable();
		case CorePackage.VALUE_SPECIFICATION___TO_STRING:
			return toString();
		case CorePackage.VALUE_SPECIFICATION___GET_TANGIBLE_CHILD:
			return getTangibleChild();
		case CorePackage.VALUE_SPECIFICATION___GET_ACTUAL_PARENT:
			return getActualParent();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ValueSpecificationImpl
