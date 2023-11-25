/*
Hypotenuusan laskeminen

Tee ohjelma, joka laskee suorakulmaisen kolmion hypotenuusan pituuden ohjelmaan syötettyjen kateettien perusteella.
Hypotenuusa on neliöjuuri kateettien neliöiden summasta.
Kateettien odotetaan olevan kokonaislukuja, kun taas hypotenuusan pituus sijoitetaan double-muuttujaan.

Vihje:
Neliöjuuren voi laskea seuraavasti (palauttaa double-tyypin arvon):
Math.sqrt(double_luku)

Ohjelma kirjoitetaan luokkaan, jonka nimi on Hypotenuusa.

Esimerkkituloste:
Anna ensimmäinen kateetti:43
Anna toinen kateetti:33
Hypotenuusan pituus: 54.20332093147061
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hypotenuusa {
    public static void main(String[] args) {

        int a = 0, b = 0;
        double c;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader lukija = new BufferedReader(input);

        try {
            System.out.print("Anna ensimmäinen kateetti:");
            a = Integer.parseInt(lukija.readLine());
            System.out.print("Anna toinen kateetti:");
            b = Integer.parseInt(lukija.readLine());
        } catch (Exception e) {
            System.out.println("Virhe: " + e);
        }

        System.out.println("Hypotenuusan pituus: " + Math.sqrt(a * a + b * b));
    }
}