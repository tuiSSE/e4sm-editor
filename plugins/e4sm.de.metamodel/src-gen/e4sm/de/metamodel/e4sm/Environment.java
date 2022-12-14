/**
 */
package e4sm.de.metamodel.e4sm;

import e4sm.de.metamodel.e4sm.core.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Environment#getClassificationClasses <em>Classification Classes</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getEnvironment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EnvironmentC1'"
 * @generated
 */
public interface Environment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Classification Classes</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.ClassificationClassDistribution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Classes</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getEnvironment_ClassificationClasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassificationClassDistribution> getClassificationClasses();

} // Environment
