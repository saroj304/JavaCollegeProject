package connection.java.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;


import com.toedter.calendar.JDateChooser;

import connection.java.model.Form;
import connection.java.service.Service;
import connection.java.service.ServiceImpl;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class CForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblFirstName;
	private JTextField fname;
	private JLabel lblMiddleName;
	private JTextField mname;
	private JLabel lblLastName;
	private JTextField lname;
	private JLabel lblTemproraryAddress;
	private JTextField taddress;
	private JLabel lblPermanentAddress;
	private JTextField paddress;
	private JLabel lblGender;
	private JRadioButton male;
	private JRadioButton female;
	private JRadioButton other;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblStatus;
	private JComboBox status;
	private JLabel lblEmail;
	private JTextField email;
	private JLabel lblPhone;
	private JTextField phone;
	private JButton btnSubmit;
	private JLabel lblFatherName;
	private JTextField username;
	private JLabel lblMotherName;
	private JPasswordField password;
	private JButton btnSignUp;
	private JDateChooser dob;
	private JLabel lblDateOfBirth;
	private JButton button;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblFormApplication;
	private JLabel label;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CForm frame = new CForm();
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
	public CForm() {
		setTitle("Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 807);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblFirstName());
		contentPane.add(getFname());
		contentPane.add(getLblMiddleName());
		contentPane.add(getMname());
		contentPane.add(getLblLastName());
		contentPane.add(getLname());
		contentPane.add(getLblTemproraryAddress());
		contentPane.add(getTaddress());
		contentPane.add(getLblPermanentAddress());
		contentPane.add(getPaddress());
		contentPane.add(getLblGender());
		contentPane.add(getMale());
		contentPane.add(getFemale());
		contentPane.add(getOther());
		contentPane.add(getLblStatus());
		contentPane.add(getStatus());
		contentPane.add(getLblEmail());
		contentPane.add(getEmail());
		contentPane.add(getLblPhone());
		contentPane.add(getPhone());
		contentPane.add(getBtnSubmit());
		contentPane.add(getLblFatherName());
		contentPane.add(getUsername());
		contentPane.add(getLblMotherName());
		contentPane.add(getPassword());
		contentPane.add(getBtnSignUp());
		contentPane.add(getDob());
		contentPane.add(getLblDateOfBirth());
		contentPane.add(getButton());
		contentPane.add(getScrollPane());
		contentPane.add(getLblFormApplication());
		contentPane.add(getLabel_1());
		displayData();
	}
	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First  Name");
			lblFirstName.setForeground(Color.LIGHT_GRAY);
			lblFirstName.setFont(new Font("Dialog", Font.BOLD, 15));
			lblFirstName.setBounds(40, 57, 118, 21);
		}
		return lblFirstName;
	}
	private JTextField getFname() {
		if (fname == null) {
			fname = new JTextField();
			fname.setBounds(23, 90, 237, 29);
			fname.setColumns(10);
		}
		return fname;
	}
	private JLabel getLblMiddleName() {
		if (lblMiddleName == null) {
			lblMiddleName = new JLabel("Middle Name");
			lblMiddleName.setForeground(Color.LIGHT_GRAY);
			lblMiddleName.setFont(new Font("Dialog", Font.BOLD, 15));
			lblMiddleName.setBounds(336, 57, 112, 21);
		}
		return lblMiddleName;
	}
	private JTextField getMname() {
		if (mname == null) {
			mname = new JTextField();
			mname.setBounds(272, 90, 230, 29);
			mname.setColumns(10);
		}
		return mname;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setForeground(Color.LIGHT_GRAY);
			lblLastName.setFont(new Font("Dialog", Font.BOLD, 15));
			lblLastName.setBounds(568, 58, 118, 18);
		}
		return lblLastName;
	}
	private JTextField getLname() {
		if (lname == null) {
			lname = new JTextField();
			lname.setBounds(518, 90, 208, 29);
			lname.setColumns(10);
		}
		return lname;
	}
	private JLabel getLblTemproraryAddress() {
		if (lblTemproraryAddress == null) {
			lblTemproraryAddress = new JLabel("Temporary Address");
			lblTemproraryAddress.setForeground(Color.LIGHT_GRAY);
			lblTemproraryAddress.setFont(new Font("Dialog", Font.BOLD, 15));
			lblTemproraryAddress.setBounds(12, 140, 175, 21);
		}
		return lblTemproraryAddress;
	}
	private JTextField getTaddress() {
		if (taddress == null) {
			taddress = new JTextField();
			taddress.setBounds(191, 138, 175, 29);
			taddress.setColumns(10);
		}
		return taddress;
	}
	private JLabel getLblPermanentAddress() {
		if (lblPermanentAddress == null) {
			lblPermanentAddress = new JLabel("Permanent Address");
			lblPermanentAddress.setForeground(Color.LIGHT_GRAY);
			lblPermanentAddress.setFont(new Font("Dialog", Font.BOLD, 15));
			lblPermanentAddress.setBounds(384, 143, 162, 18);
		}
		return lblPermanentAddress;
	}
	private JTextField getPaddress() {
		if (paddress == null) {
			paddress = new JTextField();
			paddress.setBounds(568, 132, 158, 29);
			paddress.setColumns(10);
		}
		return paddress;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setForeground(Color.WHITE);
			lblGender.setFont(new Font("Dialog", Font.BOLD, 15));
			lblGender.setBounds(33, 187, 70, 21);
		}
		return lblGender;
	}
	private JRadioButton getMale() {
		if (male == null) {
			male = new JRadioButton("Male");
			buttonGroup.add(male);
			male.setBounds(117, 186, 70, 23);
		}
		return male;
	}
	private JRadioButton getFemale() {
		if (female == null) {
			female = new JRadioButton("Female");
			buttonGroup.add(female);
			female.setBounds(201, 186, 83, 23);
		}
		return female;
	}
	private JRadioButton getOther() {
		if (other == null) {
			other = new JRadioButton("Other");
			buttonGroup.add(other);
			other.setBounds(296, 186, 70, 23);
		}
		return other;
	}
	private JLabel getLblStatus() {
		if (lblStatus == null) {
			lblStatus = new JLabel("Status");
			lblStatus.setBackground(Color.WHITE);
			lblStatus.setForeground(Color.WHITE);
			lblStatus.setFont(new Font("Dialog", Font.BOLD, 15));
			lblStatus.setBounds(398, 221, 83, 21);
		}
		return lblStatus;
	}
	private JComboBox getStatus() {
		if (status == null) {
			status = new JComboBox();
			status.setModel(new DefaultComboBoxModel(new String[] {"-------Relation-------", "married", "unmarried"}));
			status.setToolTipText("");
			status.setBounds(485, 219, 141, 24);
		}
		return status;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setForeground(Color.WHITE);
			lblEmail.setFont(new Font("Dialog", Font.BOLD, 15));
			lblEmail.setBounds(40, 344, 63, 24);
		}
		return lblEmail;
	}
	private JTextField getEmail() {
		if (email == null) {
			email = new JTextField();
			email.setBounds(128, 342, 498, 29);
			email.setColumns(10);
		}
		return email;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setForeground(Color.WHITE);
			lblPhone.setFont(new Font("Dialog", Font.BOLD, 15));
			lblPhone.setBounds(40, 306, 70, 19);
		}
		return lblPhone;
	}
	private JTextField getPhone() {
		if (phone == null) {
			phone = new JTextField();
			phone.setBounds(123, 301, 243, 29);
			phone.setColumns(10);
		}
		return phone;
	}
	private JButton getBtnSubmit() {
		if (btnSubmit == null) {
			btnSubmit = new JButton("Submit");
			btnSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Form fr=new Form();
					fr.setFname(fname.getText());
					fr.setMname(mname.getText());
					fr.setLname(lname.getText());
					fr.setT_address(taddress.getText());
					fr.setP_address(paddress.getText());
					fr.setUsername(username.getText());
					fr.setPassword(password.getText());
					fr.setPhone(phone.getText());
					fr.setEmail(email.getText());
					fr.setStatus(status.getSelectedItem().toString());
					fr.setDob(new Date(dob.getDate().getTime()));
					if(male.isSelected()) {
						fr.setGender("Male");
					}else if(female.isSelected()) {
						fr.setGender("Female");
					}
					else {
						fr.setGender("Other");
					}
					Service s=new ServiceImpl();
						if(s.Insert(fr)) {
							JOptionPane.showMessageDialog(null, "Added success");
							displayData();
						}
				}
			});
			btnSubmit.setBackground(new Color(30, 144, 255));
			btnSubmit.setForeground(Color.WHITE);
			btnSubmit.setFont(new Font("Dialog", Font.BOLD, 15));
			btnSubmit.setBounds(110, 396, 112, 25);
		}
		return btnSubmit;
	}
	private JLabel getLblFatherName() {
		if (lblFatherName == null) {
			lblFatherName = new JLabel("username");
			lblFatherName.setForeground(Color.WHITE);
			lblFatherName.setFont(new Font("Dialog", Font.BOLD, 15));
			lblFatherName.setBounds(24, 220, 96, 21);
		}
		return lblFatherName;
	}
	private JTextField getUsername() {
		if (username == null) {
			username = new JTextField();
			username.setBounds(123, 217, 243, 29);
			username.setColumns(10);
		}
		return username;
	}
	private JLabel getLblMotherName() {
		if (lblMotherName == null) {
			lblMotherName = new JLabel("Password");
			lblMotherName.setForeground(Color.WHITE);
			lblMotherName.setFont(new Font("Dialog", Font.BOLD, 14));
			lblMotherName.setBounds(23, 263, 86, 21);
		}
		return lblMotherName;
	}
	private JPasswordField getPassword() {
		if (password == null) {
			password = new JPasswordField();
			password.setBounds(123, 258, 243, 31);
		}
		return password;
	}
	private JButton getBtnSignUp() {
		if (btnSignUp == null) {
			btnSignUp = new JButton("sign in");
			btnSignUp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new LForm().setVisible(true);
					dispose();
				}
			});
			btnSignUp.setBackground(new Color(30, 144, 255));
			btnSignUp.setForeground(Color.WHITE);
			btnSignUp.setFont(new Font("Dialog", Font.BOLD, 15));
			btnSignUp.setBounds(283, 396, 117, 25);
		}
		return btnSignUp;
	}
	private JDateChooser getDob() {
		if (dob == null) {
			dob = new JDateChooser();
			dob.setBounds(518, 264, 129, 20);
		}
		return dob;
	}
	private JLabel getLblDateOfBirth() {
		if (lblDateOfBirth == null) {
			lblDateOfBirth = new JLabel("Date Of Birth");
			lblDateOfBirth.setForeground(Color.WHITE);
			lblDateOfBirth.setFont(new Font("Dialog", Font.BOLD, 15));
			lblDateOfBirth.setBounds(384, 263, 130, 20);
		}
		return lblDateOfBirth;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("update");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any row");
						return;
					}
					int row=table.getSelectedRow();
					int id=(int)table.getModel().getValueAt(row,0);
					
					EditForm ef=new EditForm();
					ef.setData(id);
					ef.setVisible(true);
					dispose();
				}
			});
			button.setFont(new Font("Dialog", Font.PLAIN, 15));
			button.setBackground(new Color(30, 144, 255));
			button.setForeground(Color.WHITE);
			button.setBounds(464, 396, 117, 25);
		}
		return button;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 433, 677, 253);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"Id","FirstName","LastName","DOB","Username","Password","phone","Email"
					}
		));	
		}
		return table;
	}
	private JLabel getLblFormApplication() {
		if (lblFormApplication == null) {
			lblFormApplication = new JLabel("Form Application");
			lblFormApplication.setForeground(Color.RED);
			lblFormApplication.setFont(new Font("Dialog", Font.BOLD, 20));
			lblFormApplication.setBounds(255, 12, 247, 33);
		}
		return lblFormApplication;
	}
	private JLabel getLabel_1() {
		if (label == null) {
			label = new JLabel("");
			label.setIcon(new ImageIcon("/home/seetal/Downloads/pexels-photo-414612.jpeg"));
			label.setBounds(0, 0, 738, 686);
		}
		return label;
	}
	private void displayData() {
		Service es = new ServiceImpl();
		List <Form> elist = es.getAll();
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.setRowCount(0);
		
		for(Form emp : elist) {
			model.addRow(new Object[]{emp.getId(),emp.getFname(),emp.getLname(),emp.getDob(),emp.getUsername(),emp.getPassword(),emp.getPhone(),emp.getEmail()});
			}
	}
}
