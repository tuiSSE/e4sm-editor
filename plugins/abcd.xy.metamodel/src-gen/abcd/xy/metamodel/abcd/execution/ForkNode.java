/**
 */
package abcd.xy.metamodel.abcd.execution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.execution.ForkNode#getSource <em>Source</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.execution.ForkNode#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getForkNode()
 * @model
 * @generated
 */
public interface ForkNode extends ConnectableNode, DelayableElement {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ConnectableNode)
	 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getForkNode_Source()
	 * @model required="true"
	 * @generated
	 */
	ConnectableNode getSource();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.execution.ForkNode#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ConnectableNode value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.execution.ConnectableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getForkNode_Targets()
	 * @model lower="2"
	 * @generated
	 */
	EList<ConnectableNode> getTargets();
} // ForkNode
