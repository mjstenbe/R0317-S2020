package tietorakenteet;

import java.util.ArrayList;

public class Tietorakenteita {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("eka");
		lista.add("kolmas");
		lista.add("toka");

		System.out.println(lista.size());

		String t = lista.get(0);
		System.out.println(t);

		System.out.println(lista.get(2));

		System.out.println(lista);

	}

}
