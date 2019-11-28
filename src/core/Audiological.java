package core;


public class Audiological {
	
	private int audiological_ID;

	private int visit_id;
//8.
	private String comments;
	
//	1. Pure-tone audiogram tests 
	private double R25;
	private double R50;
	private double R10;
	private double R12;
	
	private double L25;
	private double L50;
	private double L10;
	private double L12;
	
//  2.tinnitus pitch match Right
	private double T_PR;
	private String T_Rm;
	private double T_LR;
	private double Th_R;
	private double T_RLs;
//  3.tinnitus pitch match	Left
	private double T_PL;
	private String T_Lm;
	private double T_LL;
	private double Th_L;
	private double T_Ls;
	
// 4. 
	private double WNR;
	private double WNL;
	
//5. 
	private double MML;
	
	private double MRR;
	private double MRB;
	
	private double MRL;
	private double MLB;
//6. 
	private double RSD;
	private double LSD;
//7.
	private double LR50;
	private double LR1;
	private double LR12;
	private double LRTP;
	
	private double LL50;
	private double LL1;
	private double LL12;
	private double LLTP;
	
	
	

	public Audiological(int visit_id, String comments, double r25, double r50, double r10,
			double r12, double l25, double l50, double l10, double l12, double t_PR, String t_Rm, double t_LR,
			double th_R, double t_RLs, double t_PL, String t_Lm, double t_LL, double th_L, double t_Ls, double wNR,
			double wNL, double mML, double mRR, double mRB, double mRL, double mLB, double rSD, double lSD, double lR50,
			double lR1, double lR12, double lRTP, double lL50, double lL1, double lL12, double lLTP) {
		super();
		this.visit_id = visit_id;
		this.comments = comments;
		this.R25 = r25;
		this.R50 = r50;
		this.R10 = r10;
		this.R12 = r12;
		this.L25 = l25;
		this.L50 = l50;
		this.L10 = l10;
		this.L12 = l12;
		this.T_PR = t_PR;
		this.T_Rm = t_Rm;
		this.T_LR = t_LR;
		this.Th_R = th_R;
		this.T_RLs = t_RLs;
		this.T_PL = t_PL;
		this.T_Lm = t_Lm;
		this.T_LL = t_LL;
		this.Th_L = th_L;
		this.T_Ls = t_Ls;
		this.WNR = wNR;
		this.WNL = wNL;
		this.MML = mML;
		this.MRR = mRR;
		this.MRB = mRB;
		this.MRL = mRL;
		this.MLB = mLB;
		this.RSD = rSD;
		this.LSD = lSD;
		this.LR50 = lR50;
		this.LR1 = lR1;
		this.LR12 = lR12;
		this.LRTP = lRTP;
		this.LL50 = lL50;
		this.LL1 = lL1;
		this.LL12 = lL12;
		this.LLTP = lLTP;
	}




	public int getAudiological_ID() {
		return audiological_ID;
	}




	public void setAudiological_ID(int audiological_ID) {
		this.audiological_ID = audiological_ID;
	}




	public int getVisit_id() {
		return visit_id;
	}




	public void setVisit_id(int visit_id) {
		this.visit_id = visit_id;
	}




	public String getComments() {
		return comments;
	}




	public void setComments(String comments) {
		this.comments = comments;
	}




	public double getR25() {
		return R25;
	}




	public void setR25(double r25) {
		R25 = r25;
	}




	public double getR50() {
		return R50;
	}




	public void setR50(double r50) {
		R50 = r50;
	}




	public double getR10() {
		return R10;
	}




	public void setR10(double r10) {
		R10 = r10;
	}




	public double getR12() {
		return R12;
	}




	public void setR12(double r12) {
		R12 = r12;
	}




	public double getL25() {
		return L25;
	}




	public void setL25(double l25) {
		L25 = l25;
	}




	public double getL50() {
		return L50;
	}




	public void setL50(double l50) {
		L50 = l50;
	}




