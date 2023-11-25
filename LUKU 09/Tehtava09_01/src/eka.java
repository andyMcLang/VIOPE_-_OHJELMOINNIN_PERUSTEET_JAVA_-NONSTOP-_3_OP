/*
Tutustumista olioihin

Alla olevan luokan "eka" päämetodi luo luokkaan "Tulostusluokka" pohjautuvan olion nimeltään "Tulosta"
ja käyttää sen jälkeen tuota oliota tekstin tulostamiseen.
Sinun tehtävänäsi on kirjoittaa luokkaan "Tulostusluokka" metodi tulostusta varten.


import java.io.*;

public class eka
{
    public static void main(String args[])
    {
        String merkkijono;
        BufferedReader olio = new BufferedReader(new InputStreamReader(System.in));
        TulostusLuokka tulostaja = new TulostusLuokka();

        try{
        System.out.println("Anna merkkijono, jonka tulostan: ");
            merkkijono = olio.readLine();
            tulostaja.Tulosta(merkkijono);

        }catch (Exception e){
            System.out.println("Ei toimi.");

        }
    }
}

class TulostusLuokka
{

//  Sinun koodisi tulee tähän...
}

Esimerkkituloste:
Anna merkkijono, jonka tulostan:
Esimerkkituloste
Esimerkkituloste
 */

import java.io.*;

public class eka {
    public static void main(String args[]) {
        String merkkijono;
        BufferedReader olio = new BufferedReader(new InputStreamReader(System.in));
        TulostusLuokka tulostaja = new TulostusLuokka();

        try {
            System.out.println("Anna merkkijono, jonka tulostan: ");
            merkkijono = olio.readLine();
            tulostaja.Tulosta(merkkijono);

        } catch (Exception e) {
            System.out.println("Ei toimi.");

        }
    }
}

class TulostusLuokka {


    protected static void Tulosta(String t) {
        System.out.println(t);
    }
}
