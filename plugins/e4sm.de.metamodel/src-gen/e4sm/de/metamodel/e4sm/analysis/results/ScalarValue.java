/**
 */
package e4sm.de.metamodel.e4sm.analysis.results;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalar Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.ScalarValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage#getScalarValue()
 * @model
 * @generated
 */
public interface ScalarValue extends Data {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage#getScalarValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.analysis.results.ScalarValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ScalarValue
