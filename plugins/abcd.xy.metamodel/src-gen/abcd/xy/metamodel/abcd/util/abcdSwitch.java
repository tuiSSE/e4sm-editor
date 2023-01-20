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
 * @see abcd.xy.metamodel.abcd.abcdPackage
 * @generated
 */
public class abcdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static abcdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abcdSwitch() {
		if (modelPackage == null) {
			modelPackage = abcdPackage.eINSTANCE;
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
		case abcdPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseNamedElement(component);
			if (result == null)
				result = caseParameterizableElement(component);
			if (result == null)
				result = caseDelayableElement(component);
			if (result == null)
				result = caseDocumentableElement(component);
			if (result == null)
				result = caseElement(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.MACHINE_LEARNING_COMPONENT: {
			MachineLearningComponent machineLearningComponent = (MachineLearningComponent) theEObject;
			T result = caseMachineLearningComponent(machineLearningComponent);
			if (result == null)
				result = caseSoftwareComponent(machineLearningComponent);
			if (result == null)
				result = caseComponent(machineLearningComponent);
			if (result == null)
				result = caseNamedElement(machineLearningComponent);
			if (result == null)
				result = caseParameterizableElement(machineLearningComponent);
			if (result == null)
				result = caseDelayableElement(machineLearningComponent);
			if (result == null)
				result = caseDocumentableElement(machineLearningComponent);
			if (result == null)
				result = caseElement(machineLearningComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.CONNECTOR: {
			Connector connector = (Connector) theEObject;
			T result = caseConnector(connector);
			if (result == null)
				result = caseParameterizableElement(connector);
			if (result == null)
				result = caseNamedElement(connector);
			if (result == null)
				result = caseDocumentableElement(connector);
			if (result == null)
				result = caseElement(connector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.PHYSICAL_CONNECTOR: {
			PhysicalConnector physicalConnector = (PhysicalConnector) theEObject;
			T result = casePhysicalConnector(physicalConnector);
			if (result == null)
				result = caseConnector(physicalConnector);
			if (result == null)
				result = caseParameterizableElement(physicalConnector);
			if (result == null)
				result = caseNamedElement(physicalConnector);
			if (result == null)
				result = caseDocumentableElement(physicalConnector);
			if (result == null)
				result = caseElement(physicalConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.PHYSICAL_COMPONENT: {
			PhysicalComponent physicalComponent = (PhysicalComponent) theEObject;
			T result = casePhysicalComponent(physicalComponent);
			if (result == null)
				result = caseComponent(physicalComponent);
			if (result == null)
				result = caseNamedElement(physicalComponent);
			if (result == null)
				result = caseParameterizableElement(physicalComponent);
			if (result == null)
				result = caseDelayableElement(physicalComponent);
			if (result == null)
				result = caseDocumentableElement(physicalComponent);
			if (result == null)
				result = caseElement(physicalComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.SOFTWARE_COMPONENT: {
			SoftwareComponent softwareComponent = (SoftwareComponent) theEObject;
			T result = caseSoftwareComponent(softwareComponent);
			if (result == null)
				result = caseComponent(softwareComponent);
			if (result == null)
				result = caseNamedElement(softwareComponent);
			if (result == null)
				result = caseParameterizableElement(softwareComponent);
			if (result == null)
				result = caseDelayableElement(softwareComponent);
			if (result == null)
				result = caseDocumentableElement(softwareComponent);
			if (result == null)
				result = caseElement(softwareComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.LOGICAL_CONNECTOR: {
			LogicalConnector logicalConnector = (LogicalConnector) theEObject;
			T result = caseLogicalConnector(logicalConnector);
			if (result == null)
				result = caseConnector(logicalConnector);
			if (result == null)
				result = caseParameterizableElement(logicalConnector);
			if (result == null)
				result = caseNamedElement(logicalConnector);
			if (result == null)
				result = caseDocumentableElement(logicalConnector);
			if (result == null)
				result = caseElement(logicalConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.HEURISTIC: {
			Heuristic heuristic = (Heuristic) theEObject;
			T result = caseHeuristic(heuristic);
			if (result == null)
				result = caseSoftwareComponent(heuristic);
			if (result == null)
				result = caseComponent(heuristic);
			if (result == null)
				result = caseNamedElement(heuristic);
			if (result == null)
				result = caseParameterizableElement(heuristic);
			if (result == null)
				result = caseDelayableElement(heuristic);
			if (result == null)
				result = caseDocumentableElement(heuristic);
			if (result == null)
				result = caseElement(heuristic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.FUNCTION: {
			Function function = (Function) theEObject;
			T result = caseFunction(function);
			if (result == null)
				result = caseSoftwareComponent(function);
			if (result == null)
				result = caseComponent(function);
			if (result == null)
				result = caseNamedElement(function);
			if (result == null)
				result = caseParameterizableElement(function);
			if (result == null)
				result = caseDelayableElement(function);
			if (result == null)
				result = caseDocumentableElement(function);
			if (result == null)
				result = caseElement(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.EXTERNAL_DEPENDENCY: {
			ExternalDependency externalDependency = (ExternalDependency) theEObject;
			T result = caseExternalDependency(externalDependency);
			if (result == null)
				result = caseSoftwareComponent(externalDependency);
			if (result == null)
				result = caseComponent(externalDependency);
			if (result == null)
				result = caseNamedElement(externalDependency);
			if (result == null)
				result = caseParameterizableElement(externalDependency);
			if (result == null)
				result = caseDelayableElement(externalDependency);
			if (result == null)
				result = caseDocumentableElement(externalDependency);
			if (result == null)
				result = caseElement(externalDependency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.PACKAGE: {
			abcd.xy.metamodel.abcd.Package package_ = (abcd.xy.metamodel.abcd.Package) theEObject;
			T result = casePackage(package_);
			if (result == null)
				result = caseNamedElement(package_);
			if (result == null)
				result = caseParameterizableElement(package_);
			if (result == null)
				result = caseDocumentableElement(package_);
			if (result == null)
				result = caseElement(package_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = caseNamedElement(model);
			if (result == null)
				result = caseParameterizableElement(model);
			if (result == null)
				result = caseDocumentableElement(model);
			if (result == null)
				result = caseElement(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.ACTOR: {
			Actor actor = (Actor) theEObject;
			T result = caseActor(actor);
			if (result == null)
				result = caseNamedElement(actor);
			if (result == null)
				result = caseDocumentableElement(actor);
			if (result == null)
				result = caseElement(actor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.HUMAN: {
			Human human = (Human) theEObject;
			T result = caseHuman(human);
			if (result == null)
				result = caseActor(human);
			if (result == null)
				result = caseNamedElement(human);
			if (result == null)
				result = caseDocumentableElement(human);
			if (result == null)
				result = caseElement(human);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.ROBOT: {
			Robot robot = (Robot) theEObject;
			T result = caseRobot(robot);
			if (result == null)
				result = caseActor(robot);
			if (result == null)
				result = caseNamedElement(robot);
			if (result == null)
				result = caseDocumentableElement(robot);
			if (result == null)
				result = caseElement(robot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.SECTOR: {
			Sector sector = (Sector) theEObject;
			T result = caseSector(sector);
			if (result == null)
				result = caseNamedElement(sector);
			if (result == null)
				result = caseDocumentableElement(sector);
			if (result == null)
				result = caseElement(sector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = casePhysicalComponent(sensor);
			if (result == null)
				result = caseComponent(sensor);
			if (result == null)
				result = caseNamedElement(sensor);
			if (result == null)
				result = caseParameterizableElement(sensor);
			if (result == null)
				result = caseDelayableElement(sensor);
			if (result == null)
				result = caseDocumentableElement(sensor);
			if (result == null)
				result = caseElement(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.ACTUATOR: {
			Actuator actuator = (Actuator) theEObject;
			T result = caseActuator(actuator);
			if (result == null)
				result = casePhysicalComponent(actuator);
			if (result == null)
				result = caseComponent(actuator);
			if (result == null)
				result = caseNamedElement(actuator);
			if (result == null)
				result = caseParameterizableElement(actuator);
			if (result == null)
				result = caseDelayableElement(actuator);
			if (result == null)
				result = caseDocumentableElement(actuator);
			if (result == null)
				result = caseElement(actuator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.PIN: {
			Pin pin = (Pin) theEObject;
			T result = casePin(pin);
			if (result == null)
				result = caseDataNode(pin);
			if (result == null)
				result = caseTypedElement(pin);
			if (result == null)
				result = caseConnectableNode(pin);
			if (result == null)
				result = caseParameterizableElement(pin);
			if (result == null)
				result = caseDocumentableElement(pin);
			if (result == null)
				result = caseNamedElement(pin);
			if (result == null)
				result = caseExecutionElement(pin);
			if (result == null)
				result = caseElement(pin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.INPUT_PIN: {
			InputPin inputPin = (InputPin) theEObject;
			T result = caseInputPin(inputPin);
			if (result == null)
				result = casePin(inputPin);
			if (result == null)
				result = caseDataNode(inputPin);
			if (result == null)
				result = caseTypedElement(inputPin);
			if (result == null)
				result = caseConnectableNode(inputPin);
			if (result == null)
				result = caseParameterizableElement(inputPin);
			if (result == null)
				result = caseDocumentableElement(inputPin);
			if (result == null)
				result = caseNamedElement(inputPin);
			if (result == null)
				result = caseExecutionElement(inputPin);
			if (result == null)
				result = caseElement(inputPin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.OUTPUT_PIN: {
			OutputPin outputPin = (OutputPin) theEObject;
			T result = caseOutputPin(outputPin);
			if (result == null)
				result = casePin(outputPin);
			if (result == null)
				result = caseAssignableElement(outputPin);
			if (result == null)
				result = caseDataNode(outputPin);
			if (result == null)
				result = caseTypedElement(outputPin);
			if (result == null)
				result = caseConnectableNode(outputPin);
			if (result == null)
				result = caseParameterizableElement(outputPin);
			if (result == null)
				result = caseDocumentableElement(outputPin);
			if (result == null)
				result = caseNamedElement(outputPin);
			if (result == null)
				result = caseExecutionElement(outputPin);
			if (result == null)
				result = caseElement(outputPin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.PERSON: {
			Person person = (Person) theEObject;
			T result = casePerson(person);
			if (result == null)
				result = caseHuman(person);
			if (result == null)
				result = caseActor(person);
			if (result == null)
				result = caseNamedElement(person);
			if (result == null)
				result = caseDocumentableElement(person);
			if (result == null)
				result = caseElement(person);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.MEASUREMENT_UNIT: {
			MeasurementUnit measurementUnit = (MeasurementUnit) theEObject;
			T result = caseMeasurementUnit(measurementUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.SIMPLE_UNIT: {
			SimpleUnit simpleUnit = (SimpleUnit) theEObject;
			T result = caseSimpleUnit(simpleUnit);
			if (result == null)
				result = caseMeasurementUnit(simpleUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.DERIVED_UNIT: {
			DerivedUnit derivedUnit = (DerivedUnit) theEObject;
			T result = caseDerivedUnit(derivedUnit);
			if (result == null)
				result = caseMeasurementUnit(derivedUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.UNIT_CONVERSION: {
			UnitConversion unitConversion = (UnitConversion) theEObject;
			T result = caseUnitConversion(unitConversion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.CONVERSION_BY_PREFIX: {
			ConversionByPrefix conversionByPrefix = (ConversionByPrefix) theEObject;
			T result = caseConversionByPrefix(conversionByPrefix);
			if (result == null)
				result = caseUnitConversion(conversionByPrefix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.CONVERSION_BY_CONVENTION: {
			ConversionByConvention conversionByConvention = (ConversionByConvention) theEObject;
			T result = caseConversionByConvention(conversionByConvention);
			if (result == null)
				result = caseUnitConversion(conversionByConvention);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.UNIT_PREFIX: {
			UnitPrefix unitPrefix = (UnitPrefix) theEObject;
			T result = caseUnitPrefix(unitPrefix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.IMPORT: {
			Import import_ = (Import) theEObject;
			T result = caseImport(import_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.DATA_STORE: {
			DataStore dataStore = (DataStore) theEObject;
			T result = caseDataStore(dataStore);
			if (result == null)
				result = caseDataNode(dataStore);
			if (result == null)
				result = caseTypedElement(dataStore);
			if (result == null)
				result = caseConnectableNode(dataStore);
			if (result == null)
				result = caseParameterizableElement(dataStore);
			if (result == null)
				result = caseDocumentableElement(dataStore);
			if (result == null)
				result = caseNamedElement(dataStore);
			if (result == null)
				result = caseExecutionElement(dataStore);
			if (result == null)
				result = caseElement(dataStore);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case abcdPackage.DATA_NODE: {
			DataNode dataNode = (DataNode) theEObject;
			T result = caseDataNode(dataNode);
			if (result == null)
				result = caseTypedElement(dataNode);
			if (result == null)
				result = caseConnectableNode(dataNode);
			if (result == null)
				result = caseParameterizableElement(dataNode);
			if (result == null)
				result = caseDocumentableElement(dataNode);
			if (result == null)
				result = caseNamedElement(dataNode);
			if (result == null)
				result = caseExecutionElement(dataNode);
			if (result == null)
				result = caseElement(dataNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine Learning Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Learning Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachineLearningComponent(MachineLearningComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalConnector(PhysicalConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalComponent(PhysicalComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareComponent(SoftwareComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalConnector(LogicalConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heuristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heuristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeuristic(Heuristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDependency(ExternalDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(abcd.xy.metamodel.abcd.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHuman(Human object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobot(Robot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSector(Sector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPin(InputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPin(OutputPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurementUnit(MeasurementUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleUnit(SimpleUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedUnit(DerivedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Conversion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Conversion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitConversion(UnitConversion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion By Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion By Prefix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionByPrefix(ConversionByPrefix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion By Convention</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion By Convention</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionByConvention(ConversionByConvention object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Prefix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitPrefix(UnitPrefix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStore(DataStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataNode(DataNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Parameterizable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterizable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizableElement(ParameterizableElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Documentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentableElement(DocumentableElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
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

} //abcdSwitch
