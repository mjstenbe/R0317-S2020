package GUI;

import java.awt.Color;

import javax.swing.JFrame;

public class Ikkuna {
	public static void main(String[] args) {

		JFrame ikkuna = new JFrame();
		ikkuna.setBackground(Color.BLACK);
		ikkuna.setSize(300, 300);
		ikkuna.setTitle("Eka ikkuna");
		ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ikkuna.setVisible(true);
	}
}
