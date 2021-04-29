package e4sm.de.metamodel.design;

import org.eclipse.core.expressions.PropertyTester;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.diagram.ui.edit.api.part.IDiagramElementEditPart;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;

/**
 * Test if the button for starting the Data flow analysis should be shown.
 * 
 * @author mporhel
 * Adapted from: https://www.eclipse.org/sirius/doc/developer/extensions-provide_tabbar_extensions.html
 */
public class DataFlowTabbarExtensionActivationPropertyTester extends PropertyTester {
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
    	System.err.println(property);
    	return true;
        /*if ("isConcernedEditor".equals(property)) {
            // called in a with activeEditor element
            if (receiver instanceof DialectEditor) {
                DRepresentation activeRepresentation = ((DialectEditor) receiver).getRepresentation();
                if (activeRepresentation instanceof DDiagram) {
                    // the id property in the VSM editor : name in the meta
                    // model.
                	System.out.println(((DDiagram) activeRepresentation).getDescription().getName());
                    return "e4sm_diagram_2".equals(((DDiagram) activeRepresentation).getDescription().getName());
                }
            }
        } else if ("org.eclipse.sirius.diagram.ui.part.SiriusDiagramEditorID".equals(property)) {
            if (receiver instanceof IDiagramElementEditPart) {
            	return true;
                //EObject domainElement = ((IDiagramElementEditPart) receiver).resolveTargetSemanticElement();
                // sample condition
                //return domainElement instanceof EClass && ((EClass) domainElement).isAbstract();
            }
        }
        return false;
        */
    }
}
