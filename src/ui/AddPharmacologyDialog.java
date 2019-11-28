package ui;
import dao.MedicamentDAO;

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

public class AddPharmacologyDialog extends JDialog {
	private MedicamentDAO MedicamentDAO;
	private final JPanel contentPanel = new JPanel();
	private JTextField IDtextField;
	private JTextField NametextField;
	private JTextField DescriptiontextField;
	private JTextField DosetextField;
	private JTextField GIDtextField;
	private JTextField GNametextField;
	private JTextField GdescriptiontextField;
	private JTextField DIDtextField;
	private JTextField DNametextField;
//	private JTextField DdescriptiontextField;
	private JTextField CIDtextField;
	private JTextField CNametextField;
	private JTextField CdescriptiontextField;
	private JTextField DdescriptiontextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddPharmacologyDialog dialog = new AddPharmacologyDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddPharmacologyDialog() {
		try {
			MedicamentDAO = new MedicamentDAO();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setBounds(100, 100, 608, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
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
		{
			JLabel lblMedication = new JLabel("Medication");
			contentPanel.add(lblMedication, "2, 2");
		}
		{
			JLabel lblInt = new JLabel("int");
			contentPanel.add(lblInt, "4, 2");
		}
		{
			JLabel lblTring = new JLabel("string");
			contentPanel.add(lblTring, "8, 2");
		}
		{
			JLabel lblString = new JLabel("string");
			contentPanel.add(lblString, "14, 2");
		}
		{
			JLabel lblInt_1 = new JLabel("int");
			contentPanel.add(lblInt_1, "18, 2");
		}
		{
			JLabel lblNewLabel = new JLabel("id:");
			contentPanel.add(lblNewLabel, "2, 4, right, default");
		}
		{
			IDtextField = new JTextField();
			contentPanel.add(IDtextField, "4, 4, fill, default");
			IDtextField.setColumns(10);
		}
		{
			JLabel lblName = new JLabel("name:");
			contentPanel.add(lblName, "8, 4, right, default");
		}
		{
			NametextField = new JTextField();
			contentPanel.add(NametextField, "10, 4, fill, default");
			NametextField.setColumns(10);
		}
		{
			JLabel lblDescription = new JLabel("description");
			contentPanel.add(lblDescription, "14, 4, right, default");
		}
		{
			DescriptiontextField = new JTextField();
			contentPanel.add(DescriptiontextField, "16, 4, fill, default");
			DescriptiontextField.setColumns(10);
		}
		{
			JLabel lblUsua = new JLabel("usual dose:");
			contentPanel.add(lblUsua, "18, 4, right, default");
		}
		{
			DosetextField = new JTextField();
			contentPanel.add(DosetextField, "20, 4, fill, default");
			DosetextField.setColumns(10);
		}
		{
			JLabel lblGeneric = new JLabel("Generic:");
			contentPanel.add(lblGeneric, "2, 6");
		}
		{
			JLabel lblId = new JLabel("id:");
			contentPanel.add(lblId, "2, 8, right, default");
		}
		{
			GIDtextField = new JTextField();
			contentPanel.add(GIDtextField, "4, 8, fill, default");
			GIDtextField.setColumns(10);
		}
		{
			JLabel lblName_1 = new JLabel("name:");
			contentPanel.add(lblName_1, "8, 8, right, default");
		}
		{
			GNametextField = new JTextField();
			contentPanel.add(GNametextField, "10, 8, fill, default");
			GNametextField.setColumns(10);
		}
		{
			JLabel lblDescription_1 = new JLabel("description:");
			contentPanel.add(lblDescription_1, "14, 8, right, default");
		}
		{
			GdescriptiontextField = new JTextField();
			contentPanel.add(GdescriptiontextField, "16, 8, fill, default");
			GdescriptiontextField.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Disease");
			contentPanel.add(lblNewLabel_1, "2, 10");
		}
		{
			JLabel lblId_1 = new JLabel("id");
			contentPanel.add(lblId_1, "2, 12, right, default");
		}
		{
			DIDtextField = new JTextField();
			contentPanel.add(DIDtextField, "4, 12, fill, default");
			DIDtextField.setColumns(10);
		}
		{
			JLabel lblName_2 = new JLabel("name:");
			contentPanel.add(lblName_2, "8, 12, right, default");
		}
		{
			DNametextField = new JTextField();
			contentPanel.add(DNametextField, "10, 12, fill, default");
			DNametextField.setColumns(10);
		}
		{
			JLabel lblDescription_2 = new JLabel("description:");
			contentPanel.add(lblDescription_2, "14, 12, right, default");
		}
		{
			DdescriptiontextField = new JTextField();
			contentPanel.add(DdescriptiontextField, "16, 12, fill, default");
			DdescriptiontextField.setColumns(10);
		}
		
		
		{
			JLabel lblCatchem = new JLabel("CatChem:");
			contentPanel.add(lblCatchem, "2, 14");
		}
		{
			JLabel lblId_2 = new JLabel("id:");
			contentPanel.add(lblId_2, "2, 16, right, default");
		}
		{
			CIDtextField = new JTextField();
			contentPanel.add(CIDtextField, "4, 16, fill, default");
			CIDtextField.setColumns(10);
		}
		{
			JLabel lblName_3 = new JLabel("name:");
			contentPanel.add(lblName_3, "8, 16, right, default");
		}
		{
			CNametextField = new JTextField();
			contentPanel.add(CNametextField, "10, 16, fill, default");
			CNametextField.setColumns(10);
		}
		{
			JLabel lblDescription_3 = new JLabel("description:");
			contentPanel.add(lblDescription_3, "14, 16, right, default");
		}
		{
			CdescriptiontextField = new JTextField();
			contentPanel.add(CdescriptiontextField, "16, 16, fill, default");
			CdescriptiontextField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
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
	
	public AddPharmacologyDialog(int pharma_id) {
		
		System.out.println("into addpharmacologyDialog");
		
		try {
			MedicamentDAO = new MedicamentDAO();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setBounds(100, 100, 608, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
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
		{
			JLabel lblMedication = new JLabel("Medication");
			contentPanel.add(lblMedication, "2, 2");
		}
		{
			JLabel lblInt = new JLabel("int");
			contentPanel.add(lblInt, "4, 2");
		}
		{
			JLabel lblTring = new JLabel("string");
			contentPanel.add(lblTring, "8, 2");
		}
		{
			JLabel lblString = new JLabel("string");
			contentPanel.add(lblString, "14, 2");
		}
		{
			JLabel lblInt_1 = new JLabel("int");
			contentPanel.add(lblInt_1, "18, 2");
		}
		{
			JLabel lblNewLabel = new JLabel("id:");
			contentPanel.add(lblNewLabel, "2, 4, right, default");
		}
		{
			IDtextField = new JTextField();
			contentPanel.add(IDtextField, "4, 4, fill, default");
			IDtextField.setColumns(10);
		}
		{
			JLabel lblName = new JLabel("name:");
			contentPanel.add(lblName, "8, 4, right, default");
		}
		{
			NametextField = new JTextField();
			contentPanel.add(NametextField, "10, 4, fill, default");
			NametextField.setColumns(10);
		}
		{
			JLabel lblDescription = new JLabel("description");
			contentPanel.add(lblDescription, "14, 4, right, default");
		}
		{
			DescriptiontextField = new JTextField();
			contentPanel.add(DescriptiontextField, "16, 4, fill, default");
			DescriptiontextField.setColumns(10);
		}
		{
			JLabel lblUsua = new JLabel("usual dose:");
			contentPanel.add(lblUsua, "18, 4, right, default");
		}
		{
			DosetextField = new JTextField();
			contentPanel.add(DosetextField, "20, 4, fill, default");
			DosetextField.setColumns(10);
		}
		{
			JLabel lblGeneric = new JLabel("Generic:");
			contentPanel.add(lblGeneric, "2, 6");
		}
		{
			JLabel lblId = new JLabel("id:");
			contentPanel.add(lblId, "2, 8, right, default");
		}
		{
			GIDtextField = new JTextField();
			contentPanel.add(GIDtextField, "4, 8, fill, default");
			GIDtextField.setColumns(10);
		}
		{
			JLabel lblName_1 = new JLabel("name:");
			contentPanel.add(lblName_1, "8, 8, right, default");
		}
		{
			GNametextField = new JTextField();
			contentPanel.add(GNametextField, "10, 8, fill, default");
			GNametextField.setColumns(10);
		}
		{
			JLabel lblDescription_1 = new JLabel("description:");
			contentPanel.add(lblDescription_1, "14, 8, right, default");
		}
		{
			GdescriptiontextField = new JTextField();
			contentPanel.add(GdescriptiontextField, "16, 8, fill, default");
			GdescriptiontextField.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Disease");
			contentPanel.add(lblNewLabel_1, "2, 10");
		}
		{
			JLabel lblId_1 = new JLabel("id");
			contentPanel.add(lblId_1, "2, 12, right, default");
		}
		{
			DIDtextField = new JTextField();
			contentPanel.add(DIDtextField, "4, 12, fill, default");
			DIDtextField.setColumns(10);
		}
		{
			JLabel lblName_2 = new JLabel("name:");
			contentPanel.add(lblName_2, "8, 12, right, default");
		}
		{
			DNametextField = new JTextField();
			contentPanel.add(DNametextField, "10, 12, fill, default");
			DNametextField.setColumns(10);
		}
		{
			JLabel lblDescription_2 = new JLabel("description:");
			contentPanel.add(lblDescription_2, "14, 12, right, default");
		}
		{
			DdescriptiontextField = new JTextField();
			contentPanel.add(DdescriptiontextField, "16, 12, fill, default");
			DdescriptiontextField.setColumns(10);
		}
		
		
		{
			JLabel lblCatchem = new JLabel("CatChem:");
			contentPanel.add(lblCatchem, "2, 14");
		}
		{
			JLabel lblId_2 = new JLabel("id:");
			contentPanel.add(lblId_2, "2, 16, right, default");
		}
		{
			CIDtextField = new JTextField();
			contentPanel.add(CIDtextField, "4, 16, fill, default");
			CIDtextField.setColumns(10);
		}
		{
			JLabel lblName_3 = new JLabel("name:");
			contentPanel.add(lblName_3, "8, 16, right, default");
		}
		{
			CNametextField = new JTextField();
			contentPanel.add(CNametextField, "10, 16, fill, default");
			CNametextField.setColumns(10);
		}
		{
			JLabel lblDescription_3 = new JLabel("description:");
			contentPanel.add(lblDescription_3, "14, 16, right, default");
		}
		{
			CdescriptiontextField = new JTextField();
			contentPanel.add(CdescriptiontextField, "16, 16, fill, default");
			CdescriptiontextField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							saveAddNewGemdicament();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
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
	
	protected void saveAddNewGemdicament() throws Exception {


		// get the employee info from gui
//		String Mid = IDtextField.getText();
		String Mname = NametextField.getText();
		String Mdescription = DescriptiontextField.getText();
		String Mdose = DosetextField.getText();
		
//		String Gid = GIDtextField.getText();
		String Gname = GNametextField.getText();
		String Gdescription = GdescriptiontextField.getText();
		
//		String DMid = DIDtextField.getText();
		String Dname = DNametextField.getText();
		String Ddescription = DdescriptiontextField.getText();

		String Cname = CIDtextField.getText();
		String Cdescription = CdescriptiontextField.getText();

		
//		int MidC = Integer.parseInt(Mid);
		int MdosC = Integer.parseInt(Mdose);
//		int GidC = Integer.parseInt(Gid);
//		int DMidC = Integer.parseInt(DMid);
		
		MedicamentDAO.addMoreMedicament(Mname, Mdescription, MdosC, Gname, Gdescription, Dname, Ddescription,Cname,Cdescription);
		
		setVisible(false);
		dispose();
	}

}
