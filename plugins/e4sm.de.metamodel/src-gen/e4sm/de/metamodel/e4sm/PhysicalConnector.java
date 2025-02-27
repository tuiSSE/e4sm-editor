/**
 */
package e4sm.de.metamodel.e4sm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A phyisical connector is a connector which links 2 physical components.
 * Constraints:
 * - C1: A Physical Connector shall only connect Physical Components.
 * - C2: An output pin shall only be connected to an input pin.
 * - C3: An input pin shall only be connected to an output pin.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.PhysicalConnector#getMinSpeed <em>Min Speed</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.PhysicalConnector#getMaxSpeed <em>Max Speed</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPhysicalConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PhysicalConnectorC1 PhysicalConnectorC2 PhysicalConnectorC3 PhysicalConnectorC4'"
 * @generated
 */
public interface PhysicalConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Min Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Speed</em>' attribute.
	 * @see #setMinSpeed(Object)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPhysicalConnector_MinSpeed()
	 * @model dataType="e4sm.de.metamodel.e4sm.Connectionspeed"
	 * @generated
	 */
	Object getMinSpeed();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.PhysicalConnector#getMinSpeed <em>Min Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Speed</em>' attribute.
	 * @see #getMinSpeed()
	 * @generated
	 */
	void setMinSpeed(Object value);

	/**
	 * Returns the value of the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Speed</em>' attribute.
	 * @see #setMaxSpeed(Object)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPhysicalConnector_MaxSpeed()
	 * @model dataType="e4sm.de.metamodel.e4sm.Connectionspeed"
	 * @generated
	 */
	Object getMaxSpeed();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.PhysicalConnector#getMaxSpeed <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Speed</em>' attribute.
	 * @see #getMaxSpeed()
	 * @generated
	 */
	void setMaxSpeed(Object value);

} // PhysicalConnector
