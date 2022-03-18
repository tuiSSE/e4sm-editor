/**
 */
package de.ilmenau.tu.timenet.schema.scpn.impl;

import de.ilmenau.tu.timenet.schema.scpn.LabelType;
import de.ilmenau.tu.timenet.schema.scpn.ServerTypeType;
import de.ilmenau.tu.timenet.schema.scpn.SpecTypeType;
import de.ilmenau.tu.timenet.schema.scpn.TransitionType;
import de.ilmenau.tu.timenet.schema.scpn.scpnPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#getDisplayExpression <em>Display Expression</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#getGlobalGuard <em>Global Guard</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#getLocalGuard <em>Local Guard</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#getLogfileDescription <em>Logfile Description</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#getLogfileExpression <em>Logfile Expression</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#getLogfileName <em>Logfile Name</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#getManualCode <em>Manual Code</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#getServerType <em>Server Type</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#getSpecType <em>Spec Type</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#isTakeFirst <em>Take First</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#getTimeGuard <em>Time Guard</em>}</li>
 *   <li>{@link de.ilmenau.tu.timenet.schema.scpn.impl.TransitionTypeImpl#isWatch <em>Watch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionTypeImpl extends NodeTypeImpl implements TransitionType {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected LabelType label;

	/**
	 * The default value of the '{@link #getDisplayExpression() <em>Display Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayExpression() <em>Display Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayExpression()
	 * @generated
	 * @ordered
	 */
	protected String displayExpression = DISPLAY_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlobalGuard() <em>Global Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalGuard() <em>Global Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalGuard()
	 * @generated
	 * @ordered
	 */
	protected String globalGuard = GLOBAL_GUARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalGuard() <em>Local Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalGuard() <em>Local Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalGuard()
	 * @generated
	 * @ordered
	 */
	protected String localGuard = LOCAL_GUARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogfileDescription() <em>Logfile Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogfileDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGFILE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogfileDescription() <em>Logfile Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogfileDescription()
	 * @generated
	 * @ordered
	 */
	protected String logfileDescription = LOGFILE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogfileExpression() <em>Logfile Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogfileExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGFILE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogfileExpression() <em>Logfile Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogfileExpression()
	 * @generated
	 * @ordered
	 */
	protected String logfileExpression = LOGFILE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogfileName() <em>Logfile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogfileName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGFILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogfileName() <em>Logfile Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogfileName()
	 * @generated
	 * @ordered
	 */
	protected String logfileName = LOGFILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getManualCode() <em>Manual Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualCode()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManualCode() <em>Manual Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualCode()
	 * @generated
	 * @ordered
	 */
	protected String manualCode = MANUAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerType() <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerType()
	 * @generated
	 * @ordered
	 */
	protected static final ServerTypeType SERVER_TYPE_EDEFAULT = ServerTypeType.EXCLUSIVE_SERVER;

	/**
	 * The cached value of the '{@link #getServerType() <em>Server Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerType()
	 * @generated
	 * @ordered
	 */
	protected ServerTypeType serverType = SERVER_TYPE_EDEFAULT;

	/**
	 * This is true if the Server Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverTypeESet;

	/**
	 * The default value of the '{@link #getSpecType() <em>Spec Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecType()
	 * @generated
	 * @ordered
	 */
	protected static final SpecTypeType SPEC_TYPE_EDEFAULT = SpecTypeType.AUTOMATIC;

	/**
	 * The cached value of the '{@link #getSpecType() <em>Spec Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecType()
	 * @generated
	 * @ordered
	 */
	protected SpecTypeType specType = SPEC_TYPE_EDEFAULT;

	/**
	 * This is true if the Spec Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specTypeESet;

	/**
	 * The default value of the '{@link #isTakeFirst() <em>Take First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTakeFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAKE_FIRST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTakeFirst() <em>Take First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTakeFirst()
	 * @generated
	 * @ordered
	 */
	protected boolean takeFirst = TAKE_FIRST_EDEFAULT;

	/**
	 * This is true if the Take First attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean takeFirstESet;

	/**
	 * The default value of the '{@link #getTimeGuard() <em>Time Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeGuard() <em>Time Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeGuard()
	 * @generated
	 * @ordered
	 */
	protected String timeGuard = TIME_GUARD_EDEFAULT;

	/**
	 * The default value of the '{@link #isWatch() <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWatch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WATCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWatch() <em>Watch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWatch()
	 * @generated
	 * @ordered
	 */
	protected boolean watch = WATCH_EDEFAULT;

	/**
	 * This is true if the Watch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean watchESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scpnPackage.Literals.TRANSITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(LabelType newLabel, NotificationChain msgs) {
		LabelType oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					scpnPackage.TRANSITION_TYPE__LABEL, oldLabel, newLabel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(LabelType newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject) label).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - scpnPackage.TRANSITION_TYPE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject) newLabel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - scpnPackage.TRANSITION_TYPE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__LABEL, newLabel,
					newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayExpression() {
		return displayExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayExpression(String newDisplayExpression) {
		String oldDisplayExpression = displayExpression;
		displayExpression = newDisplayExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__DISPLAY_EXPRESSION,
					oldDisplayExpression, displayExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlobalGuard() {
		return globalGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalGuard(String newGlobalGuard) {
		String oldGlobalGuard = globalGuard;
		globalGuard = newGlobalGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__GLOBAL_GUARD,
					oldGlobalGuard, globalGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalGuard() {
		return localGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalGuard(String newLocalGuard) {
		String oldLocalGuard = localGuard;
		localGuard = newLocalGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__LOCAL_GUARD,
					oldLocalGuard, localGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogfileDescription() {
		return logfileDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogfileDescription(String newLogfileDescription) {
		String oldLogfileDescription = logfileDescription;
		logfileDescription = newLogfileDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__LOGFILE_DESCRIPTION,
					oldLogfileDescription, logfileDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogfileExpression() {
		return logfileExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogfileExpression(String newLogfileExpression) {
		String oldLogfileExpression = logfileExpression;
		logfileExpression = newLogfileExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__LOGFILE_EXPRESSION,
					oldLogfileExpression, logfileExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogfileName() {
		return logfileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogfileName(String newLogfileName) {
		String oldLogfileName = logfileName;
		logfileName = newLogfileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__LOGFILE_NAME,
					oldLogfileName, logfileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManualCode() {
		return manualCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManualCode(String newManualCode) {
		String oldManualCode = manualCode;
		manualCode = newManualCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__MANUAL_CODE,
					oldManualCode, manualCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerTypeType getServerType() {
		return serverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerType(ServerTypeType newServerType) {
		ServerTypeType oldServerType = serverType;
		serverType = newServerType == null ? SERVER_TYPE_EDEFAULT : newServerType;
		boolean oldServerTypeESet = serverTypeESet;
		serverTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__SERVER_TYPE,
					oldServerType, serverType, !oldServerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetServerType() {
		ServerTypeType oldServerType = serverType;
		boolean oldServerTypeESet = serverTypeESet;
		serverType = SERVER_TYPE_EDEFAULT;
		serverTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scpnPackage.TRANSITION_TYPE__SERVER_TYPE,
					oldServerType, SERVER_TYPE_EDEFAULT, oldServerTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetServerType() {
		return serverTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecTypeType getSpecType() {
		return specType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecType(SpecTypeType newSpecType) {
		SpecTypeType oldSpecType = specType;
		specType = newSpecType == null ? SPEC_TYPE_EDEFAULT : newSpecType;
		boolean oldSpecTypeESet = specTypeESet;
		specTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__SPEC_TYPE, oldSpecType,
					specType, !oldSpecTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSpecType() {
		SpecTypeType oldSpecType = specType;
		boolean oldSpecTypeESet = specTypeESet;
		specType = SPEC_TYPE_EDEFAULT;
		specTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scpnPackage.TRANSITION_TYPE__SPEC_TYPE, oldSpecType,
					SPEC_TYPE_EDEFAULT, oldSpecTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSpecType() {
		return specTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTakeFirst() {
		return takeFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTakeFirst(boolean newTakeFirst) {
		boolean oldTakeFirst = takeFirst;
		takeFirst = newTakeFirst;
		boolean oldTakeFirstESet = takeFirstESet;
		takeFirstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__TAKE_FIRST, oldTakeFirst,
					takeFirst, !oldTakeFirstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTakeFirst() {
		boolean oldTakeFirst = takeFirst;
		boolean oldTakeFirstESet = takeFirstESet;
		takeFirst = TAKE_FIRST_EDEFAULT;
		takeFirstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scpnPackage.TRANSITION_TYPE__TAKE_FIRST,
					oldTakeFirst, TAKE_FIRST_EDEFAULT, oldTakeFirstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTakeFirst() {
		return takeFirstESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeGuard() {
		return timeGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeGuard(String newTimeGuard) {
		String oldTimeGuard = timeGuard;
		timeGuard = newTimeGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__TIME_GUARD, oldTimeGuard,
					timeGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWatch() {
		return watch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWatch(boolean newWatch) {
		boolean oldWatch = watch;
		watch = newWatch;
		boolean oldWatchESet = watchESet;
		watchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scpnPackage.TRANSITION_TYPE__WATCH, oldWatch, watch,
					!oldWatchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWatch() {
		boolean oldWatch = watch;
		boolean oldWatchESet = watchESet;
		watch = WATCH_EDEFAULT;
		watchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scpnPackage.TRANSITION_TYPE__WATCH, oldWatch,
					WATCH_EDEFAULT, oldWatchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWatch() {
		return watchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case scpnPackage.TRANSITION_TYPE__LABEL:
			return basicSetLabel(null, msgs);
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
		case scpnPackage.TRANSITION_TYPE__LABEL:
			return getLabel();
		case scpnPackage.TRANSITION_TYPE__DISPLAY_EXPRESSION:
			return getDisplayExpression();
		case scpnPackage.TRANSITION_TYPE__GLOBAL_GUARD:
			return getGlobalGuard();
		case scpnPackage.TRANSITION_TYPE__LOCAL_GUARD:
			return getLocalGuard();
		case scpnPackage.TRANSITION_TYPE__LOGFILE_DESCRIPTION:
			return getLogfileDescription();
		case scpnPackage.TRANSITION_TYPE__LOGFILE_EXPRESSION:
			return getLogfileExpression();
		case scpnPackage.TRANSITION_TYPE__LOGFILE_NAME:
			return getLogfileName();
		case scpnPackage.TRANSITION_TYPE__MANUAL_CODE:
			return getManualCode();
		case scpnPackage.TRANSITION_TYPE__PATH:
			return getPath();
		case scpnPackage.TRANSITION_TYPE__SERVER_TYPE:
			return getServerType();
		case scpnPackage.TRANSITION_TYPE__SPEC_TYPE:
			return getSpecType();
		case scpnPackage.TRANSITION_TYPE__TAKE_FIRST:
			return isTakeFirst();
		case scpnPackage.TRANSITION_TYPE__TIME_GUARD:
			return getTimeGuard();
		case scpnPackage.TRANSITION_TYPE__WATCH:
			return isWatch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case scpnPackage.TRANSITION_TYPE__LABEL:
			setLabel((LabelType) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__DISPLAY_EXPRESSION:
			setDisplayExpression((String) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__GLOBAL_GUARD:
			setGlobalGuard((String) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__LOCAL_GUARD:
			setLocalGuard((String) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__LOGFILE_DESCRIPTION:
			setLogfileDescription((String) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__LOGFILE_EXPRESSION:
			setLogfileExpression((String) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__LOGFILE_NAME:
			setLogfileName((String) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__MANUAL_CODE:
			setManualCode((String) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__PATH:
			setPath((String) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__SERVER_TYPE:
			setServerType((ServerTypeType) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__SPEC_TYPE:
			setSpecType((SpecTypeType) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__TAKE_FIRST:
			setTakeFirst((Boolean) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__TIME_GUARD:
			setTimeGuard((String) newValue);
			return;
		case scpnPackage.TRANSITION_TYPE__WATCH:
			setWatch((Boolean) newValue);
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
		case scpnPackage.TRANSITION_TYPE__LABEL:
			setLabel((LabelType) null);
			return;
		case scpnPackage.TRANSITION_TYPE__DISPLAY_EXPRESSION:
			setDisplayExpression(DISPLAY_EXPRESSION_EDEFAULT);
			return;
		case scpnPackage.TRANSITION_TYPE__GLOBAL_GUARD:
			setGlobalGuard(GLOBAL_GUARD_EDEFAULT);
			return;
		case scpnPackage.TRANSITION_TYPE__LOCAL_GUARD:
			setLocalGuard(LOCAL_GUARD_EDEFAULT);
			return;
		case scpnPackage.TRANSITION_TYPE__LOGFILE_DESCRIPTION:
			setLogfileDescription(LOGFILE_DESCRIPTION_EDEFAULT);
			return;
		case scpnPackage.TRANSITION_TYPE__LOGFILE_EXPRESSION:
			setLogfileExpression(LOGFILE_EXPRESSION_EDEFAULT);
			return;
		case scpnPackage.TRANSITION_TYPE__LOGFILE_NAME:
			setLogfileName(LOGFILE_NAME_EDEFAULT);
			return;
		case scpnPackage.TRANSITION_TYPE__MANUAL_CODE:
			setManualCode(MANUAL_CODE_EDEFAULT);
			return;
		case scpnPackage.TRANSITION_TYPE__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case scpnPackage.TRANSITION_TYPE__SERVER_TYPE:
			unsetServerType();
			return;
		case scpnPackage.TRANSITION_TYPE__SPEC_TYPE:
			unsetSpecType();
			return;
		case scpnPackage.TRANSITION_TYPE__TAKE_FIRST:
			unsetTakeFirst();
			return;
		case scpnPackage.TRANSITION_TYPE__TIME_GUARD:
			setTimeGuard(TIME_GUARD_EDEFAULT);
			return;
		case scpnPackage.TRANSITION_TYPE__WATCH:
			unsetWatch();
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
		case scpnPackage.TRANSITION_TYPE__LABEL:
			return label != null;
		case scpnPackage.TRANSITION_TYPE__DISPLAY_EXPRESSION:
			return DISPLAY_EXPRESSION_EDEFAULT == null ? displayExpression != null
					: !DISPLAY_EXPRESSION_EDEFAULT.equals(displayExpression);
		case scpnPackage.TRANSITION_TYPE__GLOBAL_GUARD:
			return GLOBAL_GUARD_EDEFAULT == null ? globalGuard != null : !GLOBAL_GUARD_EDEFAULT.equals(globalGuard);
		case scpnPackage.TRANSITION_TYPE__LOCAL_GUARD:
			return LOCAL_GUARD_EDEFAULT == null ? localGuard != null : !LOCAL_GUARD_EDEFAULT.equals(localGuard);
		case scpnPackage.TRANSITION_TYPE__LOGFILE_DESCRIPTION:
			return LOGFILE_DESCRIPTION_EDEFAULT == null ? logfileDescription != null
					: !LOGFILE_DESCRIPTION_EDEFAULT.equals(logfileDescription);
		case scpnPackage.TRANSITION_TYPE__LOGFILE_EXPRESSION:
			return LOGFILE_EXPRESSION_EDEFAULT == null ? logfileExpression != null
					: !LOGFILE_EXPRESSION_EDEFAULT.equals(logfileExpression);
		case scpnPackage.TRANSITION_TYPE__LOGFILE_NAME:
			return LOGFILE_NAME_EDEFAULT == null ? logfileName != null : !LOGFILE_NAME_EDEFAULT.equals(logfileName);
		case scpnPackage.TRANSITION_TYPE__MANUAL_CODE:
			return MANUAL_CODE_EDEFAULT == null ? manualCode != null : !MANUAL_CODE_EDEFAULT.equals(manualCode);
		case scpnPackage.TRANSITION_TYPE__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case scpnPackage.TRANSITION_TYPE__SERVER_TYPE:
			return isSetServerType();
		case scpnPackage.TRANSITION_TYPE__SPEC_TYPE:
			return isSetSpecType();
		case scpnPackage.TRANSITION_TYPE__TAKE_FIRST:
			return isSetTakeFirst();
		case scpnPackage.TRANSITION_TYPE__TIME_GUARD:
			return TIME_GUARD_EDEFAULT == null ? timeGuard != null : !TIME_GUARD_EDEFAULT.equals(timeGuard);
		case scpnPackage.TRANSITION_TYPE__WATCH:
			return isSetWatch();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (displayExpression: ");
		result.append(displayExpression);
		result.append(", globalGuard: ");
		result.append(globalGuard);
		result.append(", localGuard: ");
		result.append(localGuard);
		result.append(", logfileDescription: ");
		result.append(logfileDescription);
		result.append(", logfileExpression: ");
		result.append(logfileExpression);
		result.append(", logfileName: ");
		result.append(logfileName);
		result.append(", manualCode: ");
		result.append(manualCode);
		result.append(", path: ");
		result.append(path);
		result.append(", serverType: ");
		if (serverTypeESet)
			result.append(serverType);
		else
			result.append("<unset>");
		result.append(", specType: ");
		if (specTypeESet)
			result.append(specType);
		else
			result.append("<unset>");
		result.append(", takeFirst: ");
		if (takeFirstESet)
			result.append(takeFirst);
		else
			result.append("<unset>");
		result.append(", timeGuard: ");
		result.append(timeGuard);
		result.append(", watch: ");
		if (watchESet)
			result.append(watch);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TransitionTypeImpl
