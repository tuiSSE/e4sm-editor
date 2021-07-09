/**
 */
package e4sm.de.metamodel.e4sm.analysis.results.impl;

import e4sm.de.metamodel.e4sm.Model;

import e4sm.de.metamodel.e4sm.analysis.Analysis;

import e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution;
import e4sm.de.metamodel.e4sm.analysis.results.AnalysisResult;
import e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.impl.AnalysisExecutionImpl#getAnalysisResults <em>Analysis Results</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.impl.AnalysisExecutionImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.impl.AnalysisExecutionImpl#getFinished <em>Finished</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.impl.AnalysisExecutionImpl#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.results.impl.AnalysisExecutionImpl#getRunOnModel <em>Run On Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisExecutionImpl extends MinimalEObjectImpl.Container implements AnalysisExecution {
	/**
	 * The cached value of the '{@link #getAnalysisResults() <em>Analysis Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisResults()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisResult> analysisResults;

	/**
	 * The default value of the '{@link #getStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDateTime STARTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
	protected LocalDateTime started = STARTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinished()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDateTime FINISHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinished()
	 * @generated
	 * @ordered
	 */
	protected LocalDateTime finished = FINISHED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysis()
	 * @generated
	 * @ordered
	 */
	protected Analysis analysis;

	/**
	 * The cached value of the '{@link #getRunOnModel() <em>Run On Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunOnModel()
	 * @generated
	 * @ordered
	 */
	protected Model runOnModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultsPackage.Literals.ANALYSIS_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnalysisResult> getAnalysisResults() {
		if (analysisResults == null) {
			analysisResults = new EObjectContainmentEList<AnalysisResult>(AnalysisResult.class, this,
					ResultsPackage.ANALYSIS_EXECUTION__ANALYSIS_RESULTS);
		}
		return analysisResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalDateTime getStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarted(LocalDateTime newStarted) {
		LocalDateTime oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.ANALYSIS_EXECUTION__STARTED,
					oldStarted, started));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalDateTime getFinished() {
		return finished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinished(LocalDateTime newFinished) {
		LocalDateTime oldFinished = finished;
		finished = newFinished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.ANALYSIS_EXECUTION__FINISHED,
					oldFinished, finished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Analysis getAnalysis() {
		if (analysis != null && analysis.eIsProxy()) {
			InternalEObject oldAnalysis = (InternalEObject) analysis;
			analysis = (Analysis) eResolveProxy(oldAnalysis);
			if (analysis != oldAnalysis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ResultsPackage.ANALYSIS_EXECUTION__ANALYSIS, oldAnalysis, analysis));
			}
		}
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis basicGetAnalysis() {
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnalysis(Analysis newAnalysis) {
		Analysis oldAnalysis = analysis;
		analysis = newAnalysis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.ANALYSIS_EXECUTION__ANALYSIS,
					oldAnalysis, analysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getRunOnModel() {
		if (runOnModel != null && runOnModel.eIsProxy()) {
			InternalEObject oldRunOnModel = (InternalEObject) runOnModel;
			runOnModel = (Model) eResolveProxy(oldRunOnModel);
			if (runOnModel != oldRunOnModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ResultsPackage.ANALYSIS_EXECUTION__RUN_ON_MODEL, oldRunOnModel, runOnModel));
			}
		}
		return runOnModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetRunOnModel() {
		return runOnModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunOnModel(Model newRunOnModel) {
		Model oldRunOnModel = runOnModel;
		runOnModel = newRunOnModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultsPackage.ANALYSIS_EXECUTION__RUN_ON_MODEL,
					oldRunOnModel, runOnModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ResultsPackage.ANALYSIS_EXECUTION__ANALYSIS_RESULTS:
			return ((InternalEList<?>) getAnalysisResults()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ResultsPackage.ANALYSIS_EXECUTION__ANALYSIS_RESULTS:
			return getAnalysisResults();
		case ResultsPackage.ANALYSIS_EXECUTION__STARTED:
			return getStarted();
		case ResultsPackage.ANALYSIS_EXECUTION__FINISHED:
			return getFinished();
		case ResultsPackage.ANALYSIS_EXECUTION__ANALYSIS:
			if (resolve)
				return getAnalysis();
			return basicGetAnalysis();
		case ResultsPackage.ANALYSIS_EXECUTION__RUN_ON_MODEL:
			if (resolve)
				return getRunOnModel();
			return basicGetRunOnModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ResultsPackage.ANALYSIS_EXECUTION__ANALYSIS_RESULTS:
			getAnalysisResults().clear();
			getAnalysisResults().addAll((Collection<? extends AnalysisResult>) newValue);
			return;
		case ResultsPackage.ANALYSIS_EXECUTION__STARTED:
			setStarted((LocalDateTime) newValue);
			return;
		case ResultsPackage.ANALYSIS_EXECUTION__FINISHED:
			setFinished((LocalDateTime) newValue);
			return;
		case ResultsPackage.ANALYSIS_EXECUTION__ANALYSIS:
			setAnalysis((Analysis) newValue);
			return;
		case ResultsPackage.ANALYSIS_EXECUTION__RUN_ON_MODEL:
			setRunOnModel((Model) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ResultsPackage.ANALYSIS_EXECUTION__ANALYSIS_RESULTS:
			getAnalysisResults().clear();
			return;
		case ResultsPackage.ANALYSIS_EXECUTION__STARTED:
			setStarted(STARTED_EDEFAULT);
			return;
		case ResultsPackage.ANALYSIS_EXECUTION__FINISHED:
			setFinished(FINISHED_EDEFAULT);
			return;
		case ResultsPackage.ANALYSIS_EXECUTION__ANALYSIS:
			setAnalysis((Analysis) null);
			return;
		case ResultsPackage.ANALYSIS_EXECUTION__RUN_ON_MODEL:
			setRunOnModel((Model) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ResultsPackage.ANALYSIS_EXECUTION__ANALYSIS_RESULTS:
			return analysisResults != null && !analysisResults.isEmpty();
		case ResultsPackage.ANALYSIS_EXECUTION__STARTED:
			return STARTED_EDEFAULT == null ? started != null : !STARTED_EDEFAULT.equals(started);
		case ResultsPackage.ANALYSIS_EXECUTION__FINISHED:
			return FINISHED_EDEFAULT == null ? finished != null : !FINISHED_EDEFAULT.equals(finished);
		case ResultsPackage.ANALYSIS_EXECUTION__ANALYSIS:
			return analysis != null;
		case ResultsPackage.ANALYSIS_EXECUTION__RUN_ON_MODEL:
			return runOnModel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (started: ");
		result.append(started);
		result.append(", finished: ");
		result.append(finished);
		result.append(')');
		return result.toString();
	}

} //AnalysisExecutionImpl
