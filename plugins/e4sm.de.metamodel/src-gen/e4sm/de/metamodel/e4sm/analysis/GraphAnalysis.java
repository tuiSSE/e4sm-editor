/**
 */
package e4sm.de.metamodel.e4sm.analysis;

import com.google.common.graph.Graph;

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
public interface GraphAnalysis<C> extends Analysis {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' reference.
	 * @see #setGraph(Graph)
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisPackage#getGraphAnalysis_Graph()
	 * @model type="e4sm.de.metamodel.e4sm.guava.Graph&lt;C&gt;"
	 * @generated
	 */
	Graph<C> getGraph();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.analysis.GraphAnalysis#getGraph <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph<C> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initGraph();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean init();

} // GraphAnalysis
