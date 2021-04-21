/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Component#getComponents <em>Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Component#getContainedBy <em>Contained By</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Component}.
	 * It is bidirectional and its opposite is '{@link e4sm.de.metamodel.e4sm.Component#getContainedBy <em>Contained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getComponent_Components()
	 * @see e4sm.de.metamodel.e4sm.Component#getContainedBy
	 * @model opposite="containedBy" containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Contained By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link e4sm.de.metamodel.e4sm.Component#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained By</em>' container reference.
	 * @see #setContainedBy(Component)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getComponent_ContainedBy()
	 * @see e4sm.de.metamodel.e4sm.Component#getComponents
	 * @model opposite="components" transient="false"
	 * @generated
	 */
	Component getContainedBy();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Component#getContainedBy <em>Contained By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained By</em>' container reference.
	 * @see #getContainedBy()
	 * @generated
	 */
	void setContainedBy(Component value);

} // Component
