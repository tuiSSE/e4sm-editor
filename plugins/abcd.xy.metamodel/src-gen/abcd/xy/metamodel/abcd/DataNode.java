/**
 */
package abcd.xy.metamodel.abcd;

import abcd.xy.metamodel.abcd.analysis.ParameterizableElement;
import abcd.xy.metamodel.abcd.core.DocumentableElement;
import abcd.xy.metamodel.abcd.core.TypedElement;

import abcd.xy.metamodel.abcd.execution.ConnectableNode;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Is a node which provides or receives data
 * <!-- end-model-doc -->
 *
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getDataNode()
 * @model abstract="true"
 * @generated
 */
public interface DataNode extends TypedElement, ConnectableNode, ParameterizableElement, DocumentableElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String computeName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Connector> getOutgoingConnectors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Connector> getIncomingConnectors();
} // DataNode
