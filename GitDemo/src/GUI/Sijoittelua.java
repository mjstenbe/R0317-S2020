package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Sijoittelua {
	public static void main(String args[]) {

		JFrame frame = new JFrame("Lis‰‰ komponentteja");
		BorderLayout sijoittelija = new BorderLayout();
		frame.setLayout(sijoittelija);

		JButton button1 = new JButton("Button 1");
		JTextArea tekstikentt‰ = new JTextArea();
		tekstikentt‰.setText("Toinen ikkuna");
		JCheckBox valintaruutu1 = new JCheckBox();
		JCheckBox valintaruutu2 = new JCheckBox();

		JMenuBar menu = new JMenuBar();
		JMenu valikko = new JMenu("FILE");
		JMenuItem valikon_eka = new JMenuItem("Open");

		valikko.add(valikon_eka);
		menu.add(valikko);

		frame.add(menu, BorderLayout.NORTH);
		frame.add(button1, BorderLayout.EAST);
		frame.add(tekstikentt‰, BorderLayout.CENTER);
		frame.add(valintaruutu1, BorderLayout.SOUTH);
		frame.add(valintaruutu2, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
