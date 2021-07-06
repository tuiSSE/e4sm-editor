/**
 */
package e4sm.de.metamodel.e4sm.analysis.impl;

import e4sm.de.metamodel.e4sm.analysis.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class AnalysisFactoryImpl extends EFactoryImpl implements AnalysisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static AnalysisFactory init() {
		try {
			AnalysisFactory theAnalysisFactory = (AnalysisFactory) EPackage.Registry.INSTANCE
					.getEFactory(AnalysisPackage.eNS_URI);
			if (theAnalysisFactory != null) {
				return theAnalysisFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnalysisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public AnalysisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AnalysisPackage.ANALYSIS_MANAGER:
			return createAnalysisManager();
		case AnalysisPackage.ANALYSIS_DEFINITION:
			return createAnalysisDefinition();
		case AnalysisPackage.PARAMETER_DEFINITION:
			return createParameterDefinition();
		case AnalysisPackage.PARAMETER:
			return createParameter();
		case AnalysisPackage.MEMORY_LESS_GRAPH_ANALYSIS:
			return createMemoryLessGraphAnalysis();
		case AnalysisPackage.ENTIRE_GRAPH_ANALYSIS:
			return createEntireGraphAnalysis();
		case AnalysisPackage.PACKAGE_ANALYSIS:
			return createPackageAnalysis();
		case AnalysisPackage.PREVIOUS_NODE_GRAPH_ANALYSIS:
			return createPreviousNodeGraphAnalysis();
		case AnalysisPackage.VARIANT:
			return createVariant();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisManager createAnalysisManager() {
		AnalysisManagerImpl analysisManager = new AnalysisManagerImpl();
		return analysisManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisDefinition createAnalysisDefinition() {
		AnalysisDefinitionImpl analysisDefinition = new AnalysisDefinitionImpl();
		return analysisDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDefinition createParameterDefinition() {
		ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
		return parameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemoryLessGraphAnalysis createMemoryLessGraphAnalysis() {
		MemoryLessGraphAnalysisImpl memoryLessGraphAnalysis = new MemoryLessGraphAnalysisImpl();
		return memoryLessGraphAnalysis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntireGraphAnalysis createEntireGraphAnalysis() {
		EntireGraphAnalysisImpl entireGraphAnalysis = new EntireGraphAnalysisImpl();
		return entireGraphAnalysis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageAnalysis createPackageAnalysis() {
		PackageAnalysisImpl packageAnalysis = new PackageAnalysisImpl();
		return packageAnalysis;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreviousNodeGraphAnalysis createPreviousNodeGraphAnalysis() {
		PreviousNodeGraphAnalysisImpl previousNodeGraphAnalysis = new PreviousNodeGraphAnalysisImpl();
		return previousNodeGraphAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variant createVariant() {
		VariantImpl variant = new VariantImpl();
		return variant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisPackage getAnalysisPackage() {
		return (AnalysisPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnalysisPackage getPackage() {
		return AnalysisPackage.eINSTANCE;
	}

} // AnalysisFactoryImpl
