package project;

import java.sql.*;
import java.io.*;
import java.util.Scanner;

class ConnectorClass {

	private static boolean isCommandEnd(String command) {
		return command.equals("Z") || command.equals("z");
	}
	
	public static void main(String[] args)
		throws SQLException, IOException {
		
		DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
		
		BufferedReader re = new BufferedReader(new FileReader("C:/Akanb/Documents/test.sql"));
		
		Scanner skanner = new Scanner(System.in);
		
		String username = "";
		String password = "";
		
		System.out.print("Enter Username: ");
		username = skanner.nextLine();
		skanner.reset();
		
		System.out.print("Enter Password: ");
		password = skanner.nextLine();
		skanner.reset();
		
		/*
		 * I recommend using someone else's laptop for the implementation of this program
		 * I can't seem to fix the issues on MySQL in my laptop.
		 */
		Connection conn = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db",
						username, 
						password);
		
		Statement stmt = conn.createStatement();
		
		String fileLine = re.readLine();
		
		while(fileLine != null) {
			
			stmt.execute(fileLine);
			
			fileLine = re.readLine();
		}
		
		String command = ""; 
		
		while(!isCommandEnd(command)) {
			command = skanner.nextLine();
			
			stmt.executeUpdate(command);
			
			skanner.reset();
		}
						
		conn.close();
		skanner.close();
		re.close();
	}
	
}
