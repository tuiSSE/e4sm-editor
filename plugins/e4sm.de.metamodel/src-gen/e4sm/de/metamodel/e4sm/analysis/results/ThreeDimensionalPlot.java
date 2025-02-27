/**
 */
package e4sm.de.metamodel.e4sm.analysis.results;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Three Dimensional Plot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.ThreeDimensionalPlot#getZLabel <em>ZLabel</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage#getThreeDimensionalPlot()
 * @model
 * @generated
 */
public interface ThreeDimensionalPlot extends TwoDimensionalPlot {
	/**
	 * Returns the value of the '<em><b>ZLabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZLabel</em>' attribute.
	 * @see #setZLabel(String)
	 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage#getThreeDimensionalPlot_ZLabel()
	 * @model
	 * @generated
	 */
	String getZLabel();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.analysis.results.ThreeDimensionalPlot#getZLabel <em>ZLabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZLabel</em>' attribute.
	 * @see #getZLabel()
	 * @generated
	 */
	void setZLabel(String value);

} // ThreeDimensionalPlot
