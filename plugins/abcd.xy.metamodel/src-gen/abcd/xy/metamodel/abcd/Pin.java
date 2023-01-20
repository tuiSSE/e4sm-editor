/**
 */
package abcd.xy.metamodel.abcd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interface to and from a component
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.Pin#isGatewayPin <em>Gateway Pin</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Pin#isStream <em>Stream</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.Pin#getRaceSemantic <em>Race Semantic</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getPin()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PinC1'"
 * @generated
 */
public interface Pin extends DataNode {

	/**
	 * Returns the value of the '<em><b>Gateway Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Pin</em>' attribute.
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPin_GatewayPin()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isGatewayPin();

	/**
	 * Returns the value of the '<em><b>Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream</em>' attribute.
	 * @see #setStream(boolean)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPin_Stream()
	 * @model
	 * @generated
	 */
	boolean isStream();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.Pin#isStream <em>Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream</em>' attribute.
	 * @see #isStream()
	 * @generated
	 */
	void setStream(boolean value);

	/**
	 * Returns the value of the '<em><b>Race Semantic</b></em>' attribute.
	 * The default value is <code>"MERGE_AND_DUPLICATE"</code>.
	 * The literals are from the enumeration {@link abcd.xy.metamodel.abcd.RaceSemantic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When multiple connectors are connected to a pin, the race semantic specifies how the data gets sent forward.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Race Semantic</em>' attribute.
	 * @see abcd.xy.metamodel.abcd.RaceSemantic
	 * @see #setRaceSemantic(RaceSemantic)
	 * @see abcd.xy.metamodel.abcd.abcdPackage#getPin_RaceSemantic()
	 * @model default="MERGE_AND_DUPLICATE" unique="false"
	 * @generated
	 */
	RaceSemantic getRaceSemantic();

	/**
	 * Sets the value of the '{@link abcd.xy.metamodel.abcd.Pin#getRaceSemantic <em>Race Semantic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Race Semantic</em>' attribute.
	 * @see abcd.xy.metamodel.abcd.RaceSemantic
	 * @see #getRaceSemantic()
	 * @generated
	 */
	void setRaceSemantic(RaceSemantic value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String computeName();
} // Pin
