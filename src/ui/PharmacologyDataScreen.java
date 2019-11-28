package ui;
import core.Pharmacology;
import dao.PharmacologyDAO;
import dao.VisitDAO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class PharmacologyDataScreen extends JFrame {

	private PharmacologyDAO PharmacologyDAO;
	
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PharmacologyDataScreen frame = new PharmacologyDataScreen();
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
//	public PharmacologyDataScreen() {
//		
//		try {
//			PharmacologyDAO= new PharmacologyDAO();
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		setTitle("Pharmacology Data Screen");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 653, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
//		
//		JPanel panel = new JPanel();
//		contentPane.add(panel, BorderLayout.NORTH);
//		
//		JLabel lblSkipSomeUnused = new JLabel("Skip some unused screen such as : Other screen, Dictionary data screen");
//		panel.add(lblSkipSomeUnused);
//		
//		JLabel lblJumpToData = new JLabel("----Jump to Data Screen.");
//		panel.add(lblJumpToData);
//		
//		JScrollPane scrollPane = new JScrollPane();
//		contentPane.add(scrollPane, BorderLayout.CENTER);
//		
//		table = new JTable();
//		scrollPane.setViewportView(table);
//		
//		JPanel panel_1 = new JPanel();
//		contentPane.add(panel_1, BorderLayout.SOUTH);
//		
//		JButton btnAdd = new JButton("Add");
//		btnAdd.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		
//		JButton btnDisplay = new JButton("Display");
//		btnDisplay.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				List<Pharmacology> pharmacology = null;
//				try {
//					pharmacology = PharmacologyDAO.getAllPharmacology();
//					PharmacologyDataTableModel model = new PharmacologyDataTableModel(pharmacology);
//					
//					table.setModel(model);
//				} catch (Exception e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//			}
//		});
//		panel_1.add(btnDisplay);
//		panel_1.add(btnAdd);
//		
//		JButton btnEdit = new JButton("Edit");
//		btnEdit.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		panel_1.add(btnEdit);
//	}
	
	public PharmacologyDataScreen() {
//	public PharmacologyDataScreen(int visit_id) {
		
		try {
			PharmacologyDAO= new PharmacologyDAO();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setTitle("Pharmacology Data Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblSkipSomeUnused = new JLabel("Skip some unused screen such as : Other screen, Dictionary data screen");
		panel.add(lblSkipSomeUnused);
		
		JLabel lblJumpToData = new JLabel("----Jump to Data Screen.");
		panel.add(lblJumpToData);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
 			int row = table.getSelectedRow();
 			
				
			// make sure a row is selected
			if (row < 0) {
				JOptionPane.showMessageDialog(PharmacologyDataScreen.this, "You must select an employee", "Error",
						JOptionPane.ERROR_MESSAGE);				
				return;
			}
			Pharmacology tempPharmacology = (Pharmacology)table.getValueAt(row, PharmacologyDataTableModel.OBJECT_COL);
			int tempPharm_id = tempPharmacology.getPharmacology_ID();
			System.out.println(tempPharm_id);
			AddPharmacologyDialog dialog = new AddPharmacologyDialog(tempPharm_id);
//			AddPharmacologyDialog dialog = new AddPharmacologyDialog();
			
//
//			// show dialog
			dialog.setVisible(true);
			}
		});
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Pharmacology> pharmacology = null;
				try {
					pharmacology = PharmacologyDAO.getAllPharmacology();
					PharmacologyDataTableModel model = new PharmacologyDataTableModel(pharmacology);
					table.setModel(model);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel_1.add(btnDisplay);
		panel_1.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnEdit);
	}

}
