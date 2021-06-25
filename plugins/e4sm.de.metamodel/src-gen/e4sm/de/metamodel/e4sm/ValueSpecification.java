/**
 */
package e4sm.de.metamodel.e4sm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getValueSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ValueSpecification extends TypedElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="e4sm.de.metamodel.e4sm.types.Boolean"
	 * @generated
	 */
	boolean booleanValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="e4sm.de.metamodel.e4sm.types.Integer"
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
} // ValueSpecification
