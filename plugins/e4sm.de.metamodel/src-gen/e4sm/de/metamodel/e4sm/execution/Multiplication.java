/**
 */
package e4sm.de.metamodel.e4sm.execution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.Multiplication#isMultiplication <em>Multiplication</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.Multiplication#isDivision <em>Division</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getMultiplication()
 * @model
 * @generated
 */
public interface Multiplication extends BinaryExpression {

	/**
	 * Returns the value of the '<em><b>Multiplication</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplication</em>' attribute.
	 * @see #setMultiplication(boolean)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getMultiplication_Multiplication()
	 * @model default="false"
	 * @generated
	 */
	boolean isMultiplication();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.Multiplication#isMultiplication <em>Multiplication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplication</em>' attribute.
	 * @see #isMultiplication()
	 * @generated
	 */
	void setMultiplication(boolean value);

	/**
	 * Returns the value of the '<em><b>Division</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Division</em>' attribute.
	 * @see #setDivision(boolean)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getMultiplication_Division()
	 * @model default="false"
	 * @generated
	 */
	boolean isDivision();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.Multiplication#isDivision <em>Division</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Division</em>' attribute.
	 * @see #isDivision()
	 * @generated
	 */
	void setDivision(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRealOperation();
} // Multiplication
