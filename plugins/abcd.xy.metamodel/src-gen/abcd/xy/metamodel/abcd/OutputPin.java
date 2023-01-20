/**
 */
package abcd.xy.metamodel.abcd;

import abcd.xy.metamodel.abcd.execution.AssignableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interface which sends data outside of a component
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.OutputPin#getAmplify <em>Amplify</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.OutputPin#getOutputUncertainty <em>Output Uncertainty</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getOutputPin()
 * @model
 * @generated
 */
public interface OutputPin extends Pin, AssignableElement {

	/**
	 * Returns the value of the '<em><b>Amplify</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amplify</em>' attribute.
	 * @see #setAmplify(int)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getOutputPin_Amplify()
	 * @model default="1"
	 * @generated
	 */
	int getAmplify();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.OutputPin#getAmplify <em>Amplify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amplify</em>' attribute.
	 * @see #getAmplify()
	 * @generated
	 */
	void setAmplify(int value);

	/**
	 * Returns the value of the '<em><b>Output Uncertainty</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Uncertainty</em>' attribute.
	 * @see #setOutputUncertainty(double)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getOutputPin_OutputUncertainty()
	 * @model default="0.0"
	 * @generated
	 */
	double getOutputUncertainty();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.OutputPin#getOutputUncertainty <em>Output Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Uncertainty</em>' attribute.
	 * @see #getOutputUncertainty()
	 * @generated
	 */
	void setOutputUncertainty(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String computeName();
} // OutputPin
