/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.util;

import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage;

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
public class EDSPNXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDSPNXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EDSPNPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the EDSPNResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EDSPNResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EDSPNResourceFactoryImpl());
		}
		return registrations;
	}

} //EDSPNXMLProcessor
