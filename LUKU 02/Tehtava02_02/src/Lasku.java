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

import java.io.*;

public class Lasku {

    public static void main(String args[]) {
        int luku1, luku2, summa;

        BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Anna ensimmäinen luku:");
            luku1 = Integer.parseInt(lukija.readLine());
            System.out.print("Anna toinen luku:");
            luku2 = Integer.parseInt(lukija.readLine());

            summa = luku1 + luku2;
            System.out.println("Antamiesi lukujen summa on " + summa);

        } catch (Exception e) {
            //
        }
    }
}
