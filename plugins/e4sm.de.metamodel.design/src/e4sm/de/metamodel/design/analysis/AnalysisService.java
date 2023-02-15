package e4sm.de.metamodel.design.analysis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import e4sm.de.metamodel.design.Activator;
import e4sm.de.metamodel.design.Utils;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.analysis.AnalysisDefinition;
import e4sm.de.metamodel.e4sm.analysis.Parameter;
import e4sm.de.metamodel.e4sm.Package;
import e4sm.de.metamodel.e4sm.Sensor;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

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

	// private ArrayList<AnalysisResult> results = new ArrayList<AnalysisResult>();

	private AnalysisExecution ae = null;

	// private void addResult(AnalysisResult ar) {
	//	results.add(ar);
	// }

	public int toSCPN(Package p, String outputPath) {
		Utils.debug("Converting package to SCPN");
		var pName = p.getName();
		if(pName == null || pName.isEmpty()){
			Utils.debug("Package name is empty, transformation canceled");
			return 1;
		}
		Utils.debug("Package: " + p.getName());
		Model m = Utils.getModel(p);
		
		// Get the path of the input model
		var inputURI = EcoreUtil.getURI(m);
		System.err.println(inputURI.toString());

		var parts = inputURI.toString().split("/");
		var projectPath = "";
		var modelFileName = "";
		for (int i = 0; i < parts.length; i++) {
			if (parts[i].contains("#")) {
				// example: "model.e4sm#"
				modelFileName = parts[i].substring(0, parts[i].indexOf("."));
				break;
			} else {
				projectPath += (parts[i] + "/");
			}
		}
		Utils.debug("\nProject path: " + projectPath);
		Utils.debug("\nModel file name: " + modelFileName);
		Utils.debug("\nGiven outputPath is: " + outputPath);

		if (outputPath == null || outputPath.isEmpty()) {
			Utils.debug("Output path not provided, setting the default path /SCPN/<modelName>.xml");
			// Using the default output SCPN/model_name.xml"
			outputPath = projectPath + "SCPN/" + p.getName() + ".xml";
			Utils.debug("\noutputPath set to: " + outputPath);
		}

		// Refer to an existing transformation via URI
		URI transformationURI = URI
				.createURI("platform:/plugin/e4sm.de.metamodel.to.scpn.qvto/transforms/transformToSCPN.qvto");
		// URI transformationURI =
		// URI.createURI("platform:/resource/e4sm.de.metamodel.to.scpn.qvto/transforms/transformToSCPN.qvto");
		// if (!transformationURI.isFile()) {
		// System.err.println("Given URI is not a transformation file");
		// }
		if (!transformationURI.isPlatformPlugin()) {
			System.err.println("Given URI is not a platform plugin");
		}
		// Utils.debug(transformationURI.toString());

		// create executor for the given transformation
		TransformationExecutor executor = new TransformationExecutor(transformationURI);
		Utils.debug("TransformationExecutor - created");
		// define the transformation input
		// Define an empty list
		Utils.debug("Creating an empty list");
		EList<EObject> inObjects = ECollections.newBasicEList();
		// Add the package to the list
		Utils.debug("Add model to the list");
		inObjects.add(m);

		Utils.debug("Setting input model");
		// create the input extent with its initial contents
		ModelExtent input = new BasicModelExtent(inObjects);
		// create an empty extent to catch the output
		ModelExtent output = new BasicModelExtent();

		// setup the execution environment details ->
		// configuration properties, logger, monitor object etc.
		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setConfigProperty("packageName", p.getName());

		// run the transformation assigned to the executor with the given
		// input and output and execution context -> ChangeTheWorld(in, out)
		// Remark: variable arguments count is supported
		Utils.debug("Sirius - starting transformation");
		ExecutionDiagnostic result = executor.execute(context, input, output);

		// check the result for success
		System.out.println(result.toString());
		if (result.getSeverity() == Diagnostic.OK) {
			Utils.debug("Sirius - transformation succeded");
			// Utils.debug(output.toString());
			// the output objects got captured in the output extent
			List<EObject> outObjects = output.getContents();
			Utils.debug("Transformation output size: " + outObjects.size());
			// let's persist them using a resource
			ResourceSet resourceSet2 = new ResourceSetImpl();
			URI outputURI = URI.createURI(outputPath);
			Utils.debug("Created output URI");
			Resource outResource = resourceSet2.createResource(outputURI);
			outResource.getContents().addAll(outObjects);
			Utils.debug("Saving net to " + outputPath);
			try {
				Utils.debug(outResource.toString());
				outResource.save(Collections.emptyMap());
			} catch (IOException e) {
				System.err.println("Failed to save output SCPN");
				e.printStackTrace();
				return 2;
			}
			Utils.debug("SCPN net saved to " + outputPath);

			Utils.debug("\nMaking net compatible with TimeNet...");
			try {
				var rt = Runtime.getRuntime();

				var scpnFolderPath = projectPath + "SCPN/";
				var scpnFolderURI = URI.createURI(scpnFolderPath);
				
				var absoluteScpnPath = FileLocator.resolve(new URL(scpnFolderURI.toString())).getPath();
				var npmCommand = "tn-fix-xml "+ modelFileName + " -a -o";
				
				//var command = "cmd.exe /C cd \"" + absoluteScpnPath + "\" && " + npmCommand;

				//Utils.debug("\nRunning command: " + command);

				var pr = rt.exec(new String[] {"cmd.exe", "/C cd " + absoluteScpnPath + "\" &&" + npmCommand});
				var in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
				String line = null;

				while ((line = in.readLine()) != null) {
					System.out.println(line);
				}

				int exitVal = pr.waitFor();
				System.out.println("Exited with error code " + exitVal);
			} catch (IOException e) {
				System.err.println("Execution error during tn-fix-xml");
				System.out.println(e.toString());
				e.printStackTrace();
			} catch (InterruptedException e) {
				System.err.println(e.toString());
				e.printStackTrace();
			}
			return 0;

		} else {
			System.err.println("Sirius - Transformation failed");
			// turn the result diagnostic into status and send it to error log
			IStatus status = BasicDiagnostic.toIStatus(result);
			Activator.getDefault().getLog().log(status);
		}
		return 3;
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
		ae = null; // TODO: probably shouldn't be done like this.
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
		saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList<Object>());
		try {
			resource.save(saveOptions);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
