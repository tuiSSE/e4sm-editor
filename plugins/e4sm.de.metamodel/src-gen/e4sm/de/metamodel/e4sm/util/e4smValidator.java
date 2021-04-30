/**
 */
package e4sm.de.metamodel.e4sm.util;

import e4sm.de.metamodel.e4sm.Actor;
import e4sm.de.metamodel.e4sm.Actuator;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.Element;
import e4sm.de.metamodel.e4sm.ExternalDependency;
import e4sm.de.metamodel.e4sm.Function;
import e4sm.de.metamodel.e4sm.Heuristic;
import e4sm.de.metamodel.e4sm.Human;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.LogicalConnector;
import e4sm.de.metamodel.e4sm.MachineLearningComponent;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.NamedElement;
import e4sm.de.metamodel.e4sm.OptionallyNamedElement;
import e4sm.de.metamodel.e4sm.OutputPin;
import e4sm.de.metamodel.e4sm.Person;
import e4sm.de.metamodel.e4sm.PhysicalComponent;
import e4sm.de.metamodel.e4sm.PhysicalConnector;
import e4sm.de.metamodel.e4sm.Pin;
import e4sm.de.metamodel.e4sm.Robot;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see e4sm.de.metamodel.e4sm.e4smPackage
 * @generated
 */
