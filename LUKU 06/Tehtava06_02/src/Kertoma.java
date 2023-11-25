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

import java.io.*;

public class Kertoma {
    public static void main(String[] args) {
        int a = 0, kertoma = 1;
        BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Anna kokonaisluku:");
            a = Integer.parseInt(lukija.readLine());
        } catch (Exception Ex) {
            System.out.println("Virhe: " + Ex);
        }
        for (int i = 1; i <= a; i++) {
            kertoma = i * kertoma;
        }
        System.out.println("Luvun " + a + " kertoma on " + kertoma);
    }
}
