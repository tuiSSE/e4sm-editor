/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The possible inputs are limited to a finite set of values
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Set#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends DataSize {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.SetValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getSet_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetValue> getValues();

} // Set
