package core;

public class medicationsTable {
	
	private int medication_id;
	private String medicationName;
	private String genericName;
	private int dose;
	private int duration;

	private String catChemName;
	private String diseaseName;

	private int usualDose;

	public medicationsTable(int medication_id, String medicationName, String genericName, int dose, int duration,
			String catChemName, String diseaseName, int usualDose) {
		super();
		this.medication_id = medication_id;
		this.medicationName = medicationName;
		this.genericName = genericName;
		this.dose = dose;
		this.duration = duration;
		this.catChemName = catChemName;
		this.diseaseName = diseaseName;
		this.usualDose = usualDose;
	}

	public int getMedication_id() {
		return medication_id;
	}

	public void setMedication_id(int medication_id) {
		this.medication_id = medication_id;
	}

	public String getMedicationName() {
		return medicationName;
	}

	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public int getDose() {
		return dose;
	}

	public void setDose(int dose) {
		this.dose = dose;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCatChemName() {
		return catChemName;
	}

	public void setCatChemName(String catChemName) {
		this.catChemName = catChemName;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public int getUsualDose() {
		return usualDose;
	}

	public void setUsualDose(int usualDose) {
		this.usualDose = usualDose;
	}
	
	
	
	
	

}
