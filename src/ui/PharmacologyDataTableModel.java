package ui;
import core.Pharmacology;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class PharmacologyDataTableModel extends AbstractTableModel{
	
	public static final int OBJECT_COL = -1;
	private static final int pharmacology_ID_COL = 0;
	private static final int Pvisit_COL = 1;
	private static final int medicament_id_COL = 2;
	private static final int dose_COL = 3;
	private static final int durnation_COL = 4;
	private static final int comments_COL = 5;
	
	private String[] columnNames = { "pharmacology_ID", "visit", "medicament_id","dose","durnation",
	"comments" };
	
	private List<Pharmacology> pharmacology;

	public PharmacologyDataTableModel(List<Pharmacology> thePharmacology) {
		pharmacology = thePharmacology;
	}

	@Override
	public int getRowCount() {
		return pharmacology.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {

		Pharmacology tempPharmacology = pharmacology.get(row);
		


		switch (col) {
		case pharmacology_ID_COL:
			return tempPharmacology.getPharmacology_ID();
		case Pvisit_COL:
			return tempPharmacology.getVisit_id();
		case medicament_id_COL:
			return tempPharmacology.getMedicament_id();
		case dose_COL:
			return tempPharmacology.getDose();
		case durnation_COL:
			return tempPharmacology.getDurnation();
		case comments_COL:
			return tempPharmacology.getComments();
		case OBJECT_COL:
			return tempPharmacology;
		default:
			return tempPharmacology.getPharmacology_ID();
		}
	}
	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}

}
