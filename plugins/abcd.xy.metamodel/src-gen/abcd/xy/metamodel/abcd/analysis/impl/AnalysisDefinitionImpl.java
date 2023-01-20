/**
 */
package abcd.xy.metamodel.abcd.analysis.impl;

import abcd.xy.metamodel.abcd.analysis.Analysis;
import abcd.xy.metamodel.abcd.analysis.AnalysisDefinition;
import abcd.xy.metamodel.abcd.analysis.AnalysisPackage;
import abcd.xy.metamodel.abcd.analysis.ParameterDefinition;
import abcd.xy.metamodel.abcd.core.impl.NamedElementImpl;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.impl.AnalysisDefinitionImpl#getParameterDefinitions <em>Parameter Definitions</em>}</li>
 *   <li>{@link abcd.xy.metamodel.abcd.analysis.impl.AnalysisDefinitionImpl#getAnalysis <em>Analysis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisDefinitionImpl extends NamedElementImpl implements AnalysisDefinition {
	/**
	 * The cached value of the '{@link #getParameterDefinitions() <em>Parameter Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDefinition> parameterDefinitions;

	/**
	 * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysis()
	 * @generated
	 * @ordered
	 */
	protected Analysis analysis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.ANALYSIS_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterDefinition> getParameterDefinitions() {
		if (parameterDefinitions == null) {
			parameterDefinitions = new EObjectContainmentEList<ParameterDefinition>(ParameterDefinition.class, this,
					AnalysisPackage.ANALYSIS_DEFINITION__PARAMETER_DEFINITIONS);
		}
		return parameterDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Analysis getAnalysis() {
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysis(Analysis newAnalysis, NotificationChain msgs) {
		Analysis oldAnalysis = analysis;
		analysis = newAnalysis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AnalysisPackage.ANALYSIS_DEFINITION__ANALYSIS, oldAnalysis, newAnalysis);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnalysis(Analysis newAnalysis) {
		if (newAnalysis != analysis) {
			NotificationChain msgs = null;
			if (analysis != null)
				msgs = ((InternalEObject) analysis).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS_DEFINITION__ANALYSIS, null, msgs);
			if (newAnalysis != null)
				msgs = ((InternalEObject) newAnalysis).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AnalysisPackage.ANALYSIS_DEFINITION__ANALYSIS, null, msgs);
			msgs = basicSetAnalysis(newAnalysis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_DEFINITION__ANALYSIS,
					newAnalysis, newAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AnalysisPackage.ANALYSIS_DEFINITION__PARAMETER_DEFINITIONS:
			return ((InternalEList<?>) getParameterDefinitions()).basicRemove(otherEnd, msgs);
		case AnalysisPackage.ANALYSIS_DEFINITION__ANALYSIS:
			return basicSetAnalysis(null, msgs);
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
		case AnalysisPackage.ANALYSIS_DEFINITION__PARAMETER_DEFINITIONS:
			return getParameterDefinitions();
		case AnalysisPackage.ANALYSIS_DEFINITION__ANALYSIS:
			return getAnalysis();
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
		case AnalysisPackage.ANALYSIS_DEFINITION__PARAMETER_DEFINITIONS:
			getParameterDefinitions().clear();
			getParameterDefinitions().addAll((Collection<? extends ParameterDefinition>) newValue);
			return;
		case AnalysisPackage.ANALYSIS_DEFINITION__ANALYSIS:
			setAnalysis((Analysis) newValue);
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
		case AnalysisPackage.ANALYSIS_DEFINITION__PARAMETER_DEFINITIONS:
			getParameterDefinitions().clear();
			return;
		case AnalysisPackage.ANALYSIS_DEFINITION__ANALYSIS:
			setAnalysis((Analysis) null);
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
		case AnalysisPackage.ANALYSIS_DEFINITION__PARAMETER_DEFINITIONS:
			return parameterDefinitions != null && !parameterDefinitions.isEmpty();
		case AnalysisPackage.ANALYSIS_DEFINITION__ANALYSIS:
			return analysis != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalysisDefinitionImpl
