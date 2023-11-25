/*
Laskutoimituksia

Täydennä aikaisemmin laatimaasi laskinohjelmaa niin, että käyttäjä voi valita,
mikä laskutoimitus suoritetaan.
Ohjelma kysyy ensin mikä laskutoimitus suoritetaan.
Tämän jälkeen ohjelma kysyy kokonaisluvut, suorittaa laskutoimituksen
ja tulostaa saadun tuloksen.
Ohjelman valinta on tehtävä käyttämällä switch()-lausetta.

Ohjelma kirjoitetaan luokkaan, jonka nimi on Laskenta.

Esimerkkituloste:
Käytössäsi on seuraavat laskutoimitukset:
1: vähennyslasku
2: yhteenlasku
3: kertolasku
4: osamäärä
5: jakojäännös

Valitse laskutoimitus:
2
Anna eka luku:4354
Anna toka luku:
432432
4354+432432 = 436786
 */

import java.io.*;

public class Laskenta {
    public static void main(String[] args) {
        int valinta = 0, a = 0, b = 0;

        InputStream input_ = System.in;
        InputStreamReader input = new InputStreamReader(input_);
        BufferedReader lukija = new BufferedReader(input);

        System.out.println("Käytössäsi on seuraavat laskutoimitukset:");
        System.out.println("1: vähennyslasku");
        System.out.println("2: yhteenlasku");
        System.out.println("3: kertolasku");
        System.out.println("4: osamäärä");
        System.out.println("5: jakojäännös");
        System.out.println("\nValitse laskutoimitus:");

        try {
            valinta = Integer.parseInt(lukija.readLine());
            System.out.print("Anna eka luku:");
            a = Integer.parseInt(lukija.readLine());
            System.out.println("Anna toka luku:");
            b = Integer.parseInt(lukija.readLine());
        } catch (Exception e) {
            System.out.print("Virhe: " + e);
        }
        switch (valinta) {
            case 1:
                System.out.print(a + "-" + b + " = " + (a - b));
                break;
            case 2:
                System.out.print(a + "+" + b + " = " + (a + b));
                break;
            case 3:
                System.out.print(a + "*" + b + " = " + (a * b));
                break;
            case 4:
                System.out.print(a + "/" + b + " = " + (a / b));
                break;
            case 5:
                System.out.print(a + "%" + b + " = " + (a % b));
                break;
            default:
                System.out.print("Ohjelmassa tapahtui virhe: valinnan pitää olla välillä 1-5.");
                break;
        }
        System.out.println("");
    }
}