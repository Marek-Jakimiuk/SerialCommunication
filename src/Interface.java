import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	private JFrame frmLogicboard;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmLogicboard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Interface() {initialize();}

	
		private void initialize() {
		frmLogicboard = new JFrame();
		frmLogicboard.setResizable(false);
		frmLogicboard.setTitle("LogicBoard 1.0.0");
		frmLogicboard.setBounds(100, 100, 190, 300);
		frmLogicboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogicboard.getContentPane().setLayout(null);
								
		JButton btnNewButton = new JButton("Rozłącz");
		JButton btnConnect = new JButton("Połącz");
		JButton btnSend = new JButton("Wyslij");
		JTextPane txtpnWpisz = new JTextPane();
		JComboBox comboBox = new JComboBox();
		JComboBox comboBox_1 = new JComboBox();
		JLabel metkaCOM = new JLabel("Port COM");
		JLabel metkaBaud = new JLabel("Baud Rate");
		JLabel lblNewLabel = new JLabel("Rozlaczony");
		lblNewLabel.setLabelFor(btnConnect);
		JLabel lblStatus = new JLabel("Status:");
		
		btnConnect.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) {}});
		//btnSend.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) {}});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "COM10", "COM11", "COM12"}));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1200", "2400", "4800", "9600", "19200", "57200", "118200"}));
		comboBox.setSelectedIndex(3);
		
		lblNewLabel.setBounds(76, 88, 90, 15);
		lblStatus.setBounds(16, 88, 60, 15);
		btnNewButton.setBounds(98, 241, 80, 25);
		btnSend.setBounds(88, 61, 90, 25);
		btnConnect.setBounds(6, 241, 80, 25);
		comboBox.setBounds(88, 38, 90, 20);
		comboBox_1.setBounds(88, 9, 90, 24);
		metkaCOM.setBounds(6, 14, 70, 15);
		metkaBaud.setBounds(6, 41, 90, 15);
		txtpnWpisz.setBounds(5, 109, 173, 128);
		
		textField = new JTextField();
		frmLogicboard.getContentPane().add(btnNewButton);
		frmLogicboard.getContentPane().add(btnConnect);
		frmLogicboard.getContentPane().add(metkaCOM);
		frmLogicboard.getContentPane().add(metkaBaud);
		frmLogicboard.getContentPane().add(txtpnWpisz);	
		frmLogicboard.getContentPane().add(btnSend);
		frmLogicboard.getContentPane().add(comboBox_1);
		frmLogicboard.getContentPane().add(comboBox);
		frmLogicboard.getContentPane().add(lblStatus);
		frmLogicboard.getContentPane().add(lblNewLabel);
		frmLogicboard.getContentPane().add(textField);
		
		textField.setBounds(6, 60, 80, 27);
		textField.setColumns(10);
		
		

		
	}
}
