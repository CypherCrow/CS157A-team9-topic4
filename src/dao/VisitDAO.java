package dao;
import java.util.*;

import core.Visit;

import java.sql.*;
import java.sql.Date;
import java.io.*;




public class VisitDAO {
	private Connection myConn;
	
	public VisitDAO() throws Exception {
		
		Properties props = new Properties();
		props.load(new FileInputStream("CS157AProject.properties"));
		
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");
		
		// connect to database
		myConn = DriverManager.getConnection(dburl, user, password);
		System.out.println("DB from VisitDAO connection successful to: " + dburl);		
	}
	
	// get all visit history
	public List<Visit> getAllVisit() throws Exception {
		
		List<Visit> list = new ArrayList<>();	
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select * from Visit");
			
			while (myRs.next()) {
				Visit tempVisit = convertRowToVisit(myRs);
				list.add(tempVisit);
			}
			
			return list;		
		}
		finally {
			close(myStmt, myRs);
		}
	}
	
	public int getCurrentVisit_ID() throws Exception {	
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("SELECT * FROM Visit ORDER BY Visit_ID DESC LIMIT 1");
			myRs.next();
			
			int visit_id = myRs.getInt("Visit_ID");
			return visit_id;
			
		}
		finally {
			close(myStmt, myRs);
		}
	}
	
	public Visit getCurrentVisitInfo(int visit_id) throws Exception {	
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("SELECT * FROM Visit WHERE visit_id = '"+visit_id+"'");
			myRs.next();
			Visit tempVisit = convertRowToVisit(myRs);
			return tempVisit;	
		}
		finally {
			close(myStmt, myRs);
		}
	}
	
	// add a new visit 
	public void addNewVisit() throws Exception {
		PreparedStatement myStmt = null;
		
		//1. get current time and transfer it to mysql accepted datetime obj
		java.util.Date dt = new java.util.Date();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sdf.format(dt);
		
		//2. Random generate patient name
		String patient_names[] = {"Emma", "Olivia", "Ava", "Isabella", "Sophia", 
								  "Liam", "Noah", "William", "James","Oliver",
								  "Charlotte", "Mia", "Amelia", "Harper", "Evelyn", 
								  "Benjamin", "Elijah", "Lucas", "Mason", "Logan"};
		String patient_name = patient_names[new Random().nextInt(patient_names.length)];
		
		//3. Random generate THC#
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                					+ "0123456789"
                					+ "abcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(6);
		for (int i = 0; i < 6; i++) { 
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString .charAt(index)); 
        }
		String THC = sb.toString();
		
		
		
//		test the THC and patient_name
//		System.out.println(THC);
//		System.out.println(patient_name);

		try {
			// prepare statement
			myStmt = myConn.prepareStatement("insert into Visit"
					+ " (THC, date, Patient_name)"
					+ " values (?, ?, ?)");
			
			// set params
			myStmt.setString(1, THC);
			myStmt.setString(2, currentTime);
			myStmt.setString(3, patient_name);
			
			// execute SQL
			myStmt.executeUpdate();			
		}
		finally {
			close(myStmt, null);
		}	
	}
	
	private Visit convertRowToVisit(ResultSet myRs) throws SQLException {
		
		int visit_id = myRs.getInt("visit_id");
		String THC = myRs.getString("THC");
		Date date = myRs.getDate(3);
//		myRs.getTimestamp("Date");
		String name = myRs.getString("Patient_name");
		
//		System.out.println(visit_id);
//		System.out.println(THC);
//		System.out.println(date);
//		System.out.println(name);
			
		Visit tempVisite = new Visit(visit_id, THC, date, name);
		
		return tempVisite;
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
		
		VisitDAO dao = new VisitDAO();
//		dao.addNewVisit();
		

		System.out.println(dao.getCurrentVisit_ID());
	}
}


