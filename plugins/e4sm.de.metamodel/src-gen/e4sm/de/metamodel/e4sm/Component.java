/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic component, which should be used to temporally specify an element before deciding how it will be realised.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Component#getComponents <em>Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Component#getContainedBy <em>Contained By</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Component#getPins <em>Pins</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Component#getMainResponsible <em>Main Responsible</em>}</li>
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
	 * <!-- begin-model-doc -->
	 * A list of components contained by this component
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * The parent component which contains this component
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Pin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of pins (input and output pins) which are placed on the border of this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getComponent_Pins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pin> getPins();

	/**
	 * Returns the value of the '<em><b>Main Responsible</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link e4sm.de.metamodel.e4sm.Person#getResponsibleForComponents <em>Responsible For Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who is responsible for realising and/or designing this component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main Responsible</em>' reference.
	 * @see #setMainResponsible(Person)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getComponent_MainResponsible()
	 * @see e4sm.de.metamodel.e4sm.Person#getResponsibleForComponents
	 * @model opposite="responsibleForComponents"
	 * @generated
	 */
	Person getMainResponsible();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Component#getMainResponsible <em>Main Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Responsible</em>' reference.
	 * @see #getMainResponsible()
	 * @generated
	 */
	void setMainResponsible(Person value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Person computeMainResponsible();

} // Component
