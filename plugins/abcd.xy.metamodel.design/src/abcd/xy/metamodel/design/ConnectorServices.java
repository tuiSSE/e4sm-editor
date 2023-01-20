package abcd.xy.metamodel.design;

import org.eclipse.emf.ecore.EObject;

import abcd.xy.metamodel.abcd.DataStore;
import abcd.xy.metamodel.abcd.OutputPin;
import abcd.xy.metamodel.abcd.PhysicalComponent;

/**
 * The services class used by VSM.
 */
public class ConnectorServices {

	/**
	 * 
	 * @param source
	 * @param target
	 * @return true if the connection is allowed, false otherwise
	 */
	public boolean canPhysicalConnectorConnectSourceToTarget(EObject source, EObject target) {
		final EObject sourceContainer = source.eContainer();
		final EObject targetContainer = target.eContainer();

		// Not allowed: If the source and the target are the same component
		if (sourceContainer.equals(targetContainer)) {
			return false;
		}
		
		// It is allowed to collect the a datastore
		if(target instanceof DataStore) {
			return true;
		}

		// Not allowed: If the target is not a Physical Component or a container
		if ((!(targetContainer instanceof PhysicalComponent) /*|| !targetContainer.getClass().equals(Component.class))*/)) {
			return false;
		}
		
		// An output pin can only be connected to an output pin of its container
		if(source instanceof OutputPin && target instanceof OutputPin) {
			if (sourceContainer.eContainer().equals(targetContainer)) {
				return true;
			}
			return false;
		}

		// Otherwise, the connection should be allowed
		return true;
	}
}
