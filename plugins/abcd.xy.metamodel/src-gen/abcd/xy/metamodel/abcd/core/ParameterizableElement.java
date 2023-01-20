/**
 */
package abcd.xy.metamodel.abcd.core;

import abcd.xy.metamodel.abcd.analysis.Parameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterizable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link abcd.xy.metamodel.abcd.core.ParameterizableElement#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see abcd.xy.metamodel.abcd.core.CorePackage#getParameterizableElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ParameterizableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link abcd.xy.metamodel.abcd.analysis.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see abcd.xy.metamodel.abcd.core.CorePackage#getParameterizableElement_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // ParameterizableElement
