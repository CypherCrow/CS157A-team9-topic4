package core;

public class Disease {
	//PK
	private int Disease_id;
	//ATT
	private String name;
	private String description;
	
	public Disease(int disease_id, String name, String description) {
		super();
		Disease_id = disease_id;
		this.name = name;
		this.description = description;
	}
	
	
	public int getDisease_id() {
		return Disease_id;
	}
	public void setDisease_id(int disease_id) {
		Disease_id = disease_id;
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
