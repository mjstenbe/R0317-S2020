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
//		eka.ik� = 20;
//		toka.ik� = 50;
//		
//		eka.paino = 35;
//		toka.paino = 82;
//		
//		System.out.println("Ihminen: "+eka.nimi+" "+ eka.ik�);
//		System.out.println("Ihminen: "+toka.nimi+" "+ toka.ik�);
		
		eka.setIk�(-10);
		toka.setIk�(56);
		


		// System.out.println( eka.getIk�() );
		
		
		eka.sy�();
		eka.sy�();
		eka.sy�();
		
		toka.sy�();
		
//		System.out.println("Ihminen: "+eka.nimi+" "+ eka.ik� +" "+eka.paino);
//		System.out.println("Ihminen: "+toka.nimi+" "+ toka.ik�+" "+toka.paino);
	
		
		//ihminendemo.Ihminen@66a29884
		System.out.println(eka);
		System.out.println(toka);
		

	}

}
