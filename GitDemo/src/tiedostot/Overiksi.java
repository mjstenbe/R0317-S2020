package tiedostot;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Overiksi {
    public static void main(String[] args) {
        suorita();
    }
    public static void suorita()  {

        try {
            Scanner lukija = new Scanner(new File("tiedosto.txt"));
        } catch (FileNotFoundException e) {

        }

        int[] taulu = new int[10];
        try {
            for (int i = 0; i < 15; i++)
                if (i == 5) throw new FileNotFoundException("Tämän poikkeuksen aiheutti silmukka!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nyt tuli poikkeus, joka napattiin.");
        }
        catch (NullPointerException e){
            System.out.println("Nyt tuli NullPointer-poikkeus, joka napattiin.");
        }
        catch (Exception p){
            System.out.println("Nyt joku muu poikkeus, joka napattiin.");
            p.getCause();
            p.getLocalizedMessage();
            p.getStackTrace();
            p.printStackTrace();

        }


    }
}