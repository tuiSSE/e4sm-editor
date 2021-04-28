/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.ExternalDependency;
import e4sm.de.metamodel.e4sm.Person;
import e4sm.de.metamodel.e4sm.e4smFactory;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExternalDependencyImpl extends SoftwareComponentImpl implements ExternalDependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.EXTERNAL_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person computeMainResponsible() {
		Person p = e4smFactory.eINSTANCE.createPerson();
		p.setName("Provider");
		p.setSurname("External");
		p.setPictureFileName("external.png");
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Component.class) {
			switch (baseOperationID) {
			case e4smPackage.COMPONENT___COMPUTE_MAIN_RESPONSIBLE:
				return e4smPackage.EXTERNAL_DEPENDENCY___COMPUTE_MAIN_RESPONSIBLE;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case e4smPackage.EXTERNAL_DEPENDENCY___COMPUTE_MAIN_RESPONSIBLE:
			return computeMainResponsible();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExternalDependencyImpl
