package tietorakenteet;

import java.util.ArrayList;
import java.util.Scanner;

public class Kauppakassi {

	public static void main(String[] args) {

		ArrayList<String> ostokset = new ArrayList<String>();

		Scanner lukija = new Scanner(System.in);

		do {
			System.out.println("Sy�t� ostos: (Listalla: " + ostokset.size() + " tuotetta): ");
			String ostos = lukija.nextLine();
			if (ostokset.contains(ostos)) {
				System.out.println("L�ytyy jo listasta.");
			} else if (ostos.equals("lopeta"))
				break;
			else
				ostokset.add(ostos);

		} while (true);

		System.out.println("Tulostetaan lista: ");

		System.out.print("Listan ensimm�inen alkio on:");
		System.out.println(ostokset.get(0));

		System.out.print("Listan viimeinen alkio on: ");
		System.out.println(ostokset.get(ostokset.size() - 1));

		System.out.println("Listalla tuotteita yhteens� : " + ostokset.size());
		System.out.println("Koko listan sis�lt�: ");

		for (String ostos : ostokset) {
			System.out.print(ostos + " ");
		}

	}

}
