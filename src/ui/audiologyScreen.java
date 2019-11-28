package ui;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.VisitDAO;
import core.Visit;
import dao.AudiologicalDAO;
import core.Audiological;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class audiologyScreen extends JFrame {

	
	private VisitDAO visitDAO;
	private AudiologicalDAO AudiologicalDAO;
	private int visit_id;
	
	private JPanel contentPane;
	private JTextField R25textField;
	private JTextField R50textField;
	private JTextField R10textField;
	private JTextField R12textField;
	private JTextField L25textField;
	private JTextField L50textField;
	private JTextField L10textField;
	private JTextField L12textField;
	private JTextField T_PRtextField;
	private JTextField T_RmtextField;
	private JTextField T_LRtextField;
	private JTextField Th_RtextField;
	private JTextField T_RLstextField;
	private JTextField T_PLtextField;
	private JTextField T_LmtextField;
	private JTextField T_LLtextField;
	private JTextField Th_LtextField;
	private JTextField T_LstextField;
	private JTextField WNRtextField;
	private JTextField WNLtextField;
	private JTextField MMLtextField;
	private JTextField MRRtextField;
	private JTextField MRBtextField;
	private JTextField MRLtextField;
	private JTextField MLBtextField;
	private JTextField RSDtextField;
	private JTextField LSDtextField;
	private JTextField LR50textField;
	private JTextField LR1textField;
	private JTextField LR12textField;
	private JTextField LRTPtextField;
	private JTextField LL50textField;
	private JTextField LL1textField;
	private JTextField LL12textField;
	private JTextField LLTPtextField;
	private JTextField commentstextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					audiologyScreen frame = new audiologyScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public audiologyScreen() {
		// create the DAO
		try {
			visitDAO = new VisitDAO();
			AudiologicalDAO = new AudiologicalDAO();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(this, "Error: " + exc, "Error", JOptionPane.ERROR_MESSAGE); 
		}
				
		setTitle("Audiology Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("790px:grow"),},
			new RowSpec[] {
				FormSpecs.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("26px"),
				RowSpec.decode("21px:grow"),}));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, "2, 2, fill, top");
		
		JLabel lblPatientName = new JLabel("Patient Name:");
		panel.add(lblPatientName);
		
		JLabel lblName = new JLabel("name");
		panel.add(lblName);
		
		JLabel lblPatientsThc = new JLabel("   Patient’s THC#:");
		panel.add(lblPatientsThc);
		
		JLabel lblThclable = new JLabel("THCLable");
		panel.add(lblThclable);
		
		JLabel lblSequenceNumber = new JLabel("   Sequence Number:");
		panel.add(lblSequenceNumber);
		
		JLabel lblSqnumber = new JLabel("SQNumber");
		panel.add(lblSqnumber);
		
		JLabel lblVisitDate = new JLabel("   Visit Date:");
		panel.add(lblVisitDate);
		
		JLabel lblDatelable = new JLabel("    DateLable");
		panel.add(lblDatelable);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "2, 3, fill, fill");
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblPuretoneAudiogramTests = new JLabel("1.Pure-tone audiogram tests:");
		panel_1.add(lblPuretoneAudiogramTests, "2, 2");
		
		JLabel lblR = new JLabel("R25");
		panel_1.add(lblR, "2, 4, right, default");
		
		R25textField = new JTextField();
		panel_1.add(R25textField, "4, 4, 2, 1, fill, default");
		R25textField.setColumns(10);
		
		JLabel lblR_1 = new JLabel("R50");
		panel_1.add(lblR_1, "6, 4, right, default");
		
		R50textField = new JTextField();
		panel_1.add(R50textField, "8, 4, fill, default");
		R50textField.setColumns(10);
		
		JLabel lblR_2 = new JLabel("R10:");
		panel_1.add(lblR_2, "10, 4, right, default");
		
		R10textField = new JTextField();
		panel_1.add(R10textField, "12, 4, fill, default");
		R10textField.setColumns(10);
		
		JLabel lblR_3 = new JLabel("R12");
		panel_1.add(lblR_3, "14, 4, right, default");
		
		R12textField = new JTextField();
		panel_1.add(R12textField, "16, 4, fill, default");
		R12textField.setColumns(10);
		
		JLabel lblL = new JLabel("L25");
		panel_1.add(lblL, "2, 6, right, default");
		
		L25textField = new JTextField();
		panel_1.add(L25textField, "4, 6, 2, 1, fill, default");
		L25textField.setColumns(10);
		
		JLabel lblL_1 = new JLabel("L50");
		panel_1.add(lblL_1, "6, 6, right, default");
		
		L50textField = new JTextField();
		panel_1.add(L50textField, "8, 6, 2, 1, fill, default");
		L50textField.setColumns(10);
		
		JLabel lblL_2 = new JLabel("L10");
		panel_1.add(lblL_2, "10, 6, right, default");
		
		L10textField = new JTextField();
		panel_1.add(L10textField, "12, 6, fill, default");
		L10textField.setColumns(10);
		
		JLabel lblL_3 = new JLabel("L12");
		panel_1.add(lblL_3, "14, 6, right, default");
		
		L12textField = new JTextField();
		panel_1.add(L12textField, "16, 6, fill, default");
		L12textField.setColumns(10);
		
		JLabel label = new JLabel("2.&3");
		panel_1.add(label, "2, 8");
		
		JLabel lblTpr = new JLabel("T_PR");
		panel_1.add(lblTpr, "2, 10, right, default");
		
		T_PRtextField = new JTextField();
		panel_1.add(T_PRtextField, "4, 10, 2, 1, fill, default");
		T_PRtextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("T_Rm(String)");
		panel_1.add(lblNewLabel, "6, 10, right, default");
		
		T_RmtextField = new JTextField();
		panel_1.add(T_RmtextField, "8, 10, 2, 1, fill, default");
		T_RmtextField.setColumns(10);
		
		JLabel lblTlr = new JLabel("T_LR");
		panel_1.add(lblTlr, "10, 10, right, default");
		
		T_LRtextField = new JTextField();
		panel_1.add(T_LRtextField, "12, 10, fill, default");
		T_LRtextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Th_R");
		panel_1.add(lblNewLabel_1, "14, 10, right, default");
		
		Th_RtextField = new JTextField();
		panel_1.add(Th_RtextField, "16, 10, fill, default");
		Th_RtextField.setColumns(10);
		
		JLabel lblTrls = new JLabel("T_RLs");
		panel_1.add(lblTrls, "18, 10, right, default");
		
		T_RLstextField = new JTextField();
		panel_1.add(T_RLstextField, "20, 10, fill, default");
		T_RLstextField.setColumns(10);
		
		JLabel lblTpl = new JLabel("T_PL");
		panel_1.add(lblTpl, "2, 12, right, default");
		
		T_PLtextField = new JTextField();
		panel_1.add(T_PLtextField, "4, 12, fill, default");
		T_PLtextField.setColumns(10);
		
		JLabel lblTlmstring = new JLabel("T_Lm(String)");
		panel_1.add(lblTlmstring, "6, 12, right, default");
		
		T_LmtextField = new JTextField();
		panel_1.add(T_LmtextField, "8, 12, 2, 1, fill, default");
		T_LmtextField.setColumns(10);
		
		JLabel lblTll = new JLabel("T_LL");
		panel_1.add(lblTll, "10, 12, right, default");
		
		T_LLtextField = new JTextField();
		panel_1.add(T_LLtextField, "12, 12, fill, default");
		T_LLtextField.setColumns(10);
		
		JLabel lblThl = new JLabel("Th_L");
		panel_1.add(lblThl, "14, 12, right, default");
		
		Th_LtextField = new JTextField();
		panel_1.add(Th_LtextField, "16, 12, fill, default");
		Th_LtextField.setColumns(10);
		
		JLabel lblTlls = new JLabel("T_Ls");
		panel_1.add(lblTlls, "18, 12, right, default");
		
		T_LstextField = new JTextField();
		panel_1.add(T_LstextField, "20, 12, fill, default");
		T_LstextField.setColumns(10);
		
		JLabel label_1 = new JLabel("4.");
		panel_1.add(label_1, "2, 14");
		
		JLabel lblWnr = new JLabel("WNR");
		panel_1.add(lblWnr, "2, 16, right, default");
		
		WNRtextField = new JTextField();
		panel_1.add(WNRtextField, "4, 16, fill, default");
		WNRtextField.setColumns(10);
		
		JLabel lblWnl = new JLabel("WNL");
		panel_1.add(lblWnl, "14, 16, right, default");
		
		WNLtextField = new JTextField();
		panel_1.add(WNLtextField, "16, 16, fill, default");
		WNLtextField.setColumns(10);
		
		JLabel label_2 = new JLabel("5.");
		panel_1.add(label_2, "2, 18");
		
		JLabel lblMml = new JLabel("MML");
		panel_1.add(lblMml, "6, 18, right, default");
		
		MMLtextField = new JTextField();
		panel_1.add(MMLtextField, "8, 18, fill, default");
		MMLtextField.setColumns(10);
		
		JLabel lblMrr = new JLabel("MRR");
		panel_1.add(lblMrr, "2, 20, right, default");
		
		MRRtextField = new JTextField();
		panel_1.add(MRRtextField, "4, 20, fill, default");
		MRRtextField.setColumns(10);
		
		JLabel lblMrb = new JLabel("MRB");
		panel_1.add(lblMrb, "6, 20, right, default");
		
		MRBtextField = new JTextField();
		panel_1.add(MRBtextField, "8, 20, fill, default");
		MRBtextField.setColumns(10);
		
		JLabel lblMbr = new JLabel("MRL");
		panel_1.add(lblMbr, "10, 20, right, default");
		
		MRLtextField = new JTextField();
		panel_1.add(MRLtextField, "12, 20, fill, default");
		MRLtextField.setColumns(10);
		
		JLabel lblMlb = new JLabel("MLB");
		panel_1.add(lblMlb, "14, 20, right, default");
		
		MLBtextField = new JTextField();
		panel_1.add(MLBtextField, "16, 20, fill, default");
		MLBtextField.setColumns(10);
		
		JLabel label_3 = new JLabel("6.");
		panel_1.add(label_3, "2, 22");
		
		JLabel lblNewLabel_2 = new JLabel("RSD");
		panel_1.add(lblNewLabel_2, "2, 24, right, default");
		
		RSDtextField = new JTextField();
		panel_1.add(RSDtextField, "4, 24, fill, default");
		RSDtextField.setColumns(10);
		
		JLabel lblLsd = new JLabel("LSD");
		panel_1.add(lblLsd, "14, 24, right, default");
		
		LSDtextField = new JTextField();
		panel_1.add(LSDtextField, "16, 24, fill, default");
		LSDtextField.setColumns(10);
		
		JLabel label_4 = new JLabel("7.");
		panel_1.add(label_4, "2, 26");
		
		JLabel lblLr = new JLabel("LR50");
		panel_1.add(lblLr, "2, 28, right, default");
		
		LR50textField = new JTextField();
		panel_1.add(LR50textField, "4, 28, fill, default");
		LR50textField.setColumns(10);
		
		JLabel lblLr_1 = new JLabel("LR1");
		panel_1.add(lblLr_1, "6, 28, right, default");
		
		LR1textField = new JTextField();
		panel_1.add(LR1textField, "8, 28, fill, default");
		LR1textField.setColumns(10);
		
		JLabel lblLr_2 = new JLabel("LR12");
		panel_1.add(lblLr_2, "10, 28, right, default");
		
		LR12textField = new JTextField();
		panel_1.add(LR12textField, "12, 28, fill, default");
		LR12textField.setColumns(10);
		
		JLabel lblLrtp = new JLabel("LRTP");
		panel_1.add(lblLrtp, "14, 28, right, default");
		
		LRTPtextField = new JTextField();
		panel_1.add(LRTPtextField, "16, 28, fill, default");
		LRTPtextField.setColumns(10);
		
		JLabel lblLl = new JLabel("LL50");
		panel_1.add(lblLl, "2, 30, right, default");
		
		LL50textField = new JTextField();
		panel_1.add(LL50textField, "4, 30, fill, default");
		LL50textField.setColumns(10);
		
		JLabel lblLl_1 = new JLabel("LL1");
		panel_1.add(lblLl_1, "6, 30, right, default");
		
		LL1textField = new JTextField();
		panel_1.add(LL1textField, "8, 30, fill, default");
		LL1textField.setColumns(10);
		
		JLabel lblLl_2 = new JLabel("LL12");
		panel_1.add(lblLl_2, "10, 30, right, default");
		
		LL12textField = new JTextField();
		panel_1.add(LL12textField, "12, 30, fill, default");
		LL12textField.setColumns(10);
		
		JLabel lblLltp = new JLabel("LLTP");
		panel_1.add(lblLltp, "14, 30, right, default");
		
		LLTPtextField = new JTextField();
		panel_1.add(LLTPtextField, "16, 30, fill, default");
		LLTPtextField.setColumns(10);
		
		JLabel label_5 = new JLabel("8.");
		panel_1.add(label_5, "2, 32");
		
		JLabel lblComments = new JLabel("comments:");
		panel_1.add(lblComments, "2, 34");
		
		commentstextField = new JTextField();
		panel_1.add(commentstextField, "6, 34, fill, default");
		commentstextField.setColumns(10);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("add from audio screen");
				saveAudiology();
