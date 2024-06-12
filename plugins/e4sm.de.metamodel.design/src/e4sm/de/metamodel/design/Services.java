package e4sm.de.metamodel.design;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.sirius.viewpoint.description.tool.Let;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import e4sm.de.metamodel.e4sm.Actuator;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.LogicalConnector;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.OutputPin;
import e4sm.de.metamodel.e4sm.Package;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.e4smFactory;
import e4sm.de.metamodel.e4sm.utils.Utils;
import e4sm.de.metamodel.xtext.E4smRuntimeModule;
import e4sm.de.metamodel.xtext.E4smStandaloneSetup;
import e4sm.de.metamodel.xtext.parser.antlr.E4smParser;

/**
 * The services class used by VSM.
 */
public class Services {

	@Inject
	private XtextResourceSet resourceSet;

	private static boolean xTextInitialized = false;

	/**
	 * See
	 * http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24
	 * for documentation on how to write service methods.
	 */
	public String nameFactory(EObject self) {
		String basename = "el_";
		if (self instanceof Connector) {
			basename = "con_";
		} else if (self instanceof InputPin) {
			basename = "in_";
		} else if (self instanceof OutputPin) {
			basename = "out_";
		}
		return basename + randomString(4);
	}

	static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static Random rnd = new Random();

	String randomString(int len) {
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	public int mergeModels(Component c, String text) {
		System.out.println("\n\n");
		System.out.println(text);
		System.out.println("Merging the given text into " + c.getName());
		if (c.getSpecifiedInPackage() != null) {
			System.err.println("remove the specification first, and then import it.");
			return 1; // remove the specification first, and then import it.
		}
		System.out.println("Component is valid");
		// E4smStandaloneSetup.doSetup();
		if (!xTextInitialized) {
			new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
			Injector injector = Guice.createInjector(new E4smRuntimeModule());
			injector.injectMembers(this);
			resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			System.out.println("Parser initialized");
			xTextInitialized = true;
		}

		// IParseResult res = null;
		Resource resource = null;
		try {
			resource = resourceSet
					.createResource(URI.createURI("dummy:/" + UUID.randomUUID().toString() + ".e4smcode"));
			resource.load(new ByteArrayInputStream(text.getBytes()), resourceSet.getLoadOptions());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * try { res = parser.doParse(text); } catch (Exception e) {
		 * System.err.println(e.getMessage()); }
		 */
		System.out.println("Parsed");

		if (resource.getWarnings().size() > 0) {
			System.err.println("Provided text has syntax errors:");
			resource.getWarnings().forEach(e -> System.err.println(e.getMessage()));
			return 3;
		}

		EObject root = resource.getContents().get(0); // res.getRootASTElement();
		if (root == null || !(root instanceof Model)) {
			System.err.println("Root is not a model");
			return 2; // parse error
		}
		
		// TODO: parsing errors are not catched, the first string is a model
		
		System.err.println(root);
		System.out.println("Root is a model");
		Model m = (Model) root;
		System.out.println("Model name: " + m.getName());

		// copy the parameters
		var parFromImport = m.getParameters();
		Model currentModel = Utils.getContainingModel(c);
		currentModel.getParameters().addAll(parFromImport);

		// Check that the model has exactly one package
		var packages = m.getPackages();
		if (packages.size() != 1) {
			System.err.println("The model contains " + packages.size() + " packages. Expected: 1");
			return 5;
		}

		// Set the read package as component specification (make a copy)
		Package p = packages.get(0);
		System.out.println("Package name: " + p.getName());

		System.err.println(p.getConnectors());

		Copier copier = new Copier();
		Model modelCopy = (Model) copier.copy(m);
		copier.copyReferences();
		System.err.println(copier.toString());

		Package copy = modelCopy.getPackages().get(0);

		System.err.println(copy.getConnectors().get(0).getSource());
		// TODO - change connections from sensors to the input pins of the higher
		// component
		try {
			var targetSensors = copy.getAllSensors();
			System.out.println("SENSORS: " + targetSensors);

			var targetConnectors = copy.getConnectors();
			System.out.println("TargetConnectors: " + targetConnectors);

			var componentInputs = c.getInputPins();
			System.out.println("ComponentInputs: " + componentInputs);

			// for each Sensor try to match an inputPin
			for (int i = targetSensors.size() - 1; i > -1; i--) {

				var currSens = targetSensors.get(i);

				for (int j = 0; j < componentInputs.size(); j++) {

					var currInput = componentInputs.get(j);
					if (currInput.getName() != null && currInput.getName().equals(currSens.getName())) {
						var selectedConnector = currSens.getOutputPins().get(0).getOutgoingConnectors().get(0);
						LogicalConnector lc = e4smFactory.eINSTANCE.createLogicalConnector();
						// Copy all attributes
						lc.setName(selectedConnector.getName());
						lc.setSource(currInput);
						lc.setTarget(selectedConnector.getTarget());
						lc.setTimeFunction(selectedConnector.getTimeFunction());
						copy.getConnectors().add(lc);
						EcoreUtil.delete(currSens);
						EcoreUtil.delete(selectedConnector);
						continue;
					}
					if (j == componentInputs.size() - 1) {
						System.err.println("NO MATCH FOUND FOR SENSOR: " + currSens.getName());
					}
				}
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		Utils.getContainingPackage(c).getPackages().add(copy);
		c.setSpecifiedInPackage(copy);

		System.out.println("\n✓ Merge completed\n▔▔▔▔▔▔▔▔▔▔▔▔▔");
		return 0; // all good
	}

	public String pipelineInformation(SoftwareComponent s) {
		Package p = Utils.getContainingPackage(s);
		String res = """
				# Component Report
				## Model Environment
				Model: "%MODEL%"

				> Generated on: %GENERATED_ON%<br>
				> Version: 1.0.0

				### Sensors
				%SENSORS%

				### Actuators
				%ACTUATORS%

				## Component Details
				Name: "%PIPELINE_NAME%"

				### Inputs
				%PIPELINE_INPUTS%

				### Outputs
				%PIPELINE_OUTPUTS%
				""";
		res = res.replaceFirst("%MODEL%", p.getName());
		res = res.replaceFirst("%GENERATED_ON%", new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date()));
		res = res.replaceFirst("%PIPELINE_NAME%", s.getName());
		res = res.replaceFirst("%ACTUATORS%", printActuatorsInfo(p.getAllActuators()));
		res = res.replaceFirst("%SENSORS%", printSensorsInfo(p.getAllSensors()));
		res = res.replaceFirst("%PIPELINE_INPUTS%", printInputsInfo(s));
		res = res.replaceFirst("%PIPELINE_OUTPUTS%", printOutputsInfo(s));
		return res;
	}

	private String printInputsInfo(Component c) {
		var in = c.getInputPins();
		if (in.size() == 0)
			return "*No input pins*";
		var res = new StringBuilder();
		for (int i = 0; i < in.size(); i++) {
			var inP = in.get(i);
			res.append("- \"");
			res.append(inP.getName());
			res.append("\"");
			var type = inP.getType();
			if (type != null) {
				res.append(" : ");
				res.append(type.getName());
			} else {
				res.append(" *no type*");
			}
			res.append("\n");
		}
		return res.toString();
	}

	private String printOutputsInfo(Component c) {
		var o = c.getOutputPins();
		if (o.size() == 0)
			return "*No output pins*";
		var res = new StringBuilder();
		for (int i = 0; i < o.size(); i++) {
			var oP = o.get(i);
			res.append("- \"");
			res.append(oP.getName());
			res.append("\"");
			var type = oP.getType();
			if (type != null) {
				res.append(" : ");
				res.append(type.getName());
			} else {
				res.append(" *no type*");
			}
			res.append("\n");
		}
		return res.toString();
	}

	private String printSensorsInfo(EList<Sensor> sensors) {
		if (sensors.size() == 0)
			return "*No sensors*";

		var res = new StringBuilder();
		for (int i = 0; i < sensors.size(); i++) {
			var s = sensors.get(i);
			res.append("- \"");
			res.append(s.getName());
			res.append("\"");
			var timeFunction = s.getTimeFunction();
			if (timeFunction != null) {
				res.append(" fires in **");
				res.append(timeFunction.getString());
				res.append("**");
			} else {
				res.append(" *no firing info*");
			}
			res.append("\n");
		}
		return res.toString();
	}

	private String printActuatorsInfo(EList<Actuator> actuators) {
		if (actuators.size() == 0) {
			return "*No actuators*";
		}
		var res = new StringBuilder();
		for (int i = 0; i < actuators.size(); i++) {
			var a = actuators.get(i);
			res.append("- \"");
			res.append(a.getName());
			res.append("\"");
			var timeFunction = a.getTimeFunction();
			if (timeFunction != null) {
				res.append(" fires in **");
				res.append(timeFunction.getString());
				res.append("**");
			} else {
				res.append(" *no firing info*");
			}
			res.append("\n");
		}
		return res.toString();
	}
	
	/**
	 * Removes the packageSpecification from the model and the component.
	 * @param c A component with a specifiedInPackage value set
	 */
	public void deletePackageSpecification(Component c) {
		var p = c.getSpecifiedInPackage();
		if(p == null)
			return;
		EcoreUtil.delete(p);
	}
}
