/**
 */
package e4sm.de.metamodel.e4sm.analysis.results.util;

import e4sm.de.metamodel.e4sm.analysis.results.*;

import e4sm.de.metamodel.e4sm.types.Element;
import e4sm.de.metamodel.e4sm.types.NamedElement;
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
 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage
 * @generated
 */
public class ResultsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResultsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSwitch() {
		if (modelPackage == null) {
			modelPackage = ResultsPackage.eINSTANCE;
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
		case ResultsPackage.ANALYSIS_RESULT: {
			AnalysisResult analysisResult = (AnalysisResult) theEObject;
			T result = caseAnalysisResult(analysisResult);
			if (result == null)
				result = caseNamedElement(analysisResult);
			if (result == null)
				result = caseElement(analysisResult);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResultsPackage.DIAGRAM: {
			Diagram diagram = (Diagram) theEObject;
			T result = caseDiagram(diagram);
			if (result == null)
				result = caseAnalysisResult(diagram);
			if (result == null)
				result = caseNamedElement(diagram);
			if (result == null)
				result = caseElement(diagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResultsPackage.PLOT: {
			Plot plot = (Plot) theEObject;
			T result = casePlot(plot);
			if (result == null)
				result = caseDiagram(plot);
			if (result == null)
				result = caseAnalysisResult(plot);
			if (result == null)
				result = caseNamedElement(plot);
			if (result == null)
				result = caseElement(plot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResultsPackage.TWO_DIMENSIONAL_PLOT: {
			TwoDimensionalPlot twoDimensionalPlot = (TwoDimensionalPlot) theEObject;
			T result = caseTwoDimensionalPlot(twoDimensionalPlot);
			if (result == null)
				result = casePlot(twoDimensionalPlot);
			if (result == null)
				result = caseDiagram(twoDimensionalPlot);
			if (result == null)
				result = caseAnalysisResult(twoDimensionalPlot);
			if (result == null)
				result = caseNamedElement(twoDimensionalPlot);
			if (result == null)
				result = caseElement(twoDimensionalPlot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResultsPackage.THREE_DIMENSIONAL_PLOT: {
			ThreeDimensionalPlot threeDimensionalPlot = (ThreeDimensionalPlot) theEObject;
			T result = caseThreeDimensionalPlot(threeDimensionalPlot);
			if (result == null)
				result = caseTwoDimensionalPlot(threeDimensionalPlot);
			if (result == null)
				result = casePlot(threeDimensionalPlot);
			if (result == null)
				result = caseDiagram(threeDimensionalPlot);
			if (result == null)
				result = caseAnalysisResult(threeDimensionalPlot);
			if (result == null)
				result = caseNamedElement(threeDimensionalPlot);
			if (result == null)
				result = caseElement(threeDimensionalPlot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResultsPackage.SCALAR_VALUE: {
			ScalarValue scalarValue = (ScalarValue) theEObject;
			T result = caseScalarValue(scalarValue);
			if (result == null)
				result = caseData(scalarValue);
			if (result == null)
				result = caseAnalysisResult(scalarValue);
			if (result == null)
				result = caseNamedElement(scalarValue);
			if (result == null)
				result = caseElement(scalarValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResultsPackage.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = caseAnalysisResult(data);
			if (result == null)
				result = caseNamedElement(data);
			if (result == null)
				result = caseElement(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ResultsPackage.ANALYSIS_EXECUTION: {
			AnalysisExecution analysisExecution = (AnalysisExecution) theEObject;
			T result = caseAnalysisExecution(analysisExecution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisResult(AnalysisResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlot(Plot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two Dimensional Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two Dimensional Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoDimensionalPlot(TwoDimensionalPlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Three Dimensional Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Three Dimensional Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreeDimensionalPlot(ThreeDimensionalPlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarValue(ScalarValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisExecution(AnalysisExecution object) {
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

} //ResultsSwitch
