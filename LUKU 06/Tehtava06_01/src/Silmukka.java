/*
For-lause

Tee ohjelma, joka kysyy käyttäjältä kokonaisluvun n (n>0)
ja tulostaa monitorille luvut 1,2,3..n allekkain.
Tee ohjelma hyödyntäen for-lausetta.

Ohjelma kirjoitetaan luokkaan, jonka nimi on Silmukka.

Esimerkkituloste:
Anna kokonaisluku:16
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
 */

import java.io.*;

public class Silmukka {
    public static void main(String[] args) {

        int i = 0;
        BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Anna kokonaisluku:");
            i = Integer.parseInt(lukija.readLine());
        } catch (Exception e_) {
            System.out.println("Virhe: " + e_);
        }

        for (int x = 1; x <= i; x++) {
            System.out.println(x);
        }
    }
}
