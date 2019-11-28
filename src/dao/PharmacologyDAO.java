package dao;
import core.Pharmacology;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;


import core.Pharmacology;
import core.Visit;

public class PharmacologyDAO {
	
	private Connection myConn;
	
	public PharmacologyDAO() throws Exception {
		
		Properties props = new Properties();
		props.load(new FileInputStream("CS157AProject.properties"));
		
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");
		
		// connect to database
		myConn = DriverManager.getConnection(dburl, user, password);
		System.out.println("DB from PharmacologyDAO connection successful to: " + dburl);		
	}
	
	public void addNewPharmacology(int visit_id) throws Exception {
		PreparedStatement myStmt = null;
		
		//FK
//		 int visit_id = 10;
//		 int medicament_id = 1;
		
		//ATTRITUBES
		 int dose = (int)(Math.random() * 500) + 200;;
		 int durnation = 5;
		 String comments = "test";

		try {
			// prepare statement
			myStmt = myConn.prepareStatement("insert into Pharmacology"
					+ " (Pvisit_id, medicament_id, dose, durnation, comments)"
					+ " values (?, ?, ?, ?, ?)");
			
			// set params
			myStmt.setInt(1, visit_id);
			myStmt.setNull(2,Types.INTEGER);
//			myStmt.setInt(2, medicament_id);
			myStmt.setInt(3, dose);
			myStmt.setInt(4, durnation);
			myStmt.setString(5, comments);
			
			// execute SQL
			myStmt.executeUpdate();			
		}
		finally {
			close(myStmt, null);
		}	
	}
	
public List<Pharmacology> getAllPharmacology() throws Exception {
		
		List<Pharmacology> list = new ArrayList<>();	
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select * from Pharmacology");
			
			while (myRs.next()) {
				Pharmacology tempPharmacology = convertRowToPharmacology(myRs);
				list.add(tempPharmacology);
			}
			
			return list;		
		}
		finally {
			close(myStmt, myRs);
		}
	}

	private Pharmacology convertRowToPharmacology(ResultSet myRs) throws SQLException {
		
		int pharmacology_ID = myRs.getInt("pharmacology_ID");
		int Pvisit_id = myRs.getInt("Pvisit_id");
		int medicament_id = myRs.getInt("medicament_id");
		int dose = myRs.getInt("dose");
		int durnation = myRs.getInt("durnation");
		String comments = myRs.getString("comments");
			
		Pharmacology tempPharmacology = new Pharmacology(pharmacology_ID, Pvisit_id, medicament_id, dose, durnation, comments);
		
		return tempPharmacology;
	}

	
	public void updatePharmacologyMedicament_id(int pharmacology_ID, int Medicament_id) throws Exception {
		PreparedStatement myStmt = null;
		
		System.out.println("into updatePharmacologyMedicament_id function");
		try {

			myStmt = myConn.prepareStatement("update Pharmacology"
					+ " set medicament_id=?"
					+ " where pharmacology_ID=?");
			
			myStmt.setInt(1, Medicament_id);
			myStmt.setInt(2, pharmacology_ID);
			myStmt.executeUpdate();
			System.out.println("pharmacology_ID and Medicament_id is " + pharmacology_ID + "and " + Medicament_id);
		} finally {
			close(myStmt, null);
		}	
	}
	
	public int getCurrentPharmacology_ID() throws Exception {	
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("SELECT * FROM Pharmacology ORDER BY pharmacology_ID DESC LIMIT 1");
			myRs.next();
			
			int pharmacology_ID = myRs.getInt("pharmacology_ID");
			return pharmacology_ID;
			
		}
		finally {
			close(myStmt, myRs);
		}
	}
//	private Pharmacology convertRowToPharmacology(ResultSet myRs) throws SQLException {
//		
//		int pharmacology_ID = myRs.getInt("pharmacology_ID");
//		int Pvisit_id = myRs.getInt("Pvisit_id");
//		int medicament_id = myRs.getInt("medicament_id");
//		int dose = myRs.getInt("dose");
//		int durnation = myRs.getInt("durnation");
//		String comments = myRs.getString("comments");
//		
//		Pharmacology tempPharmacology = new Pharmacology(pharmacology_ID, Pvisit_id, medicament_id, dose, durnation,comments);
//		
//		return tempPharmacology;
//	}
	
//	public List<Pharmacology> searchPharmacology(int pharam_id) throws Exception {
//	List<Pharmacology> list = new ArrayList<>();
//
//	PreparedStatement myStmt = null;
//	ResultSet myRs = null;
//
//	try {
//		
//		myStmt = myConn.prepareStatement("select * from Pharmacology where pharmacology_ID = ?  order by pharmacology_ID");
//		
//		myStmt.setInt(1, pharam_id);
//		
//		myRs = myStmt.executeQuery();
//		
//		while (myRs.next()) {
//			Pharmacology tempPharmacology = convertRowToPharmacology(myRs);
//			list.add(tempPharmacology);
//		}
//		
//		return list;
//	}
//	finally {
//		close(myStmt, myRs);
//	}
//}
	
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
		
		PharmacologyDAO dao = new PharmacologyDAO();
//		dao.addNewPharmacology();

		
	}
}