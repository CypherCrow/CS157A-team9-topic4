package ui;
import core.medicationsTable;
import core.Pharmacology;
import core.Medicament;
import core.Generic;
import core.Disease;
import core.CatChem;



import java.util.List;

import javax.swing.table.AbstractTableModel;

public class PharmacologyTableModel extends AbstractTableModel{
	
	private static final int MED_ID__COL = 0;
	private static final int MED_NAME_COL = 1;
	private static final int GENERIC_NAME_COL = 2;
	private static final int DOSE_COL = 3;
	private static final int DURATION_COL = 4;
	private static final int CATCHEM_NAME_COL = 5;
	private static final int DISEASE_NAME_COL = 6;
	private static final int USUAL_DOSE_COL = 7;
	
	
//	private static final int MED_ID__COL = 0;
//	private static final int MED_NAME_COL = 1;
//	private static final int GENERIC_NAME_COL = 2;
//	private static final int DISEASE_NAME_COL = 3;
//	private static final int CATCHEM_NAME_COL = 4;
//	private static final int MED_DESC_COL = 5;
//	private static final int USUAL_DOSE_COL = 6;
//	private static final int PARAM_ID_COL = 7;
	
	private String[] columnNames = { "MED_ID", "MED_NAME", "GENERIC_NAME", "DOSE","DURATION","CATCHEM_NAME","DISEASE_NAME","USUAL_DOSE"};
//	private String[] columnNames = { "MED_ID", "MED_NAME", "GENERIC_NAME", "DISEASE_NAME","CATCHEM_NAME","MED_DESC","USUAL_DOSE","PARAM_ID"};
	
	
//	private List<Pharmacology> pharmacology;
//	private List<Medicament> medicament;
	private List<medicationsTable> medicationsTable;
//	private List<Generic> generic;
//	private List<Disease> disease;
//	private List<CatChem> catChem;
	
//	public PharmacologyTableModel(List<Medicament> theMedicament, List<Generic> theGeneric,
//								List<Disease> theDisease, List<CatChem> theCatChem, List<Pharmacology> thePharmacology) {
//		pharmacology = thePharmacology;
//		medicament = theMedicament;
//		generic = theGeneric;
//		disease = theDisease;
//		catChem = theCatChem;
//	}
	public PharmacologyTableModel(List<medicationsTable> themedicationsTable) {
		medicationsTable = themedicationsTable;
	}
	

	

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}
	@Override
	public int getRowCount() {
		return medicationsTable.size();
	}
	
	@Override
	public String getColumnName(int col) {
		return columnNames[col];
	}

	@Override
	public Object getValueAt(int row, int col) {

		medicationsTable tempMedicament = medicationsTable.get(row);
//		Generic tempGeneric = generic.get(row);
//		Disease tempDisease = disease.get(row);
//		CatChem tempcatChem = catChem.get(row);
		

		switch (col) {
		case MED_ID__COL:
			return tempMedicament.getMedication_id();
		case MED_NAME_COL:
			return tempMedicament.getMedicationName();
		case GENERIC_NAME_COL:
			return tempMedicament.getGenericName();
		case DOSE_COL:
			return tempMedicament.getDose();
		case DURATION_COL:
			return tempMedicament.getDuration();
		case CATCHEM_NAME_COL:
			return tempMedicament.getCatChemName();
		case DISEASE_NAME_COL:
			return tempMedicament.getDiseaseName();
		case USUAL_DOSE_COL:
			return tempMedicament.getUsualDose();
		default:
			return tempMedicament.getMedication_id();
		}
		
	}
	
	@Override
	public Class getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}
	
	
	

}
