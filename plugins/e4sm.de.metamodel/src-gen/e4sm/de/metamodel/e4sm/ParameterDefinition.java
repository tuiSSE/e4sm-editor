/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.ParameterDefinition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.ParameterDefinition#getUnit <em>Unit</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.ParameterDefinition#getMustBeDefinedOn <em>Must Be Defined On</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.ParameterDefinition#getCanBeDefinedOn <em>Can Be Defined On</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.ParameterDefinition#getShallNotBeDefinedOn <em>Shall Not Be Defined On</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.ParameterDefinition#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameterDefinition()
 * @model
 * @generated
 */
public interface ParameterDefinition extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Parameter}.
	 * It is bidirectional and its opposite is '{@link e4sm.de.metamodel.e4sm.Parameter#getParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameterDefinition_Parameters()
	 * @see e4sm.de.metamodel.e4sm.Parameter#getParameterDefinition
	 * @model opposite="parameterDefinition"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link e4sm.de.metamodel.e4sm.UnitOfMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.UnitOfMeasurement
	 * @see #setUnit(UnitOfMeasurement)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameterDefinition_Unit()
	 * @model default="none"
	 * @generated
	 */
	UnitOfMeasurement getUnit();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.ParameterDefinition#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see e4sm.de.metamodel.e4sm.UnitOfMeasurement
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitOfMeasurement value);

	/**
	 * Returns the value of the '<em><b>Can Be Defined On</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Be Defined On</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameterDefinition_CanBeDefinedOn()
	 * @model
	 * @generated
	 */
	EList<EClass> getCanBeDefinedOn();

	/**
	 * Returns the value of the '<em><b>Shall Not Be Defined On</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shall Not Be Defined On</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameterDefinition_ShallNotBeDefinedOn()
	 * @model
	 * @generated
	 */
	EList<EClass> getShallNotBeDefinedOn();

	/**
	 * Returns the value of the '<em><b>Must Be Defined On</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Be Defined On</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameterDefinition_MustBeDefinedOn()
	 * @model
	 * @generated
	 */
	EList<EClass> getMustBeDefinedOn();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getParameterDefinition_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.ParameterDefinition#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueSpecification value);

} // ParameterDefinition
