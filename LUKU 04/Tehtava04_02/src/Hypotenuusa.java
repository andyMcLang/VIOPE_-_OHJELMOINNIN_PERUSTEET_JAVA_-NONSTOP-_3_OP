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

import java.util.Scanner;

public class Hypotenuusa {
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);
        int kateetti1;
        int kateetti2;
        double hypotenuusanPituus;

        System.out.print("Anna ensimmäinen kateetti:");
        kateetti1 = Integer.parseInt(skanneri.nextLine());

        System.out.print("Anna toinen kateetti:");
        kateetti2 = Integer.parseInt(skanneri.nextLine());

        hypotenuusanPituus = Math.sqrt(Math.pow(kateetti1,2)+Math.pow(kateetti2,2));
        System.out.println("Hypotenuusan pituus: "+hypotenuusanPituus);
    }
}
