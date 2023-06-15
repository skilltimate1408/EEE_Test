package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mtero {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mtero window = new Mtero();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mtero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(186, 85, 211));
		frame.setBounds(100, 100, 934, 739);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(301, 43, 319, 72);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblName.setBounds(26, 168, 319, 72);
		frame.getContentPane().add(lblName);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFrom.setBounds(26, 261, 319, 72);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTo.setBounds(26, 360, 319, 72);
		frame.getContentPane().add(lblTo);
		
		JLabel lblTickets = new JLabel("Tickets");
		lblTickets.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTickets.setBounds(26, 460, 319, 72);
		frame.getContentPane().add(lblTickets);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Tahoma", Font.BOLD, 35));
		tb1.setBounds(301, 175, 248, 54);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 30));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "KPHB", "JNTUH", "MYP"}));
		c1.setBounds(303, 264, 246, 41);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Tahoma", Font.BOLD, 30));
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "KPHB", "JNTUH", "MYP"}));
		c2.setBounds(301, 360, 248, 43);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setFont(new Font("Tahoma", Font.BOLD, 30));
		c3.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5"}));
		c3.setBounds(316, 460, 141, 55);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pn=tb1.getText();
				String fr=(String) c1.getSelectedItem();
				String to=(String) c2.getSelectedItem();
				String tickets=(String) c3.getSelectedItem();
				int t=Integer.parseInt(tickets);
				int bill=t*40;
				JOptionPane.showMessageDialog(btnNewButton, 
				"Hello "+pn+"\n From :"+fr+"\n To:"+to+
				"\n Tickets :"+t+"/n Bill :"+bill);
			}
		});
		btnNewButton.setBackground(new Color(218, 165, 32));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(197, 570, 141, 41);
		frame.getContentPane().add(btnNewButton);
	}
}
