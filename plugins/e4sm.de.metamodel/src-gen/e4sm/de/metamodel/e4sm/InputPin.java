/**
 */
package e4sm.de.metamodel.e4sm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interface which delivers data inside a component
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.InputPin#getQueueType <em>Queue Type</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getInputPin()
 * @model
 * @generated
 */
public interface InputPin extends Pin {

	/**
	 * Returns the value of the '<em><b>Queue Type</b></em>' attribute.
	 * The literals are from the enumeration {@link e4sm.de.metamodel.e4sm.QueueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When multiple data reaches this pin, the Queue type decides how they will be processed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Type</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.QueueType
	 * @see #setQueueType(QueueType)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getInputPin_QueueType()
	 * @model
	 * @generated
	 */
	QueueType getQueueType();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.InputPin#getQueueType <em>Queue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Type</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.QueueType
	 * @see #getQueueType()
	 * @generated
	 */
	void setQueueType(QueueType value);
} // InputPin
