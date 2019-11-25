/* This sample shows how to connect and compile a JDBC program
 You should have Driver for your database installed.
*/

// You need to import the java.sql package to use JDBC
import java.sql.*;
// you need this import if you are connecting to Oracle database
//import oracle.jdbc.*;

class SimpleJDBC
{
  public static void main (String args [])
       throws SQLException
  {
    // Load the JDBC driver
	//Uncomment below if you are using Oracle
    //DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	//Uncomment below if you are using Oracle
    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

    // Connect to the database
    //we can use another MySQL account for this project aside from mine's
    	    Connection conn =
    	      DriverManager.getConnection("jdbc:mysql://localhost:3306/anime_characters","root", "matr1X_D3US_ex");

    // Create a Statement
    Statement stmt = conn.createStatement ();

   ResultSet rset = stmt.executeQuery ("show tables");

    // Iterate through the result and print out the table names
    while (rset.next ())
      System.out.println (rset.getString (1));
  }
  rset.close(); 
  stmt.close();
  conn.close();
}