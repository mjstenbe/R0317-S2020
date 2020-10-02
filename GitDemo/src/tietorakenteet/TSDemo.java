package tietorakenteet;

import java.util.Arrays;
import java.util.TreeSet;

public class TSDemo {

	public static void main(String[] args) {

		TreeSet<String> aakkostetut = new TreeSet<>();
		String[] kaupungit = { "Calgary", "Vancouver", "Berliini", "Alanya", "Helsinki" };
		for (int i = 0; i < kaupungit.length; i++) {

			aakkostetut.add(kaupungit[i]);

		}

		
// Tulostaminen onnistuu monella tapaa
		// https://www.javacodeexamples.com/print-treeset-in-java-example-print-elements/2793
		System.out.println("\nSanat TreeSetistä:\n");

		for (String kaupunki : aakkostetut) {
			System.out.println(kaupunki);
		}

		// convert TreeSet to an array
		String[] arr = aakkostetut.toArray(new String[aakkostetut.size()]);

		System.out.println(Arrays.toString(arr));
	}

}
