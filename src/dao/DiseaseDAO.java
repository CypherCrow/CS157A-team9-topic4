package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DiseaseDAO {
	private Connection myConn;
	
	public DiseaseDAO() throws Exception {
		
		Properties props = new Properties();
		props.load(new FileInputStream("CS157AProject.properties"));
		
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");
		
		// connect to database
		myConn = DriverManager.getConnection(dburl, user, password);
		System.out.println("DB from DiseaseDAO connection successful to: " + dburl);		
	}
	
	public void addMoreDisease(String Dname, String Ddescription) throws Exception {
		PreparedStatement myStmt = null;		
//		String name = "disease name";
//		String description = "disease description";
		
		try {
			// prepare statement
			myStmt = myConn.prepareStatement("insert into Disease"
					+ " (name, description)"
					+ " values (?, ?)");
			
			// set params
			myStmt.setString(1, Dname);
			myStmt.setString(2, Ddescription);
			
			// execute SQL
			myStmt.executeUpdate();			
		}
		finally {
			close(myStmt, null);
		}
	}
	
	public void addNewDisease() throws Exception {
		
		PreparedStatement myStmt = null;
		
		String name = "disease name";
		String description = "disease description";
		
		try {
			// prepare statement
			myStmt = myConn.prepareStatement("insert into Disease"
					+ " (name, description)"
					+ " values (?, ?)");
			
			// set params
			myStmt.setString(1, name);
			myStmt.setString(2, description);
			
			// execute SQL
			myStmt.executeUpdate();			
		}
		finally {
			close(myStmt, null);
		}		
	}
	
	public int getCurrentDisease_id() throws Exception {	
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("SELECT * FROM Disease ORDER BY Disease_id DESC LIMIT 1");
			myRs.next();
			
			int Disease_id = myRs.getInt("Disease_id");
			return Disease_id;
			
		}
		finally {
			close(myStmt, myRs);
		}
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
		
		DiseaseDAO dao = new DiseaseDAO();
//		dao.addNewDisease();
		dao.getCurrentDisease_id();
		
		System.out.println(dao.getCurrentDisease_id());
		
	
		System.out.println("main in DiseaseDAO");
	}
}
