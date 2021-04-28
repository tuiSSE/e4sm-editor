/**
 */
package e4sm.de.metamodel.e4sm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A software component is a generic component which will be realised/is already available digitally
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.SoftwareComponent#getOutputUncertainty <em>Output Uncertainty</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSoftwareComponent()
 * @model
 * @generated
 */
public interface SoftwareComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Output Uncertainty</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Uncertainty</em>' attribute.
	 * @see #setOutputUncertainty(double)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSoftwareComponent_OutputUncertainty()
	 * @model default="0.0"
	 * @generated
	 */
	double getOutputUncertainty();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.SoftwareComponent#getOutputUncertainty <em>Output Uncertainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Uncertainty</em>' attribute.
	 * @see #getOutputUncertainty()
	 * @generated
	 */
	void setOutputUncertainty(double value);

} // SoftwareComponent
