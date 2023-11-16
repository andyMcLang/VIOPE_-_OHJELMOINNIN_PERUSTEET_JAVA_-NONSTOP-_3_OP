/*
Eurolaskin

Tee ohjelma, joka pyytää käyttäjältä markkamäärän
ja muuntaa syötetyn markkamäärän euroiksi.
Lopuksi ohjelma tulostaa markkamäärän euroina näytölle.
Euron kerroin on 5.94573. Ohjelmassa käytetään double-tyypin muuttujia.

Ohjelma kirjoitetaan luokkaan, jonka nimi on EuroŽ

Esimerkkituloste:
Syötä jokin markkamäärä:679
Markat euroina: 114.19960206736599
*/

import java.util.Scanner;

public class Euro {
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);

        double markkamaara;
        double euromaara;
        double euronKerroin = 5.94573;

        System.out.print("Syötä jokin markkamäärä:");
        markkamaara = skanneri.nextDouble();
        euromaara = markkamaara/euronKerroin;

        System.out.println("Markat euroina: " + euromaara);


    }
}
