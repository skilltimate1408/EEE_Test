package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp {

	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1052, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SignUp");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(399, 35, 222, 74);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblName.setBackground(Color.WHITE);
		lblName.setBounds(26, 149, 222, 74);
		frame.getContentPane().add(lblName);
		
		JLabel lblGeneder = new JLabel("Geneder");
		lblGeneder.setForeground(Color.WHITE);
		lblGeneder.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblGeneder.setBackground(Color.WHITE);
		lblGeneder.setBounds(26, 254, 222, 74);
		frame.getContentPane().add(lblGeneder);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setForeground(Color.WHITE);
		lblBranch.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblBranch.setBackground(Color.WHITE);
		lblBranch.setBounds(26, 361, 222, 74);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblProgramming = new JLabel("Programming");
		lblProgramming.setForeground(Color.WHITE);
		lblProgramming.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblProgramming.setBackground(Color.WHITE);
		lblProgramming.setBounds(26, 468, 294, 74);
		frame.getContentPane().add(lblProgramming);
		
		tb = new JTextField();
		tb.setFont(new Font("Tahoma", Font.BOLD, 30));
		tb.setBounds(352, 149, 316, 59);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Female");
		r1.setFont(new Font("Tahoma", Font.BOLD, 25));
		r1.setBounds(352, 267, 129, 39);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Male");
		r2.setFont(new Font("Tahoma", Font.BOLD, 25));
		r2.setBounds(575, 267, 129, 39);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 30));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "EEE", "ECE", "CSE", "IT", "IoT", "AIML", "DS", "CS", "Civil", "Mech"}));
		c1.setBounds(376, 372, 307, 49);
		frame.getContentPane().add(c1);
		
		JCheckBox cb1 = new JCheckBox("JAVA");
		cb1.setFont(new Font("Tahoma", Font.BOLD, 25));
		cb1.setBounds(399, 486, 129, 51);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("Python");
		cb2.setFont(new Font("Tahoma", Font.BOLD, 25));
		cb2.setBounds(606, 486, 129, 51);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("'C'");
		cb3.setFont(new Font("Tahoma", Font.BOLD, 25));
		cb3.setBounds(802, 486, 129, 51);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb.getText();
				String g;
				if(r1.isSelected())
				{
					g="Female";
				}
				else if(r2.isSelected())
				{
					g="Male";
				}
				else
				{
					g="Invalid";
				}
				String b=(String) c1.getSelectedItem();
				String p;
				if(cb1.isSelected())
				{
					p="Java";
				}
				else if(cb2.isSelected())
				{
					p="python";
				}
				else
				{
					p="C";
				}
		JOptionPane.showMessageDialog(btnNewButton,
				"Hello "+n+" \n gender :"+g+" \n Branch"+b+
				"\n Programming"+p);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(376, 607, 164, 59);
		frame.getContentPane().add(btnNewButton);
		
		JLabel tb888 = new JLabel("");
		tb888.setBackground(new Color(220, 20, 60));
		tb888.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\bg.PNG"));
		tb888.setBounds(10, -25, 1135, 752);
		frame.getContentPane().add(tb888);
	}
}
