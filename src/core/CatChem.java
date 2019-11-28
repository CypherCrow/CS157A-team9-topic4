package core;

public class CatChem {
	
	//PK
	private int CatChem_id;
	//ATT
	private String name;
	private String description;
	
	public CatChem(int catChem_id, String name, String description) {
		super();
		CatChem_id = catChem_id;
		this.name = name;
		this.description = description;
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

	
	
	

}
