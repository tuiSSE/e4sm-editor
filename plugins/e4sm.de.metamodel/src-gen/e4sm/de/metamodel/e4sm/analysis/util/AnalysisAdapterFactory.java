/**
 */
package e4sm.de.metamodel.e4sm.analysis.util;

import e4sm.de.metamodel.e4sm.analysis.*;

import e4sm.de.metamodel.e4sm.core.DocumentableElement;
import e4sm.de.metamodel.e4sm.core.Element;
import e4sm.de.metamodel.e4sm.core.NamedElement;
import e4sm.de.metamodel.e4sm.core.TypedElement;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisPackage
 * @generated
 */
public class AnalysisAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnalysisPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AnalysisPackage.eINSTANCE;
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
	protected AnalysisSwitch<Adapter> modelSwitch = new AnalysisSwitch<Adapter>() {
		@Override
		public Adapter caseAnalysis(Analysis object) {
			return createAnalysisAdapter();
		}

		@Override
		public Adapter caseAnalysisManager(AnalysisManager object) {
			return createAnalysisManagerAdapter();
		}

		@Override
		public Adapter caseAnalysisDefinition(AnalysisDefinition object) {
			return createAnalysisDefinitionAdapter();
		}

		@Override
		public Adapter caseParameterDefinition(ParameterDefinition object) {
			return createParameterDefinitionAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseModelAnalysis(ModelAnalysis object) {
			return createModelAnalysisAdapter();
		}

		@Override
		public <C> Adapter caseGraphAnalysis(GraphAnalysis<C> object) {
			return createGraphAnalysisAdapter();
		}

		@Override
		public <C> Adapter caseMemoryLessGraphAnalysis(MemoryLessGraphAnalysis<C> object) {
			return createMemoryLessGraphAnalysisAdapter();
		}

		@Override
		public <C> Adapter caseEntireGraphAnalysis(EntireGraphAnalysis<C> object) {
			return createEntireGraphAnalysisAdapter();
		}

		@Override
		public Adapter casePackageAnalysis(PackageAnalysis object) {
			return createPackageAnalysisAdapter();
		}

		@Override
		public <C> Adapter casePreviousNodeGraphAnalysis(PreviousNodeGraphAnalysis<C> object) {
			return createPreviousNodeGraphAnalysisAdapter();
		}

		@Override
		public Adapter caseNetworkGenerator(NetworkGenerator object) {
			return createNetworkGeneratorAdapter();
		}

		@Override
		public Adapter caseParameterizableElement(ParameterizableElement object) {
			return createParameterizableElementAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseDocumentableElement(DocumentableElement object) {
			return createDocumentableElementAdapter();
		}

		@Override
		public Adapter caseTypedElement(TypedElement object) {
			return createTypedElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.AnalysisManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisManager
	 * @generated
	 */
	public Adapter createAnalysisManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition
	 * @generated
	 */
	public Adapter createAnalysisDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.ParameterDefinition
	 * @generated
	 */
	public Adapter createParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.Analysis
	 * @generated
	 */
	public Adapter createAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.ModelAnalysis <em>Model Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.ModelAnalysis
	 * @generated
	 */
	public Adapter createModelAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.GraphAnalysis <em>Graph Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.GraphAnalysis
	 * @generated
	 */
	public Adapter createGraphAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.MemoryLessGraphAnalysis <em>Memory Less Graph Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.MemoryLessGraphAnalysis
	 * @generated
	 */
	public Adapter createMemoryLessGraphAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.EntireGraphAnalysis <em>Entire Graph Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.EntireGraphAnalysis
	 * @generated
	 */
	public Adapter createEntireGraphAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.PackageAnalysis <em>Package Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.PackageAnalysis
	 * @generated
	 */
	public Adapter createPackageAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.PreviousNodeGraphAnalysis <em>Previous Node Graph Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.PreviousNodeGraphAnalysis
	 * @generated
	 */
	public Adapter createPreviousNodeGraphAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.NetworkGenerator <em>Network Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.NetworkGenerator
	 * @generated
	 */
	public Adapter createNetworkGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.ParameterizableElement <em>Parameterizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.ParameterizableElement
	 * @generated
	 */
	public Adapter createParameterizableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.DocumentableElement <em>Documentable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.DocumentableElement
	 * @generated
	 */
	public Adapter createDocumentableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.core.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.core.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
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

} //AnalysisAdapterFactory
