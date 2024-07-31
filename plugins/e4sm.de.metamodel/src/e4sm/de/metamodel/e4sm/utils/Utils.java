package e4sm.de.metamodel.e4sm.utils;

import org.eclipse.emf.ecore.EObject;

import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.Model;
import e4sm.de.metamodel.e4sm.Package;

public final class Utils {
	/**
	 * Return the package containing the given element
	 * 
	 * @param nEl an element contained by a package
	 * @return the Package containing this element or null
	 */
	public static Package getContainingPackage(EObject nEl) {
		EObject el = (EObject) nEl;
		while (el != null && !(el instanceof Package)) {
			el = el.eContainer();
		}
		return (Package) el;
	}

	/**
	 * Return the model containing the given element
	 * 
	 * @param nEl an element contained by a model
	 * @return the Model containing this element or null
	 */
	public static Model getContainingModel(EObject nEl) {
		EObject el = (EObject) nEl;
		while (el != null && !(el instanceof Model)) {
			el = el.eContainer();
		}
		return (Model) el;
	}

	/**
	 * Return the component containing the given element
	 * 
	 * @param nEl an element contained by a package
	 * @return the Component containing this element or null
	 */
	public static Component getContainingComponent(EObject nEl) {
		EObject el = (EObject) nEl;
		while (el != null && !(el instanceof Component)) {
			el = el.eContainer();
		}
		return (Component) el;
	}
}
