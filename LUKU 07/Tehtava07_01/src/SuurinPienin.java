/*
Metodit suurin ja pienin

Alla oleva luokka SuurinPienin kysyy käyttäjältä kolme kokonaislukua
ja tulostaa syötetyistä luvuista suurimman ja pienimmän näytölle.
Tehtävänäsi on kirjoittaa ohjelmasta puuttuvat metodit (suurin() ja pienin()),
jotka saavat parametreina käyttäjän syöttämät kokonaisluvut
ja palauttavat nimensä mukaiset kokonaisluvut.

Täydennettävä ohjelma:

import java.io.*;
public class SuurinPienin
{
  public static void main(String[] args)
  {
    int luku1, luku2, luku3, suurin, pienin;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.print("Syötä ensimmäinen kokonaisluku: ");
      luku1 = Integer.parseInt(in.readLine());

      System.out.print("Syötä toinen kokonaisluku: ");
      luku2 = Integer.parseInt(in.readLine());

      System.out.print("Syötä kolmas kokonaisluku: ");
      luku3 = Integer.parseInt(in.readLine());

      suurin = suurin(luku1, luku2, luku3);
      pienin = pienin(luku1, luku2, luku3);

      System.out.print("Syöttämistäsi luvuista suurin oli " +suurin);
      System.out.print(" ja pienin " +pienin + "\n");
    }
    catch(Exception e){
      System.out.print("Antamasi syöte on virheellinen...");
    }
  }

//  Tähän kirjoitetaan metodit suurin() ja pienin()!!!
//  Metodit kirjoitetaan alapuolen tekstikenttään.

}
Huom!
Tehtäväkenttään tulee kirjoittaa vain puuttuvat metodit.
Yllä olevaa koodia ei pidä kopioida palautuskenttään.


Esimerkkituloste:
Syötä ensimmäinen kokonaisluku: 555
Syötä toinen kokonaisluku: 33
Syötä kolmas kokonaisluku: 411
Syöttämistäsi luvuista suurin oli 555 ja pienin 33
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SuurinPienin {


    public static void main(String[] args) {
        int luku1, luku2, luku3, suurin, pienin;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Syötä ensimmäinen kokonaisluku: ");
            luku1 = Integer.parseInt(in.readLine());

            System.out.print("Syötä toinen kokonaisluku: ");
            luku2 = Integer.parseInt(in.readLine());

            System.out.print("Syötä kolmas kokonaisluku: ");
            luku3 = Integer.parseInt(in.readLine());

            suurin = suurin(luku1, luku2, luku3);
            pienin = pienin(luku1, luku2, luku3);

            System.out.print("Syöttämistäsi luvuista suurin oli " + suurin);
            System.out.print(" ja pienin " + pienin + "\n");
        } catch (Exception e) {
            System.out.print("Antamasi syöte on virheellinen...");
        }
    }

    // Vastaus kenttä alkaa:
    private static int pienin(int luku1, int luku2, int luku3) {
        int pienin = luku1;

        if (luku2 < pienin) pienin = luku2;
        if (luku3 < pienin) pienin = luku3;

        return pienin;
    }

    private static int suurin(int luku1, int luku2, int luku3) {
        int suurin = luku1;

        if (luku2 > suurin) suurin = luku2;
        if (luku3 > suurin) suurin = luku3;

        return suurin;
    }
    // Vastauskenttä loppuu.
}
