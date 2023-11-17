/*
Kertoma

Tee ohjelma, joka kysyy käyttäjältä kokonaisluvun n (n>0)
ja tulostaa luvun kertoma näytölle.
Esimerkiksi n:n kertomaa merkitään merkillä n!,
joka tarkoittaa lukua, joka saadaan seuraavasti 1*2*3...*n.

Ohjelma kirjoitetaan luokkaan, jonka nimi on Kertoma.

Esimerkkituloste:
Anna kokonaisluku:9
Luvun 9 kertoma on 362880
 */

import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);

        int syote;

        int kertoma = 1;

        System.out.print("Anna kokonaisluku:");
        syote = skanneri.nextInt();

        for (int i = 1; i <= syote; i++) {
            kertoma *= i;
        }

        System.out.println("Luvun "+ syote + " kertoma on "+kertoma);
    }
}
