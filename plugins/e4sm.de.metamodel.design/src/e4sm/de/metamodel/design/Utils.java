package e4sm.de.metamodel.design;

import org.eclipse.emf.ecore.EObject;

import e4sm.de.metamodel.e4sm.Package;

final public class Utils {
//Final: it makes no sense to extend a static class.
	private Utils() {
		// Does not make sense to construct a static class
	}

	/**
	 * When true, debug messages get printed on the console.
	 */
	private static boolean DEBUG_ENABLED = true;

	public static Package getContainingPackage(EObject el) {
		if (el == null) {
			return null;
		}
		if (!(el instanceof Package)) {
			return getContainingPackage(el.eContainer());
		}
		return (Package) el;
	}

	/**
	 * If debug is enabled, prints the given message
	 * @param {String} message - The message to print.
	 * @param {boolean} red - whether it should be print in red or not (on the error stream)
	 */
	public static void debug(String message, boolean red) {
		if (DEBUG_ENABLED) {
			if (red) {
				System.err.println("DEBUG: " + message);
			} else {
				System.out.println("DEBUG: " + message);
			}
		}
	}

	/**
	 * Prints the given message on the standard output, if debug is enabled.
	 * @param message
	 */
	public static void debug(String message) {
		debug(message, false);
	}
}
