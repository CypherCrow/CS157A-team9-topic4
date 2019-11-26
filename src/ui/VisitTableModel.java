package ui;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import core.Visit;

class VisitTableModel extends AbstractTableModel {
	
	private static final int VISIT_ID_COL = 0;
	private static final int THC_COL = 1;
	private static final int DATE_COL = 2;
	private static final int PATIENT_NAME_COL = 3;
	
	private String[] columnNames = { "Visit_ID", "THC", "Date","Patient_name" };
	private List<Visit> visits;
	
	public VisitTableModel(List<Visit> theVisits) {
		visits = theVisits;
	}
	
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return visits.size();
	}
	
	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}
	

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Visit tempVisit = visits.get(rowIndex);
		
		switch (columnIndex) {
		case VISIT_ID_COL:
			return tempVisit.getVisit_id();
		case THC_COL:
			return tempVisit.getTHC();
		case DATE_COL:
			return tempVisit.getDate();
		case PATIENT_NAME_COL:
			return tempVisit.getPatient_name();
		default:
			return tempVisit.getVisit_id();
		}
	}
	
	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}

}
