/**
 * 
 */
package e4sm.de.metamodel.design;


final public class NodeTools {
	private NodeTools() {
		// Does not make sense to construct a static class
	}
	/**
	 * Check if the npm command is available
	 * @return true if it is, false otherwise
	 * @todo erik
	 */
	public static boolean checkNpm() {
		return true;
	}
	
	/**
	 * Check if the tn-fix-xml command is available
	 * @return true if it is, false otherwise
	 * @todo erik
	 */
	public static boolean checkTnFix() {
		return true;
	}
	
	/**
	 * 
	 * @return
	 */
	public static boolean optimizePN(/*Model path*/) {
		//  tn-fix-xml <p.xml> -o
		return true;
	}
}