//				System.out.println("add ok");
			}
		});
		panel_1.add(btnSave, "2, 36");
		
		JButton btnCancel = new JButton("CANCEL");
		panel_1.add(btnCancel, "6, 36");
		
		JButton btnHelp = new JButton("HELP");
		panel_1.add(btnHelp, "2, 38");
		
		JButton btnBack = new JButton("BACK");
		panel_1.add(btnBack, "6, 38");
		
		
	}
	
	public audiologyScreen(int visit_id) throws Exception {
		
		try {
			visitDAO = new VisitDAO();	
			AudiologicalDAO = new AudiologicalDAO();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(this, "Error: " + exc, "Error", JOptionPane.ERROR_MESSAGE); 
		}
		
		this.visit_id = visit_id;
		Visit currentVisit = visitDAO.getCurrentVisitInfo(visit_id);
		String Patient_name = currentVisit.getPatient_name();
		Date date = currentVisit.getDate();
		String THC = currentVisit.getTHC();
		int sequenceNumber = currentVisit.getVisit_id();
		String convertedSQN = Integer.toString(sequenceNumber);
		
		Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String convertedDate = formatter.format(date);
		
		System.out.println(visit_id + "from audiology page");
		
		setTitle("Audiology Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblPatientName = new JLabel("Patient Name:");
		panel.add(lblPatientName);
		
		JLabel lblName = new JLabel(Patient_name);
		panel.add(lblName);
		
		JLabel lblPatientsThc = new JLabel("   Patient’s THC#:");
		panel.add(lblPatientsThc);
		
		JLabel lblThclable = new JLabel(THC);
		panel.add(lblThclable);
		
		JLabel lblSequenceNumber = new JLabel("   Sequence Number:");
		panel.add(lblSequenceNumber);
		
		JLabel lblSqnumber = new JLabel(convertedSQN);
		panel.add(lblSqnumber);
		
		JLabel lblVisitDate = new JLabel("   Visit Date:");
		panel.add(lblVisitDate);
		
		JLabel lblDatelable = new JLabel(convertedDate);
		panel.add(lblDatelable);
		
		JPanel panel_1 = new JPanel();
//		contentPane.add(panel_1, "2, 3, fill, fill");
		contentPane.add(panel_1);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblPuretoneAudiogramTests = new JLabel("1.Pure-tone audiogram tests:");
		panel_1.add(lblPuretoneAudiogramTests, "2, 2");
		
		JLabel lblR = new JLabel("R25");
		panel_1.add(lblR, "2, 4, right, default");
		
		R25textField = new JTextField();
		panel_1.add(R25textField, "4, 4, 2, 1, fill, default");
		R25textField.setColumns(10);
		
		JLabel lblR_1 = new JLabel("R50");
		panel_1.add(lblR_1, "6, 4, right, default");
		
		R50textField = new JTextField();
		panel_1.add(R50textField, "8, 4, fill, default");
		R50textField.setColumns(10);
		
		JLabel lblR_2 = new JLabel("R10:");
		panel_1.add(lblR_2, "10, 4, right, default");
		
		R10textField = new JTextField();
		panel_1.add(R10textField, "12, 4, fill, default");
		R10textField.setColumns(10);
		
		JLabel lblR_3 = new JLabel("R12");
		panel_1.add(lblR_3, "14, 4, right, default");
		
		R12textField = new JTextField();
		panel_1.add(R12textField, "16, 4, fill, default");
		R12textField.setColumns(10);
		
		JLabel lblL = new JLabel("L25");
		panel_1.add(lblL, "2, 6, right, default");
		
		L25textField = new JTextField();
		panel_1.add(L25textField, "4, 6, 2, 1, fill, default");
		L25textField.setColumns(10);
		
		JLabel lblL_1 = new JLabel("L50");
		panel_1.add(lblL_1, "6, 6, right, default");
		
		L50textField = new JTextField();
		panel_1.add(L50textField, "8, 6, 2, 1, fill, default");
		L50textField.setColumns(10);
		
		JLabel lblL_2 = new JLabel("L10");
		panel_1.add(lblL_2, "10, 6, right, default");
		
		L10textField = new JTextField();
		panel_1.add(L10textField, "12, 6, fill, default");
		L10textField.setColumns(10);
		
		JLabel lblL_3 = new JLabel("L12");
		panel_1.add(lblL_3, "14, 6, right, default");
		
		L12textField = new JTextField();
		panel_1.add(L12textField, "16, 6, fill, default");
		L12textField.setColumns(10);
		
		JLabel label = new JLabel("2.&3");
		panel_1.add(label, "2, 8");
		
		JLabel lblTpr = new JLabel("T_PR");
		panel_1.add(lblTpr, "2, 10, right, default");
		
		T_PRtextField = new JTextField();
		panel_1.add(T_PRtextField, "4, 10, 2, 1, fill, default");
		T_PRtextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("T_Rm(String)");
		panel_1.add(lblNewLabel, "6, 10, right, default");
		
		T_RmtextField = new JTextField();
		panel_1.add(T_RmtextField, "8, 10, 2, 1, fill, default");
		T_RmtextField.setColumns(10);
		
		JLabel lblTlr = new JLabel("T_LR");
		panel_1.add(lblTlr, "10, 10, right, default");
		
		T_LRtextField = new JTextField();
		panel_1.add(T_LRtextField, "12, 10, fill, default");
		T_LRtextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Th_R");
		panel_1.add(lblNewLabel_1, "14, 10, right, default");
		
		Th_RtextField = new JTextField();
		panel_1.add(Th_RtextField, "16, 10, fill, default");
		Th_RtextField.setColumns(10);
		
		JLabel lblTrls = new JLabel("T_RLs");
		panel_1.add(lblTrls, "18, 10, right, default");
		
		T_RLstextField = new JTextField();
		panel_1.add(T_RLstextField, "20, 10, fill, default");
		T_RLstextField.setColumns(10);
		
		JLabel lblTpl = new JLabel("T_PL");
		panel_1.add(lblTpl, "2, 12, right, default");
		
		T_PLtextField = new JTextField();
		panel_1.add(T_PLtextField, "4, 12, fill, default");
		T_PLtextField.setColumns(10);
		
		JLabel lblTlmstring = new JLabel("T_Lm(String)");
		panel_1.add(lblTlmstring, "6, 12, right, default");
		
		T_LmtextField = new JTextField();
		panel_1.add(T_LmtextField, "8, 12, 2, 1, fill, default");
		T_LmtextField.setColumns(10);
		
		JLabel lblTll = new JLabel("T_LL");
		panel_1.add(lblTll, "10, 12, right, default");
		
		T_LLtextField = new JTextField();
		panel_1.add(T_LLtextField, "12, 12, fill, default");
		T_LLtextField.setColumns(10);
		
		JLabel lblThl = new JLabel("Th_L");
		panel_1.add(lblThl, "14, 12, right, default");
		
		Th_LtextField = new JTextField();
		panel_1.add(Th_LtextField, "16, 12, fill, default");
		Th_LtextField.setColumns(10);
		
		JLabel lblTlls = new JLabel("T_Ls");
		panel_1.add(lblTlls, "18, 12, right, default");
		
		T_LstextField = new JTextField();
		panel_1.add(T_LstextField, "20, 12, fill, default");
		T_LstextField.setColumns(10);
		
		JLabel label_1 = new JLabel("4.");
		panel_1.add(label_1, "2, 14");
		
		JLabel lblWnr = new JLabel("WNR");
		panel_1.add(lblWnr, "2, 16, right, default");
		
		WNRtextField = new JTextField();
		panel_1.add(WNRtextField, "4, 16, fill, default");
		WNRtextField.setColumns(10);
		
		JLabel lblWnl = new JLabel("WNL");
		panel_1.add(lblWnl, "14, 16, right, default");
		
		WNLtextField = new JTextField();
		panel_1.add(WNLtextField, "16, 16, fill, default");
		WNLtextField.setColumns(10);
		
		JLabel label_2 = new JLabel("5.");
		panel_1.add(label_2, "2, 18");
		
		JLabel lblMml = new JLabel("MML");
		panel_1.add(lblMml, "6, 18, right, default");
		
		MMLtextField = new JTextField();
		panel_1.add(MMLtextField, "8, 18, fill, default");
		MMLtextField.setColumns(10);
		
		JLabel lblMrr = new JLabel("MRR");
		panel_1.add(lblMrr, "2, 20, right, default");
		
		MRRtextField = new JTextField();
		panel_1.add(MRRtextField, "4, 20, fill, default");
		MRRtextField.setColumns(10);
		
		JLabel lblMrb = new JLabel("MRB");
		panel_1.add(lblMrb, "6, 20, right, default");
		
		MRBtextField = new JTextField();
		panel_1.add(MRBtextField, "8, 20, fill, default");
		MRBtextField.setColumns(10);
		
		JLabel lblMbr = new JLabel("MRL");
		panel_1.add(lblMbr, "10, 20, right, default");
		
		MRLtextField = new JTextField();
		panel_1.add(MRLtextField, "12, 20, fill, default");
		MRLtextField.setColumns(10);
		
		JLabel lblMlb = new JLabel("MLB");
		panel_1.add(lblMlb, "14, 20, right, default");
		
		MLBtextField = new JTextField();
		panel_1.add(MLBtextField, "16, 20, fill, default");
		MLBtextField.setColumns(10);
		
		JLabel label_3 = new JLabel("6.");
		panel_1.add(label_3, "2, 22");
		
		JLabel lblNewLabel_2 = new JLabel("RSD");
		panel_1.add(lblNewLabel_2, "2, 24, right, default");
		
		RSDtextField = new JTextField();
		panel_1.add(RSDtextField, "4, 24, fill, default");
		RSDtextField.setColumns(10);
		
		JLabel lblLsd = new JLabel("LSD");
		panel_1.add(lblLsd, "14, 24, right, default");
		
		LSDtextField = new JTextField();
		panel_1.add(LSDtextField, "16, 24, fill, default");
		LSDtextField.setColumns(10);
		
		JLabel label_4 = new JLabel("7.");
		panel_1.add(label_4, "2, 26");
		
		JLabel lblLr = new JLabel("LR50");
		panel_1.add(lblLr, "2, 28, right, default");
		
		LR50textField = new JTextField();
		panel_1.add(LR50textField, "4, 28, fill, default");
		LR50textField.setColumns(10);
		
		JLabel lblLr_1 = new JLabel("LR1");
		panel_1.add(lblLr_1, "6, 28, right, default");
		
		LR1textField = new JTextField();
		panel_1.add(LR1textField, "8, 28, fill, default");
		LR1textField.setColumns(10);
		
		JLabel lblLr_2 = new JLabel("LR12");
		panel_1.add(lblLr_2, "10, 28, right, default");
		
		LR12textField = new JTextField();
		panel_1.add(LR12textField, "12, 28, fill, default");
		LR12textField.setColumns(10);
		
		JLabel lblLrtp = new JLabel("LRTP");
		panel_1.add(lblLrtp, "14, 28, right, default");
		
		LRTPtextField = new JTextField();
		panel_1.add(LRTPtextField, "16, 28, fill, default");
		LRTPtextField.setColumns(10);
		
		JLabel lblLl = new JLabel("LL50");
		panel_1.add(lblLl, "2, 30, right, default");
		
		LL50textField = new JTextField();
		panel_1.add(LL50textField, "4, 30, fill, default");
		LL50textField.setColumns(10);
		
		JLabel lblLl_1 = new JLabel("LL1");
		panel_1.add(lblLl_1, "6, 30, right, default");
		
		LL1textField = new JTextField();
		panel_1.add(LL1textField, "8, 30, fill, default");
		LL1textField.setColumns(10);
		
		JLabel lblLl_2 = new JLabel("LL12");
		panel_1.add(lblLl_2, "10, 30, right, default");
		
		LL12textField = new JTextField();
		panel_1.add(LL12textField, "12, 30, fill, default");
		LL12textField.setColumns(10);
		
		JLabel lblLltp = new JLabel("LLTP");
		panel_1.add(lblLltp, "14, 30, right, default");
		
		LLTPtextField = new JTextField();
		panel_1.add(LLTPtextField, "16, 30, fill, default");
		LLTPtextField.setColumns(10);
		
		JLabel label_5 = new JLabel("8.");
		panel_1.add(label_5, "2, 32");
		
		JLabel lblComments = new JLabel("comments:");
		panel_1.add(lblComments, "2, 34");
		
		commentstextField = new JTextField();
		panel_1.add(commentstextField, "6, 34, fill, default");
		commentstextField.setColumns(10);
		
		JButton btnSave = new JButton("SAVE");
		panel_1.add(btnSave, "2, 36");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("add from audio screen");
				saveAudiology();
//				System.out.println("add ok");
			}
		});
		
		JButton btnCancel = new JButton("CANCEL");
		panel_1.add(btnCancel, "6, 36");
		
		JButton btnHelp = new JButton("HELP");
		panel_1.add(btnHelp, "2, 38");
		
		JButton btnBack = new JButton("BACK");
		panel_1.add(btnBack, "6, 38");
	}
	
	protected void saveAudiology() {
		
		
		System.out.println("into saveAudiology");
		// 1.
		String R25 = R25textField.getText();
		String R50 = R50textField.getText();
		String R10 = R10textField.getText();
		String R12 = R12textField.getText();
		String L25 = L25textField.getText();
		String L50 = L50textField.getText();
		String L10 = L10textField.getText();
		String L12 = L12textField.getText();
		
		//CONVERT TO double
		double R25C = Double.parseDouble(R25);
		double R50C = Double.parseDouble(R50);
		double R10C = Double.parseDouble(R10);
		double R12C = Double.parseDouble(R12);
		double L25C = Double.parseDouble(L25);
		double L50C = Double.parseDouble(L50);
		double L10C = Double.parseDouble(L10);
		double L12C = Double.parseDouble(L12);
		
		//2. 5 total
		String T_PR = T_PRtextField.getText();
		String T_Rm = T_RmtextField.getText();
		String T_LR = T_LRtextField.getText();
		String Th_R = Th_RtextField.getText();
		String T_RLs = T_RLstextField.getText();
		
		//CONVERT TO double 4 total
		double T_PRC = Double.parseDouble(T_PR);
		double T_LRC = Double.parseDouble(T_LR);
		double Th_RC = Double.parseDouble(Th_R);
		double T_RLsC = Double.parseDouble(T_RLs);
		
		//3. 5 total
		String T_PL = T_PLtextField.getText();
		String T_Lm = T_LmtextField.getText();
		String T_LL = T_LLtextField.getText();
		String Th_L = Th_LtextField.getText();
		String T_Ls = T_LstextField.getText();
		
		//CONVERT TO double 4 total
		double T_PLC = Double.parseDouble(T_PL);
		double T_LLC = Double.parseDouble(T_LL);
		double Th_LC = Double.parseDouble(Th_L);
		double T_LsC = Double.parseDouble(T_Ls);
		
		//4.
		String WNR = WNRtextField.getText();
		String WNL = WNLtextField.getText();
		
		//CONVERT TO double
		double WNRC = Double.parseDouble(WNR);
		double WNLC = Double.parseDouble(WNL);
		
		//5. 
		String MML = MMLtextField.getText();
		String MRR = MRRtextField.getText();
		String MRB = MRBtextField.getText();
		String MRL = MRLtextField.getText();
		String MLB = MLBtextField.getText();
		
		//CONVERT TO double
		double MMLC = Double.parseDouble(MML);
		double MRRC = Double.parseDouble(MRR);
		double MRBC = Double.parseDouble(MRB);
		double MRLC = Double.parseDouble(MRL);
		double MLBC = Double.parseDouble(MLB);

		
		//6.
		String RSD = RSDtextField.getText();
		String LSD = RSDtextField.getText();
		
		//CONVERT TO double
		double RSDC = Double.parseDouble(RSD);
		double LSDC = Double.parseDouble(LSD);
		
		//7.
		String LR50 = LR50textField.getText();
		String LR1 = LR1textField.getText();
		String LR12 = LR12textField.getText();
		String LRTP = LRTPtextField.getText();
		String LL50 = LL50textField.getText();
		String LL1 = LL1textField.getText();
		String LL12 = LL12textField.getText();
		String LLTP = LLTPtextField.getText();
		
		
		//CONVERT TO double
		double LR50C = Double.parseDouble(LR50);
		double LR1C = Double.parseDouble(LR1);
		double LR12C = Double.parseDouble(LR12);
		double LRTPC = Double.parseDouble(LRTP);
		double LL50C = Double.parseDouble(LL50);
		double LL1C = Double.parseDouble(LL1);
		double LL12C = Double.parseDouble(LL12);
		double LLTPC = Double.parseDouble(LLTP);
		
		//8.
		String comments = commentstextField.getText();
		
		
		Audiological tempAudiological = new Audiological(visit_id,comments,
														R25C,R50C,R10C,R12C,L25C,L50C,L10C,L12C,
														T_PRC, T_Rm, T_LRC, Th_RC, T_RLsC,
														T_PLC, T_Lm, T_LLC, Th_LC, T_LsC,
														WNRC, WNLC,
														MMLC, MRRC, MRBC, MRLC, MLBC,
														RSDC, LSDC,
														LR50C, LR1C,LR12C, LRTPC,LL50C,LL1C,LL12C,LLTPC
														);
		
		System.out.println("before in to into try (audiodao)");
		
		try {
			System.out.println("before call dao");
			AudiologicalDAO.addNewAudoi(tempAudiological);
			System.out.println("add audio");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}

//test for 7
//System.out.println(LR50);
//System.out.println(LR50C);
//System.out.println(LR1);
//System.out.println(LR1C);
//System.out.println(LR12);
//System.out.println(LR12C);
//System.out.println(LRTP);
//System.out.println(LRTPC);
//
//System.out.println(LL50);
//System.out.println(LL50C);	
//System.out.println(LL1);
//System.out.println(LL1C);		
//System.out.println(LL12);
//System.out.println(LL12C);		
//System.out.println(LLTP);
//System.out.println(LLTP);

//test for 6

//System.out.println(RSD);
//System.out.println(RSDC);
//System.out.println(LSD);
//System.out.println(LSDC);

//test for 5

//System.out.println(MML);
//System.out.println(MMLC);
//System.out.println(MRR);
//System.out.println(MRRC);
//System.out.println(MRB);
//System.out.println(MRBC);
//System.out.println(MRL);
//System.out.println(MRLC);
//System.out.println(MLB);
//System.out.println(MLBC);



//test for 4

//System.out.println(WNR);
//System.out.println(WNRC);	
//System.out.println(WNL);
//System.out.println(WNLC);	



//test for 3

//System.out.println(T_PL);
//System.out.println(T_PLC);	
//System.out.println(T_LL);
//System.out.println(T_LLC);	
//System.out.println(Th_L);
//System.out.println(Th_LC);	
//System.out.println(T_Ls);
//System.out.println(T_LsC);


//test for 2
//System.out.println(T_PR);
//System.out.println(T_PRC);	
//System.out.println(T_LR);
//System.out.println(T_LRC);	
//System.out.println(Th_R);
//System.out.println(Th_RC);	
//System.out.println(T_RLs);
//System.out.println(T_RLsC);	


//test for 1 success
//System.out.println(R25);
//System.out.println(R25C);	
//System.out.println(R50);
//System.out.println(R50C);	
//System.out.println(R10);
//System.out.println(R10C);	
//System.out.println(R12);
//System.out.println(R12C);
//
//System.out.println(L25);
//System.out.println(L25C);
//System.out.println(L50);
//System.out.println(L50C);
//System.out.println(L10);
//System.out.println(L10C);
//System.out.println(L12);
//System.out.println(L12C);