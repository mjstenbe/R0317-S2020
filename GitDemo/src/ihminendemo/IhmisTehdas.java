package ihminendemo;

public class IhmisTehdas {

	public static void main(String[] args) {

		Ihminen eka = new Ihminen();
		Ihminen toka = new Ihminen();
		
		eka.nimi = "Masa";
		toka.nimi = "Mauno";
		
		eka.ik� = 20;
		toka.ik� = 50;
		
		eka.paino = 35;
		toka.paino = 82;
		
		System.out.println("Ihminen: "+eka.nimi+" "+ eka.ik�);
		System.out.println("Ihminen: "+toka.nimi+" "+ toka.ik�);
		
		eka.sy�();
		eka.sy�();
		eka.sy�();
		
		toka.sy�();
		
		System.out.println("Ihminen: "+eka.nimi+" "+ eka.ik� +" "+eka.paino);
		System.out.println("Ihminen: "+toka.nimi+" "+ toka.ik�+" "+toka.paino);
		
		

	}

}
