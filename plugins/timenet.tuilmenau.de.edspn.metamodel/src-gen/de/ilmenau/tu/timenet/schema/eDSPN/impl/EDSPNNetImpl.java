/**
 */
package de.ilmenau.tu.timenet.schema.eDSPN.impl;

import de.ilmenau.tu.timenet.schema.eDSPN.ArcType;
import de.ilmenau.tu.timenet.schema.eDSPN.CommentType;
import de.ilmenau.tu.timenet.schema.eDSPN.DefinitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.DeterministicTransitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNNet;
import de.ilmenau.tu.timenet.schema.eDSPN.EDSPNPackage;
import de.ilmenau.tu.timenet.schema.eDSPN.ExponentialTransitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.GeneralTransitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.ImmediateTransitionType;
import de.ilmenau.tu.timenet.schema.eDSPN.InhibitType;
import de.ilmenau.tu.timenet.schema.eDSPN.MeasureType;
import de.ilmenau.tu.timenet.schema.eDSPN.PlaceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl#getExponentialTransition <em>Exponential Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl#getImmediateTransition <em>Immediate Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl#getDeterministicTransition <em>Deterministic Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl#getGeneralTransition <em>General Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl#getInhibit <em>Inhibit</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.eDSPN.impl.EDSPNNetImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDSPNNetImpl extends NetTypeImpl implements EDSPNNet {
	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<PlaceType> place;

	/**
	 * The cached value of the '{@link #getExponentialTransition() <em>Exponential Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponentialTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ExponentialTransitionType> exponentialTransition;

	/**
	 * The cached value of the '{@link #getImmediateTransition() <em>Immediate Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediateTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ImmediateTransitionType> immediateTransition;

	/**
	 * The cached value of the '{@link #getDeterministicTransition() <em>Deterministic Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeterministicTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<DeterministicTransitionType> deterministicTransition;

	/**
	 * The cached value of the '{@link #getGeneralTransition() <em>General Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralTransitionType> generalTransition;

	/**
	 * The cached value of the '{@link #getArc() <em>Arc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArc()
	 * @generated
	 * @ordered
	 */
	protected EList<ArcType> arc;

	/**
	 * The cached value of the '{@link #getInhibit() <em>Inhibit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhibit()
	 * @generated
	 * @ordered
	 */
	protected EList<InhibitType> inhibit;

	/**
	 * The cached value of the '{@link #getMeasure() <em>Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> measure;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinitionType> definition;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected EList<CommentType> comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDSPNNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDSPNPackage.Literals.EDSPN_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlaceType> getPlace() {
		if (place == null) {
			place = new EObjectContainmentEList<PlaceType>(PlaceType.class, this, EDSPNPackage.EDSPN_NET__PLACE);
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExponentialTransitionType> getExponentialTransition() {
		if (exponentialTransition == null) {
			exponentialTransition = new EObjectContainmentEList<ExponentialTransitionType>(
					ExponentialTransitionType.class, this, EDSPNPackage.EDSPN_NET__EXPONENTIAL_TRANSITION);
		}
		return exponentialTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImmediateTransitionType> getImmediateTransition() {
		if (immediateTransition == null) {
			immediateTransition = new EObjectContainmentEList<ImmediateTransitionType>(ImmediateTransitionType.class,
					this, EDSPNPackage.EDSPN_NET__IMMEDIATE_TRANSITION);
		}
		return immediateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeterministicTransitionType> getDeterministicTransition() {
		if (deterministicTransition == null) {
			deterministicTransition = new EObjectContainmentEList<DeterministicTransitionType>(
					DeterministicTransitionType.class, this, EDSPNPackage.EDSPN_NET__DETERMINISTIC_TRANSITION);
		}
		return deterministicTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralTransitionType> getGeneralTransition() {
		if (generalTransition == null) {
			generalTransition = new EObjectContainmentEList<GeneralTransitionType>(GeneralTransitionType.class, this,
					EDSPNPackage.EDSPN_NET__GENERAL_TRANSITION);
		}
		return generalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArcType> getArc() {
		if (arc == null) {
			arc = new EObjectContainmentEList<ArcType>(ArcType.class, this, EDSPNPackage.EDSPN_NET__ARC);
		}
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InhibitType> getInhibit() {
		if (inhibit == null) {
			inhibit = new EObjectContainmentEList<InhibitType>(InhibitType.class, this,
					EDSPNPackage.EDSPN_NET__INHIBIT);
		}
		return inhibit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMeasure() {
		if (measure == null) {
			measure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this,
					EDSPNPackage.EDSPN_NET__MEASURE);
		}
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefinitionType> getDefinition() {
		if (definition == null) {
			definition = new EObjectContainmentEList<DefinitionType>(DefinitionType.class, this,
					EDSPNPackage.EDSPN_NET__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommentType> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<CommentType>(CommentType.class, this,
					EDSPNPackage.EDSPN_NET__COMMENT);
		}
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDSPNPackage.EDSPN_NET__PLACE:
			return ((InternalEList<?>) getPlace()).basicRemove(otherEnd, msgs);
		case EDSPNPackage.EDSPN_NET__EXPONENTIAL_TRANSITION:
			return ((InternalEList<?>) getExponentialTransition()).basicRemove(otherEnd, msgs);
		case EDSPNPackage.EDSPN_NET__IMMEDIATE_TRANSITION:
			return ((InternalEList<?>) getImmediateTransition()).basicRemove(otherEnd, msgs);
		case EDSPNPackage.EDSPN_NET__DETERMINISTIC_TRANSITION:
			return ((InternalEList<?>) getDeterministicTransition()).basicRemove(otherEnd, msgs);
		case EDSPNPackage.EDSPN_NET__GENERAL_TRANSITION:
			return ((InternalEList<?>) getGeneralTransition()).basicRemove(otherEnd, msgs);
		case EDSPNPackage.EDSPN_NET__ARC:
			return ((InternalEList<?>) getArc()).basicRemove(otherEnd, msgs);
		case EDSPNPackage.EDSPN_NET__INHIBIT:
			return ((InternalEList<?>) getInhibit()).basicRemove(otherEnd, msgs);
		case EDSPNPackage.EDSPN_NET__MEASURE:
			return ((InternalEList<?>) getMeasure()).basicRemove(otherEnd, msgs);
		case EDSPNPackage.EDSPN_NET__DEFINITION:
			return ((InternalEList<?>) getDefinition()).basicRemove(otherEnd, msgs);
		case EDSPNPackage.EDSPN_NET__COMMENT:
			return ((InternalEList<?>) getComment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDSPNPackage.EDSPN_NET__PLACE:
			return getPlace();
		case EDSPNPackage.EDSPN_NET__EXPONENTIAL_TRANSITION:
			return getExponentialTransition();
		case EDSPNPackage.EDSPN_NET__IMMEDIATE_TRANSITION:
			return getImmediateTransition();
		case EDSPNPackage.EDSPN_NET__DETERMINISTIC_TRANSITION:
			return getDeterministicTransition();
		case EDSPNPackage.EDSPN_NET__GENERAL_TRANSITION:
			return getGeneralTransition();
		case EDSPNPackage.EDSPN_NET__ARC:
			return getArc();
		case EDSPNPackage.EDSPN_NET__INHIBIT:
			return getInhibit();
		case EDSPNPackage.EDSPN_NET__MEASURE:
			return getMeasure();
		case EDSPNPackage.EDSPN_NET__DEFINITION:
			return getDefinition();
		case EDSPNPackage.EDSPN_NET__COMMENT:
			return getComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EDSPNPackage.EDSPN_NET__PLACE:
			getPlace().clear();
			getPlace().addAll((Collection<? extends PlaceType>) newValue);
			return;
		case EDSPNPackage.EDSPN_NET__EXPONENTIAL_TRANSITION:
			getExponentialTransition().clear();
			getExponentialTransition().addAll((Collection<? extends ExponentialTransitionType>) newValue);
			return;
		case EDSPNPackage.EDSPN_NET__IMMEDIATE_TRANSITION:
			getImmediateTransition().clear();
			getImmediateTransition().addAll((Collection<? extends ImmediateTransitionType>) newValue);
			return;
		case EDSPNPackage.EDSPN_NET__DETERMINISTIC_TRANSITION:
			getDeterministicTransition().clear();
			getDeterministicTransition().addAll((Collection<? extends DeterministicTransitionType>) newValue);
			return;
		case EDSPNPackage.EDSPN_NET__GENERAL_TRANSITION:
			getGeneralTransition().clear();
			getGeneralTransition().addAll((Collection<? extends GeneralTransitionType>) newValue);
			return;
		case EDSPNPackage.EDSPN_NET__ARC:
			getArc().clear();
			getArc().addAll((Collection<? extends ArcType>) newValue);
			return;
		case EDSPNPackage.EDSPN_NET__INHIBIT:
			getInhibit().clear();
			getInhibit().addAll((Collection<? extends InhibitType>) newValue);
			return;
		case EDSPNPackage.EDSPN_NET__MEASURE:
			getMeasure().clear();
			getMeasure().addAll((Collection<? extends MeasureType>) newValue);
			return;
		case EDSPNPackage.EDSPN_NET__DEFINITION:
			getDefinition().clear();
			getDefinition().addAll((Collection<? extends DefinitionType>) newValue);
			return;
		case EDSPNPackage.EDSPN_NET__COMMENT:
			getComment().clear();
			getComment().addAll((Collection<? extends CommentType>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EDSPNPackage.EDSPN_NET__PLACE:
			getPlace().clear();
			return;
		case EDSPNPackage.EDSPN_NET__EXPONENTIAL_TRANSITION:
			getExponentialTransition().clear();
			return;
		case EDSPNPackage.EDSPN_NET__IMMEDIATE_TRANSITION:
			getImmediateTransition().clear();
			return;
		case EDSPNPackage.EDSPN_NET__DETERMINISTIC_TRANSITION:
			getDeterministicTransition().clear();
			return;
		case EDSPNPackage.EDSPN_NET__GENERAL_TRANSITION:
			getGeneralTransition().clear();
			return;
		case EDSPNPackage.EDSPN_NET__ARC:
			getArc().clear();
			return;
		case EDSPNPackage.EDSPN_NET__INHIBIT:
			getInhibit().clear();
			return;
		case EDSPNPackage.EDSPN_NET__MEASURE:
			getMeasure().clear();
			return;
		case EDSPNPackage.EDSPN_NET__DEFINITION:
			getDefinition().clear();
			return;
		case EDSPNPackage.EDSPN_NET__COMMENT:
			getComment().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EDSPNPackage.EDSPN_NET__PLACE:
			return place != null && !place.isEmpty();
		case EDSPNPackage.EDSPN_NET__EXPONENTIAL_TRANSITION:
			return exponentialTransition != null && !exponentialTransition.isEmpty();
		case EDSPNPackage.EDSPN_NET__IMMEDIATE_TRANSITION:
			return immediateTransition != null && !immediateTransition.isEmpty();
		case EDSPNPackage.EDSPN_NET__DETERMINISTIC_TRANSITION:
			return deterministicTransition != null && !deterministicTransition.isEmpty();
		case EDSPNPackage.EDSPN_NET__GENERAL_TRANSITION:
			return generalTransition != null && !generalTransition.isEmpty();
		case EDSPNPackage.EDSPN_NET__ARC:
			return arc != null && !arc.isEmpty();
		case EDSPNPackage.EDSPN_NET__INHIBIT:
			return inhibit != null && !inhibit.isEmpty();
		case EDSPNPackage.EDSPN_NET__MEASURE:
			return measure != null && !measure.isEmpty();
		case EDSPNPackage.EDSPN_NET__DEFINITION:
			return definition != null && !definition.isEmpty();
		case EDSPNPackage.EDSPN_NET__COMMENT:
			return comment != null && !comment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EDSPNNetImpl
