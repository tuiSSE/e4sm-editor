package abcd.xy.metamodel.design;

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


import abcd.xy.metamodel.abcd.Actuator;
import abcd.xy.metamodel.abcd.Component;
import abcd.xy.metamodel.abcd.ExternalDependency;
import abcd.xy.metamodel.abcd.Function;
import abcd.xy.metamodel.abcd.Heuristic;
import abcd.xy.metamodel.abcd.MachineLearningComponent;
import abcd.xy.metamodel.abcd.core.NamedElement;
import abcd.xy.metamodel.abcd.Package;
import abcd.xy.metamodel.abcd.PhysicalComponent;
import abcd.xy.metamodel.abcd.Sector;
import abcd.xy.metamodel.abcd.Sensor;
import abcd.xy.metamodel.abcd.SoftwareComponent;
import abcd.xy.metamodel.abcd.abcdFactory;

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
	 * @param c
	 * @param containingViews
	 */
	public static void transformToComponent(Component c, List<DSemanticDecorator> containingViews) {
		final Component newComponent = abcdFactory.eINSTANCE.createComponent();
		// ArrayList<EObject> references = new ArrayList<EObject>( new
		// EObjectQuery(c).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET));

		final boolean isPhysicalComponent = c instanceof PhysicalComponent;
		final boolean hasPins = c.getPins().size() > 0;
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if (oldComponentContainer instanceof Component) {
			// This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		} else if (isPhysicalComponent && oldComponentContainer instanceof Sector) {
			// This component is contained by a sector. A sector can only contain Physical
			// Components.
			final Package container = Utils.getContainingPackage(oldComponentContainer);
			container.getComponents().add(newComponent);
		} else if (oldComponentContainer instanceof Package) {
			// This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}
		System.out.println("Co");

		// Copy all attributes
		newComponent.setName(c.getName());
		if (hasPins) {
			newComponent.getPins().addAll(c.getPins());
		}
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		// Give to the new component the same size/position as the old one.
		if (containingViews != null && containingViews.size() > 0) {
			DNodeContainer existingNode = (DNodeContainer) containingViews.get(0);
			restorePositionAndSize(existingNode);

			// TODO: place all contained elements at the same position:
//			existingNode.getElements().stream().forEach(e -> {
//				IGraphicalEditPart editPart = getEditPart(e);
//				if (editPart instanceof ShapeEditPart) {
//					ShapeEditPart part = (ShapeEditPart) editPart;
//					SiriusLayoutDataManager.INSTANCE
//							.addData(new RootLayoutData(e.eContainer(), part.getLocation(), part.getSize()));
//				}
//
//			});

			// TODO: Place bordered nodes at the same position:
			// if(hasPins) {
//			existingNode.getOwnedBorderedNodes().stream().forEach(bn -> {
//				IGraphicalEditPart editPart2 = getEditPart(bn);
//				System.out.println(editPart2.toString());
//				if (editPart2 instanceof ShapeEditPart) {
//					System.out.println("Is Shape Edit Part");
//					ShapeEditPart part = (ShapeEditPart) editPart2;
//					System.out.println(part.toString());
//					SiriusLayoutDataManager.INSTANCE
//							.addData(new RootLayoutData(bn, part.getLocation(), part.getSize()));
//				}
//			});
			// }
		}

		System.out.println("Del");
		// Delete the old component
		try {
			// Delete does not work here, why?
			EcoreUtil.remove(c);
			System.out.println("Element transformed to component");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Could not delete the original element.");
		}

	}

	/*
	 * Transforms the given specific software component to a SoftwareComponent
	 */
	public void transformToSoftwareComponent(SoftwareComponent c,  List<DSemanticDecorator> containingViews) {
		final SoftwareComponent newComponent = abcdFactory.eINSTANCE.createSoftwareComponent();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if (oldComponentContainer instanceof Component) {
			// This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		} else if (oldComponentContainer instanceof Package) {
			// This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		// Give to the new component the same size/position as the old one.
		if (containingViews != null && containingViews.size() > 0) {
			DNodeContainer existingNode = (DNodeContainer) containingViews.get(0);
			restorePositionAndSize(existingNode);
			
			//TODO, see "transformToComponent"
		}

		// Delete the old component
		EcoreUtil.remove(c);
		System.out.println("Element transformed to software component");
	}

	/*
	 * Transforms the given Sensor/Actuator to a PhysicalComponent
	 */
	public void transformToPhysicalComponent(PhysicalComponent c) {
		final PhysicalComponent newComponent = abcdFactory.eINSTANCE.createPhysicalComponent();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if (oldComponentContainer instanceof Component) {
			// This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		} else if (c.eContainer() instanceof Sector) {
			// This component is contained by a Sector
			final Sector container = (Sector) c.eContainer();
			container.getComponents().add(newComponent);
		} else if (oldComponentContainer instanceof Package) {
			// This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		// TODO: give to the new component the same size/position as the old one.

		// Delete the old component
		EcoreUtil.remove(c);
		System.out.println("Actuator/Sensor transformed to PhysicalComponent");
	}

	/*
	 * Transforms the given Component to a SoftwareComponent
	 */
	public void transformDownToSoftwareComponent(Component c) {
		final SoftwareComponent newComponent = abcdFactory.eINSTANCE.createSoftwareComponent();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if (oldComponentContainer instanceof Component) {
			// This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		} else if (oldComponentContainer instanceof Package) {
			// This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		// TODO: give to the new component the same size/position as the old one.

		// Delete the old component
		EcoreUtil.remove(c);
		System.out.println("Component transformed to software component");
	}

	/*
	 * Transforms the given Component to a PhysicalComponent
	 */
	public void transformDownToPhysicalComponent(Component c) {
		final PhysicalComponent newComponent = abcdFactory.eINSTANCE.createPhysicalComponent();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if (oldComponentContainer instanceof Component) {
			// This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		} else if (oldComponentContainer instanceof Package) {
			// This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		// TODO: give to the new component the same size/position as the old one.

		// Delete the old component
		EcoreUtil.remove(c);
		System.out.println("Component transformed to physical component");
	}

	/*
	 * Transforms the given PhysicalComponent to a Sensor
	 */
	public void transformDownToSensor(PhysicalComponent c) {
		final Sensor newComponent = abcdFactory.eINSTANCE.createSensor();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if (oldComponentContainer instanceof Component) {
			// This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		} else if (c.eContainer() instanceof Sector) {
			// This component is contained by a Sector
			final Sector container = (Sector) c.eContainer();
			container.getComponents().add(newComponent);
		} else if (oldComponentContainer instanceof Package) {
			// This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}

		// Copy all attributes
		// TODO: only copy output pins?
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		// TODO: give to the new component the same size/position as the old one.

		// Delete the old component
		EcoreUtil.remove(c);
		System.out.println("Physical Component transformed to sensor");
	}

	/*
	 * Transforms the given PhysicalComponent to an Actuator
	 */
	public void transformDownToActuator(PhysicalComponent c) {
		final Actuator newComponent = abcdFactory.eINSTANCE.createActuator();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if (oldComponentContainer instanceof Component) {
			// This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		} else if (c.eContainer() instanceof Sector) {
			// This component is contained by a Sector
			final Sector container = (Sector) c.eContainer();
			container.getComponents().add(newComponent);
		} else if (oldComponentContainer instanceof Package) {
			// This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}

		// Copy all attributes
		// TODO: only copy input pins?
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		// TODO: give to the new component the same size/position as the old one.

		// Delete the old component
		EcoreUtil.remove(c);
		System.out.println("Physical Component transformed to actuator");
	}

	/*
	 * Transforms the given SoftwareComponent to a MachineLearningComponent
	 */
	public void transformDownToMachineLearningComponent(SoftwareComponent c) {
		final MachineLearningComponent newComponent = abcdFactory.eINSTANCE.createMachineLearningComponent();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if (oldComponentContainer instanceof Component) {
			// This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		} else if (oldComponentContainer instanceof Package) {
			// This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		// TODO: give to the new component the same size/position as the old one.

		// Delete the old component
		EcoreUtil.remove(c);
		System.out.println("SoftwareComponent transformed to MachineLearningComponent");
	}

	/*
	 * Transforms the given SoftwareComponent to an Heuristic
	 */
	public void transformDownToHeuristic(SoftwareComponent c) {
		final Heuristic newComponent = abcdFactory.eINSTANCE.createHeuristic();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if (oldComponentContainer instanceof Component) {
			// This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		} else if (oldComponentContainer instanceof Package) {
			// This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		// TODO: give to the new component the same size/position as the old one.

		// Delete the old component
		EcoreUtil.remove(c);
		System.out.println("SoftwareComponent transformed to Heuristic");
	}

	/*
	 * Transforms the given SoftwareComponent to a Function
	 */
	public void transformDownToFunction(SoftwareComponent c) {
		final Function newComponent = abcdFactory.eINSTANCE.createFunction();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if (oldComponentContainer instanceof Component) {
			// This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		} else if (oldComponentContainer instanceof Package) {
			// This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		// TODO: give to the new component the same size/position as the old one.

		// Delete the old component
		EcoreUtil.remove(c);
		System.out.println("SoftwareComponent transformed to Function");
	}

	/*
	 * Transforms the given SoftwareComponent to an ExternalDependency
	 */
	public void transformDownToExternalDependency(SoftwareComponent c) {
		final ExternalDependency newComponent = abcdFactory.eINSTANCE.createExternalDependency();
		NamedElement oldComponentContainer = (NamedElement) c.eContainer();
		if (oldComponentContainer instanceof Component) {
			// This component is contained by another component
			((Component) oldComponentContainer).getComponents().add(newComponent);
		} else if (oldComponentContainer instanceof Package) {
			// This component is contained by a package
			((Package) oldComponentContainer).getComponents().add(newComponent);
		}

		// Copy all attributes
		newComponent.setName(c.getName());
		newComponent.getPins().addAll(c.getPins());
		newComponent.setSpecifiedInPackage(c.getSpecifiedInPackage());
		// External dependency usually don't have a main responsibile
		// newComponent.setMainResponsible(c.getMainResponsible());
		newComponent.getComponents().addAll(c.getComponents());

		// TODO: give to the new component the same size/position as the old one.

		// Delete the old component
		EcoreUtil.remove(c);
		System.out.println("SoftwareComponent transformed to ExternalDependency");
	}
}
