/**
 */
package e4sm.de.metamodel.e4sm.analysis.results;

import e4sm.de.metamodel.e4sm.Model;

import e4sm.de.metamodel.e4sm.analysis.Analysis;

import java.time.LocalDate;
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
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution#getAnalysisResults <em>Analysis Results</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution#getStarted <em>Started</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution#getFinished <em>Finished</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution#getRunOnModel <em>Run On Model</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage#getAnalysisExecution()
 * @model
 * @generated
 */
public interface AnalysisExecution extends EObject {
	/**
	 * Returns the value of the '<em><b>Analysis Results</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.analysis.results.AnalysisResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Results</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage#getAnalysisExecution_AnalysisResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnalysisResult> getAnalysisResults();

	/**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see #setStarted(LocalDate)
	 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage#getAnalysisExecution_Started()
	 * @model dataType="e4sm.de.metamodel.e4sm.types.Date"
	 * @generated
	 */
	LocalDate getStarted();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution#getStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #getStarted()
	 * @generated
	 */
	void setStarted(LocalDate value);

	/**
	 * Returns the value of the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished</em>' attribute.
	 * @see #setFinished(LocalDateTime)
	 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage#getAnalysisExecution_Finished()
	 * @model dataType="e4sm.de.metamodel.e4sm.types.Timestamp"
	 * @generated
	 */
	LocalDateTime getFinished();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution#getFinished <em>Finished</em>}' attribute.
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
	 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage#getAnalysisExecution_Analysis()
	 * @model
	 * @generated
	 */
	Analysis getAnalysis();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution#getAnalysis <em>Analysis</em>}' reference.
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
	 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage#getAnalysisExecution_RunOnModel()
	 * @model
	 * @generated
	 */
	Model getRunOnModel();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution#getRunOnModel <em>Run On Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run On Model</em>' reference.
	 * @see #getRunOnModel()
	 * @generated
	 */
	void setRunOnModel(Model value);

} // AnalysisExecution
