package tietorakenteet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Demoja {

	public static void main(String[] args) {

		String[] kaupungit = { "Calgary", "Vancouver", "Berliini", "Alanya", "Helsinki" };
		String[] avaimet = { "Eka", "Toka", "Kolmas", "Nelj�s", "Viides" };

		ArrayList<String> sanat = new ArrayList<>();
		TreeSet<String> aakkostetut = new TreeSet<>();
		HashMap<String, String> parit = new HashMap<>();

		for (int i = 0; i < kaupungit.length; i++) {

			sanat.add(kaupungit[i]);
			aakkostetut.add(kaupungit[i]);
			parit.put(avaimet[i], kaupungit[i]);

		}

		System.out.println("\nSanat arraylistist�:\n");
		for (int i = 0; i < sanat.size(); i++) {
			System.out.println(sanat.get(i));
		}

		System.out.println("\nSanat TreeSetist�:\n");

		Iterator<String> itr = aakkostetut.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("\nSanat HashMapista:\n");

		Iterator<Entry<String, String>> it = parit.entrySet().iterator();
		while (it.hasNext()) {
			HashMap.Entry<String, String> alkio = (HashMap.Entry<String, String>) it.next();
			System.out.println(alkio.getKey() + " = " + alkio.getValue());
		}

		System.out.println("\nAvaimen \"Viides\" arvo HashMapista:\n");
		System.out.println(parit.get("Viides"));

		parit.put("koira", "Dog");

		Iterator<Entry<String, String>> iterator = parit.entrySet().iterator();
		System.out.print("Tree set data: ");

		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();

		
	
	}
}