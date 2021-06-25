/**
 */
package e4sm.de.metamodel.e4sm;

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
 *   <li>{@link e4sm.de.metamodel.e4sm.UnitConversion#getReferenceUnit <em>Reference Unit</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getUnitConversion()
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
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getUnitConversion_ReferenceUnit()
	 * @model required="true"
	 * @generated
	 */
	MeasurementUnit getReferenceUnit();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.UnitConversion#getReferenceUnit <em>Reference Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Unit</em>' reference.
	 * @see #getReferenceUnit()
	 * @generated
	 */
	void setReferenceUnit(MeasurementUnit value);

} // UnitConversion
