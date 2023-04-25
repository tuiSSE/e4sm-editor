/**
 */
package e4sm.de.metamodel.e4sm.analysis.util;

import e4sm.de.metamodel.e4sm.analysis.*;

import e4sm.de.metamodel.e4sm.core.Element;
import e4sm.de.metamodel.e4sm.core.NamedElement;
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
 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisPackage
 * @generated
 */
public class AnalysisSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnalysisPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisSwitch() {
		if (modelPackage == null) {
			modelPackage = AnalysisPackage.eINSTANCE;
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
		case AnalysisPackage.ANALYSIS: {
			Analysis analysis = (Analysis) theEObject;
			T result = caseAnalysis(analysis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AnalysisPackage.ANALYSIS_MANAGER: {
			AnalysisManager analysisManager = (AnalysisManager) theEObject;
			T result = caseAnalysisManager(analysisManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AnalysisPackage.ANALYSIS_DEFINITION: {
			AnalysisDefinition analysisDefinition = (AnalysisDefinition) theEObject;
			T result = caseAnalysisDefinition(analysisDefinition);
			if (result == null)
				result = caseNamedElement(analysisDefinition);
			if (result == null)
				result = caseElement(analysisDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AnalysisPackage.PARAMETER_DEFINITION: {
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
		case AnalysisPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = caseTypedElement(parameter);
			if (result == null)
				result = caseNamedElement(parameter);
			if (result == null)
				result = caseElement(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AnalysisPackage.MODEL_ANALYSIS: {
			ModelAnalysis modelAnalysis = (ModelAnalysis) theEObject;
			T result = caseModelAnalysis(modelAnalysis);
			if (result == null)
				result = caseAnalysis(modelAnalysis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AnalysisPackage.GRAPH_ANALYSIS: {
			GraphAnalysis<?> graphAnalysis = (GraphAnalysis<?>) theEObject;
			T result = caseGraphAnalysis(graphAnalysis);
			if (result == null)
				result = caseAnalysis(graphAnalysis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AnalysisPackage.MEMORY_LESS_GRAPH_ANALYSIS: {
			MemoryLessGraphAnalysis<?> memoryLessGraphAnalysis = (MemoryLessGraphAnalysis<?>) theEObject;
			T result = caseMemoryLessGraphAnalysis(memoryLessGraphAnalysis);
			if (result == null)
				result = caseGraphAnalysis(memoryLessGraphAnalysis);
			if (result == null)
				result = caseAnalysis(memoryLessGraphAnalysis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AnalysisPackage.ENTIRE_GRAPH_ANALYSIS: {
			EntireGraphAnalysis<?> entireGraphAnalysis = (EntireGraphAnalysis<?>) theEObject;
			T result = caseEntireGraphAnalysis(entireGraphAnalysis);
			if (result == null)
				result = caseGraphAnalysis(entireGraphAnalysis);
			if (result == null)
				result = caseAnalysis(entireGraphAnalysis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AnalysisPackage.PACKAGE_ANALYSIS: {
			PackageAnalysis packageAnalysis = (PackageAnalysis) theEObject;
			T result = casePackageAnalysis(packageAnalysis);
			if (result == null)
				result = caseAnalysis(packageAnalysis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AnalysisPackage.PREVIOUS_NODE_GRAPH_ANALYSIS: {
			PreviousNodeGraphAnalysis<?> previousNodeGraphAnalysis = (PreviousNodeGraphAnalysis<?>) theEObject;
			T result = casePreviousNodeGraphAnalysis(previousNodeGraphAnalysis);
			if (result == null)
				result = caseGraphAnalysis(previousNodeGraphAnalysis);
			if (result == null)
				result = caseAnalysis(previousNodeGraphAnalysis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AnalysisPackage.NETWORK_GENERATOR: {
			NetworkGenerator networkGenerator = (NetworkGenerator) theEObject;
			T result = caseNetworkGenerator(networkGenerator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AnalysisPackage.PARAMETERIZABLE_ELEMENT: {
			ParameterizableElement parameterizableElement = (ParameterizableElement) theEObject;
			T result = caseParameterizableElement(parameterizableElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisManager(AnalysisManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisDefinition(AnalysisDefinition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysis(Analysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelAnalysis(ModelAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseGraphAnalysis(GraphAnalysis<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Less Graph Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Less Graph Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseMemoryLessGraphAnalysis(MemoryLessGraphAnalysis<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entire Graph Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entire Graph Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T caseEntireGraphAnalysis(EntireGraphAnalysis<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageAnalysis(PackageAnalysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Previous Node Graph Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Previous Node Graph Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C> T casePreviousNodeGraphAnalysis(PreviousNodeGraphAnalysis<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkGenerator(NetworkGenerator object) {
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

} //AnalysisSwitch