	public double getL10() {
		return L10;
	}




	public void setL10(double l10) {
		L10 = l10;
	}




	public double getL12() {
		return L12;
	}




	public void setL12(double l12) {
		L12 = l12;
	}




	public double getT_PR() {
		return T_PR;
	}




	public void setT_PR(double t_PR) {
		T_PR = t_PR;
	}




	public String getT_Rm() {
		return T_Rm;
	}




	public void setT_Rm(String t_Rm) {
		T_Rm = t_Rm;
	}




	public double getT_LR() {
		return T_LR;
	}




	public void setT_LR(double t_LR) {
		T_LR = t_LR;
	}




	public double getTh_R() {
		return Th_R;
	}




	public void setTh_R(double th_R) {
		Th_R = th_R;
	}




	public double getT_RLs() {
		return T_RLs;
	}




	public void setT_RLs(double t_RLs) {
		T_RLs = t_RLs;
	}




	public double getT_PL() {
		return T_PL;
	}




	public void setT_PL(double t_PL) {
		T_PL = t_PL;
	}




	public String getT_Lm() {
		return T_Lm;
	}




	public void setT_Lm(String t_Lm) {
		T_Lm = t_Lm;
	}




	public double getT_LL() {
		return T_LL;
	}




	public void setT_LL(double t_LL) {
		T_LL = t_LL;
	}




	public double getTh_L() {
		return Th_L;
	}




	public void setTh_L(double th_L) {
		Th_L = th_L;
	}




	public double getT_Ls() {
		return T_Ls;
	}




	public void setT_Ls(double t_Ls) {
		T_Ls = t_Ls;
	}




	public double getWNR() {
		return WNR;
	}




	public void setWNR(double wNR) {
		WNR = wNR;
	}




	public double getWNL() {
		return WNL;
	}




	public void setWNL(double wNL) {
		WNL = wNL;
	}




	public double getMML() {
		return MML;
	}




	public void setMML(double mML) {
		MML = mML;
	}




	public double getMRR() {
		return MRR;
	}




	public void setMRR(double mRR) {
		MRR = mRR;
	}




	public double getMRB() {
		return MRB;
	}




	public void setMRB(double mRB) {
		MRB = mRB;
	}




	public double getMRL() {
		return MRL;
	}




	public void setMRL(double mRL) {
		MRL = mRL;
	}




	public double getMLB() {
		return MLB;
	}




	public void setMLB(double mLB) {
		MLB = mLB;
	}




	public double getRSD() {
		return RSD;
	}




	public void setRSD(double rSD) {
		RSD = rSD;
	}




	public double getLSD() {
		return LSD;
	}




	public void setLSD(double lSD) {
		LSD = lSD;
	}




	public double getLR50() {
		return LR50;
	}




	public void setLR50(double lR50) {
		LR50 = lR50;
	}




	public double getLR1() {
		return LR1;
	}




	public void setLR1(double lR1) {
		LR1 = lR1;
	}




	public double getLR12() {
		return LR12;
	}




	public void setLR12(double lR12) {
		LR12 = lR12;
	}




	public double getLRTP() {
		return LRTP;
	}




	public void setLRTP(double lRTP) {
		LRTP = lRTP;
	}




	public double getLL50() {
		return LL50;
	}




	public void setLL50(double lL50) {
		LL50 = lL50;
	}




	public double getLL1() {
		return LL1;
	}




	public void setLL1(double lL1) {
		LL1 = lL1;
	}




	public double getLL12() {
		return LL12;
	}




	public void setLL12(double lL12) {
		LL12 = lL12;
	}




	public double getLLTP() {
		return LLTP;
	}




	public void setLLTP(double lLTP) {
		LLTP = lLTP;
	}




	@Override
	public String toString() {
		return String
				.format("Audio [audiological_ID=%s, visit_id=%s, comments=%s, R25=%s]",
						audiological_ID, visit_id, comments, R25);
	}
}
