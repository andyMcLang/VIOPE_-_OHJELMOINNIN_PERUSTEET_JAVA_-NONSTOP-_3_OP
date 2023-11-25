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

import java.io.*;

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

    private static int pienin(int a, int b, int c) {
        int palautus = 0;

        if (a >= b) {
            palautus = b;
        } else {
            palautus = a;
        }

        if (palautus >= c) {
            palautus = c;
        } else {
            palautus = palautus;
        }
        return palautus;
    }

    private static int suurin(int a, int b, int c) {
        int palautus = 0;
        if (a <= b) {
            palautus = b;
        } else {
            palautus = a;
        }

        if (palautus <= c) {
            palautus = c;
        } else {
            palautus = palautus;
        }
        return palautus;
    }

}
