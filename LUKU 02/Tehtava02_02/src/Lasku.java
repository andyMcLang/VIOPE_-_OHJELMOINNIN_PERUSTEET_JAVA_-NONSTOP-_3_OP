/*
Näppäimistöltä lukeminen ja tulostus

Tee ohjelma, joka pyytää käyttäjältä kaksi kokonaislukua, laskee lukujen summan
ja tulostaa tuloksen näytölle. Tulostuksen jälkeen ohjelma sulkee itsensä.

Vihje:
Ohjelma voidaan kirjoittaa pitkälti samoin kuin luvun esimerkki.
Voit toteuttaa ohjelman monella tavalla,
mutta todennäköisesti tarvitset ohjelmassa kahta muuttujaa.
Tässä ohjelmassa tarvitset yhteenlaskuoperaattoria +.

Ohjelma kirjoitetaan luokkaan, jonka nimi on Lasku.

Esimerkkituloste:
Anna ensimmäinen luku:432432
Anna toinen luku:42
Antamiesi lukujen summa on 432474
*/

import java.util.Scanner;

public class Lasku {
    public static void main(String[] args) {
        int luku1;
        int luku2;
        int summa;

        Scanner skanneri = new Scanner(System.in);
        System.out.print("Anna ensimmäinen luku:");
        luku1 = skanneri.nextInt();

        System.out.print("Anna toinen luku:");
        luku2 = skanneri.nextInt();

        summa = luku1+luku2;
        System.out.println("Antamiesi lukujen summa on " + summa);
    }
}
