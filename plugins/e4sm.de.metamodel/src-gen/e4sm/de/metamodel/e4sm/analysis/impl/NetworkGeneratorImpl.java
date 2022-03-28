/**
 */
package e4sm.de.metamodel.e4sm.analysis.impl;

import com.google.common.graph.ImmutableNetwork;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.analysis.NetworkGenerator;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NetworkGeneratorImpl extends MinimalEObjectImpl.Container implements NetworkGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.NETWORK_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmutableNetwork<Component, Connector> generateNetwork(Model m) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmutableNetwork<Component, Connector> generateNetwork(e4sm.de.metamodel.e4sm.Package p) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AnalysisPackage.NETWORK_GENERATOR___GENERATE_NETWORK__MODEL:
			return generateNetwork((Model) arguments.get(0));
		case AnalysisPackage.NETWORK_GENERATOR___GENERATE_NETWORK__PACKAGE:
			return generateNetwork((e4sm.de.metamodel.e4sm.Package) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NetworkGeneratorImpl
