/*
Ympyrän pinta-ala

Tee ohjelma, joka kysyy käyttäjältä ympyrän säteen
ja laskee annetun säteen perusteella ympyrän pinta-alan.
Lopuksi pinta-ala tulostetaan näytölle.
Piin arvona käytetään likiarvoa 3.142.
Käyttäjän oletetaan syöttävän kokonaislukuja.

Vihje:
Ympyrän pinta-ala lasketaan kaavalla:
A = π · r2, jossa r on ympyrän säde.

Ohjelma kirjoitetaan luokkaan, jonka nimi on Ala.

Esimerkkituloste:
Anna ympyrän säde:3
Ympyrän ala annetulla säteellä: 28.278
*/

import java.util.Scanner;

public class Ala {
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);

        int ympyranSade;
        double PI = 3.142;
        double ympyranAla;

        System.out.print("Anna ympyrän säde:");
        ympyranSade = skanneri.nextInt();
        ympyranAla = ympyranSade*ympyranSade*PI;

        System.out.println("Ympyrän ala annetulla säteellä: " + ympyranAla);
    }
}
