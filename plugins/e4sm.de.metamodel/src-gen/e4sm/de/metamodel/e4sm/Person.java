/**
 */
package e4sm.de.metamodel.e4sm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A person, which may be responsible for the realisation of a certain number of components
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.Person#getSurname <em>Surname</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Person#getDepartment <em>Department</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Person#getResponsibleForComponents <em>Responsible For Components</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.Person#getPictureFileName <em>Picture File Name</em>}</li>
 * </ul>
 *
 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends Human {
	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The surname of the person
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPerson_Surname()
	 * @model required="true"
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Person#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the department
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Department</em>' attribute.
	 * @see #setDepartment(String)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPerson_Department()
	 * @model
	 * @generated
	 */
	String getDepartment();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Person#getDepartment <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' attribute.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(String value);

	/**
	 * Returns the value of the '<em><b>Responsible For Components</b></em>' reference list.
	 * The list contents are of type {@link e4sm.de.metamodel.e4sm.Component}.
	 * It is bidirectional and its opposite is '{@link e4sm.de.metamodel.e4sm.Component#getMainResponsible <em>Main Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of elements which lay under this person's responsibility
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responsible For Components</em>' reference list.
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPerson_ResponsibleForComponents()
	 * @see e4sm.de.metamodel.e4sm.Component#getMainResponsible
	 * @model opposite="mainResponsible"
	 * @generated
	 */
	EList<Component> getResponsibleForComponents();

	/**
	 * Returns the value of the '<em><b>Picture File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The file name, including the extension of this person's picture. The folder where it is located must be specified in the model element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Picture File Name</em>' attribute.
	 * @see #setPictureFileName(String)
	 * @see e4sm.de.metamodel.e4sm.e4smPackage#getPerson_PictureFileName()
	 * @model
	 * @generated
	 */
	String getPictureFileName();

	/**
	 * Sets the value of the '{@link e4sm.de.metamodel.e4sm.Person#getPictureFileName <em>Picture File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picture File Name</em>' attribute.
	 * @see #getPictureFileName()
	 * @generated
	 */
	void setPictureFileName(String value);

} // Person
