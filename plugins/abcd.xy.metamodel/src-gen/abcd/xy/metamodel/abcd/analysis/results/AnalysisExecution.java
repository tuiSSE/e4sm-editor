/**
 */
package abcd.xy.metamodel.abcd.analysis.results;

import abcd.xy.metamodel.abcd.Model;

import abcd.xy.metamodel.abcd.analysis.Analysis;
import java.time.LocalDateTime;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getAnalysisResults <em>Analysis Results</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getStarted <em>Started</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getFinished <em>Finished</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getRunOnModel <em>Run On Model</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.analysis.results.ResultsPackage#getAnalysisExecution()
 * @model
 * @generated
 */
public interface AnalysisExecution extends EObject {
	/**
	 * Returns the value of the '<em><b>Analysis Results</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.analysis.results.AnalysisResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Results</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.analysis.results.ResultsPackage#getAnalysisExecution_AnalysisResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnalysisResult> getAnalysisResults();

	/**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see #setStarted(LocalDateTime)
	 * @see abcd.xy.metamodel.abcd.analysis.results.ResultsPackage#getAnalysisExecution_Started()
	 * @model dataType="abcd.xy.metamodel.abcd.core.Timestamp"
	 * @generated
	 */
	LocalDateTime getStarted();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #getStarted()
	 * @generated
	 */
	void setStarted(LocalDateTime value);

	/**
	 * Returns the value of the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished</em>' attribute.
	 * @see #setFinished(LocalDateTime)
	 * @see abcd.xy.metamodel.abcd.analysis.results.ResultsPackage#getAnalysisExecution_Finished()
	 * @model dataType="abcd.xy.metamodel.abcd.core.Timestamp"
	 * @generated
	 */
	LocalDateTime getFinished();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getFinished <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished</em>' attribute.
	 * @see #getFinished()
	 * @generated
	 */
	void setFinished(LocalDateTime value);

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' reference.
	 * @see #setAnalysis(Analysis)
	 * @see abcd.xy.metamodel.abcd.analysis.results.ResultsPackage#getAnalysisExecution_Analysis()
	 * @model
	 * @generated
	 */
	Analysis getAnalysis();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getAnalysis <em>Analysis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis</em>' reference.
	 * @see #getAnalysis()
	 * @generated
	 */
	void setAnalysis(Analysis value);

	/**
	 * Returns the value of the '<em><b>Run On Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run On Model</em>' reference.
	 * @see #setRunOnModel(Model)
	 * @see abcd.xy.metamodel.abcd.analysis.results.ResultsPackage#getAnalysisExecution_RunOnModel()
	 * @model
	 * @generated
	 */
	Model getRunOnModel();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution#getRunOnModel <em>Run On Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run On Model</em>' reference.
	 * @see #getRunOnModel()
	 * @generated
	 */
	void setRunOnModel(Model value);

} // AnalysisExecution
