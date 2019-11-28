package ui;
import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.VisitDAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import core.Visit;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class MainPage extends JFrame {

	private JPanel contentPane;
	
	private VisitDAO visitDAO;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		
		// create the DAO
		try {
			visitDAO = new VisitDAO();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(this, "Error: " + exc, "Error", JOptionPane.ERROR_MESSAGE); 
		}
		
		
		setTitle("MainPage");
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
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		//Add New Visit	
		JButton btnAddNewVisit = new JButton("Add New Visit");
		panel_1.add(btnAddNewVisit);
		
		// edit visit
		JButton btnEditVisit = new JButton("Edit Visit");
		panel_1.add(btnEditVisit);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int row = table.getSelectedRow();
				
				SelectAudioOrPharmPage2 selectionPage = new SelectAudioOrPharmPage2(row + 1);
				selectionPage.setVisible(true);
			}
		});
		panel_1.add(btnSelect);
		
		JButton btnLookupPatient = new JButton("Lookup Patient");
		btnLookupPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int currentVisit = visitDAO.getCurrentVisit_ID();
					SelectAudioOrPharmPage2 selectionPage = new SelectAudioOrPharmPage2(currentVisit);
					selectionPage.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		panel_1.add(btnLookupPatient);
		
		JButton btnOthers = new JButton("Others");
		btnOthers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					PharmacologyDataScreen changePharmacologyDatePage = new PharmacologyDataScreen();
					changePharmacologyDatePage.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel_1.add(btnOthers);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		btnEditVisit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				SelectAudioOrPharmPage2 selectionPage = new SelectAudioOrPharmPage2();
//				selectionPage.setVisible(true);
				
				try {
					List<Visit> visits = null;
					visits = visitDAO.getAllVisit();
					
//					for (Visit temp : visits) {
//						System.out.println(temp);
//					}
					VisitTableModel model = new VisitTableModel(visits);
					table.setModel(model);
					
				} catch (Exception exc) {
					JOptionPane.showMessageDialog(MainPage.this, "Error: " + exc, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		// add a new visit to list
		btnAddNewVisit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				SelectAudioOrPharmPage2 selectionPage = new SelectAudioOrPharmPage2();
//				selectionPage.setVisible(true);
				try {
//					visitDAO.addNewVisit();
					int currentVisit = visitDAO.getCurrentVisit_ID();
					SelectAudioOrPharmPage2 selectionPage = new SelectAudioOrPharmPage2(currentVisit);
					selectionPage.setVisible(true);
					//get the currentVisit Id test
					//System.out.println(visitDAO.getCurrentVisit_ID());
					
					System.out.println("add new visit success!");
				} catch (Exception exc) {
					JOptionPane.showMessageDialog(MainPage.this, "Error: " + exc, "Error", JOptionPane.ERROR_MESSAGE); 
				}
			}
		});
	}

}
