package Pekan7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Aritmatika {

	private JFrame frmAritmatika;
	private JTextField A;
	private JTextField B;
	private JTextField C;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aritmatika window = new Aritmatika();
					window.frmAritmatika.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aritmatika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAritmatika = new JFrame();
		frmAritmatika.setTitle("Aritmatika");
		frmAritmatika.setBounds(100, 100, 462, 321);
		frmAritmatika.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAritmatika.getContentPane().setLayout(null);
		
		A = new JTextField();
		A.setHorizontalAlignment(SwingConstants.CENTER);
		A.setBounds(25, 43, 70, 33);
		frmAritmatika.getContentPane().add(A);
		A.setColumns(10);
		JComboBox OPcb = new JComboBox();
		OPcb.setModel(new DefaultComboBoxModel(new String[] {"Pilih"}));
		OPcb.setToolTipText("");
		OPcb.setBounds(105, 43, 58, 33);
		frmAritmatika.getContentPane().add(OPcb);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(272, 46, 45, 13);
		frmAritmatika.getContentPane().add(lblNewLabel);
		
		B = new JTextField();
		B.setHorizontalAlignment(SwingConstants.CENTER);
		B.setBounds(172, 43, 70, 33);
		frmAritmatika.getContentPane().add(B);
		B.setColumns(10);
		
		C = new JTextField();
		C.setBounds(310, 43, 70, 33);
		frmAritmatika.getContentPane().add(C);
		C.setColumns(10);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int A1=Integer.parseInt(A.getText());
				int A2=Integer.parseInt(B.getText());
				int hasil;
				int op=OPcb.getSelectedIndex();
				if (op==1) (
					hasil = A1+A2;
					C.setText(String.valueOf(hasil));
						)
			}
		});
		btnNewButton.setBounds(91, 157, 85, 21);
		frmAritmatika.getContentPane().add(btnNewButton);
	}
}
