/**
 */
package abcd.xy.metamodel.abcd.util;

import abcd.xy.metamodel.abcd.Actor;
import abcd.xy.metamodel.abcd.Actuator;
import abcd.xy.metamodel.abcd.Component;
import abcd.xy.metamodel.abcd.Connector;
import abcd.xy.metamodel.abcd.ConversionByConvention;
import abcd.xy.metamodel.abcd.ConversionByPrefix;
import abcd.xy.metamodel.abcd.DataNode;
import abcd.xy.metamodel.abcd.DataStore;
import abcd.xy.metamodel.abcd.DerivedUnit;
import abcd.xy.metamodel.abcd.ExternalDependency;
import abcd.xy.metamodel.abcd.Function;
import abcd.xy.metamodel.abcd.Heuristic;
import abcd.xy.metamodel.abcd.Human;
import abcd.xy.metamodel.abcd.Import;
import abcd.xy.metamodel.abcd.InputPin;
import abcd.xy.metamodel.abcd.LogicalConnector;
import abcd.xy.metamodel.abcd.MachineLearningComponent;
import abcd.xy.metamodel.abcd.MeasurementUnit;
import abcd.xy.metamodel.abcd.Model;
import abcd.xy.metamodel.abcd.OutputPin;
import abcd.xy.metamodel.abcd.Person;
import abcd.xy.metamodel.abcd.PhysicalComponent;
import abcd.xy.metamodel.abcd.PhysicalConnector;
import abcd.xy.metamodel.abcd.Pin;
import abcd.xy.metamodel.abcd.Robot;
import abcd.xy.metamodel.abcd.Sector;
import abcd.xy.metamodel.abcd.Sensor;
import abcd.xy.metamodel.abcd.SimpleUnit;
import abcd.xy.metamodel.abcd.SoftwareComponent;
import abcd.xy.metamodel.abcd.UnitConversion;
import abcd.xy.metamodel.abcd.UnitPrefix;
import abcd.xy.metamodel.abcd.analysis.ParameterizableElement;
import abcd.xy.metamodel.abcd.core.DocumentableElement;
import abcd.xy.metamodel.abcd.abcdPackage;

import abcd.xy.metamodel.abcd.execution.AssignableElement;
import abcd.xy.metamodel.abcd.execution.ConnectableNode;
import abcd.xy.metamodel.abcd.execution.DelayableElement;
import abcd.xy.metamodel.abcd.execution.ExecutionElement;
import abcd.xy.metamodel.abcd.core.Element;
import abcd.xy.metamodel.abcd.core.NamedElement;
import abcd.xy.metamodel.abcd.core.TypedElement;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see abcd.xy.metamodel.abcd.abcdPackage
 * @generated
 */
public class abcdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static abcdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abcdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = abcdPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected abcdSwitch<Adapter> modelSwitch = new abcdSwitch<Adapter>() {
		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseMachineLearningComponent(MachineLearningComponent object) {
			return createMachineLearningComponentAdapter();
		}

		@Override
		public Adapter caseConnector(Connector object) {
			return createConnectorAdapter();
		}

		@Override
		public Adapter casePhysicalConnector(PhysicalConnector object) {
			return createPhysicalConnectorAdapter();
		}

		@Override
		public Adapter casePhysicalComponent(PhysicalComponent object) {
			return createPhysicalComponentAdapter();
		}

		@Override
		public Adapter caseSoftwareComponent(SoftwareComponent object) {
			return createSoftwareComponentAdapter();
		}

		@Override
		public Adapter caseLogicalConnector(LogicalConnector object) {
			return createLogicalConnectorAdapter();
		}

		@Override
		public Adapter caseHeuristic(Heuristic object) {
			return createHeuristicAdapter();
		}

		@Override
		public Adapter caseFunction(Function object) {
			return createFunctionAdapter();
		}

		@Override
		public Adapter caseExternalDependency(ExternalDependency object) {
			return createExternalDependencyAdapter();
		}

