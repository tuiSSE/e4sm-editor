/**
 */
package e4sm.de.metamodel.e4sm.guava.util;

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

import e4sm.de.metamodel.e4sm.guava.*;
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
 * @see e4sm.de.metamodel.e4sm.guava.GuavaPackage
 * @generated
 */
public class GuavaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GuavaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuavaSwitch() {
		if (modelPackage == null) {
			modelPackage = GuavaPackage.eINSTANCE;
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
	 * @generated NOT
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GuavaPackage.GRAPH: {
			Graph<?> graph = (Graph<?>) theEObject;
			T result = caseGraph(graph);
			if (result == null)
				result = casePredecessorsFunction(graph);
			if (result == null)
				result = caseSuccessorsFunction(graph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GuavaPackage.ABSTRACT_GRAPH: {
			AbstractGraph<?> abstractGraph = (AbstractGraph<?>) theEObject;
			T result = caseAbstractGraph(abstractGraph);
			if (result == null)
				result = (T) caseGraph(abstractGraph);
			if (result == null)
				result = casePredecessorsFunction(abstractGraph);
			if (result == null)
				result = caseSuccessorsFunction(abstractGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GuavaPackage.IMMUTABLE_GRAPH: {
			ImmutableGraph<?> immutableGraph = (ImmutableGraph<?>) theEObject;
			T result = caseImmutableGraph(immutableGraph);
			if (result == null)
				result = (T) caseAbstractGraph(immutableGraph);
			if (result == null)
				result = caseGraph(immutableGraph);
			if (result == null)
				result = casePredecessorsFunction(immutableGraph);
			if (result == null)
				result = caseSuccessorsFunction(immutableGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GuavaPackage.MUTABLE_GRAPH: {
			MutableGraph<?> mutableGraph = (MutableGraph<?>) theEObject;
			T result = caseMutableGraph(mutableGraph);
			if (result == null)
				result = (T) caseGraph(mutableGraph);
			if (result == null)
				result = casePredecessorsFunction(mutableGraph);
			if (result == null)
				result = caseSuccessorsFunction(mutableGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GuavaPackage.PREDECESSORS_FUNCTION: {
			PredecessorsFunction<?> predecessorsFunction = (PredecessorsFunction<?>) theEObject;
			T result = casePredecessorsFunction(predecessorsFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GuavaPackage.NETWORK: {
			Network<?, ?> network = (Network<?, ?>) theEObject;
			T result = caseNetwork(network);
			if (result == null)
				result = casePredecessorsFunction(network);
			if (result == null)
				result = caseSuccessorsFunction(network);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GuavaPackage.MUTABLE_NETWORK: {
			MutableNetwork<?, ?> mutableNetwork = (MutableNetwork<?, ?>) theEObject;
			T result = caseMutableNetwork(mutableNetwork);
			if (result == null)
				result = caseNetwork(mutableNetwork);
			if (result == null)
				result = casePredecessorsFunction(mutableNetwork);
			if (result == null)
				result = caseSuccessorsFunction(mutableNetwork);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GuavaPackage.ABSTRACT_NETWORK: {
			AbstractNetwork<?, ?> abstractNetwork = (AbstractNetwork<?, ?>) theEObject;
			T result = caseAbstractNetwork(abstractNetwork);
			if (result == null)
				result = caseNetwork(abstractNetwork);
			if (result == null)
				result = casePredecessorsFunction(abstractNetwork);
			if (result == null)
				result = caseSuccessorsFunction(abstractNetwork);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GuavaPackage.IMMUTABLE_NETWORK: {
			System.err.println("NOT IMPLEMENTED! - GuavaSwitch.java");
			return defaultCase(theEObject);
			//ImmutableNetwork<?, ?> immutableNetwork = (ImmutableNetwork<?, ?>) theEObject;
			//			T result = caseImmutableNetwork(immutableNetwork);
			//			if (result == null)
			//				result = caseAbstractNetwork(immutableNetwork);
			//			if (result == null)
			//				result = caseNetwork(immutableNetwork);
			//			if (result == null)
			//				result = casePredecessorsFunction(immutableNetwork);
			//			if (result == null)
			//				result = caseSuccessorsFunction(immutableNetwork);
			//			if (result == null)
			//				result = defaultCase(theEObject);
			//			return result;
		}
		case GuavaPackage.SUCCESSORS_FUNCTION: {
			SuccessorsFunction<?> successorsFunction = (SuccessorsFunction<?>) theEObject;
			T result = caseSuccessorsFunction(successorsFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <N> T caseGraph(Graph<N> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <N> T caseAbstractGraph(AbstractGraph<N> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immutable Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immutable Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <N> T caseImmutableGraph(ImmutableGraph<N> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mutable Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutable Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <N> T caseMutableGraph(MutableGraph<N> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predecessors Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predecessors Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <N> T casePredecessorsFunction(PredecessorsFunction<N> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <N, E> T caseNetwork(Network<N, E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mutable Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutable Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <N, E> T caseMutableNetwork(MutableNetwork<N, E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <N, E> T caseAbstractNetwork(AbstractNetwork<N, E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immutable Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immutable Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <N, E> T caseImmutableNetwork(ImmutableNetwork<N, E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Successors Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Successors Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <N> T caseSuccessorsFunction(SuccessorsFunction<N> object) {
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

} //GuavaSwitch
