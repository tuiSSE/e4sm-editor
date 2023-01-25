/**
 */
package e4sm.de.metamodel.e4sm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.ClassificationComponent#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getClassificationComponent()
 * @model abstract="true"
 * @generated
 */
public interface ClassificationComponent extends MachineLearningComponent {

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(Environment)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getClassificationComponent_Environment()
	 * @model
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.ClassificationComponent#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

} // ClassificationComponent
