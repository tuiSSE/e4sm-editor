package e4sm.de.metamodel.design;

import org.eclipse.emf.ecore.util.EcoreUtil;

import e4sm.de.metamodel.e4sm.Actuator;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.ExternalDependency;
import e4sm.de.metamodel.e4sm.Function;
import e4sm.de.metamodel.e4sm.Heuristic;
import e4sm.de.metamodel.e4sm.MachineLearningComponent;
import e4sm.de.metamodel.e4sm.NamedElement;
import e4sm.de.metamodel.e4sm.Package;
import e4sm.de.metamodel.e4sm.PhysicalComponent;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.e4smFactory;

public class ElementTransformationServices {
	/*
	 * Transforms the given (software/physical) component to a Component
	 * */
	public void transformToComponent(Component c) {
		final Component newComponent = e4smFactory.eINSTANCE.createComponent();
		final boolean isPhysicalComponent = c instanceof PhysicalComponent;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if(oldComponentContainer instanceof Component) {
			//This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		}
		else if(isPhysicalComponent && oldComponentContainer instanceof Sector) {
			//This component is contained by a sector. A sector can only contain Physical Components.
			final Package container = Utils.getContainingPackage(oldComponentContainer);
			container.getComponents().add(newComponent);
		}else if(oldComponentContainer instanceof Package) {
			//This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}
		
		//Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());
		
		//TODO: give to the new component the same size/position as the old one.
		
		//Delete the old component
		EcoreUtil.delete(c);
		System.out.println("Element transformed to component");
	}
	
	/*
	 * Transforms the given specific software component to a SoftwareComponent
	 * */
	public void transformToSoftwareComponent(SoftwareComponent c) {
		final SoftwareComponent newComponent = e4smFactory.eINSTANCE.createSoftwareComponent();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if(oldComponentContainer instanceof Component) {
			//This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		}
		else if(oldComponentContainer instanceof Package) {
			//This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}
		
		//Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());
		
		//TODO: give to the new component the same size/position as the old one.
		
		//Delete the old component
		EcoreUtil.delete(c);
		System.out.println("Element transformed to software component");
	}
	
	/*
	 * Transforms the given Sensor/Actuator to a PhysicalComponent
	 * */
	public void transformToPhysicalComponent(PhysicalComponent c) {
		final PhysicalComponent newComponent = e4smFactory.eINSTANCE.createPhysicalComponent();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if(oldComponentContainer instanceof Component) {
			//This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		}
		else if(c.eContainer() instanceof Sector) {
			//This component is contained by a Sector
			final Sector container = (Sector) c.eContainer();
			container.getComponents().add(newComponent);
		}
		else if(oldComponentContainer instanceof Package) {
			//This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}
		
		//Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());
		
		//TODO: give to the new component the same size/position as the old one.
		
		//Delete the old component
		EcoreUtil.delete(c);
		System.out.println("Actuator/Sensor transformed to PhysicalComponent");
	}
	
	/*
	 * Transforms the given Component to a SoftwareComponent
	 * */
	public void transformDownToSoftwareComponent(Component c) {
		final SoftwareComponent newComponent = e4smFactory.eINSTANCE.createSoftwareComponent();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if(oldComponentContainer instanceof Component) {
			//This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		}
		else if(oldComponentContainer instanceof Package) {
			//This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}
		
		//Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());
		
		//TODO: give to the new component the same size/position as the old one.
		
		//Delete the old component
		EcoreUtil.delete(c);
		System.out.println("Component transformed to software component");
	}
	
	/*
	 * Transforms the given Component to a PhysicalComponent
	 * */
	public void transformDownToPhysicalComponent(Component c) {
		final PhysicalComponent newComponent = e4smFactory.eINSTANCE.createPhysicalComponent();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if(oldComponentContainer instanceof Component) {
			//This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		}
		else if(oldComponentContainer instanceof Package) {
			//This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}
		
		//Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());
		
		//TODO: give to the new component the same size/position as the old one.
		
		//Delete the old component
		EcoreUtil.delete(c);
		System.out.println("Component transformed to physical component");
	}
	
	/*
	 * Transforms the given PhysicalComponent to a Sensor
	 * */
	public void transformDownToSensor(PhysicalComponent c) {
		final Sensor newComponent = e4smFactory.eINSTANCE.createSensor();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if(oldComponentContainer instanceof Component) {
			//This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		}
		else if(c.eContainer() instanceof Sector) {
			//This component is contained by a Sector
			final Sector container = (Sector) c.eContainer();
			container.getComponents().add(newComponent);
		}
		else if(oldComponentContainer instanceof Package) {
			//This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}
		
		//Copy all attributes
		//TODO: only copy output pins?
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());
		
		//TODO: give to the new component the same size/position as the old one.
		
		//Delete the old component
		EcoreUtil.delete(c);
		System.out.println("Physical Component transformed to sensor");
	}
	
	/*
	 * Transforms the given PhysicalComponent to an Actuator
	 * */
	public void transformDownToActuator(PhysicalComponent c) {
		final Actuator newComponent = e4smFactory.eINSTANCE.createActuator();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if(oldComponentContainer instanceof Component) {
			//This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		}
		else if(c.eContainer() instanceof Sector) {
			//This component is contained by a Sector
			final Sector container = (Sector) c.eContainer();
			container.getComponents().add(newComponent);
		}
		else if(oldComponentContainer instanceof Package) {
			//This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}
		
		//Copy all attributes
		//TODO: only copy input pins?
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());
		
		//TODO: give to the new component the same size/position as the old one.
		
		//Delete the old component
		EcoreUtil.delete(c);
		System.out.println("Physical Component transformed to actuator");
	}
	
	/*
	 * Transforms the given SoftwareComponent to a MachineLearningComponent
	 * */
	public void transformDownToMachineLearningComponent(SoftwareComponent c) {
		final MachineLearningComponent newComponent = e4smFactory.eINSTANCE.createMachineLearningComponent();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if(oldComponentContainer instanceof Component) {
			//This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		}
		else if(oldComponentContainer instanceof Package) {
			//This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}
		
		//Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());
		
		//TODO: give to the new component the same size/position as the old one.
		
		//Delete the old component
		EcoreUtil.delete(c);
		System.out.println("SoftwareComponent transformed to MachineLearningComponent");
	}
	
	/*
	 * Transforms the given SoftwareComponent to an Heuristic
	 * */
	public void transformDownToHeuristic(SoftwareComponent c) {
		final Heuristic newComponent = e4smFactory.eINSTANCE.createHeuristic();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if(oldComponentContainer instanceof Component) {
			//This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		}
		else if(oldComponentContainer instanceof Package) {
			//This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}
		
		//Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());
		
		//TODO: give to the new component the same size/position as the old one.
		
		//Delete the old component
		EcoreUtil.delete(c);
		System.out.println("SoftwareComponent transformed to Heuristic");
	}
	
	/*
	 * Transforms the given SoftwareComponent to a Function
	 * */
	public void transformDownToFunction(SoftwareComponent c) {
		final Function newComponent = e4smFactory.eINSTANCE.createFunction();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if(oldComponentContainer instanceof Component) {
			//This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		}
		else if(oldComponentContainer instanceof Package) {
			//This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}
		
		//Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());
		
		//TODO: give to the new component the same size/position as the old one.
		
		//Delete the old component
		EcoreUtil.delete(c);
		System.out.println("SoftwareComponent transformed to Function");
	}
	
	/*
	 * Transforms the given SoftwareComponent to an ExternalDependency
	 * */
	public void transformDownToExternalDependency(SoftwareComponent c) {
		final ExternalDependency newComponent = e4smFactory.eINSTANCE.createExternalDependency();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if(oldComponentContainer instanceof Component) {
			//This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		}
		else if(oldComponentContainer instanceof Package) {
			//This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}
		
		//Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		//External dependency usually don't have a main responsibile
		//newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());
		
		//TODO: give to the new component the same size/position as the old one.
		
		//Delete the old component
		EcoreUtil.delete(c);
		System.out.println("SoftwareComponent transformed to ExternalDependency");
	}
}
