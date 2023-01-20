/**
 */
package abcd.xy.metamodel.abcd.execution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends ExecutionElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Expression getTangibleChild();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ExecutionElement getActualParent();
} // Expression
