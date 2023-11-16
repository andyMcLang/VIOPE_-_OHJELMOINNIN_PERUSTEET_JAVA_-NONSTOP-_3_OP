/*
Laskin-ohjelma

Tee ohjelma, joka kysyy käyttäjältä kaksi kokonaislukua
ja tulostaa lukujen summan, erotuksen, tulon, osamäärän
sekä jakojäännöksen. (Ensin syötetty luku on jaettava luku.)

Ohjelma kirjoitetaan luokkaan, jonka nimi on Lasku.

Esimerkkituloste:
Syötä ensimmäinen kokonaisluku:7
Syötä toinen kokonaisluku:
3
7+3 = 10
7-3 = 4
7*3 = 21
7/3 = 2.3333333333333335
Jakojäännös: 1
 */

import java.util.Scanner;

class Lasku{
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);

        int luku1;
        int luku2;

        System.out.print("Syötä ensimmäinen kokonaisluku:");
        luku1 = skanneri.nextInt();

        System.out.println("Syötä toinen kokonaisluku:");
        luku2 = skanneri.nextInt();

        System.out.println(luku1+"+"+luku2+" = "+(luku1+luku2));
        System.out.println(luku1+"-"+luku2+" = "+(luku1-luku2));
        System.out.println(luku1+"*"+luku2+" = "+(luku1*luku2));
        System.out.println(luku1+"/"+luku2+" = "+((double)luku1/(double)luku2));
        System.out.printf("%d/%d = %f", luku1, luku2, (double)luku1/luku2);
        System.out.println("Jakojäännös: "+(luku1%luku2));
    }
}