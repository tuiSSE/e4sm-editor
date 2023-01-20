/**
 */
package abcd.xy.metamodel.abcd.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see abcd.xy.metamodel.abcd.core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = abcd.xy.metamodel.abcd.core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Literal Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Null</em>'.
	 * @generated
	 */
	LiteralNull createLiteralNull();

	/**
	 * Returns a new object of class '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal String</em>'.
	 * @generated
	 */
	LiteralString createLiteralString();

	/**
	 * Returns a new object of class '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Integer</em>'.
	 * @generated
	 */
	LiteralInteger createLiteralInteger();

	/**
	 * Returns a new object of class '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Boolean</em>'.
	 * @generated
	 */
	LiteralBoolean createLiteralBoolean();

	/**
	 * Returns a new object of class '<em>Literal Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Float</em>'.
	 * @generated
	 */
	LiteralFloat createLiteralFloat();

	/**
	 * Returns a new object of class '<em>Literal Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Double</em>'.
	 * @generated
	 */
	LiteralDouble createLiteralDouble();

	/**
	 * Returns a new object of class '<em>Literal Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Long</em>'.
	 * @generated
	 */
	LiteralLong createLiteralLong();

	/**
	 * Returns a new object of class '<em>Literal Short</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Short</em>'.
	 * @generated
	 */
	LiteralShort createLiteralShort();

	/**
	 * Returns a new object of class '<em>Literal Byte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Byte</em>'.
	 * @generated
	 */
	LiteralByte createLiteralByte();

	/**
	 * Returns a new object of class '<em>Literal Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Character</em>'.
	 * @generated
	 */
	LiteralCharacter createLiteralCharacter();

	/**
	 * Returns a new object of class '<em>Literal Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Date</em>'.
	 * @generated
	 */
	LiteralDate createLiteralDate();

	/**
	 * Returns a new object of class '<em>Variant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variant</em>'.
	 * @generated
	 */
	Variant createVariant();

	/**
	 * Returns a new object of class '<em>Type Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Specification</em>'.
	 * @generated
	 */
	TypeSpecification createTypeSpecification();

	/**
	 * Returns a new object of class '<em>Integer Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Attribute</em>'.
	 * @generated
	 */
	IntegerAttribute createIntegerAttribute();

	/**
	 * Returns a new object of class '<em>Double Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Attribute</em>'.
	 * @generated
	 */
	DoubleAttribute createDoubleAttribute();

	/**
	 * Returns a new object of class '<em>String Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Attribute</em>'.
	 * @generated
	 */
	StringAttribute createStringAttribute();

	/**
	 * Returns a new object of class '<em>Boolean Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Attribute</em>'.
	 * @generated
	 */
	BooleanAttribute createBooleanAttribute();

	/**
	 * Returns a new object of class '<em>Class Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Attribute</em>'.
	 * @generated
	 */
	ClassAttribute createClassAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
