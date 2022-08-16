/**
 */
package e4sm.de.metamodel.e4sm;

import e4sm.de.metamodel.e4sm.analysis.ParameterizableElement;
import e4sm.de.metamodel.e4sm.core.DocumentableElement;
import e4sm.de.metamodel.e4sm.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A connector connects one source to one target component.
 * Constraints:
 * - C1: A connector shall not connect two pins of the same component directly (loop/short circuit)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Connector#getSource <em>Source</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Connector#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConnectorC1'"
 * @generated
 */
public interface Connector extends ParameterizableElement, NamedElement, DocumentableElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DataNode)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getConnector_Source()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	DataNode getSource();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Connector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DataNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DataNode)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getConnector_Target()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	DataNode getTarget();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Connector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DataNode value);

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
	 * @model
	 * @generated
	 */
	double computeFlow();

} // Connector
