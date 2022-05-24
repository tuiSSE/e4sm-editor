/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Actor;
import e4sm.de.metamodel.e4sm.Actuator;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.ComponentFiringStrategy;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.ConversionByConvention;
import e4sm.de.metamodel.e4sm.ConversionByPrefix;
import e4sm.de.metamodel.e4sm.DerivedUnit;
import e4sm.de.metamodel.e4sm.ExternalDependency;
import e4sm.de.metamodel.e4sm.Function;
import e4sm.de.metamodel.e4sm.Heuristic;
import e4sm.de.metamodel.e4sm.Human;
import e4sm.de.metamodel.e4sm.Import;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.LogicalConnector;
import e4sm.de.metamodel.e4sm.MachineLearningComponent;
import e4sm.de.metamodel.e4sm.MeasurementUnit;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.OutputPin;
import e4sm.de.metamodel.e4sm.Person;
import e4sm.de.metamodel.e4sm.PhysicalComponent;
import e4sm.de.metamodel.e4sm.PhysicalConnector;
import e4sm.de.metamodel.e4sm.Pin;
import e4sm.de.metamodel.e4sm.QueueType;
import e4sm.de.metamodel.e4sm.RaceSemantic;
import e4sm.de.metamodel.e4sm.Robot;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.SimpleUnit;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.UnitConversion;
import e4sm.de.metamodel.e4sm.UnitPrefix;
import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.analysis.impl.AnalysisPackageImpl;
import e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage;
import e4sm.de.metamodel.e4sm.analysis.results.impl.ResultsPackageImpl;
import e4sm.de.metamodel.e4sm.core.CorePackage;
import e4sm.de.metamodel.e4sm.e4smFactory;
import e4sm.de.metamodel.e4sm.e4smPackage;
import e4sm.de.metamodel.e4sm.execution.ExecutionPackage;
import e4sm.de.metamodel.e4sm.execution.impl.ExecutionPackageImpl;
import e4sm.de.metamodel.e4sm.guava.GuavaPackage;
import e4sm.de.metamodel.e4sm.guava.impl.GuavaPackageImpl;
import e4sm.de.metamodel.e4sm.core.impl.CorePackageImpl;
import e4sm.de.metamodel.e4sm.util.e4smValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class e4smPackageImpl extends EPackageImpl implements e4smPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineLearningComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heuristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionByPrefixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversionByConventionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitPrefixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum queueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum raceSemanticEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentFiringStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType connectionspeedEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonEDataType = null;

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
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private e4smPackageImpl() {
		super(eNS_URI, e4smFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link e4smPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static e4smPackage init() {
		if (isInited)
			return (e4smPackage) EPackage.Registry.INSTANCE.getEPackage(e4smPackage.eNS_URI);

		// Obtain or create and register package
		Object registerede4smPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		e4smPackageImpl thee4smPackage = registerede4smPackage instanceof e4smPackageImpl
				? (e4smPackageImpl) registerede4smPackage
				: new e4smPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl) (registeredPackage instanceof CorePackageImpl
				? registeredPackage
				: CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl) (registeredPackage instanceof ExecutionPackageImpl
				? registeredPackage
				: ExecutionPackage.eINSTANCE);
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
		thee4smPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theAnalysisPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theGuavaPackage.createPackageContents();

		// Initialize created meta-data
		thee4smPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theAnalysisPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theGuavaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(thee4smPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return e4smValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		thee4smPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(e4smPackage.eNS_URI, thee4smPackage);
		return thee4smPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Components() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Pins() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_MainResponsible() {
		return (EReference) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_SpecifiedInPackage() {
		return (EReference) componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Execution() {
		return (EReference) componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_FiringStrategy() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__ComputeMainResponsible() {
		return componentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComponent__NewOperation2() {
		return componentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachineLearningComponent() {
		return machineLearningComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_Source() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_Target() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__ComputeName() {
		return connectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConnector__ComputeFlow() {
		return connectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalConnector() {
		return physicalConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalConnector_MinSpeed() {
		return (EAttribute) physicalConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalConnector_MaxSpeed() {
		return (EAttribute) physicalConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalComponent() {
		return physicalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftwareComponent() {
		return softwareComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftwareComponent_OutputUncertainty() {
		return (EAttribute) softwareComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftwareComponent_Synchronous() {
		return (EAttribute) softwareComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftwareComponent_NumberOfServers() {
		return (EAttribute) softwareComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSoftwareComponent__IsParallel() {
		return softwareComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalConnector() {
		return logicalConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeuristic() {
		return heuristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalDependency() {
		return externalDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExternalDependency__ComputeMainResponsible() {
		return externalDependencyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Components() {
		return (EReference) packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_SoftwareComponents() {
		return (EReference) packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_PhysicalComponents() {
		return (EReference) packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Connectors() {
		return (EReference) packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Sectors() {
		return (EReference) packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_MainResponsible() {
		return (EReference) packageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Packages() {
		return (EReference) packageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_SpecifiesComponent() {
		return (EReference) packageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackage__GetAllComponents() {
		return packageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackage__GetMaxFlow() {
		return packageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Packages() {
		return (EReference) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Actors() {
		return (EReference) modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModel_PersonsPicturesPath() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Variants() {
		return (EReference) modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Types() {
		return (EReference) modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Imports() {
		return (EReference) modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel__IsPersonPicturePathValid__DiagnosticChain_Map() {
		return modelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHuman() {
		return humanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSector() {
		return sectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSector_Components() {
		return (EReference) sectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSector_Sectors() {
		return (EReference) sectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSector__GetAllComponents() {
		return sectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPin_GatewayPin() {
		return (EAttribute) pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPin_Stream() {
		return (EAttribute) pinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPin_RaceSemantic() {
		return (EAttribute) pinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPin__ComputeName() {
		return pinEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPin__GetIncomingConnectors() {
		return pinEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPin__GetOutgoingConnectors() {
		return pinEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputPin() {
		return inputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputPin_QueueType() {
		return (EAttribute) inputPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputPin_Collect() {
		return (EAttribute) inputPinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInputPin__ComputeName() {
		return inputPinEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputPin() {
		return outputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutputPin_Amplify() {
		return (EAttribute) outputPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutputPin__ComputeName() {
		return outputPinEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Surname() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Department() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_ResponsibleForComponents() {
		return (EReference) personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_PictureFileName() {
		return (EAttribute) personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasurementUnit() {
		return measurementUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasurementUnit_UnitConversion() {
		return (EReference) measurementUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleUnit() {
		return simpleUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDerivedUnit() {
		return derivedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitConversion() {
		return unitConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnitConversion_ReferenceUnit() {
		return (EReference) unitConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConversionByPrefix() {
		return conversionByPrefixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConversionByPrefix_ConversionFactor() {
		return (EAttribute) conversionByPrefixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConversionByPrefix_Prefix() {
		return (EReference) conversionByPrefixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConversionByConvention() {
		return conversionByConventionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnitPrefix() {
		return unitPrefixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitPrefix_Symbol() {
		return (EAttribute) unitPrefixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnitPrefix_ConversionFactor() {
		return (EAttribute) unitPrefixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImport_ReferencedModel() {
		return (EReference) importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQueueType() {
		return queueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRaceSemantic() {
		return raceSemanticEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentFiringStrategy() {
		return componentFiringStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConnectionspeed() {
		return connectionspeedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJSON() {
		return jsonEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public e4smFactory gete4smFactory() {
		return (e4smFactory) getEFactoryInstance();
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
		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__COMPONENTS);
		createEReference(componentEClass, COMPONENT__PINS);
		createEReference(componentEClass, COMPONENT__MAIN_RESPONSIBLE);
		createEReference(componentEClass, COMPONENT__SPECIFIED_IN_PACKAGE);
		createEReference(componentEClass, COMPONENT__EXECUTION);
		createEAttribute(componentEClass, COMPONENT__FIRING_STRATEGY);
		createEOperation(componentEClass, COMPONENT___COMPUTE_MAIN_RESPONSIBLE);
		createEOperation(componentEClass, COMPONENT___NEW_OPERATION2);

		machineLearningComponentEClass = createEClass(MACHINE_LEARNING_COMPONENT);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__SOURCE);
		createEReference(connectorEClass, CONNECTOR__TARGET);
		createEOperation(connectorEClass, CONNECTOR___COMPUTE_NAME);
		createEOperation(connectorEClass, CONNECTOR___COMPUTE_FLOW);

		physicalConnectorEClass = createEClass(PHYSICAL_CONNECTOR);
		createEAttribute(physicalConnectorEClass, PHYSICAL_CONNECTOR__MIN_SPEED);
		createEAttribute(physicalConnectorEClass, PHYSICAL_CONNECTOR__MAX_SPEED);

		physicalComponentEClass = createEClass(PHYSICAL_COMPONENT);

		softwareComponentEClass = createEClass(SOFTWARE_COMPONENT);
		createEAttribute(softwareComponentEClass, SOFTWARE_COMPONENT__OUTPUT_UNCERTAINTY);
		createEAttribute(softwareComponentEClass, SOFTWARE_COMPONENT__SYNCHRONOUS);
		createEAttribute(softwareComponentEClass, SOFTWARE_COMPONENT__NUMBER_OF_SERVERS);
		createEOperation(softwareComponentEClass, SOFTWARE_COMPONENT___IS_PARALLEL);

		logicalConnectorEClass = createEClass(LOGICAL_CONNECTOR);

		heuristicEClass = createEClass(HEURISTIC);

		functionEClass = createEClass(FUNCTION);

		externalDependencyEClass = createEClass(EXTERNAL_DEPENDENCY);
		createEOperation(externalDependencyEClass, EXTERNAL_DEPENDENCY___COMPUTE_MAIN_RESPONSIBLE);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__COMPONENTS);
		createEReference(packageEClass, PACKAGE__SOFTWARE_COMPONENTS);
		createEReference(packageEClass, PACKAGE__PHYSICAL_COMPONENTS);
		createEReference(packageEClass, PACKAGE__CONNECTORS);
		createEReference(packageEClass, PACKAGE__SECTORS);
		createEReference(packageEClass, PACKAGE__MAIN_RESPONSIBLE);
		createEReference(packageEClass, PACKAGE__PACKAGES);
		createEReference(packageEClass, PACKAGE__SPECIFIES_COMPONENT);
		createEOperation(packageEClass, PACKAGE___GET_ALL_COMPONENTS);
		createEOperation(packageEClass, PACKAGE___GET_MAX_FLOW);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__PACKAGES);
		createEReference(modelEClass, MODEL__ACTORS);
		createEAttribute(modelEClass, MODEL__PERSONS_PICTURES_PATH);
		createEReference(modelEClass, MODEL__VARIANTS);
		createEReference(modelEClass, MODEL__TYPES);
		createEReference(modelEClass, MODEL__IMPORTS);
		createEOperation(modelEClass, MODEL___IS_PERSON_PICTURE_PATH_VALID__DIAGNOSTICCHAIN_MAP);

		actorEClass = createEClass(ACTOR);

		humanEClass = createEClass(HUMAN);

		robotEClass = createEClass(ROBOT);

		sectorEClass = createEClass(SECTOR);
		createEReference(sectorEClass, SECTOR__COMPONENTS);
		createEReference(sectorEClass, SECTOR__SECTORS);
		createEOperation(sectorEClass, SECTOR___GET_ALL_COMPONENTS);

		sensorEClass = createEClass(SENSOR);

		actuatorEClass = createEClass(ACTUATOR);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__GATEWAY_PIN);
		createEAttribute(pinEClass, PIN__STREAM);
		createEAttribute(pinEClass, PIN__RACE_SEMANTIC);
		createEOperation(pinEClass, PIN___COMPUTE_NAME);
		createEOperation(pinEClass, PIN___GET_INCOMING_CONNECTORS);
		createEOperation(pinEClass, PIN___GET_OUTGOING_CONNECTORS);

		inputPinEClass = createEClass(INPUT_PIN);
		createEAttribute(inputPinEClass, INPUT_PIN__QUEUE_TYPE);
		createEAttribute(inputPinEClass, INPUT_PIN__COLLECT);
		createEOperation(inputPinEClass, INPUT_PIN___COMPUTE_NAME);

		outputPinEClass = createEClass(OUTPUT_PIN);
		createEAttribute(outputPinEClass, OUTPUT_PIN__AMPLIFY);
		createEOperation(outputPinEClass, OUTPUT_PIN___COMPUTE_NAME);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__SURNAME);
		createEAttribute(personEClass, PERSON__DEPARTMENT);
		createEReference(personEClass, PERSON__RESPONSIBLE_FOR_COMPONENTS);
		createEAttribute(personEClass, PERSON__PICTURE_FILE_NAME);

		measurementUnitEClass = createEClass(MEASUREMENT_UNIT);
		createEReference(measurementUnitEClass, MEASUREMENT_UNIT__UNIT_CONVERSION);

		simpleUnitEClass = createEClass(SIMPLE_UNIT);

		derivedUnitEClass = createEClass(DERIVED_UNIT);

		unitConversionEClass = createEClass(UNIT_CONVERSION);
		createEReference(unitConversionEClass, UNIT_CONVERSION__REFERENCE_UNIT);

		conversionByPrefixEClass = createEClass(CONVERSION_BY_PREFIX);
		createEAttribute(conversionByPrefixEClass, CONVERSION_BY_PREFIX__CONVERSION_FACTOR);
		createEReference(conversionByPrefixEClass, CONVERSION_BY_PREFIX__PREFIX);

		conversionByConventionEClass = createEClass(CONVERSION_BY_CONVENTION);

		unitPrefixEClass = createEClass(UNIT_PREFIX);
		createEAttribute(unitPrefixEClass, UNIT_PREFIX__SYMBOL);
		createEAttribute(unitPrefixEClass, UNIT_PREFIX__CONVERSION_FACTOR);

		importEClass = createEClass(IMPORT);
		createEReference(importEClass, IMPORT__REFERENCED_MODEL);

		// Create enums
		queueTypeEEnum = createEEnum(QUEUE_TYPE);
		raceSemanticEEnum = createEEnum(RACE_SEMANTIC);
		componentFiringStrategyEEnum = createEEnum(COMPONENT_FIRING_STRATEGY);

		// Create data types
		connectionspeedEDataType = createEDataType(CONNECTIONSPEED);
		jsonEDataType = createEDataType(JSON);
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
		CorePackage theCorePackage = (CorePackage) EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ExecutionPackage theExecutionPackage = (ExecutionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExecutionPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		componentEClass.getESuperTypes().add(theCorePackage.getParameterizableElement());
		componentEClass.getESuperTypes().add(theExecutionPackage.getDelayableElement());
		machineLearningComponentEClass.getESuperTypes().add(this.getSoftwareComponent());
		connectorEClass.getESuperTypes().add(theCorePackage.getParameterizableElement());
		connectorEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		physicalConnectorEClass.getESuperTypes().add(this.getConnector());
		physicalComponentEClass.getESuperTypes().add(this.getComponent());
		softwareComponentEClass.getESuperTypes().add(this.getComponent());
		logicalConnectorEClass.getESuperTypes().add(this.getConnector());
		heuristicEClass.getESuperTypes().add(this.getSoftwareComponent());
		functionEClass.getESuperTypes().add(this.getSoftwareComponent());
		externalDependencyEClass.getESuperTypes().add(this.getSoftwareComponent());
		packageEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		packageEClass.getESuperTypes().add(theCorePackage.getParameterizableElement());
		modelEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		modelEClass.getESuperTypes().add(theCorePackage.getParameterizableElement());
		actorEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		humanEClass.getESuperTypes().add(this.getActor());
		robotEClass.getESuperTypes().add(this.getActor());
		sectorEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		sensorEClass.getESuperTypes().add(this.getPhysicalComponent());
		actuatorEClass.getESuperTypes().add(this.getPhysicalComponent());
		pinEClass.getESuperTypes().add(theCorePackage.getParameterizableElement());
		pinEClass.getESuperTypes().add(theExecutionPackage.getConnectableNode());
		pinEClass.getESuperTypes().add(theCorePackage.getTypedElement());
		inputPinEClass.getESuperTypes().add(this.getPin());
		outputPinEClass.getESuperTypes().add(this.getPin());
		outputPinEClass.getESuperTypes().add(theExecutionPackage.getAssignableElement());
		personEClass.getESuperTypes().add(this.getHuman());
		simpleUnitEClass.getESuperTypes().add(this.getMeasurementUnit());
		derivedUnitEClass.getESuperTypes().add(this.getMeasurementUnit());
		conversionByPrefixEClass.getESuperTypes().add(this.getUnitConversion());
		conversionByConventionEClass.getESuperTypes().add(this.getUnitConversion());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Components(), this.getComponent(), null, "components", null, 0, -1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Pins(), this.getPin(), null, "pins", null, 0, -1, Component.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getComponent_MainResponsible(), this.getPerson(), this.getPerson_ResponsibleForComponents(),
				"mainResponsible", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_SpecifiedInPackage(), this.getPackage(), this.getPackage_SpecifiesComponent(),
				"specifiedInPackage", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Execution(), theExecutionPackage.getExecution(), null, "execution", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_FiringStrategy(), this.getComponentFiringStrategy(), "firingStrategy", "AND", 1, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getComponent__ComputeMainResponsible(), this.getPerson(), "computeMainResponsible", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getComponent__NewOperation2(), null, "newOperation2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(machineLearningComponentEClass, MachineLearningComponent.class, "MachineLearningComponent",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Source(), this.getPin(), null, "source", null, 1, 1, Connector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getConnector_Target(), this.getPin(), null, "target", null, 1, 1, Connector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getConnector__ComputeName(), ecorePackage.getEString(), "computeName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getConnector__ComputeFlow(), theEcorePackage.getEDouble(), "computeFlow", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(physicalConnectorEClass, PhysicalConnector.class, "PhysicalConnector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalConnector_MinSpeed(), this.getConnectionspeed(), "minSpeed", null, 0, 1,
				PhysicalConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalConnector_MaxSpeed(), this.getConnectionspeed(), "maxSpeed", null, 0, 1,
				PhysicalConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(physicalComponentEClass, PhysicalComponent.class, "PhysicalComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareComponentEClass, SoftwareComponent.class, "SoftwareComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareComponent_OutputUncertainty(), ecorePackage.getEDouble(), "outputUncertainty", "0.0",
				0, 1, SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareComponent_Synchronous(), ecorePackage.getEBoolean(), "synchronous", "true", 0, 1,
				SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftwareComponent_NumberOfServers(), ecorePackage.getEInt(), "numberOfServers", "1", 0, 1,
				SoftwareComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getSoftwareComponent__IsParallel(), ecorePackage.getEBoolean(), "isParallel", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(logicalConnectorEClass, LogicalConnector.class, "LogicalConnector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(heuristicEClass, Heuristic.class, "Heuristic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalDependencyEClass, ExternalDependency.class, "ExternalDependency", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getExternalDependency__ComputeMainResponsible(), this.getPerson(), "computeMainResponsible", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(packageEClass, e4sm.de.metamodel.e4sm.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Components(), this.getComponent(), null, "components", null, 0, -1,
				e4sm.de.metamodel.e4sm.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_SoftwareComponents(), this.getSoftwareComponent(), null, "softwareComponents", null,
				0, -1, e4sm.de.metamodel.e4sm.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_PhysicalComponents(), this.getPhysicalComponent(), null, "physicalComponents", null,
				0, -1, e4sm.de.metamodel.e4sm.Package.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Connectors(), this.getConnector(), null, "connectors", null, 0, -1,
				e4sm.de.metamodel.e4sm.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Sectors(), this.getSector(), null, "sectors", null, 0, -1,
				e4sm.de.metamodel.e4sm.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_MainResponsible(), this.getPerson(), null, "mainResponsible", null, 0, 1,
				e4sm.de.metamodel.e4sm.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Packages(), this.getPackage(), null, "packages", null, 0, -1,
				e4sm.de.metamodel.e4sm.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_SpecifiesComponent(), this.getComponent(), this.getComponent_SpecifiedInPackage(),
				"specifiesComponent", null, 0, 1, e4sm.de.metamodel.e4sm.Package.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPackage__GetAllComponents(), this.getComponent(), "getAllComponents", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getPackage__GetMaxFlow(), theEcorePackage.getEDouble(), "getMaxFlow", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Packages(), this.getPackage(), null, "packages", null, 0, -1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Actors(), this.getActor(), null, "actors", null, 0, -1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getModel_PersonsPicturesPath(), ecorePackage.getEString(), "personsPicturesPath", null, 0, 1,
				Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getModel_Variants(), theCorePackage.getVariant(), null, "variants", null, 0, -1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Types(), theCorePackage.getTypeSpecification(), null, "types", null, 0, -1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Imports(), this.getImport(), null, "imports", null, 0, -1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = initEOperation(getModel__IsPersonPicturePathValid__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "isPersonPicturePathValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(humanEClass, Human.class, "Human", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sectorEClass, Sector.class, "Sector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSector_Components(), this.getComponent(), null, "components", null, 0, -1, Sector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSector_Sectors(), this.getSector(), null, "sectors", null, 0, -1, Sector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getSector__GetAllComponents(), this.getComponent(), "getAllComponents", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(pinEClass, Pin.class, "Pin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_GatewayPin(), ecorePackage.getEBoolean(), "gatewayPin", null, 0, 1, Pin.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_Stream(), ecorePackage.getEBoolean(), "stream", null, 0, 1, Pin.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPin_RaceSemantic(), this.getRaceSemantic(), "raceSemantic", "MERGE_AND_DUPLICATE", 0, 1,
				Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getPin__ComputeName(), ecorePackage.getEString(), "computeName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPin__GetIncomingConnectors(), this.getConnector(), "getIncomingConnectors", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getPin__GetOutgoingConnectors(), this.getConnector(), "getOutgoingConnectors", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(inputPinEClass, InputPin.class, "InputPin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputPin_QueueType(), this.getQueueType(), "queueType", null, 0, 1, InputPin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputPin_Collect(), theEcorePackage.getEInt(), "collect", "1", 0, 1, InputPin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInputPin__ComputeName(), ecorePackage.getEString(), "computeName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(outputPinEClass, OutputPin.class, "OutputPin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputPin_Amplify(), theEcorePackage.getEInt(), "amplify", "1", 0, 1, OutputPin.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOutputPin__ComputeName(), ecorePackage.getEString(), "computeName", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Surname(), ecorePackage.getEString(), "surname", null, 1, 1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Department(), ecorePackage.getEString(), "department", null, 0, 1, Person.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_ResponsibleForComponents(), this.getComponent(), this.getComponent_MainResponsible(),
				"responsibleForComponents", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PictureFileName(), ecorePackage.getEString(), "pictureFileName", null, 0, 1,
				Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(measurementUnitEClass, MeasurementUnit.class, "MeasurementUnit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementUnit_UnitConversion(), this.getUnitConversion(), null, "unitConversion", null, 0,
				1, MeasurementUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleUnitEClass, SimpleUnit.class, "SimpleUnit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivedUnitEClass, DerivedUnit.class, "DerivedUnit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitConversionEClass, UnitConversion.class, "UnitConversion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitConversion_ReferenceUnit(), this.getMeasurementUnit(), null, "referenceUnit", null, 1, 1,
				UnitConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conversionByPrefixEClass, ConversionByPrefix.class, "ConversionByPrefix", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConversionByPrefix_ConversionFactor(), ecorePackage.getEFloat(), "conversionFactor", null, 0,
				1, ConversionByPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConversionByPrefix_Prefix(), this.getUnitPrefix(), null, "prefix", null, 1, 1,
				ConversionByPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conversionByConventionEClass, ConversionByConvention.class, "ConversionByConvention", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitPrefixEClass, UnitPrefix.class, "UnitPrefix", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitPrefix_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, UnitPrefix.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitPrefix_ConversionFactor(), ecorePackage.getEInt(), "conversionFactor", null, 0, 1,
				UnitPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImport_ReferencedModel(), this.getModel(), null, "referencedModel", null, 1, 1, Import.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(queueTypeEEnum, QueueType.class, "QueueType");
		addEEnumLiteral(queueTypeEEnum, QueueType.FIFO);
		addEEnumLiteral(queueTypeEEnum, QueueType.LIFO);
		addEEnumLiteral(queueTypeEEnum, QueueType.RANDOM);
		addEEnumLiteral(queueTypeEEnum, QueueType.LATEST_ONLY);
		addEEnumLiteral(queueTypeEEnum, QueueType.STORE);

		initEEnum(raceSemanticEEnum, RaceSemantic.class, "RaceSemantic");
		addEEnumLiteral(raceSemanticEEnum, RaceSemantic.FCFS);
		addEEnumLiteral(raceSemanticEEnum, RaceSemantic.DUPLICATE);
		addEEnumLiteral(raceSemanticEEnum, RaceSemantic.MERGE);
		addEEnumLiteral(raceSemanticEEnum, RaceSemantic.MERGE_AND_DUPLICATE);

		initEEnum(componentFiringStrategyEEnum, ComponentFiringStrategy.class, "ComponentFiringStrategy");
		addEEnumLiteral(componentFiringStrategyEEnum, ComponentFiringStrategy.AND);
		addEEnumLiteral(componentFiringStrategyEEnum, ComponentFiringStrategy.OR);

		// Initialize data types
		initEDataType(connectionspeedEDataType, Object.class, "Connectionspeed", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jsonEDataType, String.class, "JSON", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(componentEClass, source, new String[] { "constraints", "ComponentC1 ComponentC2 ComponentC3" });
		addAnnotation(connectorEClass, source, new String[] { "constraints", "ConnectorC1" });
		addAnnotation(physicalConnectorEClass, source,
				new String[] { "constraints", "PhysicalConnectorC1 PhysicalConnectorC2 PhysicalConnectorC3" });
		addAnnotation(softwareComponentEClass, source, new String[] { "constraints", "SoftwareComponentC1" });
		addAnnotation(packageEClass, source, new String[] { "constraints", "PackageC1" });
		addAnnotation(sensorEClass, source, new String[] { "constraints", "SensorC1" });
		addAnnotation(actuatorEClass, source, new String[] { "constraints", "ActuatorC1" });
		addAnnotation(pinEClass, source, new String[] { "constraints", "PinC1" });
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation(getSoftwareComponent__IsParallel(), source, new String[] {});
	}

} //e4smPackageImpl
