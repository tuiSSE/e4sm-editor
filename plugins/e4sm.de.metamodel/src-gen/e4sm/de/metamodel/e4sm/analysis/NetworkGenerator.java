/**
 */
package e4sm.de.metamodel.e4sm.analysis;

import com.google.common.graph.ImmutableNetwork;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisPackage#getNetworkGenerator()
 * @model
 * @generated
 */
public interface NetworkGenerator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="e4sm.de.metamodel.e4sm.guava.ImmutableNetwork&lt;e4sm.de.metamodel.e4sm.Component, e4sm.de.metamodel.e4sm.Connector&gt;"
	 * @generated
	 */
	ImmutableNetwork<Component, Connector> generateNetwork(Model m);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="e4sm.de.metamodel.e4sm.guava.ImmutableNetwork&lt;e4sm.de.metamodel.e4sm.Component, e4sm.de.metamodel.e4sm.Connector&gt;"
	 * @generated
	 */
	ImmutableNetwork<Component, Connector> generateNetwork(e4sm.de.metamodel.e4sm.Package p);

} // NetworkGenerator
