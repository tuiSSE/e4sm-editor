/**
 */
package e4sm.de.metamodel.e4sm.execution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delayable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.execution.DelayableElement#getTimeFunction <em>Time Function</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getDelayableElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DelayableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Function</em>' containment reference.
	 * @see #setTimeFunction(TimeFunction)
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#getDelayableElement_TimeFunction()
	 * @model containment="true"
	 * @generated
	 */
	TimeFunction getTimeFunction();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.execution.DelayableElement#getTimeFunction <em>Time Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Function</em>' containment reference.
	 * @see #getTimeFunction()
	 * @generated
	 */
	void setTimeFunction(TimeFunction value);

} // DelayableElement
