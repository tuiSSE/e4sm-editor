/**
 */
package e4sm.de.metamodel.e4sm.impl;

import e4sm.de.metamodel.e4sm.ClassificationClass;
import e4sm.de.metamodel.e4sm.ConfusionMatrixEntry;
import e4sm.de.metamodel.e4sm.MulticlassConfusionMatrix;
import e4sm.de.metamodel.e4sm.e4smPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiclass Confusion Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link e4sm.de.metamodel.e4sm.impl.MulticlassConfusionMatrixImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MulticlassConfusionMatrixImpl extends ConfusionMatrixImpl implements MulticlassConfusionMatrix {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfusionMatrixEntry> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MulticlassConfusionMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return e4smPackage.Literals.MULTICLASS_CONFUSION_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfusionMatrixEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<ConfusionMatrixEntry>(ConfusionMatrixEntry.class, this,
					e4smPackage.MULTICLASS_CONFUSION_MATRIX__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ClassificationClass> getClasses() {
		return ECollections
				.toEList(this.entries.stream().map(a -> a.getTruth()).distinct().collect(Collectors.toList()));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public int getTP(ClassificationClass class_) {
		java.util.Optional<ConfusionMatrixEntry> res = this.getEntries().stream()
				.filter(e -> e.getTruth() == e.getPredicted() && e.getTruth() == class_).findFirst();
		if (res.isPresent()) {
			return res.get().getValue();
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public int getFP(ClassificationClass class_) {
		return this.getEntries().stream().filter(e -> e.getPredicted() == class_ && e.getPredicted() != e.getTruth())
				.map(e -> e.getValue()).reduce(0, Integer::sum);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public int getTN(ClassificationClass class_) {
		return this.getEntries().stream().filter(e -> e.getTruth() != class_ && e.getPredicted() != class_)
				.map(e -> e.getValue()).reduce(0, Integer::sum);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public int getFN(ClassificationClass class_) {
		return this.getEntries().stream().filter(e -> e.getTruth() == class_ && e.getPredicted() != e.getTruth())
				.map(e -> e.getValue()).reduce(0, Integer::sum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Computes the macro accuracy
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computeAccuracy() {
		var classes = this.getClasses();
		double recallSum = 0;
		for (int i = 0; i < classes.size(); i++) {
			recallSum += this.computeClassAccuracy(classes.get(i));
		}
		return recallSum / classes.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Computes the macro recall
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computeRecall() {
		var classes = this.getClasses();
		double recallSum = 0;
		for (int i = 0; i < classes.size(); i++) {
			recallSum += this.computeClassRecall(classes.get(i));
		}
		return recallSum / classes.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Computes the macro precision
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computePrecision() {
		var classes = this.getClasses();
		double precisionSum = 0;
		for (int i = 0; i < classes.size(); i++) {
			precisionSum += this.computeClassPrecision(classes.get(i));
		}
		return precisionSum / classes.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the macro F1 score
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computeF1Score() {
		var classes = this.getClasses();
		double f1Sum = 0;
		for (int i = 0; i < classes.size(); i++) {
			f1Sum += this.computeClassF1Score(classes.get(i));
		}
		return f1Sum / classes.size();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public double computeBalancedAccuracy() {
		var classes = this.getClasses();
		double recallSum = 0;
		for (int i = 0; i < classes.size(); i++) {
			recallSum += this.computeClassRecall(classes.get(i));
		}
		return recallSum / classes.size();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public double computeClassAccuracy(ClassificationClass class_) {
		double tp, fp, tn, fn;
		tp = this.getTP(class_);
		fp = this.getFP(class_);
		tn = this.getTN(class_);
		fn = this.getFN(class_);
		return (tp + tn) / (tp + fp + tn + fn);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public double computeClassRecall(ClassificationClass class_) {
		double tp, fn;
		tp = this.getTP(class_);
		fn = this.getFN(class_);
		return tp / (tp + fn);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public double computeClassPrecision(ClassificationClass class_) {
		double tp, fp;
		tp = this.getTP(class_);
		fp = this.getFP(class_);
		return (tp) / (tp + fp);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public double computeClassF1Score(ClassificationClass class_) {
		double recall = this.computeClassRecall(class_);
		double precision = this.computeClassPrecision(class_);
		return 2 * (recall * precision) / (recall + precision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computeClassSpecificity(ClassificationClass class_) {
		double fp, tn;
		fp = this.getFP(class_);
		tn = this.getTN(class_);
		return (tn) / (tn + fp);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * computes the macro specificity
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double computeSpecificity() {
		var classes = this.getClasses();
		double specificitySum = 0;
		for (int i = 0; i < classes.size(); i++) {
			specificitySum += this.computeClassSpecificity(classes.get(i));
		}
		return specificitySum / classes.size();		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getHighestValue() {
		return this.entries.stream().mapToInt(e -> e.getValue()).max().orElse(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX__ENTRIES:
			return ((InternalEList<?>) getEntries()).basicRemove(otherEnd, msgs);
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
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX__ENTRIES:
			return getEntries();
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
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX__ENTRIES:
			getEntries().clear();
			getEntries().addAll((Collection<? extends ConfusionMatrixEntry>) newValue);
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
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX__ENTRIES:
			getEntries().clear();
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
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX__ENTRIES:
			return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX___GET_CLASSES:
			return getClasses();
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX___GET_TP__CLASSIFICATIONCLASS:
			return getTP((ClassificationClass) arguments.get(0));
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX___GET_FP__CLASSIFICATIONCLASS:
			return getFP((ClassificationClass) arguments.get(0));
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX___GET_TN__CLASSIFICATIONCLASS:
			return getTN((ClassificationClass) arguments.get(0));
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX___GET_FN__CLASSIFICATIONCLASS:
			return getFN((ClassificationClass) arguments.get(0));
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX___COMPUTE_BALANCED_ACCURACY:
			return computeBalancedAccuracy();
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_ACCURACY__CLASSIFICATIONCLASS:
			return computeClassAccuracy((ClassificationClass) arguments.get(0));
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_RECALL__CLASSIFICATIONCLASS:
			return computeClassRecall((ClassificationClass) arguments.get(0));
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_PRECISION__CLASSIFICATIONCLASS:
			return computeClassPrecision((ClassificationClass) arguments.get(0));
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_F1_SCORE__CLASSIFICATIONCLASS:
			return computeClassF1Score((ClassificationClass) arguments.get(0));
		case e4smPackage.MULTICLASS_CONFUSION_MATRIX___COMPUTE_CLASS_SPECIFICITY__CLASSIFICATIONCLASS:
			return computeClassSpecificity((ClassificationClass) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MulticlassConfusionMatrixImpl
