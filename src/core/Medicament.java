package core;

import java.util.Date;

public class Medicament {
	//pk
	private int Medicament_id;
	//fk
	private int Generic_id;
	private int Disease_id;
	private int CatChem_id;
	
	//
	private int pharmacology_ID;
	
	//ATTRITUBES
	
	public int getPharmacology_ID() {
		return pharmacology_ID;
	}
	public void setPharmacology_ID(int pharmacology_ID) {
		this.pharmacology_ID = pharmacology_ID;
	}
	private String name;
	private String description;
	private int Usual_dose;
	
	
	public Medicament(String name,
			String description, int usual_dose) {
		super();
//		Medicament_id = medicament_id;
//		Generic_id = generic_id;
//		Disease_id = disease_id;
//		CatChem_id = catChem_id;
		this.name = name;
		this.description = description;
		Usual_dose = usual_dose;
	}
	

	
	public Medicament(int generic_id, int disease_id, int catChem_id, String name,
			String description, int usual_dose, int pharmacology_ID) {
		super();
		Generic_id = generic_id;
		Disease_id = disease_id;
		CatChem_id = catChem_id;
		
		this.name = name;
		this.description = description;
		Usual_dose = usual_dose;
		this.pharmacology_ID = pharmacology_ID;
	}
	public int getMedicament_id() {
		return Medicament_id;
	}
	public void setMedicament_id(int medicament_id) {
		Medicament_id = medicament_id;
	}
	public int getGeneric_id() {
		return Generic_id;
	}
	public void setGeneric_id(int generic_id) {
		Generic_id = generic_id;
	}
	public int getDisease_id() {
		return Disease_id;
	}
	public void setDisease_id(int disease_id) {
		Disease_id = disease_id;
	}
	public int getCatChem_id() {
		return CatChem_id;
	}
	public void setCatChem_id(int catChem_id) {
		CatChem_id = catChem_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUsual_dose() {
		return Usual_dose;
	}
	public void setUsual_dose(int usual_dose) {
		Usual_dose = usual_dose;
	}
	
}
