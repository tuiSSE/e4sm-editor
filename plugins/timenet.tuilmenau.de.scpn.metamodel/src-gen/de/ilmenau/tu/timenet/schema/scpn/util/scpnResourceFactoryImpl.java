/**
 */
package de.ilmenau.tu.timenet.schema.scpn.util;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;

import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see de.ilmenau.tu.timenet.schema.scpn.util.scpnResourceImpl
 * @generated
 */
public class scpnResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scpnResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Resource createResource(URI uri) {
		// Manually added:
		final ExtendedMetaData ext = new BasicExtendedMetaData(ExtendedMetaData.ANNOTATION_URI, EPackage.Registry.INSTANCE, new HashMap<>());
		ext.setQualified(scpnPackage.eINSTANCE, false);
		ext.setName(scpnPackage.Literals.SCPN_NET, "net");
		
		//Generated code:
		XMLResource result = new scpnResourceImpl(uri);
		
		result.getDefaultSaveOptions().put(XMLResource.OPTION_XML_VERSION, "1.0"); //String
		result.getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, "UTF-8"); //String
		result.getDefaultSaveOptions().put(XMLResource.OPTION_LINE_WIDTH, 10); //Integer
		
		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, ext); //Boolean.TRUE
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, ext); //Boolean.TRUE

		result.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		return result;
	}

} //scpnResourceFactoryImpl
