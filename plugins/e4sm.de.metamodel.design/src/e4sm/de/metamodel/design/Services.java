package e4sm.de.metamodel.design;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.viewpoint.description.tool.Let;
import org.eclipse.xtext.parser.IParseResult;

import com.google.inject.Injector;

import e4sm.de.metamodel.e4sm.Actuator;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.OutputPin;
import e4sm.de.metamodel.e4sm.Package;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.utils.Utils;
import e4sm.de.metamodel.xtext.E4smStandaloneSetup;
import e4sm.de.metamodel.xtext.parser.antlr.E4smParser;

/**
 * The services class used by VSM.
 */
public class Services {

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

	public int mergeModels(Component c, CharSequence text) {
		System.out.println("\n\n");
		System.out.println(text);
		System.out.println("Merging the given text into " + c.getName());
		if (c.getSpecifiedInPackage() != null) {
			System.err.println("remove the specification first, and then import it.");
			return 1; // remove the specification first, and then import it.
		}
		System.out.println("Component is valid");
		// E4smStandaloneSetup.doSetup();
		Injector injector = new E4smStandaloneSetup().createInjector();

		var parser = injector.getInstance(E4smParser.class);
		System.out.println("Parser created");

		IParseResult res = null;
		try {
			res = parser.doParse(text);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Parsed");

		if (res.hasSyntaxErrors()) {
			System.err.println("Provided text has syntax errors.");
			return 3;
		}

		EObject root = res.getRootASTElement();
		if (root == null || !(root instanceof Model)) {
			System.err.println("Root is not a model");
			return 2; // parse error
		}

		System.out.println("Root is a model");
		Model m = (Model) root;
		System.out.println("Model name: " + m.getName());

		// Check that the model has exactly one package
		var packages = m.getPackages();
		if (packages.size() != 1) {
			System.err.println("The model contains " + packages.size() + " packages. Expected: 1");
			return 5;
		}

		// Set the read package as component specification (make a copy)
		Package p = packages.get(0);
		System.out.println("Package name: " + p.getName());

		Package copy = EcoreUtil.copy(p);
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
			if(type != null) {
				res.append(" : ");
				res.append(type.getName());
			}else {
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
			if(type != null) {
				res.append(" : ");
				res.append(type.getName());
			}else {
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
			if(timeFunction != null) {
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
			if(timeFunction != null) {
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
}
