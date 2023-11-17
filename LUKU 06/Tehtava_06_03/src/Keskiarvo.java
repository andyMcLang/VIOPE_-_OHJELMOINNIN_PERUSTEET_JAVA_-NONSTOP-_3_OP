/*
Keskiarvon laskeminen ja silmukkarakenne

Tee ohjelma, joka kysyy oppilaiden koearvosanoja (kokonaisluvut 4-10 käytössä)
ja laskee syötettyjen arvosanojen keskiarvon.
Ohjelman tulee ottaa vastaan arvosanoja,
kunnes arvosanojen syöttö lopetetaan negatiivisella kokonaisluvulla.
Lopuksi ohjelma tulostaa arvosanojen lukumäärän sekä lasketun keskiarvon.
Vain luvut 4-10 huomioidaan keskiarvoon.
Jos käyttäjä antaa jonkin muun luvun, kysytään uusi luku.

Vihje:
Voit laatia ohjelman joko while- tai do...while-lauseen avulla.
Käytä arvosanojen ja keskiarvon tallentamiseen liukulukutyyppisiä muuttujia.

Ohjelma kirjoitetaan luokkaan, jonka nimi on Keskiarvo.

Esimerkkituloste:
Ohjelma laskee syötettyjen arvosanojen keskiarvon.
Lopetus negatiivisella kokonaisluvulla.
Anna arvosana (4-10):6
Anna arvosana (4-10):7
Anna arvosana (4-10):8
Anna arvosana (4-10):9
Anna arvosana (4-10):9
Anna arvosana (4-10):4
Anna arvosana (4-10):6
Anna arvosana (4-10):7
Anna arvosana (4-10):6
Anna arvosana (4-10):-1
Ohjelmaan syötetty 9 arvosanaa.
Arvosanojen keskiarvo: 6.888888888888889
 */

import java.util.Scanner;

public class Keskiarvo {
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);

        int maara = 0;
        int syote;
        double arvosanat=0;

        System.out.println("Ohjelma laskee syötettyjen arvosanojen keskiarvon.");
        System.out.println("Lopetus negatiivisella kokonaisluvulla.");
        System.out.print("Anna arvosana (4-10):");
        syote = skanneri.nextInt();

        while (syote > 0) {
            arvosanat+=syote;
            maara++;
            System.out.print("Anna arvosana (4-10):");
            syote = skanneri.nextInt();
        }

        System.out.println("Ohjelmaan syötetty " + maara + " arvosanaa.");
        System.out.println("Arvosanojen keskiarvo: " + (arvosanat/maara));
    }
}
