package core;

import java.util.Date;

public class Visit {
	
	private int visit_id;
	private String THC;
	private Date date;
	private String Patient_name;
	
	public Visit(int visit_id, String tHC, Date date, String name) {
		super();
		this.visit_id = visit_id;
		this.THC = tHC;
		this.date = date;
		this.Patient_name = name;
	}
	
	
	
	public int getVisit_id() {
		return visit_id;
	}

	public void setVisit_id(int visit_id) {
		this.visit_id = visit_id;
	}

	public String getTHC() {
		return THC;
	}

	public void setTHC(String tHC) {
		THC = tHC;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPatient_name() {
		return Patient_name;
	}

	public void setPatient_name(String name) {
		this.Patient_name = name;
	}
	
	@Override
	public String toString() {
		return String
				.format("Visit [visit_id=%s, THC=%s, date=%s, Patient_name=%s]",
						visit_id, THC, date, Patient_name);
	}
}
