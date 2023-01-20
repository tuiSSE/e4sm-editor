/**
 */
package abcd.xy.metamodel.abcd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.UnitConversion#getReferenceUnit <em>Reference Unit</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getUnitConversion()
 * @model
 * @generated
 */
public interface UnitConversion extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Unit</em>' reference.
	 * @see #setReferenceUnit(MeasurementUnit)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getUnitConversion_ReferenceUnit()
	 * @model required="true"
	 * @generated
	 */
	MeasurementUnit getReferenceUnit();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.UnitConversion#getReferenceUnit <em>Reference Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Unit</em>' reference.
	 * @see #getReferenceUnit()
	 * @generated
	 */
	void setReferenceUnit(MeasurementUnit value);

} // UnitConversion
