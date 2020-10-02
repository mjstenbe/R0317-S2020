package tiedostot;
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class ReadFileAndURL {
	public static void main(String[] args) throws Exception {

		// T�ss� virheet on heitetty kutsujan k�sitelt�v�ksi
		 readFromWeb();

		// T�ss� virheet on k�sitelty metodin sis�ll�
		readFromFile();
	}

	public static void readFromWeb() throws Exception {
		URL url = new URL("http://www.gutenberg.org/cache/epub/10481/pg10481.txt");
		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
		String i;
		while ((i = read.readLine()) != null)
			System.out.println(i);
		read.close();
	}

	public static void readFromFile() {
		// Esitell��n Scanner-olio sek� tiedosto, joka tullaan lukemaan
		Scanner lukija = null;
		File tiedosto = new File("c://temp//gradu.txt");

		// Luetaan tiedostoa skannerin avulla rivi kerrallaan
		// Varaudutaan poikkeuksiin try-catch -rakenteella

		try {
			lukija = new Scanner(tiedosto, "UTF-8");

			while (lukija.hasNextLine()) {
				String rivi = lukija.nextLine();
				System.out.println(rivi);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Tiedostoa ei l�ydy..");
			e.printStackTrace();
		}

	}
}
