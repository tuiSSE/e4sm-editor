/**
 */
package e4sm.de.metamodel.e4sm.analysis;

import e4sm.de.metamodel.e4sm.types.TypesPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisFactory
 * @model kind="package"
 * @generated
 */
public interface AnalysisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "analysis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.tu-ilmenau/e4sm/analysis/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "analysis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnalysisPackage eINSTANCE = e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl.init();

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.AnalysisManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisManagerImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getAnalysisManager()
	 * @generated
	 */
	int ANALYSIS_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_MANAGER___START__ELIST = 0;

	/**
	 * The operation id for the '<em>Store Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_MANAGER___STORE_RESULT__ANALYSISEXECUTION = 1;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_MANAGER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.AnalysisDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisDefinitionImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getAnalysisDefinition()
	 * @generated
	 */
	int ANALYSIS_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DEFINITION__NAME = TypesPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DEFINITION__PARAMETER_DEFINITIONS = TypesPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DEFINITION__ANALYSIS = TypesPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DEFINITION_FEATURE_COUNT = TypesPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_DEFINITION_OPERATION_COUNT = TypesPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.ParameterDefinitionImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getParameterDefinition()
	 * @generated
	 */
	int PARAMETER_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__NAME = TypesPackage.TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__TYPE = TypesPackage.TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__PARAMETERS = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__UNIT = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Must Be Defined On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__MUST_BE_DEFINED_ON = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Can Be Defined On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__CAN_BE_DEFINED_ON = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shall Not Be Defined On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__SHALL_NOT_BE_DEFINED_ON = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__DEFAULT_VALUE = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_FEATURE_COUNT = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_OPERATION_COUNT = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.ParameterImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = TypesPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_DEFINITION = TypesPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applies Only On Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__APPLIES_ONLY_ON_VARIANTS = TypesPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Does Not Apply On Variants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOES_NOT_APPLY_ON_VARIANTS = TypesPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__INITIAL_VALUE = TypesPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TypesPackage.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___IS_VALID = TypesPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = TypesPackage.ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.ParameterizableElement <em>Parameterizable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.ParameterizableElement
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getParameterizableElement()
	 * @generated
	 */
	int PARAMETERIZABLE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZABLE_ELEMENT__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Parameterizable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameterizable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.AnalysisImpl <em>Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getAnalysis()
	 * @generated
	 */
	int ANALYSIS = 5;

	/**
	 * The number of structural features of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___EXEC = 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___INIT = 1;

	/**
	 * The operation id for the '<em>Post Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___POST_EXECUTION = 2;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS___RUN = 3;

	/**
	 * The number of operations of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.ModelAnalysisImpl <em>Model Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.ModelAnalysisImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getModelAnalysis()
	 * @generated
	 */
	int MODEL_ANALYSIS = 6;

	/**
	 * The number of structural features of the '<em>Model Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALYSIS_FEATURE_COUNT = ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALYSIS___EXEC = ANALYSIS___EXEC;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALYSIS___INIT = ANALYSIS___INIT;

	/**
	 * The operation id for the '<em>Post Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALYSIS___POST_EXECUTION = ANALYSIS___POST_EXECUTION;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALYSIS___RUN = ANALYSIS___RUN;

	/**
	 * The number of operations of the '<em>Model Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ANALYSIS_OPERATION_COUNT = ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.AnalysisParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisParameterImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getAnalysisParameter()
	 * @generated
	 */
	int ANALYSIS_PARAMETER = 7;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.GraphAnalysisImpl <em>Graph Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.GraphAnalysisImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getGraphAnalysis()
	 * @generated
	 */
	int GRAPH_ANALYSIS = 8;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ANALYSIS__GRAPH = ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graph Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ANALYSIS_FEATURE_COUNT = ANALYSIS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ANALYSIS___EXEC = ANALYSIS___EXEC;

	/**
	 * The operation id for the '<em>Post Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ANALYSIS___POST_EXECUTION = ANALYSIS___POST_EXECUTION;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ANALYSIS___RUN = ANALYSIS___RUN;

	/**
	 * The operation id for the '<em>Init Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ANALYSIS___INIT_GRAPH = ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ANALYSIS___INIT = ANALYSIS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Graph Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ANALYSIS_OPERATION_COUNT = ANALYSIS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.MemoryLessGraphAnalysisImpl <em>Memory Less Graph Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.MemoryLessGraphAnalysisImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getMemoryLessGraphAnalysis()
	 * @generated
	 */
	int MEMORY_LESS_GRAPH_ANALYSIS = 9;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_LESS_GRAPH_ANALYSIS__GRAPH = GRAPH_ANALYSIS__GRAPH;

	/**
	 * The number of structural features of the '<em>Memory Less Graph Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_LESS_GRAPH_ANALYSIS_FEATURE_COUNT = GRAPH_ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_LESS_GRAPH_ANALYSIS___EXEC = GRAPH_ANALYSIS___EXEC;

	/**
	 * The operation id for the '<em>Post Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_LESS_GRAPH_ANALYSIS___POST_EXECUTION = GRAPH_ANALYSIS___POST_EXECUTION;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_LESS_GRAPH_ANALYSIS___RUN = GRAPH_ANALYSIS___RUN;

	/**
	 * The operation id for the '<em>Init Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_LESS_GRAPH_ANALYSIS___INIT_GRAPH = GRAPH_ANALYSIS___INIT_GRAPH;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_LESS_GRAPH_ANALYSIS___INIT = GRAPH_ANALYSIS___INIT;

	/**
	 * The number of operations of the '<em>Memory Less Graph Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_LESS_GRAPH_ANALYSIS_OPERATION_COUNT = GRAPH_ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.EntireGraphAnalysisImpl <em>Entire Graph Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.EntireGraphAnalysisImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getEntireGraphAnalysis()
	 * @generated
	 */
	int ENTIRE_GRAPH_ANALYSIS = 10;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIRE_GRAPH_ANALYSIS__GRAPH = GRAPH_ANALYSIS__GRAPH;

	/**
	 * The number of structural features of the '<em>Entire Graph Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIRE_GRAPH_ANALYSIS_FEATURE_COUNT = GRAPH_ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIRE_GRAPH_ANALYSIS___EXEC = GRAPH_ANALYSIS___EXEC;

	/**
	 * The operation id for the '<em>Post Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIRE_GRAPH_ANALYSIS___POST_EXECUTION = GRAPH_ANALYSIS___POST_EXECUTION;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIRE_GRAPH_ANALYSIS___RUN = GRAPH_ANALYSIS___RUN;

	/**
	 * The operation id for the '<em>Init Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIRE_GRAPH_ANALYSIS___INIT_GRAPH = GRAPH_ANALYSIS___INIT_GRAPH;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIRE_GRAPH_ANALYSIS___INIT = GRAPH_ANALYSIS___INIT;

	/**
	 * The number of operations of the '<em>Entire Graph Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIRE_GRAPH_ANALYSIS_OPERATION_COUNT = GRAPH_ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.PackageAnalysisImpl <em>Package Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.PackageAnalysisImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getPackageAnalysis()
	 * @generated
	 */
	int PACKAGE_ANALYSIS = 11;

	/**
	 * The number of structural features of the '<em>Package Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ANALYSIS_FEATURE_COUNT = ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ANALYSIS___EXEC = ANALYSIS___EXEC;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ANALYSIS___INIT = ANALYSIS___INIT;

	/**
	 * The operation id for the '<em>Post Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ANALYSIS___POST_EXECUTION = ANALYSIS___POST_EXECUTION;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ANALYSIS___RUN = ANALYSIS___RUN;

	/**
	 * The number of operations of the '<em>Package Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ANALYSIS_OPERATION_COUNT = ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.PreviousNodeGraphAnalysisImpl <em>Previous Node Graph Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.PreviousNodeGraphAnalysisImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getPreviousNodeGraphAnalysis()
	 * @generated
	 */
	int PREVIOUS_NODE_GRAPH_ANALYSIS = 12;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_NODE_GRAPH_ANALYSIS__GRAPH = GRAPH_ANALYSIS__GRAPH;

	/**
	 * The number of structural features of the '<em>Previous Node Graph Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_NODE_GRAPH_ANALYSIS_FEATURE_COUNT = GRAPH_ANALYSIS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_NODE_GRAPH_ANALYSIS___EXEC = GRAPH_ANALYSIS___EXEC;

	/**
	 * The operation id for the '<em>Post Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_NODE_GRAPH_ANALYSIS___POST_EXECUTION = GRAPH_ANALYSIS___POST_EXECUTION;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_NODE_GRAPH_ANALYSIS___RUN = GRAPH_ANALYSIS___RUN;

	/**
	 * The operation id for the '<em>Init Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_NODE_GRAPH_ANALYSIS___INIT_GRAPH = GRAPH_ANALYSIS___INIT_GRAPH;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_NODE_GRAPH_ANALYSIS___INIT = GRAPH_ANALYSIS___INIT;

	/**
	 * The number of operations of the '<em>Previous Node Graph Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREVIOUS_NODE_GRAPH_ANALYSIS_OPERATION_COUNT = GRAPH_ANALYSIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.VariantImpl <em>Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.VariantImpl
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getVariant()
	 * @generated
	 */
	int VARIANT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__NAME = TypesPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_FEATURE_COUNT = TypesPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_OPERATION_COUNT = TypesPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Graph</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 14;

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.AnalysisManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisManager
	 * @generated
	 */
	EClass getAnalysisManager();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.analysis.AnalysisManager#start(org.eclipse.emf.common.util.EList) <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisManager#start(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getAnalysisManager__Start__EList();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.analysis.AnalysisManager#storeResult(e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution) <em>Store Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Result</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisManager#storeResult(e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution)
	 * @generated
	 */
	EOperation getAnalysisManager__StoreResult__AnalysisExecution();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition
	 * @generated
	 */
	EClass getAnalysisDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition#getParameterDefinitions <em>Parameter Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Definitions</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition#getParameterDefinitions()
	 * @see #getAnalysisDefinition()
	 * @generated
	 */
	EReference getAnalysisDefinition_ParameterDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Analysis</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition#getAnalysis()
	 * @see #getAnalysisDefinition()
	 * @generated
	 */
	EReference getAnalysisDefinition_Analysis();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Definition</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.ParameterDefinition
	 * @generated
	 */
	EClass getParameterDefinition();

	/**
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.analysis.ParameterDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.ParameterDefinition#getParameters()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.analysis.ParameterDefinition#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.ParameterDefinition#getUnit()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EAttribute getParameterDefinition_Unit();

	/**
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.analysis.ParameterDefinition#getMustBeDefinedOn <em>Must Be Defined On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Must Be Defined On</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.ParameterDefinition#getMustBeDefinedOn()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_MustBeDefinedOn();

	/**
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.analysis.ParameterDefinition#getCanBeDefinedOn <em>Can Be Defined On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Can Be Defined On</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.ParameterDefinition#getCanBeDefinedOn()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_CanBeDefinedOn();

	/**
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.analysis.ParameterDefinition#getShallNotBeDefinedOn <em>Shall Not Be Defined On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shall Not Be Defined On</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.ParameterDefinition#getShallNotBeDefinedOn()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_ShallNotBeDefinedOn();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.analysis.ParameterDefinition#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.ParameterDefinition#getDefaultValue()
	 * @see #getParameterDefinition()
	 * @generated
	 */
	EReference getParameterDefinition_DefaultValue();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.analysis.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the reference '{@link e4sm.de.metamodel.e4sm.analysis.Parameter#getParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Definition</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.Parameter#getParameterDefinition()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParameterDefinition();

	/**
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.analysis.Parameter#getAppliesOnlyOnVariants <em>Applies Only On Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies Only On Variants</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.Parameter#getAppliesOnlyOnVariants()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_AppliesOnlyOnVariants();

	/**
	 * Returns the meta object for the reference list '{@link e4sm.de.metamodel.e4sm.analysis.Parameter#getDoesNotApplyOnVariants <em>Does Not Apply On Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Does Not Apply On Variants</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.Parameter#getDoesNotApplyOnVariants()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_DoesNotApplyOnVariants();

	/**
	 * Returns the meta object for the containment reference '{@link e4sm.de.metamodel.e4sm.analysis.Parameter#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.Parameter#getInitialValue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_InitialValue();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.analysis.Parameter#isValid() <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.analysis.Parameter#isValid()
	 * @generated
	 */
	EOperation getParameter__IsValid();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.ParameterizableElement <em>Parameterizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterizable Element</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.ParameterizableElement
	 * @generated
	 */
	EClass getParameterizableElement();

	/**
	 * Returns the meta object for the containment reference list '{@link e4sm.de.metamodel.e4sm.analysis.ParameterizableElement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.ParameterizableElement#getParameters()
	 * @see #getParameterizableElement()
	 * @generated
	 */
	EReference getParameterizableElement_Parameters();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.Analysis
	 * @generated
	 */
	EClass getAnalysis();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.analysis.Analysis#exec() <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exec</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.analysis.Analysis#exec()
	 * @generated
	 */
	EOperation getAnalysis__Exec();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.analysis.Analysis#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.analysis.Analysis#init()
	 * @generated
	 */
	EOperation getAnalysis__Init();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.analysis.Analysis#postExecution() <em>Post Execution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Post Execution</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.analysis.Analysis#postExecution()
	 * @generated
	 */
	EOperation getAnalysis__PostExecution();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.analysis.Analysis#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.analysis.Analysis#run()
	 * @generated
	 */
	EOperation getAnalysis__Run();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.ModelAnalysis <em>Model Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Analysis</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.ModelAnalysis
	 * @generated
	 */
	EClass getModelAnalysis();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.AnalysisParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisParameter
	 * @generated
	 */
	EClass getAnalysisParameter();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.GraphAnalysis <em>Graph Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Analysis</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.GraphAnalysis
	 * @generated
	 */
	EClass getGraphAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link e4sm.de.metamodel.e4sm.analysis.GraphAnalysis#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.GraphAnalysis#getGraph()
	 * @see #getGraphAnalysis()
	 * @generated
	 */
	EAttribute getGraphAnalysis_Graph();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.analysis.GraphAnalysis#initGraph() <em>Init Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Graph</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.analysis.GraphAnalysis#initGraph()
	 * @generated
	 */
	EOperation getGraphAnalysis__InitGraph();

	/**
	 * Returns the meta object for the '{@link e4sm.de.metamodel.e4sm.analysis.GraphAnalysis#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see e4sm.de.metamodel.e4sm.analysis.GraphAnalysis#init()
	 * @generated
	 */
	EOperation getGraphAnalysis__Init();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.MemoryLessGraphAnalysis <em>Memory Less Graph Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Less Graph Analysis</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.MemoryLessGraphAnalysis
	 * @generated
	 */
	EClass getMemoryLessGraphAnalysis();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.EntireGraphAnalysis <em>Entire Graph Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entire Graph Analysis</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.EntireGraphAnalysis
	 * @generated
	 */
	EClass getEntireGraphAnalysis();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.PackageAnalysis <em>Package Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Analysis</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.PackageAnalysis
	 * @generated
	 */
	EClass getPackageAnalysis();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.PreviousNodeGraphAnalysis <em>Previous Node Graph Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Previous Node Graph Analysis</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.PreviousNodeGraphAnalysis
	 * @generated
	 */
	EClass getPreviousNodeGraphAnalysis();

	/**
	 * Returns the meta object for class '{@link e4sm.de.metamodel.e4sm.analysis.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant</em>'.
	 * @see e4sm.de.metamodel.e4sm.analysis.Variant
	 * @generated
	 */
	EClass getVariant();

	/**
	 * Returns the meta object for data type '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Graph</em>'.
	 * @model instanceClass="int" serializeable="false"
	 * @generated
	 */
	EDataType getGraph();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnalysisFactory getAnalysisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.AnalysisManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisManagerImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getAnalysisManager()
		 * @generated
		 */
		EClass ANALYSIS_MANAGER = eINSTANCE.getAnalysisManager();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_MANAGER___START__ELIST = eINSTANCE.getAnalysisManager__Start__EList();

		/**
		 * The meta object literal for the '<em><b>Store Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_MANAGER___STORE_RESULT__ANALYSISEXECUTION = eINSTANCE
				.getAnalysisManager__StoreResult__AnalysisExecution();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.AnalysisDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisDefinitionImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getAnalysisDefinition()
		 * @generated
		 */
		EClass ANALYSIS_DEFINITION = eINSTANCE.getAnalysisDefinition();

		/**
		 * The meta object literal for the '<em><b>Parameter Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_DEFINITION__PARAMETER_DEFINITIONS = eINSTANCE.getAnalysisDefinition_ParameterDefinitions();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_DEFINITION__ANALYSIS = eINSTANCE.getAnalysisDefinition_Analysis();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.ParameterDefinitionImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getParameterDefinition()
		 * @generated
		 */
		EClass PARAMETER_DEFINITION = eINSTANCE.getParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__PARAMETERS = eINSTANCE.getParameterDefinition_Parameters();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DEFINITION__UNIT = eINSTANCE.getParameterDefinition_Unit();

		/**
		 * The meta object literal for the '<em><b>Must Be Defined On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__MUST_BE_DEFINED_ON = eINSTANCE.getParameterDefinition_MustBeDefinedOn();

		/**
		 * The meta object literal for the '<em><b>Can Be Defined On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__CAN_BE_DEFINED_ON = eINSTANCE.getParameterDefinition_CanBeDefinedOn();

		/**
		 * The meta object literal for the '<em><b>Shall Not Be Defined On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__SHALL_NOT_BE_DEFINED_ON = eINSTANCE
				.getParameterDefinition_ShallNotBeDefinedOn();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DEFINITION__DEFAULT_VALUE = eINSTANCE.getParameterDefinition_DefaultValue();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.ParameterImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Parameter Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARAMETER_DEFINITION = eINSTANCE.getParameter_ParameterDefinition();

		/**
		 * The meta object literal for the '<em><b>Applies Only On Variants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__APPLIES_ONLY_ON_VARIANTS = eINSTANCE.getParameter_AppliesOnlyOnVariants();

		/**
		 * The meta object literal for the '<em><b>Does Not Apply On Variants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DOES_NOT_APPLY_ON_VARIANTS = eINSTANCE.getParameter_DoesNotApplyOnVariants();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__INITIAL_VALUE = eINSTANCE.getParameter_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER___IS_VALID = eINSTANCE.getParameter__IsValid();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.ParameterizableElement <em>Parameterizable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.ParameterizableElement
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getParameterizableElement()
		 * @generated
		 */
		EClass PARAMETERIZABLE_ELEMENT = eINSTANCE.getParameterizableElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZABLE_ELEMENT__PARAMETERS = eINSTANCE.getParameterizableElement_Parameters();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.AnalysisImpl <em>Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getAnalysis()
		 * @generated
		 */
		EClass ANALYSIS = eINSTANCE.getAnalysis();

		/**
		 * The meta object literal for the '<em><b>Exec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___EXEC = eINSTANCE.getAnalysis__Exec();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___INIT = eINSTANCE.getAnalysis__Init();

		/**
		 * The meta object literal for the '<em><b>Post Execution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___POST_EXECUTION = eINSTANCE.getAnalysis__PostExecution();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS___RUN = eINSTANCE.getAnalysis__Run();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.ModelAnalysisImpl <em>Model Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.ModelAnalysisImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getModelAnalysis()
		 * @generated
		 */
		EClass MODEL_ANALYSIS = eINSTANCE.getModelAnalysis();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.AnalysisParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisParameterImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getAnalysisParameter()
		 * @generated
		 */
		EClass ANALYSIS_PARAMETER = eINSTANCE.getAnalysisParameter();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.GraphAnalysisImpl <em>Graph Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.GraphAnalysisImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getGraphAnalysis()
		 * @generated
		 */
		EClass GRAPH_ANALYSIS = eINSTANCE.getGraphAnalysis();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_ANALYSIS__GRAPH = eINSTANCE.getGraphAnalysis_Graph();

		/**
		 * The meta object literal for the '<em><b>Init Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH_ANALYSIS___INIT_GRAPH = eINSTANCE.getGraphAnalysis__InitGraph();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH_ANALYSIS___INIT = eINSTANCE.getGraphAnalysis__Init();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.MemoryLessGraphAnalysisImpl <em>Memory Less Graph Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.MemoryLessGraphAnalysisImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getMemoryLessGraphAnalysis()
		 * @generated
		 */
		EClass MEMORY_LESS_GRAPH_ANALYSIS = eINSTANCE.getMemoryLessGraphAnalysis();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.EntireGraphAnalysisImpl <em>Entire Graph Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.EntireGraphAnalysisImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getEntireGraphAnalysis()
		 * @generated
		 */
		EClass ENTIRE_GRAPH_ANALYSIS = eINSTANCE.getEntireGraphAnalysis();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.PackageAnalysisImpl <em>Package Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.PackageAnalysisImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getPackageAnalysis()
		 * @generated
		 */
		EClass PACKAGE_ANALYSIS = eINSTANCE.getPackageAnalysis();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.PreviousNodeGraphAnalysisImpl <em>Previous Node Graph Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.PreviousNodeGraphAnalysisImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getPreviousNodeGraphAnalysis()
		 * @generated
		 */
		EClass PREVIOUS_NODE_GRAPH_ANALYSIS = eINSTANCE.getPreviousNodeGraphAnalysis();

		/**
		 * The meta object literal for the '{@link e4sm.de.metamodel.e4sm.analysis.impl.VariantImpl <em>Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.VariantImpl
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getVariant()
		 * @generated
		 */
		EClass VARIANT = eINSTANCE.getVariant();

		/**
		 * The meta object literal for the '<em>Graph</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl#getGraph()
		 * @generated
		 */
		EDataType GRAPH = eINSTANCE.getGraph();

	}

} //AnalysisPackage
