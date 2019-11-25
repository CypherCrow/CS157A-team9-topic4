//
//import java.sql.*;
//
//class SimpleJDBC {
//
////	static Connection connection = null;
////	static String databseName = "";
//	
//	static String url = "jdbc:mysql://localhost:3306/CS157AProject";
//	static String username = "root";
//	static String password = "benson777";
//
//	public static void main(String args[]) throws SQLException {
//
//			// 1. Create connection
//			Connection myConn = DriverManager.getConnection(url,username,password);
//
//			// 2. Create a statement
//			Statement myStmt = myConn.createStatement();
////			Statement myStmt1 = myConn.createStatement();
//			
//			java.util.Date dt = new java.util.Date();
//			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			
//			String currentTime = sdf.format(dt);
//			
////			System.out.println(currentTime);
//			
//			String sql = "insert into Visit" + " (THC, Date, Patient_name)"
//                    + " values ('qwer','"+currentTime+"', 'David')";
//			
//			myStmt.executeUpdate(sql);
//
////			 3. Execute SQL query
////			ResultSet myRs = myStmt.executeQuery("select * from Visit");
//
////			 4. Process the result set
////			while (myRs.next()) {
////				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
////			}
//	}
//}