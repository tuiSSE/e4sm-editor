/**
 */
package abcd.xy.metamodel.abcd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An external dependency is a function which is offered by a third party and can't be controlled.
 * <!-- end-model-doc -->
 *
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getExternalDependency()
 * @model
 * @generated
 */
public interface ExternalDependency extends SoftwareComponent {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A dummy person is returned as responsible for External Dependencies
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Person computeMainResponsible();
} // ExternalDependency
