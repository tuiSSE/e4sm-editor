package e4sm.de.metamodel.design;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNodeContainer;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusLayoutDataManager;
import org.eclipse.sirius.diagram.ui.business.internal.view.RootLayoutData;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.IEditorPart;

import e4sm.de.metamodel.e4sm.Actuator;
import e4sm.de.metamodel.e4sm.BinaryClassificationComponent;
import e4sm.de.metamodel.e4sm.Component;
import e4sm.de.metamodel.e4sm.ExternalDependency;
import e4sm.de.metamodel.e4sm.Function;
import e4sm.de.metamodel.e4sm.Heuristic;
import e4sm.de.metamodel.e4sm.InputPin;
import e4sm.de.metamodel.e4sm.MachineLearningComponent;
import e4sm.de.metamodel.e4sm.MulticlassClassificationComponent;
import e4sm.de.metamodel.e4sm.OutputPin;
import e4sm.de.metamodel.e4sm.Package;
import e4sm.de.metamodel.e4sm.PhysicalComponent;
import e4sm.de.metamodel.e4sm.Sector;
import e4sm.de.metamodel.e4sm.Sensor;
import e4sm.de.metamodel.e4sm.SoftwareComponent;
import e4sm.de.metamodel.e4sm.e4smFactory;
import e4sm.de.metamodel.e4sm.core.NamedElement;

public class ElementTransformationServices {

	public ElementTransformationServices() {

	}

	/***
	 * This method returns the EditPart corresponding to a DDiagramElement Source:
	 * https://wiki.eclipse.org/Sirius/Cookbook
	 * 
	 * @param diagramElement
	 * @return
	 */
	private static IGraphicalEditPart getEditPart(DDiagramElement diagramElement) {
		IEditorPart editor = EclipseUIUtil.getActiveEditor();
		if (editor instanceof DiagramEditor) {
			Session session = new EObjectQuery(diagramElement).getSession();
			View gmfView = SiriusGMFHelper.getGmfView(diagramElement, session);

			IGraphicalEditPart result = null;
			if (gmfView != null && editor instanceof DiagramEditor) {
				final Map<?, ?> editPartRegistry = ((DiagramEditor) editor).getDiagramGraphicalViewer()
						.getEditPartRegistry();
				final Object editPart = editPartRegistry.get(gmfView);
				if (editPart instanceof IGraphicalEditPart) {
					result = (IGraphicalEditPart) editPart;
					return result;
				}
			}
		}
		return null;
	}

	/**
	 * Places the new element at the same position of the old one
	 * 
	 * @param existingNode
	 */
	private static void restorePositionAndSize(DNodeContainer existingNode) {
		IGraphicalEditPart editPart = getEditPart(existingNode);
		if (editPart instanceof ShapeEditPart) {
			ShapeEditPart part = (ShapeEditPart) editPart;
			SiriusLayoutDataManager.INSTANCE
					.addData(new RootLayoutData(existingNode.eContainer(), part.getLocation(), part.getSize()));
		}
	}

	/**
	 * Transforms the given (software/physical) component to a Component
	 * 
	 * @param c
	 * @param containingViews
	 */
	public void transformToComponent(Component c, List<DSemanticDecorator> containingViews) {
		final Component newComponent = e4smFactory.eINSTANCE.createComponent();

		final boolean isPhysicalComponent = c instanceof PhysicalComponent;
		final boolean hasPins = c.getPins().size() > 0;

		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Sector sect -> {
			if (isPhysicalComponent) {
				final Package container = Utils.getContainingPackage(oldComponentContainer);
				container.getComponents().add(newComponent);
			} else {
				System.err.println("Component is inside a sector but is not a physical component");
				return;
			}
		}
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				newCompPins.add(p);
			}
		}

//		System.out.println("Pin done");
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(EcoreUtil.copyAll(c.getComponents()));

//		System.out.println("Copy done");

		// Give to the new component the same size/position as the old one.
		fixElementPosition(containingViews);

