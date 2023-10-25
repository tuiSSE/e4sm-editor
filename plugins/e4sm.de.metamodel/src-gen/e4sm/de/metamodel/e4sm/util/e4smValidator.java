/**
 */
package e4sm.de.metamodel.e4sm.util;

import e4sm.de.metamodel.e4sm.Actor;

import e4sm.de.metamodel.e4sm.Actuator;
import e4sm.de.metamodel.e4sm.BinaryClassificationComponent;
import e4sm.de.metamodel.e4sm.BinaryConfusionMatrix;
import e4sm.de.metamodel.e4sm.ClassificationClass;
import e4sm.de.metamodel.e4sm.ClassificationClassDistribution;
import e4sm.de.metamodel.e4sm.ClassificationComponent;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.ComponentFiringStrategy;
import e4sm.de.metamodel.e4sm.ConfusionMatrix;
import e4sm.de.metamodel.e4sm.ConfusionMatrixEntry;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.ConversionByConvention;
import e4sm.de.metamodel.e4sm.ConversionByPrefix;
import e4sm.de.metamodel.e4sm.DataNode;
import e4sm.de.metamodel.e4sm.DataSize;
import e4sm.de.metamodel.e4sm.DataStore;
import e4sm.de.metamodel.e4sm.DerivedUnit;
import e4sm.de.metamodel.e4sm.DynamicRange;
import e4sm.de.metamodel.e4sm.Environment;
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
import e4sm.de.metamodel.e4sm.MulticlassClassificationComponent;
import e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix;
import e4sm.de.metamodel.e4sm.OutputPin;
import e4sm.de.metamodel.e4sm.Person;
import e4sm.de.metamodel.e4sm.PhysicalComponent;
import e4sm.de.metamodel.e4sm.PhysicalConnector;
import e4sm.de.metamodel.e4sm.Pin;
import e4sm.de.metamodel.e4sm.QueueType;
import e4sm.de.metamodel.e4sm.RaceSemantic;
import e4sm.de.metamodel.e4sm.Robot;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.SecurityThreatsImport;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.Set;
import e4sm.de.metamodel.e4sm.SetValue;
import e4sm.de.metamodel.e4sm.SimpleUnit;
import e4sm.de.metamodel.e4sm.SizeComputation;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.StaticSize;
import e4sm.de.metamodel.e4sm.TokenSpecification;
import e4sm.de.metamodel.e4sm.UnitConversion;
import e4sm.de.metamodel.e4sm.UnitPrefix;
import e4sm.de.metamodel.e4sm.Package;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Is Person Picture Path Valid' of 'Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODEL__IS_PERSON_PICTURE_PATH_VALID = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

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
		case e4smPackage.PIN:
			return validatePin((Pin) value, diagnostics, context);
		case e4smPackage.INPUT_PIN:
			return validateInputPin((InputPin) value, diagnostics, context);
		case e4smPackage.OUTPUT_PIN:
			return validateOutputPin((OutputPin) value, diagnostics, context);
		case e4smPackage.PERSON:
			return validatePerson((Person) value, diagnostics, context);
		case e4smPackage.MEASUREMENT_UNIT:
			return validateMeasurementUnit((MeasurementUnit) value, diagnostics, context);
		case e4smPackage.SIMPLE_UNIT:
			return validateSimpleUnit((SimpleUnit) value, diagnostics, context);
		case e4smPackage.DERIVED_UNIT:
			return validateDerivedUnit((DerivedUnit) value, diagnostics, context);
		case e4smPackage.UNIT_CONVERSION:
			return validateUnitConversion((UnitConversion) value, diagnostics, context);
		case e4smPackage.CONVERSION_BY_PREFIX:
			return validateConversionByPrefix((ConversionByPrefix) value, diagnostics, context);
		case e4smPackage.CONVERSION_BY_CONVENTION:
			return validateConversionByConvention((ConversionByConvention) value, diagnostics, context);
		case e4smPackage.UNIT_PREFIX:
			return validateUnitPrefix((UnitPrefix) value, diagnostics, context);
		case e4smPackage.IMPORT:
			return validateImport((Import) value, diagnostics, context);
		case e4smPackage.DATA_STORE:
			return validateDataStore((DataStore) value, diagnostics, context);
		case e4smPackage.DATA_NODE:
			return validateDataNode((DataNode) value, diagnostics, context);
		case e4smPackage.CLASSIFICATION_COMPONENT:
			return validateClassificationComponent((ClassificationComponent) value, diagnostics, context);
		case e4smPackage.ENVIRONMENT:
			return validateEnvironment((Environment) value, diagnostics, context);
		case e4smPackage.CLASSIFICATION_CLASS:
			return validateClassificationClass((ClassificationClass) value, diagnostics, context);
		case e4smPackage.CLASSIFICATION_CLASS_DISTRIBUTION:
			return validateClassificationClassDistribution((ClassificationClassDistribution) value, diagnostics,
					context);
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX:
			return validateMulticlassConfusionMatrix((MulticlassConfusionMatrix) value, diagnostics, context);
		case e4smPackage.CONFUSION_MATRIX_ENTRY:
			return validateConfusionMatrixEntry((ConfusionMatrixEntry) value, diagnostics, context);
		case e4smPackage.BINARY_CONFUSION_MATRIX:
			return validateBinaryConfusionMatrix((BinaryConfusionMatrix) value, diagnostics, context);
		case e4smPackage.BINARY_CLASSIFICATION_COMPONENT:
			return validateBinaryClassificationComponent((BinaryClassificationComponent) value, diagnostics, context);
		case e4smPackage.MULTICLASS_CLASSIFICATION_COMPONENT:
			return validateMulticlassClassificationComponent((MulticlassClassificationComponent) value, diagnostics,
					context);
		case e4smPackage.CONFUSION_MATRIX:
			return validateConfusionMatrix((ConfusionMatrix) value, diagnostics, context);
		case e4smPackage.TOKEN_SPECIFICATION:
			return validateTokenSpecification((TokenSpecification) value, diagnostics, context);
		case e4smPackage.DATA_SIZE:
			return validateDataSize((DataSize) value, diagnostics, context);
		case e4smPackage.STATIC_SIZE:
			return validateStaticSize((StaticSize) value, diagnostics, context);
		case e4smPackage.SET:
			return validateSet((Set) value, diagnostics, context);
		case e4smPackage.SET_VALUE:
			return validateSetValue((SetValue) value, diagnostics, context);
		case e4smPackage.DYNAMIC_RANGE:
			return validateDynamicRange((DynamicRange) value, diagnostics, context);
		case e4smPackage.SECURITY_THREATS_IMPORT:
			return validateSecurityThreatsImport((SecurityThreatsImport) value, diagnostics, context);
		case e4smPackage.QUEUE_TYPE:
			return validateQueueType((QueueType) value, diagnostics, context);
		case e4smPackage.RACE_SEMANTIC:
			return validateRaceSemantic((RaceSemantic) value, diagnostics, context);
		case e4smPackage.COMPONENT_FIRING_STRATEGY:
			return validateComponentFiringStrategy((ComponentFiringStrategy) value, diagnostics, context);
		case e4smPackage.SIZE_COMPUTATION:
			return validateSizeComputation((SizeComputation) value, diagnostics, context);
		case e4smPackage.CONNECTIONSPEED:
			return validateConnectionspeed(value, diagnostics, context);
		case e4smPackage.JSON:
			return validateJSON((String) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC1(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC2(component, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC3(component, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ComponentC1 constraint of '<em>Component</em>'. <!--
	 * begin-user-doc --> C1: no loops allowed between the component container
	 * (Package) and component "specifiedInPackage" <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateComponent_ComponentC1(Component component, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		final Package specifiedInPackage = component.getSpecifiedInPackage();
		if (specifiedInPackage != null) {
			EObject container = component;
			do {
				container = container.eContainer();
			} while (container != null && !(container instanceof Package));
			if (specifiedInPackage.equals(container)) {
				if (diagnostics != null) {
					diagnostics.add(
							createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
									new Object[] {
											"C1: This container can not be specified by the package who owns it.",
											getObjectLabel(component, context) },
									new Object[] { component }, context));
				}
				return false;
			}
		}
		return true;
	}

	/**
	 * Validates the ComponentC2 constraint of '<em>Component</em>'. <!--
	 * begin-user-doc --> - C2: components->size()>0, then specifiedInPackage=null -
	 * If the component contains other components, it can't be specified in a
	 * package. <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateComponent_ComponentC2(Component component, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (component.getComponents().size() > 0 && component.getSpecifiedInPackage() != null) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] {
								"C2: If the component contains other components, it can't be specified in a package",
								getObjectLabel(component, context) },
						new Object[] { component }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ComponentC3 constraint of '<em>Component</em>'. <!--
	 * begin-user-doc --> If the component has a code specification, it shall not
	 * contain other components, nor be specified by a package. <!-- end-user-doc
	 * -->
	 * 
	 * @generated NOT
	 */
	public boolean validateComponent_ComponentC3(Component component, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO remove
		// if (component.getCodeSpecification() != null &&
		// component.getCodeSpecification().length() > 0
		// && (component.getComponents().size() > 0 || component.getSpecifiedInPackage()
		// != null)) {
		// if (diagnostics != null) {
		// diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
		// "_UI_GenericConstraint_diagnostic",
		// new Object[] {
		// "C3: If the component has a text specification, it shall not contain other
		// components, nor be specified by a package",
		// getObjectLabel(component, context) },
		// new Object[] { component }, context));
		// }
		// return false;
		// }
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachineLearningComponent(MachineLearningComponent machineLearningComponent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machineLearningComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(machineLearningComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(machineLearningComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(machineLearningComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(machineLearningComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(machineLearningComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(machineLearningComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(machineLearningComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(machineLearningComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC1(machineLearningComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC2(machineLearningComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC3(machineLearningComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSoftwareComponent_SoftwareComponentC1(machineLearningComponent, diagnostics, context);
		return result;
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
		DataNode source = connector.getSource();
		DataNode target = connector.getTarget();
		if (source instanceof Pin && target instanceof Pin) {
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
		final DataNode source = physicalConnector.getSource();
		final DataNode target = physicalConnector.getTarget();
		final EObject sourceComponent = source.eContainer();
		final EObject targetComponent = target.eContainer();

		// If the source or the target are not PhysicalComponent
		if (source instanceof Pin && target instanceof Pin) {
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
		final DataNode source = physicalConnector.getSource();
		if (source instanceof OutputPin) {
			final DataNode target = physicalConnector.getTarget();
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
		final DataNode source = physicalConnector.getSource();
		if (source instanceof InputPin) {
			final DataNode target = physicalConnector.getTarget();
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
		if (!validate_NoCircularContainment(physicalComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(physicalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(physicalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(physicalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(physicalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(physicalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(physicalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(physicalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(physicalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC1(physicalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC2(physicalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC3(physicalComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoftwareComponent(SoftwareComponent softwareComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(softwareComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(softwareComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(softwareComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(softwareComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(softwareComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(softwareComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(softwareComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(softwareComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(softwareComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC1(softwareComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC2(softwareComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC3(softwareComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSoftwareComponent_SoftwareComponentC1(softwareComponent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SoftwareComponentC1 constraint of '<em>Software
	 * Component</em>'. <!-- begin-user-doc --> C1: A software component shall not
	 * be directly contained in a Sector <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateSoftwareComponent_SoftwareComponentC1(SoftwareComponent softwareComponent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		if (softwareComponent.eContainer() instanceof Sector) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "C1: A software component shall not be directly contained in a Sector",
										getObjectLabel(softwareComponent, context) },
								new Object[] { softwareComponent }, context));
			}
			return false;
		}
		return true;
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
		if (!validate_NoCircularContainment(heuristic, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(heuristic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(heuristic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(heuristic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(heuristic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(heuristic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(heuristic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(heuristic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(heuristic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC1(heuristic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC2(heuristic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC3(heuristic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSoftwareComponent_SoftwareComponentC1(heuristic, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(function, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC1(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC2(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC3(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSoftwareComponent_SoftwareComponentC1(function, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDependency(ExternalDependency externalDependency, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalDependency, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(externalDependency, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(externalDependency, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(externalDependency, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(externalDependency, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(externalDependency, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(externalDependency, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(externalDependency, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(externalDependency, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC1(externalDependency, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC2(externalDependency, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC3(externalDependency, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSoftwareComponent_SoftwareComponentC1(externalDependency, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(e4sm.de.metamodel.e4sm.Package package_, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(package_, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(package_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(package_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(package_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(package_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(package_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(package_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(package_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(package_, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePackage_PackageC1(package_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PackageC1 constraint of '<em>Package</em>'. <!-- begin-user-doc
	 * --> C1: This package is contained by another package but does not specify any
	 * component <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validatePackage_PackageC1(e4sm.de.metamodel.e4sm.Package package_, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (package_.getSpecifiesComponent() == null && package_.eContainer() instanceof Package) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] {
								"C1: This package is contained by another package but does not specify any component",
								getObjectLabel(package_, context) },
						new Object[] { package_ }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(model, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(model, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModel_isPersonPicturePathValid(model, diagnostics, context);
		return result;
	}

	/**
	 * Validates the isPersonPicturePathValid constraint of '<em>Model</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateModel_isPersonPicturePathValid(Model model, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return model.isPersonPicturePathValid(diagnostics, context);
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
		if (!validate_NoCircularContainment(sensor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC1(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC2(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC3(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSensor_SensorC1(sensor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SensorC1 constraint of '<em>Sensor</em>'. <!-- begin-user-doc
	 * --> C1: A sensor shall not have input pins <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateSensor_SensorC1(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (sensor.getPins().stream().anyMatch(p -> p instanceof InputPin)) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "C1: A sensor shall not have input pins", getObjectLabel(sensor, context) },
						new Object[] { sensor }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actuator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC1(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC2(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC3(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateActuator_ActuatorC1(actuator, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ActuatorC1 constraint of '<em>Actuator</em>'. <!--
	 * begin-user-doc --> C1: An actuator shall not have output pins <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateActuator_ActuatorC1(Actuator actuator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (actuator.getPins().stream().anyMatch(p -> p instanceof OutputPin)) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic", new Object[] {
								"C1: An actuator shall not have output pins", getObjectLabel(actuator, context) },
						new Object[] { actuator }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePin(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pin, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(pin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(pin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(pin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(pin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(pin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(pin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(pin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(pin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePin_PinC1(pin, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PinC1 constraint of '<em>Pin</em>'. <!-- begin-user-doc --> C1:
	 * pin is disconnected <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validatePin_PinC1(Pin pin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (pin.getIncomingConnectors().isEmpty() && pin.getOutgoingConnectors().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "C1: pin is disconnected", getObjectLabel(pin, context) },
								new Object[] { pin }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPin(InputPin inputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputPin, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(inputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(inputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(inputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(inputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(inputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(inputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(inputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(inputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePin_PinC1(inputPin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPin(OutputPin outputPin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outputPin, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(outputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(outputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(outputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(outputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(outputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(outputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(outputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(outputPin, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePin_PinC1(outputPin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurementUnit(MeasurementUnit measurementUnit, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurementUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleUnit(SimpleUnit simpleUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedUnit(DerivedUnit derivedUnit, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitConversion(UnitConversion unitConversion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitConversion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversionByPrefix(ConversionByPrefix conversionByPrefix, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversionByPrefix, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversionByConvention(ConversionByConvention conversionByConvention,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversionByConvention, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitPrefix(UnitPrefix unitPrefix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitPrefix, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImport(Import import_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(import_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStore(DataStore dataStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataStore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataNode(DataNode dataNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassificationComponent(ClassificationComponent classificationComponent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classificationComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(classificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(classificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(classificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(classificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(classificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(classificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(classificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(classificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC1(classificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC2(classificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC3(classificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSoftwareComponent_SoftwareComponentC1(classificationComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironment(Environment environment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(environment, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(environment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(environment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(environment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(environment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(environment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(environment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(environment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(environment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEnvironment_EnvironmentC1(environment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEnvironment_EnvironmentC2(environment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EnvironmentC1 constraint of '<em>Environment</em>'. <!--
	 * begin-user-doc --> C1: The entries of an environment specification should sum
	 * to 1.0 <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateEnvironment_EnvironmentC1(Environment environment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		double epsilon = 0.000000001d;
		double sum = environment.getClassificationClasses().stream().mapToDouble(c -> c.getProbability()).sum();
		if (Math.abs(sum - 1.0d) > epsilon) { // Sum equals 1?
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] {
								"C1: The entries of an environment specification should sum to 1.0, but equals " + sum,
								getObjectLabel(environment, context) },
						new Object[] { environment }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the EnvironmentC2 constraint of '<em>Environment</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateEnvironment_EnvironmentC2(Environment environment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		// Get the environment model
		Model m = (Model) environment.eContainer();
		AtomicBoolean validates = new AtomicBoolean(true);

		// get all sensors which generate a certain class
		List<Component> sensors = new ArrayList<Component>();
		m.getPackages().forEach(p -> {
			sensors.addAll(p.getComponents().stream()
					.filter(c -> c instanceof Sensor && ((Sensor) c).getClassificationClasses().size() > 0).toList());
		});

		// Check that all classes are matched to a sensor
		environment.getClassificationClasses().forEach(ccd -> {
			if (!ccd.isNot()) {
				AtomicBoolean classFound = new AtomicBoolean(false);
				// For each sensor
				sensors.forEach(s -> {
					// For each classification class linked in the sensor
					((Sensor) s).getClassificationClasses().forEach(sensorClass -> {
						if (ccd.getClassificationClass().equals(sensorClass)) {
							classFound.set(true);
						}
					});
				});
				if (classFound.get() == false) {
					validates.set(false);
				}
			}

		});
		if (!validates.get()) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "C2: At least one class is not assigned to any sensor.",
										getObjectLabel(environment, context) },
								new Object[] { environment }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassificationClass(ClassificationClass classificationClass, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classificationClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassificationClassDistribution(
			ClassificationClassDistribution classificationClassDistribution, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classificationClassDistribution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMulticlassConfusionMatrix(MulticlassConfusionMatrix multiclassConfusionMatrix,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiclassConfusionMatrix, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(multiclassConfusionMatrix, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(multiclassConfusionMatrix, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(multiclassConfusionMatrix, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(multiclassConfusionMatrix, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(multiclassConfusionMatrix, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(multiclassConfusionMatrix, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(multiclassConfusionMatrix, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(multiclassConfusionMatrix, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMulticlassConfusionMatrix_MulticlassConfusionMatrixC1(multiclassConfusionMatrix,
					diagnostics, context);
		return result;
	}

	/**
	 * Validates the MulticlassConfusionMatrixC1 constraint of '<em>Multiclass
	 * Confusion Matrix</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateMulticlassConfusionMatrix_MulticlassConfusionMatrixC1(
			MulticlassConfusionMatrix multiclassConfusionMatrix, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (multiclassConfusionMatrix == null || multiclassConfusionMatrix.getClasses() == null) {
			return true;
		}
		int classes = multiclassConfusionMatrix.getClasses().size();
		int expectedClasses = classes * classes;
		if (multiclassConfusionMatrix.getEntries().size() != expectedClasses) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.WARNING, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "C1: the number of entries does not match the expected value " + expectedClasses,
								getObjectLabel(multiclassConfusionMatrix, context) },
						new Object[] { multiclassConfusionMatrix }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfusionMatrix(ConfusionMatrix confusionMatrix, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confusionMatrix, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTokenSpecification(TokenSpecification tokenSpecification, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tokenSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSize(DataSize dataSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataSize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticSize(StaticSize staticSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticSize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSet(Set set, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(set, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetValue(SetValue setValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(setValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicRange(DynamicRange dynamicRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityThreatsImport(SecurityThreatsImport securityThreatsImport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityThreatsImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfusionMatrixEntry(ConfusionMatrixEntry confusionMatrixEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confusionMatrixEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryConfusionMatrix(BinaryConfusionMatrix binaryConfusionMatrix,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryConfusionMatrix, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryClassificationComponent(BinaryClassificationComponent binaryClassificationComponent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(binaryClassificationComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(binaryClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(binaryClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(binaryClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(binaryClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(binaryClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(binaryClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(binaryClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(binaryClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC1(binaryClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC2(binaryClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC3(binaryClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSoftwareComponent_SoftwareComponentC1(binaryClassificationComponent, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMulticlassClassificationComponent(
			MulticlassClassificationComponent multiclassClassificationComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiclassClassificationComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(multiclassClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(multiclassClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(multiclassClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(multiclassClassificationComponent, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(multiclassClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(multiclassClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(multiclassClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(multiclassClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC1(multiclassClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC2(multiclassClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponent_ComponentC3(multiclassClassificationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSoftwareComponent_SoftwareComponentC1(multiclassClassificationComponent, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueueType(QueueType queueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaceSemantic(RaceSemantic raceSemantic, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentFiringStrategy(ComponentFiringStrategy componentFiringStrategy,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeComputation(SizeComputation sizeComputation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJSON(String json, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
