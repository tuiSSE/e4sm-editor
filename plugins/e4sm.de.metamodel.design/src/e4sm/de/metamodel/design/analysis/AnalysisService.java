package e4sm.de.metamodel.design.analysis;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;

import e4sm.de.metamodel.design.Utils;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition;
import e4sm.de.metamodel.e4sm.analysis.AnalysisFactory;
import e4sm.de.metamodel.e4sm.analysis.Parameter;
import e4sm.de.metamodel.e4sm.analysis.results.AnalysisResult;
import e4sm.de.metamodel.e4sm.Package;
import e4sm.de.metamodel.e4sm.Sensor;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import com.google.common.graph.MutableNetwork;

import e4sm.de.metamodel.e4sm.analysis.results.AnalysisExecution;
import e4sm.de.metamodel.e4sm.analysis.results.ResultsFactory;
import e4sm.de.metamodel.e4sm.analysis.results.ScalarValue;
import e4sm.de.metamodel.e4sm.core.ValueSpecification;

public class AnalysisService {

	final String EXTENSION = ".results";

	public static final int ANALYSIS_TIME = 1;
	public static final int ANALYSIS_ERROR_PROPAGATION = 2;
	public static final int ANALYSIS_BANDWIDTH = 3;

	private ArrayList<AnalysisResult> results = new ArrayList<AnalysisResult>();

	private AnalysisExecution ae = null;

	private void addResult(AnalysisResult ar) {
		results.add(ar);
	}

	private Boolean startAnalysisExecution() {
		if (ae == null) {
			System.out.println("Creating a new analysis execution");
			ae = ResultsFactory.eINSTANCE.createAnalysisExecution();
		} else if (ae.getFinished() == null) {
			// Another analysis is already running.
			System.err.println("Another analysis is already running");
			return false;
		}
		System.out.println("Starting analysis");
		ae.setStarted(LocalDateTime.now());
		return true;
	}

	private void stopAnalysisExecution() {
		System.out.println("Stopping analysis");
		ae.setFinished(LocalDateTime.now());
	}

	/**
	 * Runs a given analysis on a given model
	 * 
	 * @param m        The model on which the analysis should be run against
	 * @param path     The path to the folder where to store the output
	 * @param filename The filename of the output file, without extension.
	 */
	public void startAnalyisOnModel(Model m, String path, String fileName, int analysisType) {
		System.out.println("Starting analysis on model: " + m.getName());
		System.out.println(startAnalysisExecution());
		ae.setRunOnModel(m);
		stopAnalysisExecution();
		saveResults(path, fileName);
	}

	/**
	 * Runs a given analysis on a given model
	 * 
	 * @param m  The model on which the analysis should be run against
	 * @param ad An Analysis Definition
	 */
//	public void startAnalyisOnModel(Model m, AnalysisDefinition ad) {
//		startAnalysisExecution();
//		ae.setAnalysis(ad.getAnalysis());
//		ae.setRunOnModel(m);
//		stopAnalysisExecution();
//	}

	/**
	 * Runs a given analysis on a given package
	 * 
	 * @param p        The package on which the analysis should be run against
	 * @param path     The path to the folder where to store the output
	 * @param fileName The filename of the output file, without extension.
	 * @param a        The kind of analysis to start
	 */
	public void startAnalysisOnPackage(Package p, String path, String fileName) {
		System.out.println("Start analysis on package " + p.getName());
		startAnalysisExecution();
		ae.setRunOnModel((Model) EcoreUtil.getRootContainer(p, false));

		// run analysis
		int totalExecutionTime = 0;
		MutableNetwork<Component, Connector> n = NetworkUtils.generateNetwork(p);
		Optional<Component> startComponent = n.nodes().stream().filter(c -> c instanceof Sensor).findFirst();
		if (startComponent.isPresent()) {
			Utils.debug("Start Component is present");
			Iterable<Component> dbf = NetworkUtils.depthFirst(n, startComponent.get());
			int i = 0;
			Iterator<Component> it = dbf.iterator();
			while (it.hasNext() && i < 500) {
				Component c = it.next();
				Utils.debug("Analysing component " + c.getName());
				Utils.debug(c.getParameters().toString());
				Optional<Parameter> par = c.getParameters().stream()
						.peek(a -> System.out.println(a.getParameterDefinition().getName()))
						.filter(parameter -> parameter.getParameterDefinition() != null
								? (parameter.getParameterDefinition().getName().equals("FixedExecutionTime"))
								: false)
						.findFirst();
				Utils.debug(par.toString());
				if (par.isPresent()) {
					Utils.debug("Parameter FixedExecutionTime is present in " + c.getName(), true);
					Parameter myParameter = par.get();
					ValueSpecification initialValue = myParameter.getInitialValue();
					if (initialValue != null) {
						Utils.debug("Initial value");
						int value = initialValue.integerValue();
						Utils.debug(Integer.toString(value));
						totalExecutionTime += value;
					}
				}
				i++;
			}
			if (i >= 500) {
				System.err.println("Warning: max iteration limit reached.");
				return;
			}

		} else {
			System.err.println("Sensor not found");
			return;
		}

		// totalExecutionTime:
		ScalarValue totalExecutionTimeResult = ResultsFactory.eINSTANCE.createScalarValue();
		totalExecutionTimeResult.setName("Total Execution Time");
		totalExecutionTimeResult.setValue(Integer.toString(totalExecutionTime));
		ae.getAnalysisResults().add(totalExecutionTimeResult);

		stopAnalysisExecution();
		saveResults(path, fileName);
		ae = null; //TODO: probably shouldn't be done like this.
	}

	/**
	 * Runs a given analysis on a given component
	 * 
	 * @param c  The component on which the analysis should be run against
	 * @param ad An Analysis Definition
	 */
	public void startAnalysisOnComponent(Component c, AnalysisDefinition ad, int analysisType) {
		System.out.println("Start analysis on component " + c.getName());
	}

	/**
	 * Stores the current results to the given folder with the given filename
	 * 
	 * @param path     The path to the folder where to store the result.
	 * @param filename The filename of the result file, without extension.
	 */
	public void saveResults(String path, String filename) {
		System.out.println("Saving the results...");
		this.saveResults(Path.of(path,
				filename + "_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss")) + EXTENSION)
				.toString());
	}

	/**
	 * Stores the current results to the given location
	 * 
	 * @param filePath The full path to the AnalysisResults model file
	 */
	public boolean saveResults(String filePath) {
		System.out.println("Saving analysis results to: " + filePath);
		if (ae == null) {
			return false;
		}
		ResourceSet rs = new ResourceSetImpl();
		Resource resultsResource = createAndAddResource(filePath, new String[] { "results" }, rs);
		resultsResource.getContents().add(ae);
		saveResource(resultsResource);
		return true;
	}

	private static Resource createAndAddResource(String outputFile, String[] fileextensions, ResourceSet rs) {
		for (String fileext : fileextensions) {
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileext, new XMLResourceFactoryImpl());
		}
		URI uri = URI.createFileURI(outputFile);
		Resource resource = rs.createResource(uri);
		((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap<>());
		return resource;
	}

	private static void saveResource(Resource resource) {
		Map<Object, Object> saveOptions = ((XMLResource) resource).getDefaultSaveOptions();
		saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList());
		try {
			resource.save(saveOptions);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
