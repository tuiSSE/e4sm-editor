/**
 */
package e4sm.de.metamodel.e4sm.execution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Final</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.FlowFinal#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getFlowFinal()
 * @model
 * @generated
 */
public interface FlowFinal extends ConnectableNode {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ConnectableNode)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getFlowFinal_Source()
	 * @model required="true"
	 * @generated
	 */
	ConnectableNode getSource();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.FlowFinal#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ConnectableNode value);
} // FlowFinal
