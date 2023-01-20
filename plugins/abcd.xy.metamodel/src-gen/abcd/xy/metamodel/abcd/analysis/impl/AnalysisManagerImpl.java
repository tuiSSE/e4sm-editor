/**
 */
package abcd.xy.metamodel.abcd.analysis.impl;

import abcd.xy.metamodel.abcd.analysis.Analysis;
import abcd.xy.metamodel.abcd.analysis.AnalysisManager;
import abcd.xy.metamodel.abcd.analysis.AnalysisPackage;
import abcd.xy.metamodel.abcd.analysis.results.AnalysisExecution;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnalysisManagerImpl extends MinimalEObjectImpl.Container implements AnalysisManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.ANALYSIS_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisExecution start(EList<Analysis> a) {
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
	public boolean storeResult(AnalysisExecution res) {
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case AnalysisPackage.ANALYSIS_MANAGER___START__ELIST:
			return start((EList<Analysis>) arguments.get(0));
		case AnalysisPackage.ANALYSIS_MANAGER___STORE_RESULT__ANALYSISEXECUTION:
			return storeResult((AnalysisExecution) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnalysisManagerImpl
