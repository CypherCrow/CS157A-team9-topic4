package core;

public class Pharmacology {
	//PK
	private int pharmacology_ID;
	//FK
	private int Pvisit_id;
	private int medicament_id;
	
	//ATTRITUBES
	private int dose;
	private int durnation;
	private String comments;
	
	public Pharmacology(int pharmacology_ID, int visit_id, int medicament_id, int dose, int durnation,
			String comments) {
		super();
		this.pharmacology_ID = pharmacology_ID;
		this.Pvisit_id = visit_id;
		this.medicament_id = medicament_id;
		this.dose = dose;
		this.durnation = durnation;
		this.comments = comments;
	}

	public int getPharmacology_ID() {
		return pharmacology_ID;
	}

	public void setPharmacology_ID(int pharmacology_ID) {
		this.pharmacology_ID = pharmacology_ID;
	}

	public int getVisit_id() {
		return Pvisit_id;
	}

	public void setVisit_id(int visit_id) {
		this.Pvisit_id = visit_id;
	}

	public int getMedicament_id() {
		return medicament_id;
	}

	public void setMedicament_id(int medicament_id) {
		this.medicament_id = medicament_id;
	}

	public int getDose() {
		return dose;
	}

	public void setDose(int dose) {
		this.dose = dose;
	}

	public int getDurnation() {
		return durnation;
	}

	public void setDurnation(int durnation) {
		this.durnation = durnation;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
}
