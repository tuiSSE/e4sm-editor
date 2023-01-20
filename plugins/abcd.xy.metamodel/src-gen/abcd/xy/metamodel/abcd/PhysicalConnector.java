/**
 */
package abcd.xy.metamodel.abcd;

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
 *   <li>{@link abcd.xy.metamodel.abcd.PhysicalConnector#getMinSpeed <em>Min Speed</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.PhysicalConnector#getMaxSpeed <em>Max Speed</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getPhysicalConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PhysicalConnectorC1 PhysicalConnectorC2 PhysicalConnectorC3'"
 * @generated
 */
public interface PhysicalConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Min Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Speed</em>' attribute.
	 * @see #setMinSpeed(Object)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPhysicalConnector_MinSpeed()
	 * @model dataType="abcd.xy.metamodel.abcd.Connectionspeed"
	 * @generated
	 */
	Object getMinSpeed();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.PhysicalConnector#getMinSpeed <em>Min Speed</em>}' attribute.
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
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPhysicalConnector_MaxSpeed()
	 * @model dataType="abcd.xy.metamodel.abcd.Connectionspeed"
	 * @generated
	 */
	Object getMaxSpeed();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.PhysicalConnector#getMaxSpeed <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Speed</em>' attribute.
	 * @see #getMaxSpeed()
	 * @generated
	 */
	void setMaxSpeed(Object value);

} // PhysicalConnector
