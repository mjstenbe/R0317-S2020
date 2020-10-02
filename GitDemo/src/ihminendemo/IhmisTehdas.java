package ihminendemo;

import java.util.Scanner;

public class IhmisTehdas {

	// Oliokirja, Kai Koskimies
	// Esimerkkikoodit jaetaan GitHubissa: https://github.com/mjstenbe/R0317-S2020

	public static void main(String[] args) {

		Ihminen eka = new Ihminen();

		Ihminen toka = new Ihminen();
		Ihminen kolmas = new Ihminen("Mika");
		Ihminen neljas = new Ihminen("Maija");

		Ihminen custom = new Ihminen("Matti", 29, 76.3);
		Ihminen custom2 = new Ihminen("Miisa", 53, 96.3);

//		eka.nimi = "Masa";
//		toka.nimi = "Mauno";
//		
//		eka.ikä = 20;
//		toka.ikä = 50;
//		
//		eka.paino = 35;
//		toka.paino = 82;
//		
//		System.out.println("Ihminen: "+eka.nimi+" "+ eka.ikä);
//		System.out.println("Ihminen: "+toka.nimi+" "+ toka.ikä);

		eka.setIkä(-10);
		toka.setIkä(56);

		// System.out.println( eka.getIkä() );

		eka.syä();
		eka.syä();
		eka.syä();

		toka.syä();

//		System.out.println("Ihminen: "+eka.nimi+" "+ eka.ikä +" "+eka.paino);
//		System.out.println("Ihminen: "+toka.nimi+" "+ toka.ikä+" "+toka.paino);

		// ihminendemo.Ihminen@66a29884
		System.out.println(eka);
		System.out.println(toka);
		System.out.println(kolmas);
		System.out.println(neljas);
		System.out.println(custom);
		System.out.println(custom2);

		custom.kerääOmena(1);
		neljas.kerääOmena(0);

	}

}
