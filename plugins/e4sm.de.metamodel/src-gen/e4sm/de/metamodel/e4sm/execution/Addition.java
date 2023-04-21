/**
 */
package e4sm.de.metamodel.e4sm.execution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.Addition#isAddition <em>Addition</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.Addition#isSubtraction <em>Subtraction</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getAddition()
 * @model
 * @generated
 */
public interface Addition extends BinaryExpression {

	/**
	 * Returns the value of the '<em><b>Addition</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addition</em>' attribute.
	 * @see #setAddition(boolean)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getAddition_Addition()
	 * @model default="false"
	 * @generated
	 */
	boolean isAddition();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.Addition#isAddition <em>Addition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addition</em>' attribute.
	 * @see #isAddition()
	 * @generated
	 */
	void setAddition(boolean value);

	/**
	 * Returns the value of the '<em><b>Subtraction</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtraction</em>' attribute.
	 * @see #setSubtraction(boolean)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getAddition_Subtraction()
	 * @model default="false"
	 * @generated
	 */
	boolean isSubtraction();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.Addition#isSubtraction <em>Subtraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtraction</em>' attribute.
	 * @see #isSubtraction()
	 * @generated
	 */
	void setSubtraction(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRealOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String toString();
} // Addition
