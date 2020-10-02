package tiedostot;

import java.util.Scanner;

public class Poikkeusdemo {
    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        int    jaettava, jakaja;

        System.out.print("Anna jaettava: ");
        jaettava = lukija.nextInt();

        System.out.print("Anna jakaja: ");
        jakaja = lukija.nextInt();
    double tulos = (1.0*jaettava) / jakaja;

    System.out.println("Jakolaskun tulos on " + tulos);
    }

}