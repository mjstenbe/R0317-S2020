package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class WBDemo extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblOsoite;
	private JLabel lblNewLabel_2;
	private JTextPane nimi;
	private JTextPane osoite;
	private JTextPane puhelin;
	private JButton btnNewButton;
	private JButton btnTyhjenn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBDemo frame = new WBDemo();
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
	public WBDemo() {
		setTitle("Henkil\u00F6tiedot");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Nimi:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(33, 31, 103, 46);
		contentPane.add(lblNewLabel);
		
		lblOsoite = new JLabel("Osoite:");
		lblOsoite.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblOsoite.setBounds(33, 89, 103, 46);
		contentPane.add(lblOsoite);
		
		lblNewLabel_2 = new JLabel("Puhelin:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(33, 164, 103, 46);
		contentPane.add(lblNewLabel_2);
		
		nimi = new JTextPane();
		nimi.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nimi.setBounds(146, 40, 209, 37);
		contentPane.add(nimi);
		
		osoite = new JTextPane();
		osoite.setFont(new Font("Tahoma", Font.PLAIN, 17));
		osoite.setBounds(146, 106, 209, 37);
		contentPane.add(osoite);
		
		puhelin = new JTextPane();
		puhelin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		puhelin.setBounds(146, 173, 209, 37);
		contentPane.add(puhelin);
		
		btnNewButton = new JButton("L\u00E4het\u00E4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = nimi.getText();
				String o = osoite.getText();
				String p = puhelin.getText();
				
				JOptionPane.showMessageDialog(null, "Syötit arvot: "+n+" "+o+" "+p, "Henkilötiedot",1);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(33, 232, 158, 21);
		contentPane.add(btnNewButton);
		
		btnTyhjenn = new JButton("Tyhjenn\u00E4");
		btnTyhjenn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnTyhjenn.setBounds(217, 232, 158, 21);
		contentPane.add(btnTyhjenn);
	}

}
