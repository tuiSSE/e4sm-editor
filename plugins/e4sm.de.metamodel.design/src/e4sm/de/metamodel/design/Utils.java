package e4sm.de.metamodel.design;

import org.eclipse.emf.ecore.EObject;

import e4sm.de.metamodel.e4sm.Package;

final public class Utils {
//Final: it makes no sense to extend a static class.
	private Utils() {
		//Does not make sense to construct a static class
	}
	
	public static Package getContainingPackage(EObject el) {
		if(el == null) {
			return null;
		}
		if(!(el instanceof Package)) {
			return getContainingPackage(el.eContainer());
		}
		return (Package) el;
	}
}
