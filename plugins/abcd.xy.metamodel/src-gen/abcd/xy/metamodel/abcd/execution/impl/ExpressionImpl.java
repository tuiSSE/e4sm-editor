/**
 */
package abcd.xy.metamodel.abcd.execution.impl;

import abcd.xy.metamodel.abcd.execution.ExecutionElement;
import abcd.xy.metamodel.abcd.execution.ExecutionPackage;
import abcd.xy.metamodel.abcd.execution.Expression;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExpressionImpl extends ExecutionElementImpl implements Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Expression getTangibleChild() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionElement getActualParent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ExecutionPackage.EXPRESSION___GET_TANGIBLE_CHILD:
			return getTangibleChild();
		case ExecutionPackage.EXPRESSION___GET_ACTUAL_PARENT:
			return getActualParent();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExpressionImpl
