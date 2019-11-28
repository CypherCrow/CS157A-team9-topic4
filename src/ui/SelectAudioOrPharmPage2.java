package ui;
import dao.PharmacologyDAO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectAudioOrPharmPage2 extends JFrame {
	private PharmacologyDAO PharmacologyDAO;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectAudioOrPharmPage2 frame = new SelectAudioOrPharmPage2();
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
	public SelectAudioOrPharmPage2() {
		try {
			PharmacologyDAO = new PharmacologyDAO();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		setTitle("Select Audio/Pharm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton btnAddAudiology = new JButton("Add Audiology");
		panel.add(btnAddAudiology);
		
		JButton btnAddPharmacology = new JButton("Add Pharmacology");
		btnAddPharmacology.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnAddPharmacology);
	}
	
	public SelectAudioOrPharmPage2(int visit_id) {
		
		try {
			PharmacologyDAO = new PharmacologyDAO();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(visit_id + "from selection page");
		
		setTitle("Select Audio/Pharm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton btnAddAudiology = new JButton("Add Audiology");
		btnAddAudiology.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				audiologyScreen audiologyPage;
				try {
					audiologyScreen audiologyPage = new audiologyScreen(visit_id);
					audiologyPage.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
		});
		panel.add(btnAddAudiology);
		
		JButton btnAddPharmacology = new JButton("Add Pharmacology");
		btnAddPharmacology.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					PharmacologyDAO.addNewPharmacology(visit_id);
					PharmacologyScreen pharmacologyPage = new PharmacologyScreen(visit_id);
					pharmacologyPage.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(btnAddPharmacology);
	}

}
