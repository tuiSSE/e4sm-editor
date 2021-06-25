/**
 */
package e4sm.de.metamodel.e4sm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion By Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.ConversionByPrefix#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.ConversionByPrefix#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getConversionByPrefix()
 * @model
 * @generated
 */
public interface ConversionByPrefix extends UnitConversion {
	/**
	 * Returns the value of the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Factor</em>' attribute.
	 * @see #setConversionFactor(float)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getConversionByPrefix_ConversionFactor()
	 * @model
	 * @generated
	 */
	float getConversionFactor();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.ConversionByPrefix#getConversionFactor <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Factor</em>' attribute.
	 * @see #getConversionFactor()
	 * @generated
	 */
	void setConversionFactor(float value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' reference.
	 * @see #setPrefix(UnitPrefix)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getConversionByPrefix_Prefix()
	 * @model required="true"
	 * @generated
	 */
	UnitPrefix getPrefix();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.ConversionByPrefix#getPrefix <em>Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' reference.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(UnitPrefix value);

} // ConversionByPrefix
