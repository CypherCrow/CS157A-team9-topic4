package dao;
import core.medicationsTable;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.JOptionPane;

import core.Medicament;
import core.Pharmacology;

public class MedicamentDAO {
	
	private Connection myConn;
	private DiseaseDAO diseaseDAO;
	private GenericDAO genericDAO;
	private CatChemDAO catChemDAO;
//	private PharmacologyDAO pharmacologyDAO;
	
	public MedicamentDAO() throws Exception {
		
		
		try {
			diseaseDAO = new DiseaseDAO();
			genericDAO = new GenericDAO();
			catChemDAO = new CatChemDAO();
//			pharmacologyDAO = new PharmacologyDAO();

		} catch (Exception exc) {
			JOptionPane.showInputDialog(this); 
		}
		
		
		Properties props = new Properties();
		props.load(new FileInputStream("CS157AProject.properties"));
		
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");
		
		// connect to database
		myConn = DriverManager.getConnection(dburl, user, password);
		System.out.println("DB from MedicamentDAO connection successful to: " + dburl);		
	}
//	Mname, Mdescription, MdosC,Gname,Gdescription,Dname,Ddescription
	public void addMoreMedicament(String Mname, String Mdescription,int MdosC, 
								  String Gname,String Gdescription, 
								  String Dname,String Ddescription,
								  String Cname,String Cdescription) throws Exception {
		
		genericDAO.addMoreGeneric(Gname,Gdescription);
		diseaseDAO.addMoreDisease(Dname,Ddescription);
		catChemDAO.addMoreCatChem(Cname,Cdescription);
		
		int currentGenericID = genericDAO.getCurrentGeneric_id();
		int currentDiseaseID = diseaseDAO.getCurrentDisease_id();	
		int currentCatChemID = catChemDAO.getCurrentCatChem_id();
		
		PreparedStatement myStmt = null;
		
		try {
			// prepare statement
			myStmt = myConn.prepareStatement("insert into Medicament"
					+ " (Generic_id, Disease_id, CatChem_id, name, description, Usual_dose)"
					+ " values (?, ?, ?, ?, ?, ?)");
			
			// set params
			myStmt.setInt(1, currentGenericID);
			myStmt.setInt(2, currentDiseaseID);			
			myStmt.setInt(3, currentCatChemID);
			myStmt.setString(4, Mname);
			myStmt.setString(5, Mdescription);
			myStmt.setInt(6, MdosC);
			
			// execute SQL
			myStmt.executeUpdate();			
		}
		finally {
			close(myStmt, null);
		}
	}
	
	
	public void addNewMedicament(String name, String description,int Usual_dose) throws Exception {
//	public void addNewMedicament() throws Exception {
//		System.out.println("into addNewMedicament");
		
		// nice job benson , it is 4:30AM you get this!
		// test for disease, generic and catchem work properly
		genericDAO.addNewGeneric();
		diseaseDAO.addNewDisease();
		catChemDAO.addNewCatChem();
		
		int currentGenericID = genericDAO.getCurrentGeneric_id();
		int currentDiseaseID = diseaseDAO.getCurrentDisease_id();	
		int currentCatChemID = catChemDAO.getCurrentCatChem_id();
		
		System.out.println("current genericID is:" + currentGenericID);
		System.out.println("current diseaseID is:" + currentDiseaseID);	
		System.out.println("current catChemID is:" + currentCatChemID);
		
		PreparedStatement myStmt = null;
		
//		String name = "Medicament name";
//		String description = "Medicament description";
//		int Usual_dose = 7;
		
		try {
			// prepare statement
			myStmt = myConn.prepareStatement("insert into Medicament"
					+ " (Generic_id, Disease_id, CatChem_id, name, description, Usual_dose)"
					+ " values (?, ?, ?, ?, ?, ?)");
			
			// set params
			myStmt.setInt(1, currentGenericID);
			myStmt.setInt(2, currentDiseaseID);			
			myStmt.setInt(3, currentCatChemID);
			myStmt.setString(4, name);
			myStmt.setString(5, description);
			myStmt.setInt(6, Usual_dose);
			
			// execute SQL
			myStmt.executeUpdate();			
		}
		finally {
			close(myStmt, null);
		}
	}
	
	public int getCurrentMedicament_id() throws Exception {	
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("SELECT * FROM Medicament ORDER BY Medicament_id DESC LIMIT 1");
			myRs.next();
			
			int Medicament_id = myRs.getInt("Medicament_id");
			return Medicament_id;
			
		}
		finally {
			close(myStmt, myRs);
		}
	}
	
