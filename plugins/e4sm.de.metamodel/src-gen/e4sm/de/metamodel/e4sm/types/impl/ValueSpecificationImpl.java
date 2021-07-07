/**
 */
package e4sm.de.metamodel.e4sm.types.impl;

import e4sm.de.metamodel.e4sm.types.LiteralInteger;
import e4sm.de.metamodel.e4sm.types.TypesFactory;
import e4sm.de.metamodel.e4sm.types.TypesPackage;
import e4sm.de.metamodel.e4sm.types.ValueSpecification;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Value
 * Specification</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ValueSpecificationImpl extends TypedElementImpl implements ValueSpecification {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.VALUE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean booleanValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int integerValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isComputable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Prints "<LiteralType>", without the trailing "Impl".
	 * Subclasses add " (value: #)" at the end
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		String name = this.getClass().getName();
		return "<" + name.substring(name.lastIndexOf('.') + 1, name.length() - 4) + ">";
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case TypesPackage.VALUE_SPECIFICATION___BOOLEAN_VALUE:
			return booleanValue();
		case TypesPackage.VALUE_SPECIFICATION___INTEGER_VALUE:
			return integerValue();
		case TypesPackage.VALUE_SPECIFICATION___IS_COMPUTABLE:
			return isComputable();
		case TypesPackage.VALUE_SPECIFICATION___TO_STRING:
			return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ValueSpecificationImpl
