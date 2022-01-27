/**
 */
package e4sm.de.metamodel.e4sm;

import e4sm.de.metamodel.e4sm.analysis.ParameterizableElement;
import e4sm.de.metamodel.e4sm.core.TypedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interface to and from a component
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Pin#getOutgoingConnectors <em>Outgoing Connectors</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Pin#getIncomingConnectors <em>Incoming Connectors</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Pin#isGatewayPin <em>Gateway Pin</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPin()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PinC1'"
 * @generated
 */
public interface Pin extends ParameterizableElement, TypedElement {

	/**
	 * Returns the value of the '<em><b>Outgoing Connectors</b></em>' reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Connector}.
	 * It is bidirectional and its opposite is '{@link e4sm.de.metamodel.e4sm.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connectors</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPin_OutgoingConnectors()
	 * @see e4sm.de.metamodel.e4sm.Connector#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Connector> getOutgoingConnectors();

	/**
	 * Returns the value of the '<em><b>Incoming Connectors</b></em>' reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Connector}.
	 * It is bidirectional and its opposite is '{@link e4sm.de.metamodel.e4sm.Connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connectors</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPin_IncomingConnectors()
	 * @see e4sm.de.metamodel.e4sm.Connector#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Connector> getIncomingConnectors();

	/**
	 * Returns the value of the '<em><b>Gateway Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Pin</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPin_GatewayPin()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isGatewayPin();
} // Pin
