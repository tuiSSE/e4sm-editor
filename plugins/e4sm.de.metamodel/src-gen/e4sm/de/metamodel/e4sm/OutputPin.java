/**
 */
package e4sm.de.metamodel.e4sm;

import e4sm.de.metamodel.e4sm.execution.AssignableElement;
import e4sm.de.metamodel.e4sm.execution.Expression;

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
 *   <li>{@link e4sm.de.metamodel.e4sm.OutputPin#getAmplify <em>Amplify</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.OutputPin#getOutputUncertainty <em>Output Uncertainty</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.OutputPin#getTokenSpecification <em>Token Specification</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.OutputPin#getOutputExpression <em>Output Expression</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getOutputPin()
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
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getOutputPin_Amplify()
	 * @model default="1"
	 * @generated
	 */
	int getAmplify();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.OutputPin#getAmplify <em>Amplify</em>}' attribute.
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
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getOutputPin_OutputUncertainty()
	 * @model default="0.0"
	 * @generated
	 */
	double getOutputUncertainty();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.OutputPin#getOutputUncertainty <em>Output Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Uncertainty</em>' attribute.
	 * @see #getOutputUncertainty()
	 * @generated
	 */
	void setOutputUncertainty(double value);

	/**
	 * Returns the value of the '<em><b>Token Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Specification</em>' containment reference.
	 * @see #setTokenSpecification(TokenSpecification)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getOutputPin_TokenSpecification()
	 * @model containment="true"
	 * @generated
	 */
	TokenSpecification getTokenSpecification();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.OutputPin#getTokenSpecification <em>Token Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Specification</em>' containment reference.
	 * @see #getTokenSpecification()
	 * @generated
	 */
	void setTokenSpecification(TokenSpecification value);

	/**
	 * Returns the value of the '<em><b>Output Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Expression</em>' containment reference.
	 * @see #setOutputExpression(Expression)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getOutputPin_OutputExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOutputExpression();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.OutputPin#getOutputExpression <em>Output Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Expression</em>' containment reference.
	 * @see #getOutputExpression()
	 * @generated
	 */
	void setOutputExpression(Expression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String computeName();
} // OutputPin
