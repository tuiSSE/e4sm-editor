/**
 */
package e4sm.de.metamodel.e4sm;

import e4sm.de.metamodel.e4sm.analysis.ParameterizableElement;
import e4sm.de.metamodel.e4sm.core.DocumentableElement;
import e4sm.de.metamodel.e4sm.core.TypedElement;

import e4sm.de.metamodel.e4sm.execution.ConnectableNode;
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
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getDataNode()
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
