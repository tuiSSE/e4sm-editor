/**
 */
package de.ilmenau.tu.timenet.schema.scpn.impl;

import de.ilmenau.tu.timenet.schema.scpn.ArcType;
import de.ilmenau.tu.timenet.schema.scpn.CommentType;
import de.ilmenau.tu.timenet.schema.scpn.DefinitionType;
import de.ilmenau.tu.timenet.schema.scpn.ImmediateTransitionType;
import de.ilmenau.tu.timenet.schema.scpn.MeasureType;
import de.ilmenau.tu.timenet.schema.scpn.ModuleInstanceType;
import de.ilmenau.tu.timenet.schema.scpn.ModulePinType;
import de.ilmenau.tu.timenet.schema.scpn.PlaceType;
import de.ilmenau.tu.timenet.schema.scpn.ReplicationType;
import de.ilmenau.tu.timenet.schema.scpn.SubstitutionTransitionType;
import de.ilmenau.tu.timenet.schema.scpn.TimedTransitionType;
import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replication Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl#getTimedTransition <em>Timed Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl#getImmediateTransition <em>Immediate Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl#getSubstitutionTransition <em>Substitution Transition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl#getModuleInstance <em>Module Instance</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl#getModulePin <em>Module Pin</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.ReplicationTypeImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplicationTypeImpl extends NetTypeImpl implements ReplicationType {
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
	 * The cached value of the '{@link #getTimedTransition() <em>Timed Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimedTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<TimedTransitionType> timedTransition;

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
	 * The cached value of the '{@link #getSubstitutionTransition() <em>Substitution Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutionTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstitutionTransitionType> substitutionTransition;

	/**
	 * The cached value of the '{@link #getModuleInstance() <em>Module Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleInstanceType> moduleInstance;

	/**
	 * The cached value of the '{@link #getModulePin() <em>Module Pin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulePin()
	 * @generated
	 * @ordered
	 */
	protected EList<ModulePinType> modulePin;

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
	protected ReplicationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scpnPackage.Literals.REPLICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlaceType> getPlace() {
		if (place == null) {
			place = new EObjectContainmentEList<PlaceType>(PlaceType.class, this, scpnPackage.REPLICATION_TYPE__PLACE);
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimedTransitionType> getTimedTransition() {
		if (timedTransition == null) {
			timedTransition = new EObjectContainmentEList<TimedTransitionType>(TimedTransitionType.class, this,
					scpnPackage.REPLICATION_TYPE__TIMED_TRANSITION);
		}
		return timedTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImmediateTransitionType> getImmediateTransition() {
		if (immediateTransition == null) {
			immediateTransition = new EObjectContainmentEList<ImmediateTransitionType>(ImmediateTransitionType.class,
					this, scpnPackage.REPLICATION_TYPE__IMMEDIATE_TRANSITION);
		}
		return immediateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstitutionTransitionType> getSubstitutionTransition() {
		if (substitutionTransition == null) {
			substitutionTransition = new EObjectContainmentEList<SubstitutionTransitionType>(
					SubstitutionTransitionType.class, this, scpnPackage.REPLICATION_TYPE__SUBSTITUTION_TRANSITION);
		}
		return substitutionTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleInstanceType> getModuleInstance() {
		if (moduleInstance == null) {
			moduleInstance = new EObjectContainmentEList<ModuleInstanceType>(ModuleInstanceType.class, this,
					scpnPackage.REPLICATION_TYPE__MODULE_INSTANCE);
		}
		return moduleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModulePinType> getModulePin() {
		if (modulePin == null) {
			modulePin = new EObjectContainmentEList<ModulePinType>(ModulePinType.class, this,
					scpnPackage.REPLICATION_TYPE__MODULE_PIN);
		}
		return modulePin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArcType> getArc() {
		if (arc == null) {
			arc = new EObjectContainmentEList<ArcType>(ArcType.class, this, scpnPackage.REPLICATION_TYPE__ARC);
		}
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureType> getMeasure() {
		if (measure == null) {
			measure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this,
					scpnPackage.REPLICATION_TYPE__MEASURE);
		}
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefinitionType> getDefinition() {
		if (definition == null) {
			definition = new EObjectContainmentEList<DefinitionType>(DefinitionType.class, this,
					scpnPackage.REPLICATION_TYPE__DEFINITION);
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommentType> getComment() {
		if (comment == null) {
			comment = new EObjectContainmentEList<CommentType>(CommentType.class, this,
					scpnPackage.REPLICATION_TYPE__COMMENT);
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
		case scpnPackage.REPLICATION_TYPE__PLACE:
			return ((InternalEList<?>) getPlace()).basicRemove(otherEnd, msgs);
		case scpnPackage.REPLICATION_TYPE__TIMED_TRANSITION:
			return ((InternalEList<?>) getTimedTransition()).basicRemove(otherEnd, msgs);
		case scpnPackage.REPLICATION_TYPE__IMMEDIATE_TRANSITION:
			return ((InternalEList<?>) getImmediateTransition()).basicRemove(otherEnd, msgs);
		case scpnPackage.REPLICATION_TYPE__SUBSTITUTION_TRANSITION:
			return ((InternalEList<?>) getSubstitutionTransition()).basicRemove(otherEnd, msgs);
		case scpnPackage.REPLICATION_TYPE__MODULE_INSTANCE:
			return ((InternalEList<?>) getModuleInstance()).basicRemove(otherEnd, msgs);
		case scpnPackage.REPLICATION_TYPE__MODULE_PIN:
			return ((InternalEList<?>) getModulePin()).basicRemove(otherEnd, msgs);
		case scpnPackage.REPLICATION_TYPE__ARC:
			return ((InternalEList<?>) getArc()).basicRemove(otherEnd, msgs);
		case scpnPackage.REPLICATION_TYPE__MEASURE:
			return ((InternalEList<?>) getMeasure()).basicRemove(otherEnd, msgs);
		case scpnPackage.REPLICATION_TYPE__DEFINITION:
			return ((InternalEList<?>) getDefinition()).basicRemove(otherEnd, msgs);
		case scpnPackage.REPLICATION_TYPE__COMMENT:
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
		case scpnPackage.REPLICATION_TYPE__PLACE:
			return getPlace();
		case scpnPackage.REPLICATION_TYPE__TIMED_TRANSITION:
			return getTimedTransition();
		case scpnPackage.REPLICATION_TYPE__IMMEDIATE_TRANSITION:
			return getImmediateTransition();
		case scpnPackage.REPLICATION_TYPE__SUBSTITUTION_TRANSITION:
			return getSubstitutionTransition();
		case scpnPackage.REPLICATION_TYPE__MODULE_INSTANCE:
			return getModuleInstance();
		case scpnPackage.REPLICATION_TYPE__MODULE_PIN:
			return getModulePin();
		case scpnPackage.REPLICATION_TYPE__ARC:
			return getArc();
		case scpnPackage.REPLICATION_TYPE__MEASURE:
			return getMeasure();
		case scpnPackage.REPLICATION_TYPE__DEFINITION:
			return getDefinition();
		case scpnPackage.REPLICATION_TYPE__COMMENT:
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
		case scpnPackage.REPLICATION_TYPE__PLACE:
			getPlace().clear();
			getPlace().addAll((Collection<? extends PlaceType>) newValue);
			return;
		case scpnPackage.REPLICATION_TYPE__TIMED_TRANSITION:
			getTimedTransition().clear();
			getTimedTransition().addAll((Collection<? extends TimedTransitionType>) newValue);
			return;
		case scpnPackage.REPLICATION_TYPE__IMMEDIATE_TRANSITION:
			getImmediateTransition().clear();
			getImmediateTransition().addAll((Collection<? extends ImmediateTransitionType>) newValue);
			return;
		case scpnPackage.REPLICATION_TYPE__SUBSTITUTION_TRANSITION:
			getSubstitutionTransition().clear();
			getSubstitutionTransition().addAll((Collection<? extends SubstitutionTransitionType>) newValue);
			return;
		case scpnPackage.REPLICATION_TYPE__MODULE_INSTANCE:
			getModuleInstance().clear();
			getModuleInstance().addAll((Collection<? extends ModuleInstanceType>) newValue);
			return;
		case scpnPackage.REPLICATION_TYPE__MODULE_PIN:
			getModulePin().clear();
			getModulePin().addAll((Collection<? extends ModulePinType>) newValue);
			return;
		case scpnPackage.REPLICATION_TYPE__ARC:
			getArc().clear();
			getArc().addAll((Collection<? extends ArcType>) newValue);
			return;
		case scpnPackage.REPLICATION_TYPE__MEASURE:
			getMeasure().clear();
			getMeasure().addAll((Collection<? extends MeasureType>) newValue);
			return;
		case scpnPackage.REPLICATION_TYPE__DEFINITION:
			getDefinition().clear();
			getDefinition().addAll((Collection<? extends DefinitionType>) newValue);
			return;
		case scpnPackage.REPLICATION_TYPE__COMMENT:
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
		case scpnPackage.REPLICATION_TYPE__PLACE:
			getPlace().clear();
			return;
		case scpnPackage.REPLICATION_TYPE__TIMED_TRANSITION:
			getTimedTransition().clear();
			return;
		case scpnPackage.REPLICATION_TYPE__IMMEDIATE_TRANSITION:
			getImmediateTransition().clear();
			return;
		case scpnPackage.REPLICATION_TYPE__SUBSTITUTION_TRANSITION:
			getSubstitutionTransition().clear();
			return;
		case scpnPackage.REPLICATION_TYPE__MODULE_INSTANCE:
			getModuleInstance().clear();
			return;
		case scpnPackage.REPLICATION_TYPE__MODULE_PIN:
			getModulePin().clear();
			return;
		case scpnPackage.REPLICATION_TYPE__ARC:
			getArc().clear();
			return;
		case scpnPackage.REPLICATION_TYPE__MEASURE:
			getMeasure().clear();
			return;
		case scpnPackage.REPLICATION_TYPE__DEFINITION:
			getDefinition().clear();
			return;
		case scpnPackage.REPLICATION_TYPE__COMMENT:
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
		case scpnPackage.REPLICATION_TYPE__PLACE:
			return place != null && !place.isEmpty();
		case scpnPackage.REPLICATION_TYPE__TIMED_TRANSITION:
			return timedTransition != null && !timedTransition.isEmpty();
		case scpnPackage.REPLICATION_TYPE__IMMEDIATE_TRANSITION:
			return immediateTransition != null && !immediateTransition.isEmpty();
		case scpnPackage.REPLICATION_TYPE__SUBSTITUTION_TRANSITION:
			return substitutionTransition != null && !substitutionTransition.isEmpty();
		case scpnPackage.REPLICATION_TYPE__MODULE_INSTANCE:
			return moduleInstance != null && !moduleInstance.isEmpty();
		case scpnPackage.REPLICATION_TYPE__MODULE_PIN:
			return modulePin != null && !modulePin.isEmpty();
		case scpnPackage.REPLICATION_TYPE__ARC:
			return arc != null && !arc.isEmpty();
		case scpnPackage.REPLICATION_TYPE__MEASURE:
			return measure != null && !measure.isEmpty();
		case scpnPackage.REPLICATION_TYPE__DEFINITION:
			return definition != null && !definition.isEmpty();
		case scpnPackage.REPLICATION_TYPE__COMMENT:
			return comment != null && !comment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReplicationTypeImpl
