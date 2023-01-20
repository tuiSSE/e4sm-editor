/**
 */
package abcd.xy.metamodel.abcd.core;

import abcd.xy.metamodel.abcd.execution.ExecutionElement;
import abcd.xy.metamodel.abcd.execution.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see abcd.xy.metamodel.abcd.core.CorePackage#getValueSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ValueSpecification extends TypedElement, Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="abcd.xy.metamodel.abcd.core.Boolean"
	 * @generated
	 */
	boolean booleanValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="abcd.xy.metamodel.abcd.core.Integer"
	 * @generated
	 */
	int integerValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isComputable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

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

} // ValueSpecification
