/**
 */
package e4sm.de.metamodel.e4sm;

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
public interface Connector extends OptionallyNamedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source pin of this connector
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Pin)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getConnector_Source()
	 * @model required="true"
	 * @generated
	 */
	Pin getSource();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Connector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Pin value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output pin of this connector
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Pin)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getConnector_Target()
	 * @model required="true"
	 * @generated
	 */
	Pin getTarget();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Connector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Pin value);

} // Connector
