package connection.java.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainForm extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnEdit;
	private JMenuItem mntmNew;
	private JMenuItem mntmOpen;
	private JMenuItem mntmOpenAs;
	private JMenuItem mntmSave;
	private JMenuItem mntmSaveAs;
	private JMenuItem mntmCopy;
	private JMenuItem mntmPaste;
	private JMenuItem mntmCut;
	private JMenuItem mntmSelectAll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
	public MainForm() {
		setTitle("Main");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnEdit());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmNew());
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmOpenAs());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmSaveAs());
		}
		return mnFile;
	}
	private JMenu getMnEdit() {
		if (mnEdit == null) {
			mnEdit = new JMenu("Edit");
			mnEdit.add(getMntmCopy());
			mnEdit.add(getMntmPaste());
			mnEdit.add(getMntmCut());
			mnEdit.add(getMntmSelectAll());
		}
		return mnEdit;
	}
	private JMenuItem getMntmNew() {
		if (mntmNew == null) {
			mntmNew = new JMenuItem("New");
		}
		return mntmNew;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
		}
		return mntmOpen;
	}
	private JMenuItem getMntmOpenAs() {
		if (mntmOpenAs == null) {
			mntmOpenAs = new JMenuItem("Open as");
		}
		return mntmOpenAs;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
		}
		return mntmSave;
	}
	private JMenuItem getMntmSaveAs() {
		if (mntmSaveAs == null) {
			mntmSaveAs = new JMenuItem("Save as");
		}
		return mntmSaveAs;
	}
	private JMenuItem getMntmCopy() {
		if (mntmCopy == null) {
			mntmCopy = new JMenuItem("Copy");
		}
		return mntmCopy;
	}
	private JMenuItem getMntmPaste() {
		if (mntmPaste == null) {
			mntmPaste = new JMenuItem("Paste");
		}
		return mntmPaste;
	}
	private JMenuItem getMntmCut() {
		if (mntmCut == null) {
			mntmCut = new JMenuItem("Cut");
		}
		return mntmCut;
	}
	private JMenuItem getMntmSelectAll() {
		if (mntmSelectAll == null) {
			mntmSelectAll = new JMenuItem("Select all");
		}
		return mntmSelectAll;
	}
}
