/**
 */
package e4sm.de.metamodel.e4sm.analysis.results.util;

import e4sm.de.metamodel.e4sm.analysis.results.*;

import e4sm.de.metamodel.e4sm.types.Element;
import e4sm.de.metamodel.e4sm.types.NamedElement;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see e4sm.de.metamodel.e4sm.analysis.results.ResultsPackage
 * @generated
 */
public class ResultsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResultsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ResultsPackage.eINSTANCE;
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
	protected ResultsSwitch<Adapter> modelSwitch = new ResultsSwitch<Adapter>() {
		@Override
		public Adapter caseAnalysisResult(AnalysisResult object) {
			return createAnalysisResultAdapter();
		}

		@Override
		public Adapter caseDiagram(Diagram object) {
			return createDiagramAdapter();
		}

		@Override
		public Adapter casePlot(Plot object) {
			return createPlotAdapter();
		}

		@Override
		public Adapter caseTwoDimensionalPlot(TwoDimensionalPlot object) {
			return createTwoDimensionalPlotAdapter();
		}

		@Override
		public Adapter caseThreeDimensionalPlot(ThreeDimensionalPlot object) {
			return createThreeDimensionalPlotAdapter();
		}

		@Override
		public Adapter caseScalarValue(ScalarValue object) {
			return createScalarValueAdapter();
		}

		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseAnalysisExecution(AnalysisExecution object) {
			return createAnalysisExecutionAdapter();
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
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.results.AnalysisResult <em>Analysis Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.results.AnalysisResult
	 * @generated
	 */
	public Adapter createAnalysisResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.results.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.results.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.results.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.results.Plot
	 * @generated
	 */
	public Adapter createPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.results.TwoDimensionalPlot <em>Two Dimensional Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.results.TwoDimensionalPlot
	 * @generated
	 */
	public Adapter createTwoDimensionalPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.results.ThreeDimensionalPlot <em>Three Dimensional Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.results.ThreeDimensionalPlot
	 * @generated
	 */
	public Adapter createThreeDimensionalPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.results.ScalarValue <em>Scalar Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.results.ScalarValue
	 * @generated
	 */
	public Adapter createScalarValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.results.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.results.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution <em>Analysis Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution
	 * @generated
	 */
	public Adapter createAnalysisExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.types.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.types.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link e4sm.de.metamodel.e4sm.types.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see e4sm.de.metamodel.e4sm.types.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
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

} //ResultsAdapterFactory
