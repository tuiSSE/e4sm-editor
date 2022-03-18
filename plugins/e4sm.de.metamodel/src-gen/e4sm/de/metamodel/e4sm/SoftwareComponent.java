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
 *   <li>{@link e4sm.de.metamodel.e4sm.SoftwareComponent#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.SoftwareComponent#getNumberOfServers <em>Number Of Servers</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSoftwareComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SoftwareComponentC1'"
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

	/**
	 * Returns the value of the '<em><b>Synchronous</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If synchronous, the execution is blocked on the current component until it provides a result. If the component is asynchronous, the execution continues immediatly and the results are provided in other ways (e.g. written out somewhere, with an event system, with promise systems, by polling...)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronous</em>' attribute.
	 * @see #setSynchronous(boolean)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSoftwareComponent_Synchronous()
	 * @model default="true"
	 * @generated
	 */
	boolean isSynchronous();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.SoftwareComponent#isSynchronous <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronous</em>' attribute.
	 * @see #isSynchronous()
	 * @generated
	 */
	void setSynchronous(boolean value);

	/**
	 * Returns the value of the '<em><b>Number Of Servers</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of computational units. If one, the execution is syncronous. If > 1, the execution will be parallel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Servers</em>' attribute.
	 * @see #setNumberOfServers(int)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSoftwareComponent_NumberOfServers()
	 * @model default="1"
	 * @generated
	 */
	int getNumberOfServers();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.SoftwareComponent#getNumberOfServers <em>Number Of Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Servers</em>' attribute.
	 * @see #getNumberOfServers()
	 * @generated
	 */
	void setNumberOfServers(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns true if the current Software components gets executed in parallel
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isParallel();

} // SoftwareComponent
