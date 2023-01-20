/**
 */
package abcd.xy.metamodel.abcd.impl;

import abcd.xy.metamodel.abcd.DataStore;
import abcd.xy.metamodel.abcd.abcdPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DataStoreImpl extends DataNodeImpl implements DataStore {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return abcdPackage.Literals.DATA_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String computeName() {
		if (this.getName() != null && !this.getName().isBlank()) {
			return this.getName();
		}
		return "Unnamed data store";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case abcdPackage.DATA_STORE___COMPUTE_NAME:
			return computeName();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataStoreImpl
