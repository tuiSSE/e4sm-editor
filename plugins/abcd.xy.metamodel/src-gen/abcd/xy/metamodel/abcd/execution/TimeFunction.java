/**
 */
package abcd.xy.metamodel.abcd.execution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.execution.TimeFunction#getFunction <em>Function</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.execution.TimeFunction#getPar1 <em>Par1</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.execution.TimeFunction#getPar2 <em>Par2</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getTimeFunction()
 * @model
 * @generated
 */
public interface TimeFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link abcd.xy.metamodel.abcd.execution.TimeFunctions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see abcd.xy.metamodel.abcd.execution.TimeFunctions
	 * @see #setFunction(TimeFunctions)
	 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getTimeFunction_Function()
	 * @model
	 * @generated
	 */
	TimeFunctions getFunction();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.execution.TimeFunction#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see abcd.xy.metamodel.abcd.execution.TimeFunctions
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(TimeFunctions value);

	/**
	 * Returns the value of the '<em><b>Par1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Par1</em>' attribute.
	 * @see #setPar1(double)
	 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getTimeFunction_Par1()
	 * @model required="true"
	 * @generated
	 */
	double getPar1();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.execution.TimeFunction#getPar1 <em>Par1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Par1</em>' attribute.
	 * @see #getPar1()
	 * @generated
	 */
	void setPar1(double value);

	/**
	 * Returns the value of the '<em><b>Par2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Par2</em>' attribute.
	 * @see #setPar2(double)
	 * @see abcd.xy.metamodel.abcd.execution.ExecutionPackage#getTimeFunction_Par2()
	 * @model
	 * @generated
	 */
	double getPar2();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.execution.TimeFunction#getPar2 <em>Par2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Par2</em>' attribute.
	 * @see #getPar2()
	 * @generated
	 */
	void setPar2(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getString();

} // TimeFunction
