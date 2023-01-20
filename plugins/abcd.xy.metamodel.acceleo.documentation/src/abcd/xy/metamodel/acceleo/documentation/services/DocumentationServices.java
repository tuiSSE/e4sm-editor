package abcd.xy.metamodel.acceleo.documentation.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;

public class DocumentationServices {

    public String getXMIID(EObject eObject) {
        if (eObject.eResource() instanceof XMIResource) {
            return ((XMIResource)eObject.eResource()).getID(eObject);
        }
        return EcoreUtil.getURI(eObject).toString(); // TODO: only keep the last part of the URI
    }
}
