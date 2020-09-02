package ihminendemo;

import java.util.Scanner;

public class IhmisTehdas {

	// Oliokirja, Kai Koskimies
	// Esimerkkikoodit jaetaan GitHubissa: https://github.com/mjstenbe/R0317-S2020
	
	public static void main(String[] args) {

		Ihminen eka = new Ihminen();
		Ihminen toka = new Ihminen();
		
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
		
		
		eka.syö();
		eka.syö();
		eka.syö();
		
		toka.syö();
		
//		System.out.println("Ihminen: "+eka.nimi+" "+ eka.ikä +" "+eka.paino);
//		System.out.println("Ihminen: "+toka.nimi+" "+ toka.ikä+" "+toka.paino);
	
		
		//ihminendemo.Ihminen@66a29884
		System.out.println(eka);
		System.out.println(toka);
		

	}

}
