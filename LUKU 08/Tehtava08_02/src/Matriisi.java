
/*
Matriisien käsittely

Alla oleva Java-ohjelma Matriisi lukee tiedostosta "matriisi.txt"
kokonaislukutaulukon sijoittaen sen 5x5 taulukkoon matriisi[][].
Ohjelma tulostaa matriisin näytölle, laskee alkioiden summan
ja tulostaa summan näytölle hyödyntäen metodeja tulosta_matriisi()
ja laske_summa(). Sinun tehtävänä on laatia em. metodit.
Ohjelman esimerkkitulosteesta näet, kuinka ohjelman tuloste muotoillaan.
Rivillä sijaitsevat arvot erotellaan tabulaattorilla.
Huomaa, että tiedostojen käsittely ei kuulu varsinaisesti kurssin aihealueeseen.

Vihje:
Seuraava metodin määrittely havainnollistaa taulukon viemistä metodille parametrinä:

public static int vastaanottaa_kaksi_ulot_taulukon(int[][] taulukolle_nimi);


import java.io.*;
import java.util.*;

public class Matriisi
{
  public static void main(String[] args)
  {
    int matriisi[][] = new int[5][5];
    int summa;
    String temp;

    try{
      BufferedReader syote = new BufferedReader(new FileReader("matriisi.txt"));
      for(int x = 0; x < 5; x++){
      temp = syote.readLine();
      StringTokenizer eroitin = new StringTokenizer(temp, "\t");

        for(int y = 0; y < 5; y++){
          matriisi[x][y] = Integer.parseInt(eroitin.nextToken());
        }
      }
      syote.close();

      System.out.print("Matriisi:\n\n");
      tulosta_matriisi(matriisi);
      summa = laske_summa(matriisi);
      System.out.print("\nMatriisin alkioiden summa: " +summa);

    }catch(Exception e){
      System.out.print("Antamasi syöte oli virheellinen..." + e);
    }
  }
//    Metodit tulosta_matriisi() ja laske_summa()
//    kirjoitetaan tähän ...
}

Esimerkkituloste:
Matriisi:

65	52	5	63	33
32	54	33	32	2
42	4	44	32	1
83	7	56	45	4
33	37	77	33	66

Matriisin alkioiden summa: 935

 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;


public class Matriisi {
    public static void main(String[] args) {
        int[][] matriisi = new int[5][5];
        int summa;
        String temp;

        try {
            BufferedReader syote = new BufferedReader(new FileReader("matriisi.txt"));
            for (int x = 0; x < 5; x++) {
                temp = syote.readLine();
                StringTokenizer eroitin = new StringTokenizer(temp, "\t");

                for (int y = 0; y < 5; y++) {
                    matriisi[x][y] = Integer.parseInt(eroitin.nextToken());
                }
            }
            syote.close();

            System.out.print("Matriisi:\n\n");
            tulosta_matriisi(matriisi);
            summa = laske_summa(matriisi);
            System.out.print("\nMatriisin alkioiden summa: " + summa);

        } catch (Exception e) {
            System.out.print("Antamasi syöte oli virheellinen..." + e);
        }
    }

    private static int laske_summa(int matruusi[][]) {
        int summa = 0;
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                summa = summa + matruusi[y][x];
            }
        }
        return summa;
    }

    private static void tulosta_matriisi(int[][] matriisi) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(matriisi[x][y]);
                if (y < 4) {
                    System.out.print("\t");
                } else {
                    System.out.println("");
                }
            }
        }
    }
}