//		System.out.println("Del");
		// Delete the old component
		try {
			EcoreUtil.delete(c);
			System.out.println("Element transformed to component");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Could not delete the original element.");
		}

	}

	/*
	 * Transforms the given specific software component to a SoftwareComponent
	 */
	public void transformToSoftwareComponent(SoftwareComponent c, List<DSemanticDecorator> containingViews) {
		final SoftwareComponent newComponent = e4smFactory.eINSTANCE.createSoftwareComponent();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				newCompPins.add(p);
			}
		}

		System.out.println("Pin done");
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		// Give to the new component the same size/position as the old one.
		fixElementPosition(containingViews);

		// Delete the old component
		EcoreUtil.delete(c);
		System.out.println("Element transformed to software component");
	}

	/*
	 * Transforms the given specific machine learning component to a
	 * MachineLearningComponent
	 */
	public void transformToMachineLearningComponent(MachineLearningComponent c,
			List<DSemanticDecorator> containingViews) {
		final MachineLearningComponent newComponent = e4smFactory.eINSTANCE.createMachineLearningComponent();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				newCompPins.add(p);
			}
		}
		// TODO: this does not work, as if there are references they would be pointing
		// to the old one
		// newComponent.getParameters().addAll(EcoreUtil.copyAll(c.getParameters()));
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		fixElementPosition(containingViews);

		// Delete the old component
		EcoreUtil.delete(c);
		System.out.println("Binary Classification Component transformed to Machine Learning Component");
	}

	/*
	 * Transforms the given Sensor/Actuator to a PhysicalComponent
	 */
	public void transformToPhysicalComponent(PhysicalComponent c, List<DSemanticDecorator> containingViews) {
		final PhysicalComponent newComponent = e4smFactory.eINSTANCE.createPhysicalComponent();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Sector sect -> {
			final Sector container = (Sector) c.eContainer();
			container.getComponents().add(newComponent);
		}
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				newCompPins.add(p);
			}
		}
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(EcoreUtil.copyAll(c.getComponents()));

		fixElementPosition(containingViews);

		// Delete the old component
		EcoreUtil.delete(c);
		System.out.println("Actuator/Sensor transformed to PhysicalComponent");
	}

	/*
	 * Transforms the given Component to a SoftwareComponent
	 */
	public void transformDownToSoftwareComponent(Component c, List<DSemanticDecorator> containingViews) {
		final SoftwareComponent newComponent = e4smFactory.eINSTANCE.createSoftwareComponent();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				newCompPins.add(p);
			}
		}
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(EcoreUtil.copyAll(c.getComponents()));

		fixElementPosition(containingViews);

		// Delete the old component
		EcoreUtil.delete(c);
		System.out.println("Component transformed to software component");
	}

	/*
	 * Transforms the given Component to a PhysicalComponent
	 */
	public void transformDownToPhysicalComponent(Component c, List<DSemanticDecorator> containingViews) {
		final PhysicalComponent newComponent = e4smFactory.eINSTANCE.createPhysicalComponent();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				newCompPins.add(p);
			}
		}
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(EcoreUtil.copyAll(c.getComponents()));

		fixElementPosition(containingViews);

		// Delete the old component
		EcoreUtil.delete(c);
		System.out.println("Component transformed to physical component");
	}

	/*
	 * Transforms the given PhysicalComponent to a Sensor
	 */
	public void transformDownToSensor(PhysicalComponent c, List<DSemanticDecorator> containingViews) {
		final Sensor newComponent = e4smFactory.eINSTANCE.createSensor();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Sector sect -> {
			final Sector container = (Sector) c.eContainer();
			container.getComponents().add(newComponent);
		}
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				if (p instanceof OutputPin) {
					newCompPins.add(p);
				} else if (p instanceof InputPin) {
					// delete all connectors and the pin
					try {
						if (p.getIncomingConnectors().size() > 0) {
							EcoreUtil.deleteAll(p.getIncomingConnectors(), false);
						}
						if (p.getOutgoingConnectors().size() > 0) {
							EcoreUtil.deleteAll(p.getOutgoingConnectors(), false);
						}
						EcoreUtil.remove(p);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					System.err.println("Unrecognized pin type!!!");
				}
			}
		}
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(EcoreUtil.copyAll(c.getComponents()));

		fixElementPosition(containingViews);

		// Delete the old component
		try {
			EcoreUtil.delete(c);
			System.out.println("Physical Component transformed to sensor");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Transforms the given PhysicalComponent to an Actuator
	 */
	public void transformDownToActuator(PhysicalComponent c, List<DSemanticDecorator> containingViews) {
		final Actuator newComponent = e4smFactory.eINSTANCE.createActuator();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Sector sect -> {
			final Sector container = (Sector) c.eContainer();
			container.getComponents().add(newComponent);
		}
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				if (p instanceof InputPin) {
					newCompPins.add(p);
				} else if (p instanceof OutputPin) {
					// delete all connectors and the pin
					try {
						if (p.getIncomingConnectors().size() > 0) {
							EcoreUtil.deleteAll(p.getIncomingConnectors(), false);
						}
						if (p.getOutgoingConnectors().size() > 0) {
							EcoreUtil.deleteAll(p.getOutgoingConnectors(), false);
						}
						EcoreUtil.remove(p);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					System.err.println("Unrecognized pin type!!!");
				}
			}
		}
		System.err.println("Pins done");
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(EcoreUtil.copyAll(c.getComponents()));

		fixElementPosition(containingViews);

		// Delete the old component
		try {
			EcoreUtil.delete(c);
			System.out.println("Physical Component transformed to actuator");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Could not delete the original element.");
		}
	}

	/*
	 * Transforms the given SoftwareComponent to a MachineLearningComponent
	 */
	public void transformDownToMachineLearningComponent(SoftwareComponent c, List<DSemanticDecorator> containingViews) {
		final MachineLearningComponent newComponent = e4smFactory.eINSTANCE.createMachineLearningComponent();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				newCompPins.add(p);
			}
		}
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());
		
		fixElementPosition(containingViews);

		// Delete the old component
		try {
			EcoreUtil.delete(c);
			System.out.println("SoftwareComponent transformed to MachineLearningComponent");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Transforms the given SoftwareComponent to an Heuristic
	 */
	public void transformDownToHeuristic(SoftwareComponent c, List<DSemanticDecorator> containingViews) {
		final Heuristic newComponent = e4smFactory.eINSTANCE.createHeuristic();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				newCompPins.add(p);
			}
		}
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		fixElementPosition(containingViews);

		// Delete the old component
		try {
			EcoreUtil.delete(c);
			System.out.println("SoftwareComponent transformed to Heuristic");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Places the element back to its original location
	 * @param containingViews
	 */
	private void fixElementPosition(List<DSemanticDecorator> containingViews) {
		if (containingViews != null && containingViews.size() > 0) {
			System.out.println("Layouting");
			DNodeContainer existingNode = (DNodeContainer) containingViews.get(0);
			restorePositionAndSize(existingNode);
		}
	}

	/*
	 * Transforms the given SoftwareComponent to a Function
	 */
	public void transformDownToFunction(SoftwareComponent c, List<DSemanticDecorator> containingViews) {
		final Function newComponent = e4smFactory.eINSTANCE.createFunction();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				newCompPins.add(p);
			}
		}
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		fixElementPosition(containingViews);

		// Delete the old component
		try {
			EcoreUtil.delete(c);
			System.out.println("SoftwareComponent transformed to Function");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Transforms the given SoftwareComponent to an ExternalDependency
	 */
	public void transformDownToExternalDependency(SoftwareComponent c, List<DSemanticDecorator> containingViews) {
		final ExternalDependency newComponent = e4smFactory.eINSTANCE.createExternalDependency();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				newCompPins.add(p);
			}
		}
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		// External dependency usually don't have a main responsibile
		// newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		fixElementPosition(containingViews);

		// Delete the old component
		try {
			EcoreUtil.delete(c);
			System.out.println("SoftwareComponent transformed to ExternalDependency");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Transforms the given MachineLearningComponent to a Binary Classification
	 * Component
	 */
	public void transformDownToBinaryClassificationComponent(MachineLearningComponent c,
			List<DSemanticDecorator> containingViews) {
		final BinaryClassificationComponent newComponent = e4smFactory.eINSTANCE.createBinaryClassificationComponent();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				newCompPins.add(p);
			}
		}
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		fixElementPosition(containingViews);

		// Delete the old component
		try {
			EcoreUtil.delete(c);
			System.out.println("MachineLearningComponent transformed to BinaryClassificationComponent");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Transforms the given MachineLearningComponent to a Multiclass Classification
	 * Component
	 */
	public void transformDownToMulticlassClassificationComponent(MachineLearningComponent c,
			List<DSemanticDecorator> containingViews) {
		final MulticlassClassificationComponent newComponent = e4smFactory.eINSTANCE
				.createMulticlassClassificationComponent();
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		switch (oldComponentContainer) {
		case Component comp -> comp.getComponents().add(newComponent);
		case Package pack -> pack.getComponents().add(newComponent);
		case null -> {
			System.err.println("Component has no parent");
			return;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + oldComponentContainer);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			System.out.println("Has pins");
			final var newCompPins = newComponent.getPins();
			final var oldPins = c.getPins();
			for (int i = oldPins.size() - 1; i > -1; i--) {
				var p = oldPins.get(i);
				newCompPins.add(p);
			}
		}
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		fixElementPosition(containingViews);

		// Delete the old component
		try {
			EcoreUtil.delete(c);
			System.out.println("MachineLearningComponent transformed to MulticlassClassificationComponent");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