//	public List<Medicament> searchMedicament(int pharma_id) throws Exception {
//		
//		System.out.print("into searchMedicament function");
//		List<Medicament> list = new ArrayList<>();
//
//		PreparedStatement myStmt = null;
//		ResultSet myRs = null;
//
//		try {
//			
//			myStmt = myConn.prepareStatement("select * from Medicament where pharma_id=? order by pharma_id");
//			
//			myStmt.setInt(1, pharma_id);
//			
//			myRs = myStmt.executeQuery();
//			
//			while (myRs.next()) {
//				Medicament tempMedicament = convertRowToMedicament(myRs);
//				list.add(tempMedicament);
//			}
//			
//			return list;
//		}
//		finally {
//			close(myStmt, myRs);
//		}
//	}
	
	
	public List<medicationsTable> searchMedicament(int par_id) throws Exception {
	
	System.out.print("into searchMedicament function");
	List<medicationsTable> list = new ArrayList<>();

	PreparedStatement myStmt = null;
	ResultSet myRs = null;

	try {
		
		myStmt = myConn.prepareStatement("SELECT Medicament.Medicament_id, Medicament.name as Medicament, Generic.name as Generic, Pharmacology.dose as Dose, Pharmacology.durnation as Durnation, CatChem.name as CatChem, Disease.description as Description, Medicament.Usual_dose\n" + 
				"FROM Medicament, Generic, Pharmacology, CatChem, Disease\n" + 
				"WHERE Pharmacology.medicament_id = Medicament.Medicament_id AND Medicament.Generic_id = Generic.Generic_id AND Medicament.Disease_id = Disease.Disease_id AND Medicament.CatChem_id = CatChem.CatChem_id AND Pharmacology.pharmacology_id = '" + par_id + "';");
		
		
		
		myRs = myStmt.executeQuery();
		
		while (myRs.next()) {
			medicationsTable tempmedicationsTable = convertRowTomedicationsTable(myRs);
			list.add(tempmedicationsTable);
		}
		
		return list;
	}
	finally {
		close(myStmt, myRs);
	}
}
	
	private medicationsTable convertRowTomedicationsTable(ResultSet myRs) throws SQLException {
		
		System.out.print("into convertRowToMedicament function");
		
		int Medicament_id = myRs.getInt("Medicament_id");
		String medicationName = myRs.getString("Medicament");
		String genericName = myRs.getString("Generic");
		int dose = myRs.getInt("Dose");
		int duration = myRs.getInt("Durnation");
		String catChemName = myRs.getString("CatChem");
		String diseaseDescription = myRs.getString("Description");
		int usualDose = myRs.getInt("Usual_dose");
		
//		int Generic_id = myRs.getInt("Generic_id");
//		int Disease_id = myRs.getInt("Disease_id");
//		int CatChem_id = myRs.getInt("CatChem_id");
//		
//		String name = myRs.getString("name");
//		String description = myRs.getString("description");
//		int  Usual_dose = myRs.getInt("Usual_dose");
//		
//		int pharmacology_ID = myRs.getInt("pharma_id");
		
		
//		public medicationsTable(int medication_id, String medicationName, String genericName, int dose, int duration,
//				String catChemName, String diseaseName, int usualDose) 
		
		medicationsTable tempmedicationsTable = new medicationsTable(Medicament_id, medicationName, genericName,dose,duration, catChemName, diseaseDescription,usualDose);


		return tempmedicationsTable;
	}



	private static void close(Connection myConn, Statement myStmt, ResultSet myRs) throws SQLException {
	
		if (myRs != null) {
			myRs.close();
		}
	
		if (myStmt != null) {
			
		}
		
		if (myConn != null) {
			myConn.close();
		}
	}

	private void close(Statement myStmt, ResultSet myRs) throws SQLException {
		close(null, myStmt, myRs);		
	}

	public static void main(String[] args) throws Exception {
		
		//this part is for testing right api call
		
		// create a Medicament
		MedicamentDAO dao = new MedicamentDAO();
//		dao.addNewMedicament();
		int currentMedicament_id = dao.getCurrentMedicament_id();
		
		//call update method and pass value
		System.out.println("Updating new medicamentID TO pharam");
		PharmacologyDAO pharmacologyDAO = new PharmacologyDAO();
		pharmacologyDAO.updatePharmacologyMedicament_id(2,currentMedicament_id);
		
		System.out.println("update the new medicament_id");
	
		System.out.println("main from MedicamentDAO");
	}

}
