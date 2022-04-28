/**
 */
package e4sm.de.metamodel.e4sm.execution.impl;

import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;

import e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl;

import e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage;

import e4sm.de.metamodel.e4sm.analysis.results.impl.ResultsPackageImpl;

import e4sm.de.metamodel.e4sm.core.CorePackage;

import e4sm.de.metamodel.e4sm.core.impl.CorePackageImpl;

import e4sm.de.metamodel.e4sm.e4smPackage;

import e4sm.de.metamodel.e4sm.execution.Addition;
import e4sm.de.metamodel.e4sm.execution.AssignableElement;
import e4sm.de.metamodel.e4sm.execution.AssignableElementReference;
import e4sm.de.metamodel.e4sm.execution.Assignment;
import e4sm.de.metamodel.e4sm.execution.BinaryExpression;
import e4sm.de.metamodel.e4sm.execution.ConnectableNode;
import e4sm.de.metamodel.e4sm.execution.Const;
import e4sm.de.metamodel.e4sm.execution.DecisionNode;
import e4sm.de.metamodel.e4sm.execution.DelayableElement;
import e4sm.de.metamodel.e4sm.execution.Element;
import e4sm.de.metamodel.e4sm.execution.Execution;
import e4sm.de.metamodel.e4sm.execution.ExecutionFactory;
import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
import e4sm.de.metamodel.e4sm.execution.Expression;
import e4sm.de.metamodel.e4sm.execution.Flow;
import e4sm.de.metamodel.e4sm.execution.FlowFinal;
import e4sm.de.metamodel.e4sm.execution.ForkNode;
import e4sm.de.metamodel.e4sm.execution.MergeNode;

import e4sm.de.metamodel.e4sm.execution.Multiplication;
import e4sm.de.metamodel.e4sm.execution.TimeFunction;
import e4sm.de.metamodel.e4sm.execution.TimeFunctions;
import e4sm.de.metamodel.e4sm.execution.UnaryExpression;
import e4sm.de.metamodel.e4sm.execution.Variable;
import e4sm.de.metamodel.e4sm.execution.VariableRef;
import e4sm.de.metamodel.e4sm.guava.GuavaPackage;

import e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl;

