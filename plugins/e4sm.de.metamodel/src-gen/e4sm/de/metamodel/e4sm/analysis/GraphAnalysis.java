/**
 */
package e4sm.de.metamodel.e4sm.analysis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.GraphAnalysis#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisPackage#getGraphAnalysis()
 * @model abstract="true"
 * @generated
 */
public interface GraphAnalysis extends Analysis {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' attribute.
	 * @see #setGraph(int)
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisPackage#getGraphAnalysis_Graph()
	 * @model dataType="e4sm.de.metamodel.e4sm.analysis.Graph" transient="true"
	 * @generated
	 */
	int getGraph();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.analysis.GraphAnalysis#getGraph <em>Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' attribute.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="e4sm.de.metamodel.e4sm.analysis.Graph"
	 * @generated
	 */
	int initGraph();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean init();

} // GraphAnalysis
