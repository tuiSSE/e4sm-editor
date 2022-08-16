/**
 */
package e4sm.de.metamodel.e4sm.execution;

import e4sm.de.metamodel.e4sm.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.Const#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getConst()
 * @model
 * @generated
 */
public interface Const extends ExecutionElement, NamedElement {

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getConst_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.Const#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);
} // Const
