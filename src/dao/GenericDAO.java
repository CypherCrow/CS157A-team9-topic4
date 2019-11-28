package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class GenericDAO {
	
private Connection myConn;
	
	public GenericDAO() throws Exception {
		
		Properties props = new Properties();
		props.load(new FileInputStream("CS157AProject.properties"));
		
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");
		
		// connect to database
		myConn = DriverManager.getConnection(dburl, user, password);
		System.out.println("DB from GenericDAO connection successful to: " + dburl);		
	}
	
	public void addMoreGeneric(String Gname, String Gdescription) throws Exception {
		PreparedStatement myStmt = null;
		
		try {
			// prepare statement
			myStmt = myConn.prepareStatement("insert into Generic"
					+ " (name, description)"
					+ " values (?, ?)");
			
			// set params
			myStmt.setString(1, Gname);
			myStmt.setString(2, Gdescription);
			
			// execute SQL
			myStmt.executeUpdate();			
		}
		finally {
			close(myStmt, null);
		}		
	}
	
public void addNewGeneric() throws Exception {
		
		PreparedStatement myStmt = null;
		
		String name = "Generic name";
		String description = "Generic description";
		
		try {
			// prepare statement
			myStmt = myConn.prepareStatement("insert into Generic"
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

public int getCurrentGeneric_id() throws Exception {	
	Statement myStmt = null;
	ResultSet myRs = null;
	
	try {
		myStmt = myConn.createStatement();
		myRs = myStmt.executeQuery("SELECT * FROM Generic ORDER BY Generic_id DESC LIMIT 1");
		myRs.next();
		
		int Generic_id = myRs.getInt("Generic_id");
		return Generic_id;
		
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
		
		GenericDAO dao = new GenericDAO();
		dao.addNewGeneric();
		
	
		System.out.println("main in GenericDAO");
	}

}
