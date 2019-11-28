package dao;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import core.Audiological;

public class AudiologicalDAO {
	
	private Connection myConn;
	
	public AudiologicalDAO() throws Exception {
		
		Properties props = new Properties();
		props.load(new FileInputStream("CS157AProject.properties"));
		
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");
		
		// connect to database
		myConn = DriverManager.getConnection(dburl, user, password);
		System.out.println("DB from Audiological connection successful to: " + dburl);		
	}
	
	public void addNewAudoi(Audiological theAudiological) throws Exception {
		
		System.out.println("get into addnewAudio");
		PreparedStatement myStmt = null;
		int visit_id = 1;
		String comments = "test";
		
//		1. Pure-tone audiogram tests 
		double R25 = 7;
		double R50 = 7;
		double R10 = 7;
		double R12 = 7;
		
		double L25 = 7;
		double L50 = 7;
		double L10 = 7;
		double L12 = 7;
	//  2.tinnitus pitch match Right
		double T_PR = 7;
		String T_Rm = "T_Rm";
		double T_LR = 7;
		double Th_R = 7;
		double T_RLs = 7;
	//  3.tinnitus pitch match	Left
		double T_PL = 7;
		String T_Lm = "T_Lm";
		double T_LL = 7;
		double Th_L = 7;
		double T_Ls = 7;
		
	// 4. 
		double WNR = 7;
		double WNL = 7;
		
	//5. 
		double MML = 7;
		
		double MRR = 7;
		double MRB = 7;
		
		double MRL = 7;
		double MLB = 7;
	//6. 
		double RSD = 7;
		double LSD = 7;
	//7.
		double LR50 = 7;
		double LR1 = 7;
		double LR12 = 7;
		double LRTP = 7;
		
		double LL50 = 7;
		double LL1 = 7;
		double LL12 = 7;
		double LLTP = 7;
		
		try {
			// prepare statement
			
			myStmt = myConn.prepareStatement
					("insert into Audiological" +
					 " (visit_id, comments,"
					 + "R25, R50, R10, R12,L25, L50, L10, L12,"
					 + "T_PR, T_Rm, T_LR, Th_R, T_RLs,T_PL, T_Lm, T_LL, Th_L, T_Ls,"
					 + "WNR, WNL,"
					 + "MML, MRR, MRB, MRL, MLB,"
					 + "RSD, LSD,"
					 + "LR50, LR1, LR12, LRTP,LL50,LL1,LL12,LLTP)"
					+ " values (?, ?, ?, ?, ?, "
					+ "			?, ?, ?, ?, ?,"
					+ "			?, ?, ?, ?, ?,"
					+ "			?, ?, ?, ?, ?,"
					+ "			?, ?, ?, ?, ?,"
					+ "			?, ?, ?, ?, ?,"
					+ "			?, ?, ?, ?, ?,"
					+ "			?, ?)");
			
			// set params
//			myStmt.setInt(1, visit_id);
//			myStmt.setString(2, comments);
//			
//			myStmt.setDouble(3, R25);
//			myStmt.setDouble(4, R50);
//			myStmt.setDouble(5, R10);
//			myStmt.setDouble(6, R12);
//			myStmt.setDouble(7, L25);
//			myStmt.setDouble(8, L50);
//			myStmt.setDouble(9, L10);
//			myStmt.setDouble(10, L12);
//			
//			myStmt.setDouble(11, T_PR);
//			myStmt.setString(12, T_Rm);
//			myStmt.setDouble(13, T_LR);
//			myStmt.setDouble(14, Th_R);
//			myStmt.setDouble(15, T_RLs);
//			myStmt.setDouble(16, T_PL);
//			myStmt.setString(17, T_Lm);
//			myStmt.setDouble(18, T_LL);
//			myStmt.setDouble(19, Th_L);
//			myStmt.setDouble(20, T_Ls);
//			
//			myStmt.setDouble(21, WNR);
//			myStmt.setDouble(22, WNL);
//			myStmt.setDouble(23, MML);
//			myStmt.setDouble(24, MRR);
//			myStmt.setDouble(25, MRB);
//			myStmt.setDouble(26, MRL);
//			myStmt.setDouble(27, MLB);
//			
//			myStmt.setDouble(28, RSD);
//			myStmt.setDouble(29, LSD);
//			
//			myStmt.setDouble(30, LR50);
//			myStmt.setDouble(31, LR1);
//			myStmt.setDouble(32, LR12);
//			myStmt.setDouble(33, LRTP);
//			myStmt.setDouble(34, LL50);
//			myStmt.setDouble(35, LL1);
//			myStmt.setDouble(36, LL12);
//			myStmt.setDouble(37, LLTP);
			
			
			myStmt.setInt(1, theAudiological.getVisit_id());
			myStmt.setString(2, theAudiological.getComments());
			
			myStmt.setDouble(3, theAudiological.getR25());
			myStmt.setDouble(4, theAudiological.getR50());
			myStmt.setDouble(5, theAudiological.getR10());
			myStmt.setDouble(6, theAudiological.getR12());
			myStmt.setDouble(7, theAudiological.getL25());
			myStmt.setDouble(8, theAudiological.getL50());
			myStmt.setDouble(9, theAudiological.getL10());
			myStmt.setDouble(10, theAudiological.getL12());
			
			myStmt.setDouble(11, theAudiological.getT_PR());
			myStmt.setString(12, theAudiological.getT_Rm());
			myStmt.setDouble(13, theAudiological.getT_LR());
			myStmt.setDouble(14, theAudiological.getTh_R());
			myStmt.setDouble(15, theAudiological.getT_RLs());
			myStmt.setDouble(16, theAudiological.getT_PL());
			myStmt.setString(17, theAudiological.getT_Lm());
			myStmt.setDouble(18, theAudiological.getT_LL());
			myStmt.setDouble(19, theAudiological.getTh_L());
			myStmt.setDouble(20, theAudiological.getT_Ls());
			
			myStmt.setDouble(21, theAudiological.getWNR());
			myStmt.setDouble(22, theAudiological.getWNL());
			myStmt.setDouble(23, theAudiological.getMML());
			myStmt.setDouble(24, theAudiological.getMRR());
			myStmt.setDouble(25, theAudiological.getMRB());
			myStmt.setDouble(26, theAudiological.getMRL());
			myStmt.setDouble(27, theAudiological.getMLB());
			
			myStmt.setDouble(28, theAudiological.getRSD());
			myStmt.setDouble(29, theAudiological.getLSD());
			
			myStmt.setDouble(30, theAudiological.getLR50());
			myStmt.setDouble(31, theAudiological.getLR1());
			myStmt.setDouble(32, theAudiological.getLR12());
			myStmt.setDouble(33, theAudiological.getLRTP());
			myStmt.setDouble(34, theAudiological.getLL50());
			myStmt.setDouble(35, theAudiological.getLL1());
			myStmt.setDouble(36, theAudiological.getLL12());
			myStmt.setDouble(37, theAudiological.getLLTP());
			
						
			// execute SQL
			myStmt.executeUpdate();			
		}
		finally {
			close(myStmt, null);
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
	
	AudiologicalDAO dao = new AudiologicalDAO();
//	dao.addNewAudoi();
	System.out.println("add audio success");


}

}
