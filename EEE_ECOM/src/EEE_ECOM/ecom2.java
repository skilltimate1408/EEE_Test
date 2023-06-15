package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecom2 {

	private JFrame frame;
	int i=0;
	int b=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom2 window = new ecom2();
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
	public ecom2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1161, 749);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(302, 38, 132, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\b1.PNG"));
		lblNewLabel_1.setBounds(10, 141, 194, 258);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\book1.PNG"));
		lblNewLabel_2.setBounds(302, 143, 194, 258);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\b7.PNG"));
		lblNewLabel_3.setBounds(664, 155, 179, 246);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rs  110");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_4.setBounds(20, 409, 153, 66);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Rs  140");
		lblNewLabel_4_1.setForeground(Color.RED);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_4_1.setBounds(331, 409, 153, 66);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Rs  90");
		lblNewLabel_4_2.setForeground(Color.RED);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_4_2.setBounds(690, 411, 153, 66);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Paper", "Kindel", "PDF"}));
		comboBox.setBounds(43, 472, 109, 21);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Paper", "Kindel", "PDF"}));
		comboBox_1.setBounds(354, 472, 109, 21);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Paper", "Kindel", "PDF"}));
		comboBox_2.setBounds(714, 486, 103, 21);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lb = new JLabel("CART : 0");
		lb.setFont(new Font("Tahoma", Font.BOLD, 30));
		lb.setBounds(951, 45, 153, 44);
		frame.getContentPane().add(lb);
		
		JLabel lb2 = new JLabel("Bill : 0");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 40));
		lb2.setBounds(915, 147, 189, 44);
		frame.getContentPane().add(lb2);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				b=b+110;
				lb2.setText("Bill :"+b);
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(20, 527, 132, 44);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(354, 527, 132, 44);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setBounds(695, 527, 132, 44);
		frame.getContentPane().add(btnNewButton_2);
		
		
	}
}
