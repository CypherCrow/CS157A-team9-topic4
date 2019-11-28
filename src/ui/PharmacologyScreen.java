package ui;
import core.medicationsTable;
import core.Medicament;
import dao.MedicamentDAO;

import dao.VisitDAO;
import dao.PharmacologyDAO;
import core.Visit;
import core.Pharmacology;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import core.Visit;
import dao.AudiologicalDAO;
import dao.VisitDAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PharmacologyScreen extends JFrame {

	private VisitDAO visitDAO;
	private PharmacologyDAO PharmacologyDAO;
	private MedicamentDAO MedicamentDAO;
	private int visit_id;
	
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PharmacologyScreen frame = new PharmacologyScreen();
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
	public PharmacologyScreen() {
		try {
			visitDAO = new VisitDAO();	
			PharmacologyDAO = new PharmacologyDAO();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(this, "Error: " + exc, "Error", JOptionPane.ERROR_MESSAGE); 
		}
		
		setTitle("PharmacologyScreen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("Patient Name:");
		panel.add(label);
		
		JLabel lblName = new JLabel("name");
		panel.add(lblName);
		
		JLabel label_1 = new JLabel("   Patient’s THC#:");
		panel.add(label_1);
		
		JLabel lblThclable = new JLabel("THCLable");
		panel.add(lblThclable);
		
		JLabel label_2 = new JLabel("   Sequence Number:");
		panel.add(label_2);
		
		JLabel lblSqnumber = new JLabel("SQNumber");
		panel.add(lblSqnumber);
		
		JLabel label_3 = new JLabel("   Visit Date:");
		panel.add(label_3);
		
		JLabel lblDatelable = new JLabel("    DateLable");
		panel.add(lblDatelable);
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnSearch);
		
		JButton btnNewButton = new JButton("Add Medication");

		
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				MedicationDialog dialog = new MedicationDialog(1);
//				System.out.println("passed pharma_id to MedicationDialog");
//				dialog.setVisible(true);
//			}
//		});
		panel_1.add(btnNewButton);
	}
	
	
	
	
	
	
	
	public PharmacologyScreen(int visit_id) throws Exception {
		
		try {
			visitDAO = new VisitDAO();	
			PharmacologyDAO = new PharmacologyDAO();
			MedicamentDAO = new MedicamentDAO();
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
		
		System.out.println(visit_id + "from Pharmacology page");
		
		setTitle("PharmacologyScreen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("Patient Name:");
		panel.add(label);
		
		JLabel lblName = new JLabel(Patient_name);
		panel.add(lblName);
		
		JLabel label_1 = new JLabel("   Patient’s THC#:");
		panel.add(label_1);
		
		JLabel lblThclable = new JLabel(THC);
		panel.add(lblThclable);
		
		JLabel label_2 = new JLabel("   Sequence Number:");
		panel.add(label_2);
		
		JLabel lblSqnumber = new JLabel(convertedSQN);
		panel.add(lblSqnumber);
		
		JLabel label_3 = new JLabel("   Visit Date:");
		panel.add(label_3);
		
		JLabel lblDatelable = new JLabel(convertedDate);
		panel.add(lblDatelable);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//do a search. pass param_id
				try {
					int currentPharmacology_ID = PharmacologyDAO.getCurrentPharmacology_ID();
//					int currentMedicament_ID = MedicamentDAO.getCurrentMedicament_id();
					List<medicationsTable> medicationsTable = MedicamentDAO.searchMedicament(currentPharmacology_ID);
					
					//create model
					PharmacologyTableModel model = new PharmacologyTableModel(medicationsTable);
					
					table.setModel(model);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		panel_1.add(btnSearch);
		
		JButton btnNewButton = new JButton("Add Medication");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				MedicationDialog dialog = new MedicationDialog(visit_id);
				try {
					int currentPharmacology_ID = PharmacologyDAO.getCurrentPharmacology_ID();
					MedicationDialog dialog = new MedicationDialog(currentPharmacology_ID);
					System.out.println("passed pharma_id to MedicationDialog");
					dialog.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		panel_1.add(btnNewButton);
	}

}