import e4sm.de.metamodel.e4sm.impl.e4smPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionPackageImpl extends EPackageImpl implements ExecutionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignableElementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeFunctionsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see e4sm.de.metamodel.e4sm.execution.ExecutionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExecutionPackageImpl() {
		super(eNS_URI, ExecutionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ExecutionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExecutionPackage init() {
		if (isInited)
			return (ExecutionPackage) EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExecutionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExecutionPackageImpl theExecutionPackage = registeredExecutionPackage instanceof ExecutionPackageImpl
				? (ExecutionPackageImpl) registeredExecutionPackage
				: new ExecutionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(e4smPackage.eNS_URI);
		e4smPackageImpl thee4smPackage = (e4smPackageImpl) (registeredPackage instanceof e4smPackageImpl
				? registeredPackage
				: e4smPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl) (registeredPackage instanceof CorePackageImpl
				? registeredPackage
				: CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AnalysisPackage.eNS_URI);
		AnalysisPackageImpl theAnalysisPackage = (AnalysisPackageImpl) (registeredPackage instanceof AnalysisPackageImpl
				? registeredPackage
				: AnalysisPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl) (registeredPackage instanceof ResultsPackageImpl
				? registeredPackage
				: ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GuavaPackage.eNS_URI);
		GuavaPackageImpl theGuavaPackage = (GuavaPackageImpl) (registeredPackage instanceof GuavaPackageImpl
				? registeredPackage
				: GuavaPackage.eINSTANCE);

		// Create package meta-data objects
		theExecutionPackage.createPackageContents();
		thee4smPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theAnalysisPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theGuavaPackage.createPackageContents();

		// Initialize created meta-data
		theExecutionPackage.initializePackageContents();
		thee4smPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theAnalysisPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theGuavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExecutionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExecutionPackage.eNS_URI, theExecutionPackage);
		return theExecutionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecisionNode() {
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForkNode() {
		return forkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForkNode_Source() {
		return (EReference) forkNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForkNode_Targets() {
		return (EReference) forkNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergeNode() {
		return mergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeNode_Sources() {
		return (EReference) mergeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeNode_Target() {
		return (EReference) mergeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Source() {
		return (EReference) flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Target() {
		return (EReference) flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectableNode() {
		return connectableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecution() {
		return executionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecution_Elements() {
		return (EReference) executionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowFinal() {
		return flowFinalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowFinal_Source() {
		return (EReference) flowFinalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExpression__GetTangibleChild() {
		return expressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExpression__GetActualParent() {
		return expressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryExpression_Left() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryExpression_Right() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBinaryExpression__IsRealOperation() {
		return binaryExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBinaryExpression__GetActualParent() {
		return binaryExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBinaryExpression__GetTangibleChild() {
		return binaryExpressionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddition() {
		return additionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddition_Addition() {
		return (EAttribute) additionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddition_Subtraction() {
		return (EAttribute) additionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAddition__IsRealOperation() {
		return additionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiplication() {
		return multiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplication_Multiplication() {
		return (EAttribute) multiplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiplication_Division() {
		return (EAttribute) multiplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMultiplication__IsRealOperation() {
		return multiplicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConst() {
		return constEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConst_Expression() {
		return (EReference) constEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableRef() {
		return variableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableRef_Variable() {
		return (EReference) variableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableRef__GetActualParent() {
		return variableRefEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariableRef__GetTangibleChild() {
		return variableRefEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeFunction() {
		return timeFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeFunction_Function() {
		return (EAttribute) timeFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeFunction_Par1() {
		return (EAttribute) timeFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeFunction_Par2() {
		return (EAttribute) timeFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelayableElement() {
		return delayableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelayableElement_TimeFunction() {
		return (EReference) delayableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_Expression() {
		return (EReference) assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_Target() {
		return (EReference) assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignableElementReference() {
		return assignableElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignableElementReference_Ref() {
		return (EReference) assignableElementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignableElement() {
		return assignableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimeFunctions() {
		return timeFunctionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionFactory getExecutionFactory() {
		return (ExecutionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		decisionNodeEClass = createEClass(DECISION_NODE);

		forkNodeEClass = createEClass(FORK_NODE);
		createEReference(forkNodeEClass, FORK_NODE__SOURCE);
		createEReference(forkNodeEClass, FORK_NODE__TARGETS);

		mergeNodeEClass = createEClass(MERGE_NODE);
		createEReference(mergeNodeEClass, MERGE_NODE__SOURCES);
		createEReference(mergeNodeEClass, MERGE_NODE__TARGET);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__SOURCE);
		createEReference(flowEClass, FLOW__TARGET);

		connectableNodeEClass = createEClass(CONNECTABLE_NODE);

		executionEClass = createEClass(EXECUTION);
		createEReference(executionEClass, EXECUTION__ELEMENTS);

		flowFinalEClass = createEClass(FLOW_FINAL);
		createEReference(flowFinalEClass, FLOW_FINAL__SOURCE);

		elementEClass = createEClass(ELEMENT);

		expressionEClass = createEClass(EXPRESSION);
		createEOperation(expressionEClass, EXPRESSION___GET_TANGIBLE_CHILD);
		createEOperation(expressionEClass, EXPRESSION___GET_ACTUAL_PARENT);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);
		createEOperation(binaryExpressionEClass, BINARY_EXPRESSION___IS_REAL_OPERATION);
		createEOperation(binaryExpressionEClass, BINARY_EXPRESSION___GET_ACTUAL_PARENT);
		createEOperation(binaryExpressionEClass, BINARY_EXPRESSION___GET_TANGIBLE_CHILD);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);

		additionEClass = createEClass(ADDITION);
		createEAttribute(additionEClass, ADDITION__ADDITION);
		createEAttribute(additionEClass, ADDITION__SUBTRACTION);
		createEOperation(additionEClass, ADDITION___IS_REAL_OPERATION);

		multiplicationEClass = createEClass(MULTIPLICATION);
		createEAttribute(multiplicationEClass, MULTIPLICATION__MULTIPLICATION);
		createEAttribute(multiplicationEClass, MULTIPLICATION__DIVISION);
		createEOperation(multiplicationEClass, MULTIPLICATION___IS_REAL_OPERATION);

		variableEClass = createEClass(VARIABLE);

		constEClass = createEClass(CONST);
		createEReference(constEClass, CONST__EXPRESSION);

		variableRefEClass = createEClass(VARIABLE_REF);
		createEReference(variableRefEClass, VARIABLE_REF__VARIABLE);
		createEOperation(variableRefEClass, VARIABLE_REF___GET_ACTUAL_PARENT);
		createEOperation(variableRefEClass, VARIABLE_REF___GET_TANGIBLE_CHILD);

		timeFunctionEClass = createEClass(TIME_FUNCTION);
		createEAttribute(timeFunctionEClass, TIME_FUNCTION__FUNCTION);
		createEAttribute(timeFunctionEClass, TIME_FUNCTION__PAR1);
		createEAttribute(timeFunctionEClass, TIME_FUNCTION__PAR2);

		delayableElementEClass = createEClass(DELAYABLE_ELEMENT);
		createEReference(delayableElementEClass, DELAYABLE_ELEMENT__TIME_FUNCTION);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__EXPRESSION);
		createEReference(assignmentEClass, ASSIGNMENT__TARGET);

		assignableElementReferenceEClass = createEClass(ASSIGNABLE_ELEMENT_REFERENCE);
		createEReference(assignableElementReferenceEClass, ASSIGNABLE_ELEMENT_REFERENCE__REF);

		assignableElementEClass = createEClass(ASSIGNABLE_ELEMENT);

		// Create enums
		timeFunctionsEEnum = createEEnum(TIME_FUNCTIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		decisionNodeEClass.getESuperTypes().add(this.getConnectableNode());
		forkNodeEClass.getESuperTypes().add(this.getConnectableNode());
		forkNodeEClass.getESuperTypes().add(this.getDelayableElement());
		mergeNodeEClass.getESuperTypes().add(this.getConnectableNode());
		mergeNodeEClass.getESuperTypes().add(this.getDelayableElement());
		flowEClass.getESuperTypes().add(this.getElement());
		flowEClass.getESuperTypes().add(this.getDelayableElement());
		connectableNodeEClass.getESuperTypes().add(this.getElement());
		flowFinalEClass.getESuperTypes().add(this.getConnectableNode());
		expressionEClass.getESuperTypes().add(this.getElement());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		additionEClass.getESuperTypes().add(this.getBinaryExpression());
		multiplicationEClass.getESuperTypes().add(this.getBinaryExpression());
		variableEClass.getESuperTypes().add(this.getConst());
		variableEClass.getESuperTypes().add(this.getAssignableElement());
		constEClass.getESuperTypes().add(this.getElement());
		constEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		variableRefEClass.getESuperTypes().add(this.getExpression());
		assignmentEClass.getESuperTypes().add(this.getElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkNode_Source(), this.getConnectableNode(), null, "source", null, 1, 1, ForkNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForkNode_Targets(), this.getConnectableNode(), null, "targets", null, 2, -1, ForkNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMergeNode_Sources(), this.getConnectableNode(), null, "sources", null, 2, -1, MergeNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeNode_Target(), this.getConnectableNode(), null, "target", null, 1, 1, MergeNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_Source(), this.getConnectableNode(), null, "source", null, 1, 1, Flow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Target(), this.getConnectableNode(), null, "target", null, 1, 1, Flow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectableNodeEClass, ConnectableNode.class, "ConnectableNode", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionEClass, Execution.class, "Execution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecution_Elements(), this.getElement(), null, "elements", null, 0, -1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowFinalEClass, FlowFinal.class, "FlowFinal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowFinal_Source(), this.getConnectableNode(), null, "source", null, 1, 1, FlowFinal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getExpression__GetTangibleChild(), this.getExpression(), "getTangibleChild", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getExpression__GetActualParent(), this.getElement(), "getActualParent", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Left(), this.getExpression(), null, "left", null, 1, 1,
				BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Right(), this.getExpression(), null, "right", null, 0, 1,
				BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBinaryExpression__IsRealOperation(), theEcorePackage.getEBoolean(), "isRealOperation", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getBinaryExpression__GetActualParent(), this.getElement(), "getActualParent", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getBinaryExpression__GetTangibleChild(), this.getExpression(), "getTangibleChild", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionEClass, Addition.class, "Addition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddition_Addition(), theEcorePackage.getEBoolean(), "addition", "false", 0, 1, Addition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddition_Subtraction(), theEcorePackage.getEBoolean(), "subtraction", "false", 0, 1,
				Addition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getAddition__IsRealOperation(), theEcorePackage.getEBoolean(), "isRealOperation", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplication_Multiplication(), theEcorePackage.getEBoolean(), "multiplication", "false", 0,
				1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplication_Division(), theEcorePackage.getEBoolean(), "division", "false", 0, 1,
				Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getMultiplication__IsRealOperation(), theEcorePackage.getEBoolean(), "isRealOperation", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(constEClass, Const.class, "Const", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConst_Expression(), this.getExpression(), null, "expression", null, 0, 1, Const.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableRefEClass, VariableRef.class, "VariableRef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableRef_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableRef.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVariableRef__GetActualParent(), this.getElement(), "getActualParent", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getVariableRef__GetTangibleChild(), this.getExpression(), "getTangibleChild", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(timeFunctionEClass, TimeFunction.class, "TimeFunction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeFunction_Function(), this.getTimeFunctions(), "function", null, 0, 1, TimeFunction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeFunction_Par1(), theEcorePackage.getEDouble(), "par1", null, 1, 1, TimeFunction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeFunction_Par2(), theEcorePackage.getEDouble(), "par2", null, 0, 1, TimeFunction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayableElementEClass, DelayableElement.class, "DelayableElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelayableElement_TimeFunction(), this.getTimeFunction(), null, "timeFunction", null, 0, 1,
				DelayableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Expression(), this.getExpression(), null, "expression", null, 1, 1,
				Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Target(), this.getAssignableElementReference(), null, "target", null, 1, 1,
				Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignableElementReferenceEClass, AssignableElementReference.class, "AssignableElementReference",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignableElementReference_Ref(), this.getAssignableElement(), null, "ref", null, 1, 1,
				AssignableElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignableElementEClass, AssignableElement.class, "AssignableElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(timeFunctionsEEnum, TimeFunctions.class, "TimeFunctions");
		addEEnumLiteral(timeFunctionsEEnum, TimeFunctions.DET);
		addEEnumLiteral(timeFunctionsEEnum, TimeFunctions.EXP);
		addEEnumLiteral(timeFunctionsEEnum, TimeFunctions.UNI);
		addEEnumLiteral(timeFunctionsEEnum, TimeFunctions.DUNI);
		addEEnumLiteral(timeFunctionsEEnum, TimeFunctions.NORM);
		addEEnumLiteral(timeFunctionsEEnum, TimeFunctions.LOG_NORM);
		addEEnumLiteral(timeFunctionsEEnum, TimeFunctions.WEI);
		addEEnumLiteral(timeFunctionsEEnum, TimeFunctions.TRIANG);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/edapt
		createEdaptAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/edapt</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEdaptAnnotations() {
		String source = "http://www.eclipse.org/edapt";
		addAnnotation(this, source, new String[] { "historyURI", "e4sm.history" });
	}

} //ExecutionPackageImpl
