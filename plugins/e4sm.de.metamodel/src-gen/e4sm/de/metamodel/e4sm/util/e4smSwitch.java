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
import e4sm.de.metamodel.e4sm.Element;
import e4sm.de.metamodel.e4sm.ExternalDependency;
import e4sm.de.metamodel.e4sm.Function;
import e4sm.de.metamodel.e4sm.Heuristic;
import e4sm.de.metamodel.e4sm.Human;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.LiteralBoolean;
import e4sm.de.metamodel.e4sm.LiteralByte;
import e4sm.de.metamodel.e4sm.LiteralCharacter;
import e4sm.de.metamodel.e4sm.LiteralDate;
import e4sm.de.metamodel.e4sm.LiteralDouble;
import e4sm.de.metamodel.e4sm.LiteralFloat;
import e4sm.de.metamodel.e4sm.LiteralInteger;
import e4sm.de.metamodel.e4sm.LiteralLong;
import e4sm.de.metamodel.e4sm.LiteralNull;
import e4sm.de.metamodel.e4sm.LiteralShort;
import e4sm.de.metamodel.e4sm.LiteralSpecification;
import e4sm.de.metamodel.e4sm.LiteralString;
import e4sm.de.metamodel.e4sm.LogicalConnector;
import e4sm.de.metamodel.e4sm.MachineLearningComponent;
import e4sm.de.metamodel.e4sm.MeasurementUnit;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.NamedElement;
import e4sm.de.metamodel.e4sm.OptionallyNamedElement;
import e4sm.de.metamodel.e4sm.OutputPin;
import e4sm.de.metamodel.e4sm.Parameter;
import e4sm.de.metamodel.e4sm.ParameterDefinition;
import e4sm.de.metamodel.e4sm.ParameterDefinitionLibrary;
import e4sm.de.metamodel.e4sm.ParameterizableElement;
import e4sm.de.metamodel.e4sm.Person;
import e4sm.de.metamodel.e4sm.PhysicalComponent;
import e4sm.de.metamodel.e4sm.PhysicalConnector;
import e4sm.de.metamodel.e4sm.Pin;
import e4sm.de.metamodel.e4sm.Robot;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.SimpleUnit;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.TypedElement;
import e4sm.de.metamodel.e4sm.UnitConversion;
import e4sm.de.metamodel.e4sm.UnitPrefix;
import e4sm.de.metamodel.e4sm.ValueSpecification;
import e4sm.de.metamodel.e4sm.Variant;
import e4sm.de.metamodel.e4sm.e4smPackage;
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
				result = caseOptionallyNamedElement(connector);
			if (result == null)
				result = caseParameterizableElement(connector);
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
				result = caseOptionallyNamedElement(physicalConnector);
			if (result == null)
				result = caseParameterizableElement(physicalConnector);
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
				result = caseOptionallyNamedElement(logicalConnector);
			if (result == null)
				result = caseParameterizableElement(logicalConnector);
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
		case e4smPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = caseElement(namedElement);
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
		case e4smPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
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
				result = caseTypedElement(pin);
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
				result = caseTypedElement(inputPin);
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
				result = caseTypedElement(outputPin);
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
		case e4smPackage.OPTIONALLY_NAMED_ELEMENT: {
			OptionallyNamedElement optionallyNamedElement = (OptionallyNamedElement) theEObject;
			T result = caseOptionallyNamedElement(optionallyNamedElement);
			if (result == null)
				result = caseElement(optionallyNamedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.PARAMETER_DEFINITION: {
			ParameterDefinition parameterDefinition = (ParameterDefinition) theEObject;
			T result = caseParameterDefinition(parameterDefinition);
			if (result == null)
				result = caseTypedElement(parameterDefinition);
			if (result == null)
				result = caseNamedElement(parameterDefinition);
			if (result == null)
				result = caseElement(parameterDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = caseElement(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.PARAMETERIZABLE_ELEMENT: {
			ParameterizableElement parameterizableElement = (ParameterizableElement) theEObject;
			T result = caseParameterizableElement(parameterizableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.PARAMETER_DEFINITION_LIBRARY: {
			ParameterDefinitionLibrary parameterDefinitionLibrary = (ParameterDefinitionLibrary) theEObject;
			T result = caseParameterDefinitionLibrary(parameterDefinitionLibrary);
			if (result == null)
				result = caseNamedElement(parameterDefinitionLibrary);
			if (result == null)
				result = caseElement(parameterDefinitionLibrary);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.VARIANT: {
			Variant variant = (Variant) theEObject;
			T result = caseVariant(variant);
			if (result == null)
				result = caseNamedElement(variant);
			if (result == null)
				result = caseElement(variant);
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
		case e4smPackage.VALUE_SPECIFICATION: {
			ValueSpecification valueSpecification = (ValueSpecification) theEObject;
			T result = caseValueSpecification(valueSpecification);
			if (result == null)
				result = caseTypedElement(valueSpecification);
			if (result == null)
				result = caseNamedElement(valueSpecification);
			if (result == null)
				result = caseElement(valueSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LITERAL_SPECIFICATION: {
			LiteralSpecification literalSpecification = (LiteralSpecification) theEObject;
			T result = caseLiteralSpecification(literalSpecification);
			if (result == null)
				result = caseValueSpecification(literalSpecification);
			if (result == null)
				result = caseTypedElement(literalSpecification);
			if (result == null)
				result = caseNamedElement(literalSpecification);
			if (result == null)
				result = caseElement(literalSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.TYPED_ELEMENT: {
			TypedElement typedElement = (TypedElement) theEObject;
			T result = caseTypedElement(typedElement);
			if (result == null)
				result = caseNamedElement(typedElement);
			if (result == null)
				result = caseElement(typedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LITERAL_NULL: {
			LiteralNull literalNull = (LiteralNull) theEObject;
			T result = caseLiteralNull(literalNull);
			if (result == null)
				result = caseLiteralSpecification(literalNull);
			if (result == null)
				result = caseValueSpecification(literalNull);
			if (result == null)
				result = caseTypedElement(literalNull);
			if (result == null)
				result = caseNamedElement(literalNull);
			if (result == null)
				result = caseElement(literalNull);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LITERAL_STRING: {
			LiteralString literalString = (LiteralString) theEObject;
			T result = caseLiteralString(literalString);
			if (result == null)
				result = caseLiteralSpecification(literalString);
			if (result == null)
				result = caseValueSpecification(literalString);
			if (result == null)
				result = caseTypedElement(literalString);
			if (result == null)
				result = caseNamedElement(literalString);
			if (result == null)
				result = caseElement(literalString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LITERAL_INTEGER: {
			LiteralInteger literalInteger = (LiteralInteger) theEObject;
			T result = caseLiteralInteger(literalInteger);
			if (result == null)
				result = caseLiteralSpecification(literalInteger);
			if (result == null)
				result = caseValueSpecification(literalInteger);
			if (result == null)
				result = caseTypedElement(literalInteger);
			if (result == null)
				result = caseNamedElement(literalInteger);
			if (result == null)
				result = caseElement(literalInteger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LITERAL_BOOLEAN: {
			LiteralBoolean literalBoolean = (LiteralBoolean) theEObject;
			T result = caseLiteralBoolean(literalBoolean);
			if (result == null)
				result = caseLiteralSpecification(literalBoolean);
			if (result == null)
				result = caseValueSpecification(literalBoolean);
			if (result == null)
				result = caseTypedElement(literalBoolean);
			if (result == null)
				result = caseNamedElement(literalBoolean);
			if (result == null)
				result = caseElement(literalBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LITERAL_FLOAT: {
			LiteralFloat literalFloat = (LiteralFloat) theEObject;
			T result = caseLiteralFloat(literalFloat);
			if (result == null)
				result = caseLiteralSpecification(literalFloat);
			if (result == null)
				result = caseValueSpecification(literalFloat);
			if (result == null)
				result = caseTypedElement(literalFloat);
			if (result == null)
				result = caseNamedElement(literalFloat);
			if (result == null)
				result = caseElement(literalFloat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LITERAL_DOUBLE: {
			LiteralDouble literalDouble = (LiteralDouble) theEObject;
			T result = caseLiteralDouble(literalDouble);
			if (result == null)
				result = caseLiteralSpecification(literalDouble);
			if (result == null)
				result = caseValueSpecification(literalDouble);
			if (result == null)
				result = caseTypedElement(literalDouble);
			if (result == null)
				result = caseNamedElement(literalDouble);
			if (result == null)
				result = caseElement(literalDouble);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LITERAL_LONG: {
			LiteralLong literalLong = (LiteralLong) theEObject;
			T result = caseLiteralLong(literalLong);
			if (result == null)
				result = caseLiteralSpecification(literalLong);
			if (result == null)
				result = caseValueSpecification(literalLong);
			if (result == null)
				result = caseTypedElement(literalLong);
			if (result == null)
				result = caseNamedElement(literalLong);
			if (result == null)
				result = caseElement(literalLong);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LITERAL_SHORT: {
			LiteralShort literalShort = (LiteralShort) theEObject;
			T result = caseLiteralShort(literalShort);
			if (result == null)
				result = caseLiteralSpecification(literalShort);
			if (result == null)
				result = caseValueSpecification(literalShort);
			if (result == null)
				result = caseTypedElement(literalShort);
			if (result == null)
				result = caseNamedElement(literalShort);
			if (result == null)
				result = caseElement(literalShort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LITERAL_BYTE: {
			LiteralByte literalByte = (LiteralByte) theEObject;
			T result = caseLiteralByte(literalByte);
			if (result == null)
				result = caseLiteralSpecification(literalByte);
			if (result == null)
				result = caseValueSpecification(literalByte);
			if (result == null)
				result = caseTypedElement(literalByte);
			if (result == null)
				result = caseNamedElement(literalByte);
			if (result == null)
				result = caseElement(literalByte);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LITERAL_CHARACTER: {
			LiteralCharacter literalCharacter = (LiteralCharacter) theEObject;
			T result = caseLiteralCharacter(literalCharacter);
			if (result == null)
				result = caseLiteralSpecification(literalCharacter);
			if (result == null)
				result = caseValueSpecification(literalCharacter);
			if (result == null)
				result = caseTypedElement(literalCharacter);
			if (result == null)
				result = caseNamedElement(literalCharacter);
			if (result == null)
				result = caseElement(literalCharacter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case e4smPackage.LITERAL_DATE: {
			LiteralDate literalDate = (LiteralDate) theEObject;
			T result = caseLiteralDate(literalDate);
			if (result == null)
				result = caseLiteralSpecification(literalDate);
			if (result == null)
				result = caseValueSpecification(literalDate);
			if (result == null)
				result = caseTypedElement(literalDate);
			if (result == null)
				result = caseNamedElement(literalDate);
			if (result == null)
				result = caseElement(literalDate);
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
	 * Returns the result of interpreting the object as an instance of '<em>Optionally Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optionally Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionallyNamedElement(OptionallyNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDefinition(ParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Definition Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Definition Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDefinitionLibrary(ParameterDefinitionLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariant(Variant object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralSpecification(LiteralSpecification object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralNull(LiteralNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralString(LiteralString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralInteger(LiteralInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralBoolean(LiteralBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralFloat(LiteralFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralDouble(LiteralDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralLong(LiteralLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralShort(LiteralShort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralByte(LiteralByte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralCharacter(LiteralCharacter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralDate(LiteralDate object) {
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
