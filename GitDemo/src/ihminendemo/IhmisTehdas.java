package ihminendemo;

public class IhmisTehdas {

	public static void main(String[] args) {

		Ihminen eka = new Ihminen();
		Ihminen toka = new Ihminen();
		
		eka.nimi = "Masa";
		toka.nimi = "Mauno";
		
		eka.ikä = 20;
		toka.ikä = 50;
		
		eka.paino = 35;
		toka.paino = 82;
		
		System.out.println("Ihminen: "+eka.nimi+" "+ eka.ikä);
		System.out.println("Ihminen: "+toka.nimi+" "+ toka.ikä);
		
		eka.syö();
		eka.syö();
		eka.syö();
		
		toka.syö();
		
		System.out.println("Ihminen: "+eka.nimi+" "+ eka.ikä +" "+eka.paino);
		System.out.println("Ihminen: "+toka.nimi+" "+ toka.ikä+" "+toka.paino);
		
		

	}

}
