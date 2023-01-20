/**
 */
package abcd.xy.metamodel.abcd.execution.impl;

import abcd.xy.metamodel.abcd.execution.ExecutionPackage;
import abcd.xy.metamodel.abcd.execution.UnaryExpression;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class UnaryExpressionImpl extends ExpressionImpl implements UnaryExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.UNARY_EXPRESSION;
	}

} //UnaryExpressionImpl
