/**
 */
package abcd.xy.metamodel.abcd.guava.util;

import com.google.common.graph.AbstractGraph;
import com.google.common.graph.AbstractNetwork;
import com.google.common.graph.Graph;
import com.google.common.graph.ImmutableGraph;
import com.google.common.graph.ImmutableNetwork;
import com.google.common.graph.MutableGraph;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.Network;
import com.google.common.graph.PredecessorsFunction;
import com.google.common.graph.SuccessorsFunction;

import abcd.xy.metamodel.abcd.guava.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see abcd.xy.metamodel.abcd.guava.GuavaPackage
 * @generated
 */
public class GuavaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GuavaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuavaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GuavaPackage.eINSTANCE;
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
	protected GuavaSwitch<Adapter> modelSwitch = new GuavaSwitch<Adapter>() {
		@Override
		public <N> Adapter caseGraph(Graph<N> object) {
			return createGraphAdapter();
		}

		@Override
		public <N> Adapter caseAbstractGraph(AbstractGraph<N> object) {
			return createAbstractGraphAdapter();
		}

		@Override
		public <N> Adapter caseImmutableGraph(ImmutableGraph<N> object) {
			return createImmutableGraphAdapter();
		}

		@Override
		public <N> Adapter caseMutableGraph(MutableGraph<N> object) {
			return createMutableGraphAdapter();
		}

		@Override
		public <N> Adapter casePredecessorsFunction(PredecessorsFunction<N> object) {
			return createPredecessorsFunctionAdapter();
		}

		@Override
		public <N, E> Adapter caseNetwork(Network<N, E> object) {
			return createNetworkAdapter();
		}

		@Override
		public <N, E> Adapter caseMutableNetwork(MutableNetwork<N, E> object) {
			return createMutableNetworkAdapter();
		}

		@Override
		public <N, E> Adapter caseAbstractNetwork(AbstractNetwork<N, E> object) {
			return createAbstractNetworkAdapter();
		}

		@Override
		public <N, E> Adapter caseImmutableNetwork(ImmutableNetwork<N, E> object) {
			return createImmutableNetworkAdapter();
		}

		@Override
		public <N> Adapter caseSuccessorsFunction(SuccessorsFunction<N> object) {
			return createSuccessorsFunctionAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.google.common.graph.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.common.graph.Graph
	 * @generated
	 */
	public Adapter createGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.common.graph.AbstractGraph <em>Abstract Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.common.graph.AbstractGraph
	 * @generated
	 */
	public Adapter createAbstractGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.common.graph.ImmutableGraph <em>Immutable Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.common.graph.ImmutableGraph
	 * @generated
	 */
	public Adapter createImmutableGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.common.graph.MutableGraph <em>Mutable Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.common.graph.MutableGraph
	 * @generated
	 */
	public Adapter createMutableGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.common.graph.PredecessorsFunction <em>Predecessors Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.common.graph.PredecessorsFunction
	 * @generated
	 */
	public Adapter createPredecessorsFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.common.graph.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.common.graph.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.common.graph.MutableNetwork <em>Mutable Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.common.graph.MutableNetwork
	 * @generated
	 */
	public Adapter createMutableNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.common.graph.AbstractNetwork <em>Abstract Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.common.graph.AbstractNetwork
	 * @generated
	 */
	public Adapter createAbstractNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.common.graph.ImmutableNetwork <em>Immutable Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.common.graph.ImmutableNetwork
	 * @generated
	 */
	public Adapter createImmutableNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.common.graph.SuccessorsFunction <em>Successors Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.common.graph.SuccessorsFunction
	 * @generated
	 */
	public Adapter createSuccessorsFunctionAdapter() {
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

} //GuavaAdapterFactory
