package e4sm.de.metamodel.design;

import java.util.Random;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.parser.IParseResult;

import com.google.inject.Injector;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.OutputPin;
import e4sm.de.metamodel.e4sm.Package;
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

		var packages = m.getPackages();
		if (packages.size() != 1) {
			System.err.println("The model contains " + packages.size() + " packages. Expected: 1");
			return 5;
		}

		Package p = packages.get(0);
		System.out.println("Package name: " + p.getName());

		Package copy = EcoreUtil.copy(p);

		Utils.getContainingPackage(c).getPackages().add(copy);
		c.setSpecifiedInPackage(copy);

		System.out.println("\n✓ Merge completed\n▔▔▔▔▔▔▔▔▔▔▔▔▔");
		return 0; // all good
	}
}
