/**
 */
package e4sm.de.metamodel.e4sm.core;

import java.time.LocalDate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.core.LiteralDate#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getLiteralDate()
 * @model
 * @generated
 */
public interface LiteralDate extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(LocalDate)
	 * @see e4sm.de.metamodel.e4sm.core.CorePackage#getLiteralDate_Value()
	 * @model dataType="e4sm.de.metamodel.e4sm.core.Date"
	 * @generated
	 */
	LocalDate getValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.core.LiteralDate#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(LocalDate value);

} // LiteralDate
