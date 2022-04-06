/**
 */
package e4sm.de.metamodel.e4sm.util;

import e4sm.de.metamodel.e4sm.Actor;
import e4sm.de.metamodel.e4sm.Actuator;
import e4sm.de.metamodel.e4sm.Component;
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
import e4sm.de.metamodel.e4sm.Robot;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.SimpleUnit;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.UnitConversion;
import e4sm.de.metamodel.e4sm.UnitPrefix;
import e4sm.de.metamodel.e4sm.e4smPackage;

import e4sm.de.metamodel.e4sm.execution.ConnectableNode;
import e4sm.de.metamodel.e4sm.core.Element;
import e4sm.de.metamodel.e4sm.core.NamedElement;
import e4sm.de.metamodel.e4sm.core.ParameterizableElement;
import e4sm.de.metamodel.e4sm.core.TypedElement;
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
 * @see e4sm.de.metamodel.e4sm.e4smPackage
 * @generated
 */
public class e4smSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static e4smPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public e4smSwitch() {
		if (modelPackage == null) {
			modelPackage = e4smPackage.eINSTANCE;
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
		case e4smPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = caseNamedElement(component);
			if (result == null)
				result = caseParameterizableElement(component);
			if (result == null)
				result = caseElement(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.MACHINE_LEARNING_COMPONENT: {
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
				result = caseElement(machineLearningComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.CONNECTOR: {
			Connector connector = (Connector) theEObject;
			T result = caseConnector(connector);
			if (result == null)
				result = caseParameterizableElement(connector);
			if (result == null)
				result = caseNamedElement(connector);
			if (result == null)
				result = caseElement(connector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.PHYSICAL_CONNECTOR: {
			PhysicalConnector physicalConnector = (PhysicalConnector) theEObject;
			T result = casePhysicalConnector(physicalConnector);
			if (result == null)
				result = caseConnector(physicalConnector);
			if (result == null)
				result = caseParameterizableElement(physicalConnector);
			if (result == null)
				result = caseNamedElement(physicalConnector);
			if (result == null)
				result = caseElement(physicalConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.PHYSICAL_COMPONENT: {
			PhysicalComponent physicalComponent = (PhysicalComponent) theEObject;
			T result = casePhysicalComponent(physicalComponent);
			if (result == null)
				result = caseComponent(physicalComponent);
			if (result == null)
				result = caseNamedElement(physicalComponent);
			if (result == null)
				result = caseParameterizableElement(physicalComponent);
			if (result == null)
				result = caseElement(physicalComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.SOFTWARE_COMPONENT: {
			SoftwareComponent softwareComponent = (SoftwareComponent) theEObject;
			T result = caseSoftwareComponent(softwareComponent);
			if (result == null)
				result = caseComponent(softwareComponent);
			if (result == null)
				result = caseNamedElement(softwareComponent);
			if (result == null)
				result = caseParameterizableElement(softwareComponent);
			if (result == null)
				result = caseElement(softwareComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LOGICAL_CONNECTOR: {
			LogicalConnector logicalConnector = (LogicalConnector) theEObject;
			T result = caseLogicalConnector(logicalConnector);
			if (result == null)
				result = caseConnector(logicalConnector);
			if (result == null)
				result = caseParameterizableElement(logicalConnector);
			if (result == null)
				result = caseNamedElement(logicalConnector);
			if (result == null)
				result = caseElement(logicalConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.HEURISTIC: {
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
				result = caseElement(heuristic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.FUNCTION: {
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
				result = caseElement(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.EXTERNAL_DEPENDENCY: {
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
				result = caseElement(externalDependency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.PACKAGE: {
			e4sm.de.metamodel.e4sm.Package package_ = (e4sm.de.metamodel.e4sm.Package) theEObject;
			T result = casePackage(package_);
			if (result == null)
				result = caseNamedElement(package_);
			if (result == null)
				result = caseParameterizableElement(package_);
			if (result == null)
				result = caseElement(package_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = caseNamedElement(model);
			if (result == null)
				result = caseParameterizableElement(model);
			if (result == null)
				result = caseElement(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.ACTOR: {
			Actor actor = (Actor) theEObject;
			T result = caseActor(actor);
			if (result == null)
				result = caseNamedElement(actor);
			if (result == null)
				result = caseElement(actor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.HUMAN: {
			Human human = (Human) theEObject;
			T result = caseHuman(human);
			if (result == null)
				result = caseActor(human);
			if (result == null)
				result = caseNamedElement(human);
			if (result == null)
				result = caseElement(human);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.ROBOT: {
			Robot robot = (Robot) theEObject;
			T result = caseRobot(robot);
			if (result == null)
				result = caseActor(robot);
			if (result == null)
				result = caseNamedElement(robot);
			if (result == null)
				result = caseElement(robot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.SECTOR: {
			Sector sector = (Sector) theEObject;
			T result = caseSector(sector);
			if (result == null)
				result = caseNamedElement(sector);
			if (result == null)
				result = caseElement(sector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.SENSOR: {
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
				result = caseElement(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.ACTUATOR: {
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
				result = caseElement(actuator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.PIN: {
			Pin pin = (Pin) theEObject;
			T result = casePin(pin);
			if (result == null)
				result = caseParameterizableElement(pin);
			if (result == null)
				result = caseConnectableNode(pin);
			if (result == null)
				result = caseTypedElement(pin);
			if (result == null)
				result = caseExecution_Element(pin);
			if (result == null)
				result = caseNamedElement(pin);
			if (result == null)
				result = caseElement(pin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.INPUT_PIN: {
			InputPin inputPin = (InputPin) theEObject;
			T result = caseInputPin(inputPin);
			if (result == null)
				result = casePin(inputPin);
			if (result == null)
				result = caseParameterizableElement(inputPin);
			if (result == null)
				result = caseConnectableNode(inputPin);
			if (result == null)
				result = caseTypedElement(inputPin);
			if (result == null)
				result = caseExecution_Element(inputPin);
			if (result == null)
				result = caseNamedElement(inputPin);
			if (result == null)
				result = caseElement(inputPin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.OUTPUT_PIN: {
			OutputPin outputPin = (OutputPin) theEObject;
			T result = caseOutputPin(outputPin);
			if (result == null)
				result = casePin(outputPin);
			if (result == null)
				result = caseParameterizableElement(outputPin);
			if (result == null)
				result = caseConnectableNode(outputPin);
			if (result == null)
				result = caseTypedElement(outputPin);
			if (result == null)
				result = caseExecution_Element(outputPin);
			if (result == null)
				result = caseNamedElement(outputPin);
			if (result == null)
				result = caseElement(outputPin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.PERSON: {
			Person person = (Person) theEObject;
			T result = casePerson(person);
			if (result == null)
				result = caseHuman(person);
			if (result == null)
				result = caseActor(person);
			if (result == null)
				result = caseNamedElement(person);
			if (result == null)
				result = caseElement(person);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.MEASUREMENT_UNIT: {
			MeasurementUnit measurementUnit = (MeasurementUnit) theEObject;
			T result = caseMeasurementUnit(measurementUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.SIMPLE_UNIT: {
			SimpleUnit simpleUnit = (SimpleUnit) theEObject;
			T result = caseSimpleUnit(simpleUnit);
			if (result == null)
				result = caseMeasurementUnit(simpleUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.DERIVED_UNIT: {
			DerivedUnit derivedUnit = (DerivedUnit) theEObject;
			T result = caseDerivedUnit(derivedUnit);
			if (result == null)
				result = caseMeasurementUnit(derivedUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.UNIT_CONVERSION: {
			UnitConversion unitConversion = (UnitConversion) theEObject;
			T result = caseUnitConversion(unitConversion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.CONVERSION_BY_PREFIX: {
			ConversionByPrefix conversionByPrefix = (ConversionByPrefix) theEObject;
			T result = caseConversionByPrefix(conversionByPrefix);
			if (result == null)
				result = caseUnitConversion(conversionByPrefix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.CONVERSION_BY_CONVENTION: {
			ConversionByConvention conversionByConvention = (ConversionByConvention) theEObject;
			T result = caseConversionByConvention(conversionByConvention);
			if (result == null)
				result = caseUnitConversion(conversionByConvention);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.UNIT_PREFIX: {
			UnitPrefix unitPrefix = (UnitPrefix) theEObject;
			T result = caseUnitPrefix(unitPrefix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.IMPORT: {
			Import import_ = (Import) theEObject;
			T result = caseImport(import_);
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
	public T casePackage(e4sm.de.metamodel.e4sm.Package object) {
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
	public T caseExecution_Element(e4sm.de.metamodel.e4sm.execution.Element object) {
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

} //e4smSwitch
