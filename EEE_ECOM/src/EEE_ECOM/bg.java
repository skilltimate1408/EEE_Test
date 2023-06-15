package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bg {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bg window = new bg();
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
	public bg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 837, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(556, 31, 143, 54);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Tahoma", Font.BOLD, 30));
		tb1.setBounds(504, 95, 253, 54);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Movie");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBackground(Color.RED);
		lblNewLabel_1_1.setBounds(556, 159, 143, 54);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 30));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "RRR", "PUSHPA", "KGF"}));
		c1.setBounds(524, 223, 207, 51);
		frame.getContentPane().add(c1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tickets");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBackground(Color.RED);
		lblNewLabel_1_1_1.setBounds(556, 293, 143, 54);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5"}));
		c2.setFont(new Font("Tahoma", Font.BOLD, 30));
		c2.setBounds(524, 357, 207, 51);
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String n=tb1.getText();
				String m=(String) c1.getSelectedItem();
				String t=(String) c2.getSelectedItem();
				int tk=Integer.parseInt(t);
				int bill=tk*120;
				JOptionPane.showMessageDialog(lblNewLabel_2,
						"Hello "+n+" \n Selected Movie: "+m+"\n Tickets: "+t+
						"\n Bill :"+bill);
				
				
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Hemalatha\\Desktop\\images.png"));
		lblNewLabel_2.setBounds(456, 437, 357, 164);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
