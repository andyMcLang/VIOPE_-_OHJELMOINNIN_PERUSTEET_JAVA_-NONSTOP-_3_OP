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

import java.io.*;

public class Ala {
    public static void main(String[] args) {
        int sade;
        double ala, pii = 3.142;
        BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Anna ympyrän säde:");
            sade = Integer.parseInt(lukija.readLine());
            ala = pii * (sade * sade);
            System.out.println("Ympyrän ala annetulla säteellä: " + ala);
        } catch (Exception e) {
            System.out.println("Virhe..");
        }
    }
}

