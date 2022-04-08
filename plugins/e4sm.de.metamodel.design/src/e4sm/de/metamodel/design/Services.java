package e4sm.de.metamodel.design;

import java.util.Random;

import org.eclipse.emf.ecore.EObject;

import e4sm.de.metamodel.e4sm.Connector;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.OutputPin;


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
		if(self instanceof Connector) {
			basename = "con_";
		}
		else if(self instanceof InputPin) {
			basename = "in_";
		}
		else if(self instanceof OutputPin) {
			basename = "out_";
		}
	    return basename + randomString(4);
	}
	
	static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static Random rnd = new Random();

	String randomString(int len){
	   StringBuilder sb = new StringBuilder(len);
	   for(int i = 0; i < len; i++)
	      sb.append(AB.charAt(rnd.nextInt(AB.length())));
	   return sb.toString();
	}
}
