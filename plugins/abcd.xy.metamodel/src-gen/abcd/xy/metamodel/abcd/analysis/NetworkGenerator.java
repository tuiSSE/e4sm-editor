/**
 */
package abcd.xy.metamodel.abcd.analysis;

import com.google.common.graph.ImmutableNetwork;
import abcd.xy.metamodel.abcd.Component;
import abcd.xy.metamodel.abcd.Connector;
import abcd.xy.metamodel.abcd.Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see abcd.xy.metamodel.abcd.analysis.AnalysisPackage#getNetworkGenerator()
 * @model
 * @generated
 */
public interface NetworkGenerator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="abcd.xy.metamodel.abcd.guava.ImmutableNetwork&lt;abcd.xy.metamodel.abcd.Component, abcd.xy.metamodel.abcd.Connector&gt;"
	 * @generated
	 */
	ImmutableNetwork<Component, Connector> generateNetwork(Model m);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="abcd.xy.metamodel.abcd.guava.ImmutableNetwork&lt;abcd.xy.metamodel.abcd.Component, abcd.xy.metamodel.abcd.Connector&gt;"
	 * @generated
	 */
	ImmutableNetwork<Component, Connector> generateNetwork(abcd.xy.metamodel.abcd.Package p);

} // NetworkGenerator