public class e4smValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final e4smValidator INSTANCE = new e4smValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "e4sm.de.metamodel.e4sm";

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public e4smValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return e4smPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case e4smPackage.COMPONENT:
			return validateComponent((Component) value, diagnostics, context);
		case e4smPackage.MACHINE_LEARNING_COMPONENT:
			return validateMachineLearningComponent((MachineLearningComponent) value, diagnostics, context);
		case e4smPackage.CONNECTOR:
			return validateConnector((Connector) value, diagnostics, context);
		case e4smPackage.PHYSICAL_CONNECTOR:
			return validatePhysicalConnector((PhysicalConnector) value, diagnostics, context);
		case e4smPackage.PHYSICAL_COMPONENT:
			return validatePhysicalComponent((PhysicalComponent) value, diagnostics, context);
		case e4smPackage.SOFTWARE_COMPONENT:
			return validateSoftwareComponent((SoftwareComponent) value, diagnostics, context);
		case e4smPackage.LOGICAL_CONNECTOR:
			return validateLogicalConnector((LogicalConnector) value, diagnostics, context);
		case e4smPackage.HEURISTIC:
			return validateHeuristic((Heuristic) value, diagnostics, context);
		case e4smPackage.FUNCTION:
			return validateFunction((Function) value, diagnostics, context);
		case e4smPackage.EXTERNAL_DEPENDENCY:
			return validateExternalDependency((ExternalDependency) value, diagnostics, context);
		case e4smPackage.PACKAGE:
			return validatePackage((e4sm.de.metamodel.e4sm.Package) value, diagnostics, context);
		case e4smPackage.MODEL:
			return validateModel((Model) value, diagnostics, context);
		case e4smPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case e4smPackage.ACTOR:
			return validateActor((Actor) value, diagnostics, context);
		case e4smPackage.HUMAN:
			return validateHuman((Human) value, diagnostics, context);
		case e4smPackage.ROBOT:
			return validateRobot((Robot) value, diagnostics, context);
		case e4smPackage.SECTOR:
			return validateSector((Sector) value, diagnostics, context);
		case e4smPackage.SENSOR:
			return validateSensor((Sensor) value, diagnostics, context);
		case e4smPackage.ACTUATOR:
			return validateActuator((Actuator) value, diagnostics, context);
		case e4smPackage.ELEMENT:
			return validateElement((Element) value, diagnostics, context);
		case e4smPackage.PIN:
			return validatePin((Pin) value, diagnostics, context);
		case e4smPackage.INPUT_PIN:
			return validateInputPin((InputPin) value, diagnostics, context);
		case e4smPackage.OUTPUT_PIN:
			return validateOutputPin((OutputPin) value, diagnostics, context);
		case e4smPackage.PERSON:
			return validatePerson((Person) value, diagnostics, context);
		case e4smPackage.OPTIONALLY_NAMED_ELEMENT:
			return validateOptionallyNamedElement((OptionallyNamedElement) value, diagnostics, context);
		case e4smPackage.CONNECTIONSPEED:
			return validateConnectionspeed(value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachineLearningComponent(MachineLearningComponent machineLearningComponent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(machineLearningComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnector_ConnectorC1(connector, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConnectorC1 constraint of '<em>Connector</em>'. <!--
	 * begin-user-doc --> C1: A connector shall not connect two pins of the same
	 * component directly (loop/short circuit) <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateConnector_ConnectorC1(Connector connector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		Pin source = connector.getSource();
		Pin target = connector.getTarget();
		Component sourceComponent = (Component) source.eContainer();
		Component targetComponent = (Component) target.eContainer();
		if (sourceComponent != null && sourceComponent.equals(targetComponent)) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] {
								"C1: A connector shall not connect two pins of the same component directly (loop/short circuit)",
								getObjectLabel(connector, context) },
						new Object[] { connector }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalConnector(PhysicalConnector physicalConnector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(physicalConnector, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(physicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(physicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(physicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(physicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(physicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(physicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(physicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(physicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnector_ConnectorC1(physicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePhysicalConnector_PhysicalConnectorC1(physicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePhysicalConnector_PhysicalConnectorC2(physicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePhysicalConnector_PhysicalConnectorC3(physicalConnector, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PhysicalConnectorC1 constraint of '<em>Physical
	 * Connector</em>'. <!-- begin-user-doc --> A Physical Connector shall only
	 * connect Physical Components <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validatePhysicalConnector_PhysicalConnectorC1(PhysicalConnector physicalConnector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		final Pin source = physicalConnector.getSource();
		final Pin target = physicalConnector.getTarget();
		final EObject sourceComponent = source.eContainer();
		final EObject targetComponent = target.eContainer();

		// If the source or the target are not PhysicalComponent
		if (!(sourceComponent instanceof PhysicalComponent) || !(targetComponent instanceof PhysicalComponent)) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "C1: A Physical Connector shall only connect Physical Components",
										getObjectLabel(physicalConnector, context) },
								new Object[] { physicalConnector }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the PhysicalConnectorC2 constraint of '<em>Physical
	 * Connector</em>'. <!-- begin-user-doc --> An output pin shall only be
	 * connected to an input pin. <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validatePhysicalConnector_PhysicalConnectorC2(PhysicalConnector physicalConnector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		final Pin source = physicalConnector.getSource();
		if (source instanceof OutputPin) {
			final Pin target = physicalConnector.getTarget();
			if (!(target instanceof InputPin)) {
				if (diagnostics != null) {
					diagnostics.add(
							createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
									new Object[] { "C2: An output pin shall only be connected to an input pin",
											getObjectLabel(physicalConnector, context) },
									new Object[] { physicalConnector }, context));
				}
				return false;
			}
		}
		return true;
	}

	/**
	 * Validates the PhysicalConnectorC3 constraint of '<em>Physical
	 * Connector</em>'. <!-- begin-user-doc --> An input pin shall only be connected
	 * to an output pin <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validatePhysicalConnector_PhysicalConnectorC3(PhysicalConnector physicalConnector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		final Pin source = physicalConnector.getSource();
		if (source instanceof InputPin) {
			final Pin target = physicalConnector.getTarget();
			if (!(target instanceof OutputPin)) {
				if (diagnostics != null) {
					diagnostics.add(
							createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
									new Object[] { "C3: An input pin shall only be connected to an output pin",
											getObjectLabel(physicalConnector, context) },
									new Object[] { physicalConnector }, context));
				}
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalComponent(PhysicalComponent physicalComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(physicalComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareComponent(SoftwareComponent softwareComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(softwareComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalConnector(LogicalConnector logicalConnector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(logicalConnector, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(logicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(logicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(logicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(logicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(logicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(logicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(logicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(logicalConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnector_ConnectorC1(logicalConnector, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeuristic(Heuristic heuristic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(heuristic, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(function, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDependency(ExternalDependency externalDependency, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalDependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(e4sm.de.metamodel.e4sm.Package package_, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(package_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHuman(Human human, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(human, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRobot(Robot robot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(robot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSector(Sector sector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actuator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPin(InputPin inputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputPin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPin(OutputPin outputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputPin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionallyNamedElement(OptionallyNamedElement optionallyNamedElement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optionallyNamedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionspeed(Object connectionspeed, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // e4smValidator
