/**
 */
package abcd.xy.metamodel.abcd.impl;

import abcd.xy.metamodel.abcd.Component;
import abcd.xy.metamodel.abcd.ExternalDependency;
import abcd.xy.metamodel.abcd.Person;
import abcd.xy.metamodel.abcd.abcdFactory;
import abcd.xy.metamodel.abcd.abcdPackage;

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
		return abcdPackage.Literals.EXTERNAL_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person computeMainResponsible() {
		Person p = abcdFactory.eINSTANCE.createPerson();
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
			case abcdPackage.COMPONENT___COMPUTE_MAIN_RESPONSIBLE:
				return abcdPackage.EXTERNAL_DEPENDENCY___COMPUTE_MAIN_RESPONSIBLE;
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
		case abcdPackage.EXTERNAL_DEPENDENCY___COMPUTE_MAIN_RESPONSIBLE:
			return computeMainResponsible();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExternalDependencyImpl
