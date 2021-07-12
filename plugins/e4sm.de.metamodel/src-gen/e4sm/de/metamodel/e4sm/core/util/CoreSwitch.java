/**
 */
package e4sm.de.metamodel.e4sm.core.util;

import e4sm.de.metamodel.e4sm.core.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CorePackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = caseElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LITERAL_SPECIFICATION: {
			LiteralSpecification literalSpecification = (LiteralSpecification) theEObject;
			T result = caseLiteralSpecification(literalSpecification);
			if (result == null)
				result = caseValueSpecification(literalSpecification);
			if (result == null)
				result = caseTypedElement(literalSpecification);
			if (result == null)
				result = caseNamedElement(literalSpecification);
			if (result == null)
				result = caseElement(literalSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LITERAL_NULL: {
			LiteralNull literalNull = (LiteralNull) theEObject;
			T result = caseLiteralNull(literalNull);
			if (result == null)
				result = caseLiteralSpecification(literalNull);
			if (result == null)
				result = caseValueSpecification(literalNull);
			if (result == null)
				result = caseTypedElement(literalNull);
			if (result == null)
				result = caseNamedElement(literalNull);
			if (result == null)
				result = caseElement(literalNull);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LITERAL_STRING: {
			LiteralString literalString = (LiteralString) theEObject;
			T result = caseLiteralString(literalString);
			if (result == null)
				result = caseLiteralSpecification(literalString);
			if (result == null)
				result = caseValueSpecification(literalString);
			if (result == null)
				result = caseTypedElement(literalString);
			if (result == null)
				result = caseNamedElement(literalString);
			if (result == null)
				result = caseElement(literalString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LITERAL_INTEGER: {
			LiteralInteger literalInteger = (LiteralInteger) theEObject;
			T result = caseLiteralInteger(literalInteger);
			if (result == null)
				result = caseLiteralSpecification(literalInteger);
			if (result == null)
				result = caseValueSpecification(literalInteger);
			if (result == null)
				result = caseTypedElement(literalInteger);
			if (result == null)
				result = caseNamedElement(literalInteger);
			if (result == null)
				result = caseElement(literalInteger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LITERAL_BOOLEAN: {
			LiteralBoolean literalBoolean = (LiteralBoolean) theEObject;
			T result = caseLiteralBoolean(literalBoolean);
			if (result == null)
				result = caseLiteralSpecification(literalBoolean);
			if (result == null)
				result = caseValueSpecification(literalBoolean);
			if (result == null)
				result = caseTypedElement(literalBoolean);
			if (result == null)
				result = caseNamedElement(literalBoolean);
			if (result == null)
				result = caseElement(literalBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LITERAL_FLOAT: {
			LiteralFloat literalFloat = (LiteralFloat) theEObject;
			T result = caseLiteralFloat(literalFloat);
			if (result == null)
				result = caseLiteralSpecification(literalFloat);
			if (result == null)
				result = caseValueSpecification(literalFloat);
			if (result == null)
				result = caseTypedElement(literalFloat);
			if (result == null)
				result = caseNamedElement(literalFloat);
			if (result == null)
				result = caseElement(literalFloat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LITERAL_DOUBLE: {
			LiteralDouble literalDouble = (LiteralDouble) theEObject;
			T result = caseLiteralDouble(literalDouble);
			if (result == null)
				result = caseLiteralSpecification(literalDouble);
			if (result == null)
				result = caseValueSpecification(literalDouble);
			if (result == null)
				result = caseTypedElement(literalDouble);
			if (result == null)
				result = caseNamedElement(literalDouble);
			if (result == null)
				result = caseElement(literalDouble);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LITERAL_LONG: {
			LiteralLong literalLong = (LiteralLong) theEObject;
			T result = caseLiteralLong(literalLong);
			if (result == null)
				result = caseLiteralSpecification(literalLong);
			if (result == null)
				result = caseValueSpecification(literalLong);
			if (result == null)
				result = caseTypedElement(literalLong);
			if (result == null)
				result = caseNamedElement(literalLong);
			if (result == null)
				result = caseElement(literalLong);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LITERAL_SHORT: {
			LiteralShort literalShort = (LiteralShort) theEObject;
			T result = caseLiteralShort(literalShort);
			if (result == null)
				result = caseLiteralSpecification(literalShort);
			if (result == null)
				result = caseValueSpecification(literalShort);
			if (result == null)
				result = caseTypedElement(literalShort);
			if (result == null)
				result = caseNamedElement(literalShort);
			if (result == null)
				result = caseElement(literalShort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LITERAL_BYTE: {
			LiteralByte literalByte = (LiteralByte) theEObject;
			T result = caseLiteralByte(literalByte);
			if (result == null)
				result = caseLiteralSpecification(literalByte);
			if (result == null)
				result = caseValueSpecification(literalByte);
			if (result == null)
				result = caseTypedElement(literalByte);
			if (result == null)
				result = caseNamedElement(literalByte);
			if (result == null)
				result = caseElement(literalByte);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LITERAL_CHARACTER: {
			LiteralCharacter literalCharacter = (LiteralCharacter) theEObject;
			T result = caseLiteralCharacter(literalCharacter);
			if (result == null)
				result = caseLiteralSpecification(literalCharacter);
			if (result == null)
				result = caseValueSpecification(literalCharacter);
			if (result == null)
				result = caseTypedElement(literalCharacter);
			if (result == null)
				result = caseNamedElement(literalCharacter);
			if (result == null)
				result = caseElement(literalCharacter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.LITERAL_DATE: {
			LiteralDate literalDate = (LiteralDate) theEObject;
			T result = caseLiteralDate(literalDate);
			if (result == null)
				result = caseLiteralSpecification(literalDate);
			if (result == null)
				result = caseValueSpecification(literalDate);
			if (result == null)
				result = caseTypedElement(literalDate);
			if (result == null)
				result = caseNamedElement(literalDate);
			if (result == null)
				result = caseElement(literalDate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.VALUE_SPECIFICATION: {
			ValueSpecification valueSpecification = (ValueSpecification) theEObject;
			T result = caseValueSpecification(valueSpecification);
			if (result == null)
				result = caseTypedElement(valueSpecification);
			if (result == null)
				result = caseNamedElement(valueSpecification);
			if (result == null)
				result = caseElement(valueSpecification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CorePackage.TYPED_ELEMENT: {
			TypedElement typedElement = (TypedElement) theEObject;
			T result = caseTypedElement(typedElement);
			if (result == null)
				result = caseNamedElement(typedElement);
			if (result == null)
				result = caseElement(typedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralSpecification(LiteralSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralNull(LiteralNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralString(LiteralString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralInteger(LiteralInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralBoolean(LiteralBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralFloat(LiteralFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralDouble(LiteralDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralLong(LiteralLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralShort(LiteralShort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Byte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Byte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralByte(LiteralByte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Character</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Character</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralCharacter(LiteralCharacter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralDate(LiteralDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
