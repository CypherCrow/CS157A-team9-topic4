package core;

public class Generic {
	//PK
	private int Generic_id;
	
	//ATT
	private String name;
	private String description;
	
	public Generic(int generic_id, String name, String description) {
		super();
		Generic_id = generic_id;
		this.name = name;
		this.description = description;
	}
		
	public int getGeneric_id() {
		return Generic_id;
	}
	public void setGeneric_id(int generic_id) {
		Generic_id = generic_id;
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