		@Override
		public Adapter casePackage(abcd.xy.metamodel.abcd.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter caseActor(Actor object) {
			return createActorAdapter();
		}

		@Override
		public Adapter caseHuman(Human object) {
			return createHumanAdapter();
		}

		@Override
		public Adapter caseRobot(Robot object) {
			return createRobotAdapter();
		}

		@Override
		public Adapter caseSector(Sector object) {
			return createSectorAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseActuator(Actuator object) {
			return createActuatorAdapter();
		}

		@Override
		public Adapter casePin(Pin object) {
			return createPinAdapter();
		}

		@Override
		public Adapter caseInputPin(InputPin object) {
			return createInputPinAdapter();
		}

		@Override
		public Adapter caseOutputPin(OutputPin object) {
			return createOutputPinAdapter();
		}

		@Override
		public Adapter casePerson(Person object) {
			return createPersonAdapter();
		}

		@Override
		public Adapter caseMeasurementUnit(MeasurementUnit object) {
			return createMeasurementUnitAdapter();
		}

		@Override
		public Adapter caseSimpleUnit(SimpleUnit object) {
			return createSimpleUnitAdapter();
		}

		@Override
		public Adapter caseDerivedUnit(DerivedUnit object) {
			return createDerivedUnitAdapter();
		}

		@Override
		public Adapter caseUnitConversion(UnitConversion object) {
			return createUnitConversionAdapter();
		}

		@Override
		public Adapter caseConversionByPrefix(ConversionByPrefix object) {
			return createConversionByPrefixAdapter();
		}

		@Override
		public Adapter caseConversionByConvention(ConversionByConvention object) {
			return createConversionByConventionAdapter();
		}

		@Override
		public Adapter caseUnitPrefix(UnitPrefix object) {
			return createUnitPrefixAdapter();
		}

		@Override
		public Adapter caseImport(Import object) {
			return createImportAdapter();
		}

		@Override
		public Adapter caseDataStore(DataStore object) {
			return createDataStoreAdapter();
		}

		@Override
		public Adapter caseDataNode(DataNode object) {
			return createDataNodeAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseParameterizableElement(ParameterizableElement object) {
			return createParameterizableElementAdapter();
		}

		@Override
		public Adapter caseDelayableElement(DelayableElement object) {
			return createDelayableElementAdapter();
		}

		@Override
		public Adapter caseDocumentableElement(DocumentableElement object) {
			return createDocumentableElementAdapter();
		}

		@Override
		public Adapter caseTypedElement(TypedElement object) {
			return createTypedElementAdapter();
		}

		@Override
		public Adapter caseExecutionElement(ExecutionElement object) {
			return createExecutionElementAdapter();
		}

		@Override
		public Adapter caseConnectableNode(ConnectableNode object) {
			return createConnectableNodeAdapter();
		}

		@Override
		public Adapter caseAssignableElement(AssignableElement object) {
			return createAssignableElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.MachineLearningComponent <em>Machine Learning Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.MachineLearningComponent
	 * @generated
	 */
	public Adapter createMachineLearningComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.PhysicalConnector <em>Physical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.PhysicalConnector
	 * @generated
	 */
	public Adapter createPhysicalConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.PhysicalComponent <em>Physical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.PhysicalComponent
	 * @generated
	 */
	public Adapter createPhysicalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.SoftwareComponent <em>Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.SoftwareComponent
	 * @generated
	 */
	public Adapter createSoftwareComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.LogicalConnector <em>Logical Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.LogicalConnector
	 * @generated
	 */
	public Adapter createLogicalConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Heuristic <em>Heuristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Heuristic
	 * @generated
	 */
	public Adapter createHeuristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.ExternalDependency <em>External Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.ExternalDependency
	 * @generated
	 */
	public Adapter createExternalDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Human <em>Human</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Human
	 * @generated
	 */
	public Adapter createHumanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Sector <em>Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Sector
	 * @generated
	 */
	public Adapter createSectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.InputPin
	 * @generated
	 */
	public Adapter createInputPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.OutputPin
	 * @generated
	 */
	public Adapter createOutputPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.analysis.ParameterizableElement <em>Parameterizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.analysis.ParameterizableElement
	 * @generated
	 */
	public Adapter createParameterizableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.execution.DelayableElement <em>Delayable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.execution.DelayableElement
	 * @generated
	 */
	public Adapter createDelayableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.core.DocumentableElement <em>Documentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.core.DocumentableElement
	 * @generated
	 */
	public Adapter createDocumentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.MeasurementUnit <em>Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.MeasurementUnit
	 * @generated
	 */
	public Adapter createMeasurementUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.SimpleUnit <em>Simple Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.SimpleUnit
	 * @generated
	 */
	public Adapter createSimpleUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.DerivedUnit <em>Derived Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.DerivedUnit
	 * @generated
	 */
	public Adapter createDerivedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.UnitConversion <em>Unit Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.UnitConversion
	 * @generated
	 */
	public Adapter createUnitConversionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.ConversionByPrefix <em>Conversion By Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.ConversionByPrefix
	 * @generated
	 */
	public Adapter createConversionByPrefixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.ConversionByConvention <em>Conversion By Convention</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.ConversionByConvention
	 * @generated
	 */
	public Adapter createConversionByConventionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.UnitPrefix <em>Unit Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.UnitPrefix
	 * @generated
	 */
	public Adapter createUnitPrefixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.DataStore
	 * @generated
	 */
	public Adapter createDataStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.DataNode <em>Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.DataNode
	 * @generated
	 */
	public Adapter createDataNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.execution.ConnectableNode <em>Connectable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.execution.ConnectableNode
	 * @generated
	 */
	public Adapter createConnectableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.core.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.core.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.execution.ExecutionElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.execution.ExecutionElement
	 * @generated
	 */
	public Adapter createExecutionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link abcd.xy.metamodel.abcd.execution.AssignableElement <em>Assignable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see abcd.xy.metamodel.abcd.execution.AssignableElement
	 * @generated
	 */
	public Adapter createAssignableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //abcdAdapterFactory
