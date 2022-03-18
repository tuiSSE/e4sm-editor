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
 *   <li>{@link e4sm.de.metamodel.e4sm.Pin#isStream <em>Stream</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Pin#getRaceSemantic <em>Race Semantic</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream</em>' attribute.
	 * @see #setStream(boolean)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPin_Stream()
	 * @model
	 * @generated
	 */
	boolean isStream();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Pin#isStream <em>Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream</em>' attribute.
	 * @see #isStream()
	 * @generated
	 */
	void setStream(boolean value);

	/**
	 * Returns the value of the '<em><b>Race Semantic</b></em>' attribute.
	 * The default value is <code>"MERGE_AND_DUPLICATE"</code>.
	 * The literals are from the enumeration {@link e4sm.de.metamodel.e4sm.RaceSemantic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When multiple connectors are connected to a pin, the race semantic specifies how the data gets sent forward.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Race Semantic</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.RaceSemantic
	 * @see #setRaceSemantic(RaceSemantic)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPin_RaceSemantic()
	 * @model default="MERGE_AND_DUPLICATE" unique="false"
	 * @generated
	 */
	RaceSemantic getRaceSemantic();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Pin#getRaceSemantic <em>Race Semantic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Race Semantic</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.RaceSemantic
	 * @see #getRaceSemantic()
	 * @generated
	 */
	void setRaceSemantic(RaceSemantic value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String computeName();
} // Pin
