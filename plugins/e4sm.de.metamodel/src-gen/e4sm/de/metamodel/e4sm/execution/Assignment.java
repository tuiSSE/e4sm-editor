/**
 */
package e4sm.de.metamodel.e4sm.execution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.Assignment#getExpression <em>Expression</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.Assignment#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Element {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getAssignment_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.Assignment#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(AssignableElementReference)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getAssignment_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AssignableElementReference getTarget();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.Assignment#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AssignableElementReference value);

} // Assignment
