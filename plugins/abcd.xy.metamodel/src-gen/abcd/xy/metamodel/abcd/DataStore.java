/**
 */
package abcd.xy.metamodel.abcd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * It is a node which always keep a copy of the data it sends. Once initialised, it will always contain data.
 * When newer data gets provided, the older gets deleted.
 * <!-- end-model-doc -->
 *
 *
 * @see abcd.xy.metamodel.abcd.abcdPackage#getDataStore()
 * @model
 * @generated
 */
public interface DataStore extends DataNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String computeName();
} // DataStore
