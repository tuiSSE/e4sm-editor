/**
 */
package abcd.xy.metamodel.abcd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.MeasurementUnit#getUnitConversion <em>Unit Conversion</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getMeasurementUnit()
 * @model
 * @generated
 */
public interface MeasurementUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit Conversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Conversion</em>' containment reference.
	 * @see #setUnitConversion(UnitConversion)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getMeasurementUnit_UnitConversion()
	 * @model containment="true"
	 * @generated
	 */
	UnitConversion getUnitConversion();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.MeasurementUnit#getUnitConversion <em>Unit Conversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Conversion</em>' containment reference.
	 * @see #getUnitConversion()
	 * @generated
	 */
	void setUnitConversion(UnitConversion value);

} // MeasurementUnit
