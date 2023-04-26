/**
 */
package e4sm.de.metamodel.e4sm.execution.util;

import e4sm.de.metamodel.e4sm.core.Element;
import e4sm.de.metamodel.e4sm.core.NamedElement;
import e4sm.de.metamodel.e4sm.execution.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage
 * @generated
 */
public class ExecutionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExecutionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionSwitch() {
		if (modelPackage == null) {
			modelPackage = ExecutionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ExecutionPackage.DECISION_NODE: {
			DecisionNode decisionNode = (DecisionNode) theEObject;
			T result = caseDecisionNode(decisionNode);
			if (result == null)
				result = caseConnectableNode(decisionNode);
			if (result == null)
				result = caseExecutionElement(decisionNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.FORK_NODE: {
			ForkNode forkNode = (ForkNode) theEObject;
			T result = caseForkNode(forkNode);
			if (result == null)
				result = caseConnectableNode(forkNode);
			if (result == null)
				result = caseDelayableElement(forkNode);
			if (result == null)
				result = caseExecutionElement(forkNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.MERGE_NODE: {
			MergeNode mergeNode = (MergeNode) theEObject;
			T result = caseMergeNode(mergeNode);
			if (result == null)
				result = caseConnectableNode(mergeNode);
			if (result == null)
				result = caseDelayableElement(mergeNode);
			if (result == null)
				result = caseExecutionElement(mergeNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.FLOW: {
			Flow flow = (Flow) theEObject;
			T result = caseFlow(flow);
			if (result == null)
				result = caseExecutionElement(flow);
			if (result == null)
				result = caseDelayableElement(flow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.CONNECTABLE_NODE: {
			ConnectableNode connectableNode = (ConnectableNode) theEObject;
			T result = caseConnectableNode(connectableNode);
			if (result == null)
				result = caseExecutionElement(connectableNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.EXECUTION: {
			Execution execution = (Execution) theEObject;
			T result = caseExecution(execution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.FLOW_FINAL: {
			FlowFinal flowFinal = (FlowFinal) theEObject;
			T result = caseFlowFinal(flowFinal);
			if (result == null)
				result = caseConnectableNode(flowFinal);
			if (result == null)
				result = caseExecutionElement(flowFinal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.EXECUTION_ELEMENT: {
			ExecutionElement executionElement = (ExecutionElement) theEObject;
			T result = caseExecutionElement(executionElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseExecutionElement(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.BINARY_EXPRESSION: {
			BinaryExpression binaryExpression = (BinaryExpression) theEObject;
			T result = caseBinaryExpression(binaryExpression);
			if (result == null)
				result = caseExpression(binaryExpression);
			if (result == null)
				result = caseExecutionElement(binaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.UNARY_EXPRESSION: {
			UnaryExpression unaryExpression = (UnaryExpression) theEObject;
			T result = caseUnaryExpression(unaryExpression);
			if (result == null)
				result = caseExpression(unaryExpression);
			if (result == null)
				result = caseExecutionElement(unaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.ADDITION: {
			Addition addition = (Addition) theEObject;
			T result = caseAddition(addition);
			if (result == null)
				result = caseBinaryExpression(addition);
			if (result == null)
				result = caseExpression(addition);
			if (result == null)
				result = caseExecutionElement(addition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.MULTIPLICATION: {
			Multiplication multiplication = (Multiplication) theEObject;
			T result = caseMultiplication(multiplication);
			if (result == null)
				result = caseBinaryExpression(multiplication);
			if (result == null)
				result = caseExpression(multiplication);
			if (result == null)
				result = caseExecutionElement(multiplication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseAssignableElement(variable);
			if (result == null)
				result = caseReferenceableItem(variable);
			if (result == null)
				result = caseExecutionElement(variable);
			if (result == null)
				result = caseNamedElement(variable);
			if (result == null)
				result = caseElement(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.CONST: {
			Const const_ = (Const) theEObject;
			T result = caseConst(const_);
			if (result == null)
				result = caseReferenceableItem(const_);
			if (result == null)
				result = caseExecutionElement(const_);
			if (result == null)
				result = caseNamedElement(const_);
			if (result == null)
				result = caseElement(const_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.VARIABLE_REF: {
			VariableRef variableRef = (VariableRef) theEObject;
			T result = caseVariableRef(variableRef);
			if (result == null)
				result = caseExpression(variableRef);
			if (result == null)
				result = caseExecutionElement(variableRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.TIME_FUNCTION: {
			TimeFunction timeFunction = (TimeFunction) theEObject;
			T result = caseTimeFunction(timeFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.DELAYABLE_ELEMENT: {
			DelayableElement delayableElement = (DelayableElement) theEObject;
			T result = caseDelayableElement(delayableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.ASSIGNMENT: {
			Assignment assignment = (Assignment) theEObject;
			T result = caseAssignment(assignment);
			if (result == null)
				result = caseExecutionElement(assignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.ASSIGNABLE_ELEMENT_REFERENCE: {
			AssignableElementReference assignableElementReference = (AssignableElementReference) theEObject;
			T result = caseAssignableElementReference(assignableElementReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.ASSIGNABLE_ELEMENT: {
			AssignableElement assignableElement = (AssignableElement) theEObject;
			T result = caseAssignableElement(assignableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.REFERENCEABLE_ITEM: {
			ReferenceableItem referenceableItem = (ReferenceableItem) theEObject;
			T result = caseReferenceableItem(referenceableItem);
			if (result == null)
				result = caseExecutionElement(referenceableItem);
			if (result == null)
				result = caseNamedElement(referenceableItem);
			if (result == null)
				result = caseElement(referenceableItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.INPUT_PIN_REFERENCE: {
			InputPinReference inputPinReference = (InputPinReference) theEObject;
			T result = caseInputPinReference(inputPinReference);
			if (result == null)
				result = caseExpression(inputPinReference);
			if (result == null)
				result = caseExecutionElement(inputPinReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.INPUT_PIN_ATTRIBUTE_REFERENCE: {
			InputPinAttributeReference inputPinAttributeReference = (InputPinAttributeReference) theEObject;
			T result = caseInputPinAttributeReference(inputPinAttributeReference);
			if (result == null)
				result = caseInputPinReference(inputPinAttributeReference);
			if (result == null)
				result = caseExpression(inputPinAttributeReference);
			if (result == null)
				result = caseExecutionElement(inputPinAttributeReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.PARAMETER_REFERENCE: {
			ParameterReference parameterReference = (ParameterReference) theEObject;
			T result = caseParameterReference(parameterReference);
			if (result == null)
				result = caseExpression(parameterReference);
			if (result == null)
				result = caseExecutionElement(parameterReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ExecutionPackage.EXPONENTIATION: {
			Exponentiation exponentiation = (Exponentiation) theEObject;
			T result = caseExponentiation(exponentiation);
			if (result == null)
				result = caseBinaryExpression(exponentiation);
			if (result == null)
				result = caseExpression(exponentiation);
			if (result == null)
				result = caseExecutionElement(exponentiation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNode(DecisionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkNode(ForkNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeNode(MergeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableNode(ConnectableNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecution(Execution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Final</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Final</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowFinal(FlowFinal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionElement(ExecutionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplication(Multiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Const</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Const</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConst(Const object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableRef(VariableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeFunction(TimeFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delayable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delayable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayableElement(DelayableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignable Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignable Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignableElementReference(AssignableElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignableElement(AssignableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenceable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenceable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceableItem(ReferenceableItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPinReference(InputPinReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin Attribute Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin Attribute Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPinAttributeReference(InputPinAttributeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterReference(ParameterReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponentiation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponentiation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponentiation(Exponentiation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExecutionSwitch
