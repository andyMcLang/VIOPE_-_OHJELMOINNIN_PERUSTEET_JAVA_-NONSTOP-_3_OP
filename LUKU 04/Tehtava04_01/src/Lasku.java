/*
Laskin-ohjelma

Tee ohjelma, joka kysyy käyttäjältä kaksi kokonaislukua
ja tulostaa lukujen summan, erotuksen, tulon, osamäärän
sekä jakojäännöksen. (Ensin syötetty luku on jaettava luku.)

Ohjelma kirjoitetaan luokkaan, jonka nimi on Lasku.

Esimerkkituloste:
Syötä ensimmäinen kokonaisluku:7
Syötä toinen kokonaisluku:
3
7+3 = 10
7-3 = 4
7*3 = 21
7/3 = 2.3333333333333335
Jakojäännös: 1
 */

import java.io.*;

public class Lasku {

    public static void main(String[] args) {
        int a = 0, b = 0;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader lukija = new BufferedReader(input);
        try {
            System.out.print("Syötä ensimmäinen kokonaisluku:");
            a = Integer.parseInt(lukija.readLine());
            System.out.println("Syötä toinen kokonaisluku:");
            b = Integer.parseInt(lukija.readLine());
        } catch (Exception E) {
            System.out.println("Virhe: " + E);
        }

        System.out.println(a + "+" + b + " = " + (a + b));
        System.out.println(a + "-" + b + " = " + (a - b));
        System.out.println(a + "*" + b + " = " + (a * b));
        System.out.println(a + "/" + b + " = " + ((double) a / b));
        System.out.println("Jakojäännös: " + (a % b));
    }
}