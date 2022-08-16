/**
 */
package e4sm.de.metamodel.e4sm.execution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.Flow#getSource <em>Source</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.Flow#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends ExecutionElement, DelayableElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ConnectableNode)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getFlow_Source()
	 * @model required="true"
	 * @generated
	 */
	ConnectableNode getSource();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.Flow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ConnectableNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ConnectableNode)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getFlow_Target()
	 * @model required="true"
	 * @generated
	 */
	ConnectableNode getTarget();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.Flow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ConnectableNode value);

} // Flow
