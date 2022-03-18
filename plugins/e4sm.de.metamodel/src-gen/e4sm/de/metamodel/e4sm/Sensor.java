/**
 */
package e4sm.de.metamodel.e4sm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A physical component which transforms a physical signal into a digital one
 * Constraints:
 * - C1: A sensor shall not have input pins
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Sensor#getTimeFunction <em>Time Function</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSensor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SensorC1'"
 * @generated
 */
public interface Sensor extends PhysicalComponent {

	/**
	 * Returns the value of the '<em><b>Time Function</b></em>' attribute.
	 * The default value is <code>"EXP(1.0)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Function</em>' attribute.
	 * @see #setTimeFunction(String)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSensor_TimeFunction()
	 * @model default="EXP(1.0)" dataType="e4sm.de.metamodel.e4sm.TimeFunction" required="true"
	 * @generated
	 */
	String getTimeFunction();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Sensor#getTimeFunction <em>Time Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Function</em>' attribute.
	 * @see #getTimeFunction()
	 * @generated
	 */
	void setTimeFunction(String value);
} // Sensor
