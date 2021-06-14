/**
 */
package e4sm.de.metamodel.e4sm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Parameter#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Parameter#getParameterDefinition <em>Parameter Definition</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameter_Value()
	 * @model unique="false" transient="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameter_InitialValue()
	 * @model unique="false"
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Parameter#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link e4sm.de.metamodel.e4sm.ParameterDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Definition</em>' reference.
	 * @see #setParameterDefinition(ParameterDefinition)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameter_ParameterDefinition()
	 * @see e4sm.de.metamodel.e4sm.ParameterDefinition#getParameters
	 * @model opposite="parameters" required="true"
	 * @generated
	 */
	ParameterDefinition getParameterDefinition();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Parameter#getParameterDefinition <em>Parameter Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Definition</em>' reference.
	 * @see #getParameterDefinition()
	 * @generated
	 */
	void setParameterDefinition(ParameterDefinition value);

} // Parameter
