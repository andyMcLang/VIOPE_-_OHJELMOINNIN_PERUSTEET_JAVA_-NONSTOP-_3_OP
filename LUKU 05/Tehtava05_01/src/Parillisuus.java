/*
Luvun parillisuuden tarkistaminen

Tee ohjelma, joka pyytää käyttäjältä kokonaisluvun ja tarkistaa,
onko luku parillinen vai pariton.
Jos syötetty luku on parillinen, tulostetaan näytölle "Luku 178 on parillinen.",
jos luku on pariton, tulostetaan näytölle "Luku 233 on pariton.".

Vihje:
Luku on parillinen, mikäli sen jakojäännös kahdella jaettaessa on 0.

Ohjelma kirjoitetaan luokkaan, jonka nimi on Parillisuus.

Esimerkkituloste:
Anna kokonaisluku: 322461
Luku 322461 on pariton.
 */

import java.util.Scanner;

public class Parillisuus {
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);

        int luku;

        System.out.print("Anna kokonaisluku: ");
        luku = skanneri.nextInt();

        if (luku % 2 == 0) {
            System.out.println("Luku " + luku + " on parillinen.");
        } else {
            System.out.println("Luku " + luku + " on pariton.");
        }
    }
}
