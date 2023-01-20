/**
 */
package abcd.xy.metamodel.abcd;

import abcd.xy.metamodel.abcd.analysis.ParameterizableElement;
import abcd.xy.metamodel.abcd.core.DocumentableElement;
import abcd.xy.metamodel.abcd.core.NamedElement;
import abcd.xy.metamodel.abcd.execution.DelayableElement;
import abcd.xy.metamodel.abcd.execution.Execution;
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
 *   <li>{@link abcd.xy.metamodel.abcd.Component#getComponents <em>Components</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Component#getPins <em>Pins</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Component#getMainResponsible <em>Main Responsible</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Component#getSpecifiedInPackage <em>Specified In Package</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Component#getExecution <em>Execution</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Component#getFiringStrategy <em>Firing Strategy</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Component#getDatastores <em>Datastores</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ComponentC1 ComponentC2 ComponentC3'"
 * @generated
 */
public interface Component extends NamedElement, ParameterizableElement, DelayableElement, DocumentableElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of components contained by this component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getComponent_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.Pin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of pins (input and output pins) which are placed on the border of this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getComponent_Pins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pin> getPins();

	/**
	 * Returns the value of the '<em><b>Main Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who is responsible for realising and/or designing this component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main Responsible</em>' reference.
	 * @see #setMainResponsible(Person)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getComponent_MainResponsible()
	 * @model
	 * @generated
	 */
	Person getMainResponsible();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.Component#getMainResponsible <em>Main Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Responsible</em>' reference.
	 * @see #getMainResponsible()
	 * @generated
	 */
	void setMainResponsible(Person value);

	/**
	 * Returns the value of the '<em><b>Specified In Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link abcd.xy.metamodel.abcd.Package#getSpecifiesComponent <em>Specifies Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A component may get specified further in a package
	 * Constraints:
	 * - C1: no loops allowed (implemented in Component)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specified In Package</em>' reference.
	 * @see #setSpecifiedInPackage(abcd.xy.metamodel.abcd.Package)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getComponent_SpecifiedInPackage()
	 * @see abcd.xy.metamodel.abcd.Package#getSpecifiesComponent
	 * @model opposite="specifiesComponent"
	 * @generated
	 */
	abcd.xy.metamodel.abcd.Package getSpecifiedInPackage();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.Component#getSpecifiedInPackage <em>Specified In Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specified In Package</em>' reference.
	 * @see #getSpecifiedInPackage()
	 * @generated
	 */
	void setSpecifiedInPackage(abcd.xy.metamodel.abcd.Package value);

	/**
	 * Returns the value of the '<em><b>Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' containment reference.
	 * @see #setExecution(Execution)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getComponent_Execution()
	 * @model containment="true"
	 * @generated
	 */
	Execution getExecution();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.Component#getExecution <em>Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' containment reference.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(Execution value);

	/**
	 * Returns the value of the '<em><b>Firing Strategy</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link abcd.xy.metamodel.abcd.ComponentFiringStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firing Strategy</em>' attribute.
	 * @see abcd.xy.metamodel.abcd.ComponentFiringStrategy
	 * @see #setFiringStrategy(ComponentFiringStrategy)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getComponent_FiringStrategy()
	 * @model default="AND" required="true"
	 * @generated
	 */
	ComponentFiringStrategy getFiringStrategy();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.Component#getFiringStrategy <em>Firing Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firing Strategy</em>' attribute.
	 * @see abcd.xy.metamodel.abcd.ComponentFiringStrategy
	 * @see #getFiringStrategy()
	 * @generated
	 */
	void setFiringStrategy(ComponentFiringStrategy value);

	/**
	 * Returns the value of the '<em><b>Datastores</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.DataStore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datastores</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getComponent_Datastores()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataStore> getDatastores();

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
