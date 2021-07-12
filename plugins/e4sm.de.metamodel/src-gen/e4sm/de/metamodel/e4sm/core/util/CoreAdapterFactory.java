/**
 */
package e4sm.de.metamodel.e4sm.core.util;

import e4sm.de.metamodel.e4sm.core.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreSwitch<Adapter> modelSwitch = new CoreSwitch<Adapter>() {
		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseLiteralSpecification(LiteralSpecification object) {
			return createLiteralSpecificationAdapter();
		}

		@Override
		public Adapter caseLiteralNull(LiteralNull object) {
			return createLiteralNullAdapter();
		}

		@Override
		public Adapter caseLiteralString(LiteralString object) {
			return createLiteralStringAdapter();
		}

		@Override
		public Adapter caseLiteralInteger(LiteralInteger object) {
			return createLiteralIntegerAdapter();
		}

		@Override
		public Adapter caseLiteralBoolean(LiteralBoolean object) {
			return createLiteralBooleanAdapter();
		}

		@Override
		public Adapter caseLiteralFloat(LiteralFloat object) {
			return createLiteralFloatAdapter();
		}

		@Override
		public Adapter caseLiteralDouble(LiteralDouble object) {
			return createLiteralDoubleAdapter();
		}

		@Override
		public Adapter caseLiteralLong(LiteralLong object) {
			return createLiteralLongAdapter();
		}

		@Override
		public Adapter caseLiteralShort(LiteralShort object) {
			return createLiteralShortAdapter();
		}

		@Override
		public Adapter caseLiteralByte(LiteralByte object) {
			return createLiteralByteAdapter();
		}

		@Override
		public Adapter caseLiteralCharacter(LiteralCharacter object) {
			return createLiteralCharacterAdapter();
		}

		@Override
		public Adapter caseLiteralDate(LiteralDate object) {
			return createLiteralDateAdapter();
		}

		@Override
		public Adapter caseValueSpecification(ValueSpecification object) {
			return createValueSpecificationAdapter();
		}

		@Override
		public Adapter caseTypedElement(TypedElement object) {
			return createTypedElementAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.LiteralSpecification <em>Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.LiteralSpecification
	 * @generated
	 */
	public Adapter createLiteralSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.LiteralNull <em>Literal Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.LiteralNull
	 * @generated
	 */
	public Adapter createLiteralNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.LiteralString
	 * @generated
	 */
	public Adapter createLiteralStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.LiteralInteger
	 * @generated
	 */
	public Adapter createLiteralIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.LiteralBoolean
	 * @generated
	 */
	public Adapter createLiteralBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.LiteralFloat <em>Literal Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.LiteralFloat
	 * @generated
	 */
	public Adapter createLiteralFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.LiteralDouble <em>Literal Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.LiteralDouble
	 * @generated
	 */
	public Adapter createLiteralDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.LiteralLong <em>Literal Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.LiteralLong
	 * @generated
	 */
	public Adapter createLiteralLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.LiteralShort <em>Literal Short</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.LiteralShort
	 * @generated
	 */
	public Adapter createLiteralShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.LiteralByte <em>Literal Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.LiteralByte
	 * @generated
	 */
	public Adapter createLiteralByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.LiteralCharacter <em>Literal Character</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.LiteralCharacter
	 * @generated
	 */
	public Adapter createLiteralCharacterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.LiteralDate <em>Literal Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.LiteralDate
	 * @generated
	 */
	public Adapter createLiteralDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoreAdapterFactory
