/**
 */
package e4sm.de.metamodel.e4sm.analysis.impl;

import e4sm.de.metamodel.e4sm.analysis.Analysis;
import e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition;
import e4sm.de.metamodel.e4sm.analysis.AnalysisPackage;
import e4sm.de.metamodel.e4sm.analysis.ParameterDefinition;
import e4sm.de.metamodel.e4sm.core.CorePackage;
import e4sm.de.metamodel.e4sm.core.DocumentableElement;
import e4sm.de.metamodel.e4sm.core.impl.NamedElementImpl;
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
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.AnalysisDefinitionImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.AnalysisDefinitionImpl#getParameterDefinitions <em>Parameter Definitions</em>}</li>
 *   <li>{@link e4sm.de.metamodel.e4sm.analysis.impl.AnalysisDefinitionImpl#getAnalysis <em>Analysis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisDefinitionImpl extends NamedElementImpl implements AnalysisDefinition {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

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
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.ANALYSIS_DEFINITION__DOCUMENTATION,
					oldDocumentation, documentation));
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
		case AnalysisPackage.ANALYSIS_DEFINITION__DOCUMENTATION:
			return getDocumentation();
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
		case AnalysisPackage.ANALYSIS_DEFINITION__DOCUMENTATION:
			setDocumentation((String) newValue);
			return;
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
		case AnalysisPackage.ANALYSIS_DEFINITION__DOCUMENTATION:
			setDocumentation(DOCUMENTATION_EDEFAULT);
			return;
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
		case AnalysisPackage.ANALYSIS_DEFINITION__DOCUMENTATION:
			return DOCUMENTATION_EDEFAULT == null ? documentation != null
					: !DOCUMENTATION_EDEFAULT.equals(documentation);
		case AnalysisPackage.ANALYSIS_DEFINITION__PARAMETER_DEFINITIONS:
			return parameterDefinitions != null && !parameterDefinitions.isEmpty();
		case AnalysisPackage.ANALYSIS_DEFINITION__ANALYSIS:
			return analysis != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DocumentableElement.class) {
			switch (derivedFeatureID) {
			case AnalysisPackage.ANALYSIS_DEFINITION__DOCUMENTATION:
				return CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DocumentableElement.class) {
			switch (baseFeatureID) {
			case CorePackage.DOCUMENTABLE_ELEMENT__DOCUMENTATION:
				return AnalysisPackage.ANALYSIS_DEFINITION__DOCUMENTATION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //AnalysisDefinitionImpl
