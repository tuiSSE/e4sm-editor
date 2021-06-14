/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Definition Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.ParameterDefinitionLibrary#getParameterDefinitions <em>Parameter Definitions</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameterDefinitionLibrary()
 * @model
 * @generated
 */
public interface ParameterDefinitionLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameter Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.ParameterDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Definitions</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameterDefinitionLibrary_ParameterDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDefinition> getParameterDefinitions();

} // ParameterDefinitionLibrary
