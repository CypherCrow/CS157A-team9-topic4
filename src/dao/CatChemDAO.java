package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class CatChemDAO {
private Connection myConn;
	
	public CatChemDAO() throws Exception {
		
		Properties props = new Properties();
		props.load(new FileInputStream("CS157AProject.properties"));
		
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");
		
		// connect to database
		myConn = DriverManager.getConnection(dburl, user, password);
		System.out.println("DB from CatChemDAO connection successful to: " + dburl);		
	}
	
	
	public void addMoreCatChem(String Cname, String Cdescription) throws Exception {
			
			PreparedStatement myStmt = null;
			
			String name = "CatChem name";
			String description = "CatChem description";
			
			try {
				// prepare statement
				myStmt = myConn.prepareStatement("insert into CatChem"
						+ " (name, description)"
						+ " values (?, ?)");
				
				// set params
				myStmt.setString(1, Cname);
				myStmt.setString(2, Cdescription);
				
				// execute SQL
				myStmt.executeUpdate();			
			}
			finally {
				close(myStmt, null);
			}		
		}

	
	
public void addNewCatChem() throws Exception {
		
		PreparedStatement myStmt = null;
		
		String name = "CatChem name";
		String description = "CatChem description";
		
		try {
			// prepare statement
			myStmt = myConn.prepareStatement("insert into CatChem"
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

public int getCurrentCatChem_id() throws Exception {	
	Statement myStmt = null;
	ResultSet myRs = null;
	
	try {
		myStmt = myConn.createStatement();
		myRs = myStmt.executeQuery("SELECT * FROM CatChem ORDER BY CatChem_id DESC LIMIT 1");
		myRs.next();
		
		int CatChem_id = myRs.getInt("CatChem_id");
		return CatChem_id;
		
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
		
		CatChemDAO dao = new CatChemDAO();
		dao.addNewCatChem();
		
	
		System.out.println("main in CatChemDAO");
	}
}
