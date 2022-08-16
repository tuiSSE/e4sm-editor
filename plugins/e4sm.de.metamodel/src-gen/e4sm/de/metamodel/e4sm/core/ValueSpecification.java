/**
 */
package e4sm.de.metamodel.e4sm.core;

import e4sm.de.metamodel.e4sm.execution.ExecutionElement;
import e4sm.de.metamodel.e4sm.execution.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getValueSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ValueSpecification extends TypedElement, Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="e4sm.de.metamodel.e4sm.core.Boolean"
	 * @generated
	 */
	boolean booleanValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="e4sm.de.metamodel.e4sm.core.Integer"
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
