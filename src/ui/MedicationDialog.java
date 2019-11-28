package ui;
import core.Medicament;
import dao.MedicamentDAO;
import dao.PharmacologyDAO;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MedicationDialog extends JDialog {
	
	private MedicamentDAO MedicamentDAO;
	private Medicament Medicament;
	private PharmacologyDAO PharmacologyDAO;
	private int pharma_id;

	private final JPanel contentPanel = new JPanel();
	private JTextField nametextField;
	private JTextField descriptiontextField;
	private JTextField usual_DocstextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MedicationDialog dialog = new MedicationDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MedicationDialog() {
		try {
			MedicamentDAO = new MedicamentDAO();
			PharmacologyDAO = new PharmacologyDAO();

			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
			
		setTitle("Add Medication");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		{
			JLabel lblName = new JLabel("Name:");
			contentPanel.add(lblName, "2, 2, right, default");
		}
		{
			nametextField = new JTextField();
			contentPanel.add(nametextField, "4, 2, fill, default");
			nametextField.setColumns(10);
		}
		{
			JLabel lblDescription = new JLabel("Description:");
			contentPanel.add(lblDescription, "2, 4, right, default");
		}
		{
			descriptiontextField = new JTextField();
			contentPanel.add(descriptiontextField, "4, 4, fill, default");
			descriptiontextField.setColumns(10);
		}
		{
			JLabel lblUsualdocs = new JLabel("Usual_Docs:");
			contentPanel.add(lblUsualdocs, "2, 6, right, default");
		}
		{
			usual_DocstextField = new JTextField();
			contentPanel.add(usual_DocstextField, "4, 6, fill, default");
			usual_DocstextField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Save");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// 1. add medication 
						// 2. update the medication number in pharmacololgy
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	
	public MedicationDialog(int pharma_id) {
		
		
		try {
			MedicamentDAO = new MedicamentDAO();
			PharmacologyDAO = new PharmacologyDAO();

			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		
		this.pharma_id = pharma_id;
		
		System.out.println("pharma_id passed from pharmacologyScreen:" + pharma_id);
		
		setTitle("Add Medication");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		{
			JLabel lblName = new JLabel("Name:");
			contentPanel.add(lblName, "2, 2, right, default");
		}
		{
			nametextField = new JTextField();
			contentPanel.add(nametextField, "4, 2, fill, default");
			nametextField.setColumns(10);
		}
		{
			JLabel lblDescription = new JLabel("Description:");
			contentPanel.add(lblDescription, "2, 4, right, default");
		}
		{
			descriptiontextField = new JTextField();
			contentPanel.add(descriptiontextField, "4, 4, fill, default");
			descriptiontextField.setColumns(10);
		}
		{
			JLabel lblUsualdocs = new JLabel("Usual_Docs:");
			contentPanel.add(lblUsualdocs, "2, 6, right, default");
		}
		{
			usual_DocstextField = new JTextField();
			contentPanel.add(usual_DocstextField, "4, 6, fill, default");
			usual_DocstextField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Save");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// 1. add medication 
						saveMedicatioin();
						
						//call update method and pass value
						
									
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	protected void saveMedicatioin() {

		// get the employee info from gui
		String name = nametextField.getText();
		String description = descriptiontextField.getText();
		String  Usual_dose = usual_DocstextField.getText();
		int Usual_doseC =  Integer.parseInt(Usual_dose);
		
		System.out.println(name);
		System.out.println(description);
		System.out.println(Usual_doseC);
		
		
		try {
			//this code cause error
			MedicamentDAO.addNewMedicament(name, description,Usual_doseC);
			int currentMedicament_id = MedicamentDAO.getCurrentMedicament_id();
			System.out.println("Updating new medicamentID TO pharam");
//			PharmacologyDAO pharmacologyDAO = new PharmacologyDAO();
			
			PharmacologyDAO.updatePharmacologyMedicament_id(pharma_id,currentMedicament_id);
			
//			System.out.println("here has errors");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		setVisible(false);
		dispose();
		
	}

}
