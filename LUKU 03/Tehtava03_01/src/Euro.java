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

import java.io.*;

public class Euro {
    public static void main(String[] args) {
        BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));
        double markka, euro, muunnos = 5.94573;

        try {
            System.out.print("Syötä jokin markkamäärä:");
            markka = Double.parseDouble(lukija.readLine());
            euro = (markka / muunnos);
            System.out.println("Markat euroina: " + euro);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}