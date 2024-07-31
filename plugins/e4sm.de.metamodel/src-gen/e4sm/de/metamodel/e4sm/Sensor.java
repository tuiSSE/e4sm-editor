/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link e4sm.de.metamodel.e4sm.Sensor#getClassificationClasses <em>Classification Classes</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSensor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SensorC1 SensorC2'"
 * @generated
 */
public interface Sensor extends PhysicalComponent {

	/**
	 * Returns the value of the '<em><b>Classification Classes</b></em>' reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.ClassificationClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Classes</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSensor_ClassificationClasses()
	 * @model
	 * @generated
	 */
	EList<ClassificationClass> getClassificationClasses();
} // Sensor
