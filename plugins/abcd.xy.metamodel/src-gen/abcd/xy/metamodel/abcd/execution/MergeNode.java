/**
 */
package abcd.xy.metamodel.abcd.execution;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.execution.MergeNode#getSources <em>Sources</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.execution.MergeNode#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getMergeNode()
 * @model
 * @generated
 */
public interface MergeNode extends ConnectableNode, DelayableElement {

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.execution.ConnectableNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getMergeNode_Sources()
	 * @model lower="2"
	 * @generated
	 */
	EList<ConnectableNode> getSources();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ConnectableNode)
	 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getMergeNode_Target()
	 * @model required="true"
	 * @generated
	 */
	ConnectableNode getTarget();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.execution.MergeNode#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ConnectableNode value);
} // MergeNode
