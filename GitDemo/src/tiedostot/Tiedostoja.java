package tiedostot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tiedostoja {
    public static void main(String[] args) {
// Esitellään Scanner-olio sekä tiedosto, joka tullaan lukemaan
        Scanner lukija = null;
        File tiedosto = new File("c://temp//gradu.txt");

// Luetaan tiedostoa skannerin avulla rivi kerrallaan
// Varaudutaan poikkeuksiin try-catch -rakenteella

        try {
            lukija = new Scanner(tiedosto);

            while (lukija.hasNextLine()) {
                String rivi = lukija.nextLine();
                System.out.println(rivi);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei löydy..");
        }

    }
}
