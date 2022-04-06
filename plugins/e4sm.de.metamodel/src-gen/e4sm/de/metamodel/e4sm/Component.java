/**
 */
package e4sm.de.metamodel.e4sm;

import e4sm.de.metamodel.e4sm.core.NamedElement;
import e4sm.de.metamodel.e4sm.core.ParameterizableElement;
import e4sm.de.metamodel.e4sm.execution.Execution;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic component, which should be used to temporally specify an element before deciding how it will be realised.
 * 
 * Constraints:
 * - C1: no loops allowed between the component container (Package) and component "specifiedInPackage"
 * - C2: components->size()>0, then specifiedInPackage=null - If the component contains other components, it can't be specified in a package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Component#getComponents <em>Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Component#getPins <em>Pins</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Component#getMainResponsible <em>Main Responsible</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Component#getSpecifiedInPackage <em>Specified In Package</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Component#getCodeSpecification <em>Code Specification</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Component#getExecution <em>Execution</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ComponentC1 ComponentC2 ComponentC3'"
 * @generated
 */
public interface Component extends NamedElement, ParameterizableElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of components contained by this component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getComponent_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

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
	 * Returns the value of the '<em><b>Specified In Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link e4sm.de.metamodel.e4sm.Package#getSpecifiesComponent <em>Specifies Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A component may get specified further in a package
	 * Constraints:
	 * - C1: no loops allowed (implemented in Component)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specified In Package</em>' reference.
	 * @see #setSpecifiedInPackage(e4sm.de.metamodel.e4sm.Package)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getComponent_SpecifiedInPackage()
	 * @see e4sm.de.metamodel.e4sm.Package#getSpecifiesComponent
	 * @model opposite="specifiesComponent"
	 * @generated
	 */
	e4sm.de.metamodel.e4sm.Package getSpecifiedInPackage();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Component#getSpecifiedInPackage <em>Specified In Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specified In Package</em>' reference.
	 * @see #getSpecifiedInPackage()
	 * @generated
	 */
	void setSpecifiedInPackage(e4sm.de.metamodel.e4sm.Package value);

	/**
	 * Returns the value of the '<em><b>Code Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Specification</em>' attribute.
	 * @see #setCodeSpecification(String)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getComponent_CodeSpecification()
	 * @model dataType="e4sm.de.metamodel.e4sm.CodeSpecification"
	 * @generated
	 */
	String getCodeSpecification();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Component#getCodeSpecification <em>Code Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Specification</em>' attribute.
	 * @see #getCodeSpecification()
	 * @generated
	 */
	void setCodeSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' containment reference.
	 * @see #setExecution(Execution)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getComponent_Execution()
	 * @model containment="true"
	 * @generated
	 */
	Execution getExecution();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Component#getExecution <em>Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' containment reference.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(Execution value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Person computeMainResponsible();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void newOperation2();

} // Component
