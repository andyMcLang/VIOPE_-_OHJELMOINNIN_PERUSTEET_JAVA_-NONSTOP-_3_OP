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

import java.util.Scanner;

public class Silmukka {
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);

        int syote;

        System.out.print("Anna kokonaisluku:");
        syote = skanneri.nextInt();

        for (int i = 1; i <= syote;i++) {
            System.out.println(i);
        }
    }
}
