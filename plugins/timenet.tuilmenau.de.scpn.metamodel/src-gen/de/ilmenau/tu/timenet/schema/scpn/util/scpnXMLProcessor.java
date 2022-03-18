/**
 */
package de.ilmenau.tu.timenet.schema.scpn.util;

import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class scpnXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scpnXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		scpnPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the scpnResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new scpnResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new scpnResourceFactoryImpl());
		}
		return registrations;
	}

} //scpnXMLProcessor
