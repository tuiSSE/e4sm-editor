/**
 */
package abcd.xy.metamodel.abcd.execution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.execution.Execution#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getExecution()
 * @model
 * @generated
 */
public interface Execution extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.execution.ExecutionElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getExecution_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionElement> getElements();

} // Execution
