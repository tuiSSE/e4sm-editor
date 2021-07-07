package e4sm.de.metamodel.e4sm.common;

import org.eclipse.jface.viewers.CellEditor;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;

import e4sm.de.metamodel.e4sm.analysis.Parameter;

import org.eclipse.jface.dialogs.Dialog;

public class E4SMPropertyDescriptor extends PropertyDescriptor {
	public E4SMPropertyDescriptor(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
		// TODO Auto-generated constructor stub
	}

	public CellEditor createPropertyEditor(Composite composite) {
		CellEditor result = super.createPropertyEditor(composite);
		if (result == null) {
			return result;
		}
		if (getObject() instanceof Parameter) {
			// The current object is a parameter, it has the attribute "Initial Value" of
			// type
			System.out.println(itemPropertyDescriptor.getDisplayName(object));
		}
		EClassifier eType = ((EStructuralFeature) itemPropertyDescriptor.getFeature(object)).getEType();
		System.err.println(itemPropertyDescriptor.getClass().toString());
		if (eType instanceof EDataType) {
			EDataType eDataType = (EDataType) eType;
			if (eDataType.getInstanceClass() == LocalDate.class) {
				result = new ExtendedDialogCellEditor(composite, getEditLabelProvider()) {
					protected Object openDialogBox(Control cellEditorWindow) {
						final DateTime dateTime[] = new DateTime[1];
						final LocalDate[] date = new LocalDate[1];
						Dialog d = new Dialog(cellEditorWindow.getShell()) {
							protected Control createDialogArea(Composite parent) {
								Composite dialogArea = (Composite) super.createDialogArea(parent);
								dateTime[0] = new DateTime(dialogArea, SWT.CALENDAR);
								dateTime[0].addSelectionListener(new SelectionAdapter() {
									public void widgetSelected(SelectionEvent e) {
										LocalDate dateValue = LocalDate.of(dateTime[0].getYear(),
												dateTime[0].getMonth(), dateTime[0].getDay());
										date[0] = dateValue;
										super.widgetSelected(e);
									}
								});
								return dialogArea;
							}
						};
						d.setBlockOnOpen(true);
						d.open();
						if (d.getReturnCode() == Dialog.OK) {
							return date[0];
						}
						return null;
					}
				};
			} else if (eDataType.getInstanceClass() == LocalDateTime.class) {
				result = new ExtendedDialogCellEditor(composite, getEditLabelProvider()) {
					protected Object openDialogBox(Control cellEditorWindow) {
						final DateTime dateTime[] = new DateTime[1];
						final LocalDateTime[] date = new LocalDateTime[1];
						date[0] = LocalDateTime.now();
						Dialog d = new Dialog(cellEditorWindow.getShell()) {
							protected Control createDialogArea(Composite parent) {
								Composite dialogArea = (Composite) super.createDialogArea(parent);
								dateTime[0] = new DateTime(dialogArea, SWT.CALENDAR);
								dateTime[0].addSelectionListener(new SelectionAdapter() {
									public void widgetSelected(SelectionEvent e) {
										date[0] = date[0].withYear(dateTime[0].getYear())
												.withMonth(dateTime[0].getMonth() + 1)
												.withDayOfMonth(dateTime[0].getDay());
										super.widgetSelected(e);
									}
								});

								DateTime time = new DateTime(dialogArea, SWT.TIME);
								time.addSelectionListener(new SelectionAdapter() {
									public void widgetSelected(SelectionEvent e) {
										date[0] = date[0].withHour(time.getHours()).withMinute(time.getMinutes())
												.withSecond(time.getSeconds());
										super.widgetSelected(e);
									}
								});
								return dialogArea;
							}
						};
						d.setBlockOnOpen(true);
						d.open();
						if (d.getReturnCode() == Dialog.OK) {
							return date[0];
						}
						return null;
					}
				};
			}
			System.err.println(eType.toString());
		} else if (((EStructuralFeature) itemPropertyDescriptor.getFeature(object)).isChangeable()) {
			System.err.println("AAAAAAAA");
			System.err.println(eType.toString());
		} else {
			System.err.println("BBBBBBB");
			System.out.println(eType.toString());
		}
		return result;
	}

}
