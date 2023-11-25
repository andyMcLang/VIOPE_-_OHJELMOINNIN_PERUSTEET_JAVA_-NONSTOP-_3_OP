/*
Olioiden välisiä toimintoja - 1

Alla on hieman karsittu versio luokasta "eka", mutta idea on taas sama.
Luokassa "eka" luodaan olio nimeltään "olio".
Tällä oliolla on siis luokan KysyJaTulosta ominaisuudet käytössä.

Sinun tehtäväsi on laatia luokka "KysyJaTulosta"
ja laatia luokkaan metodi teeHommasi(),
joka ottaa vastaan muuttujan "merkkijono" sisältämän merkkijonon,
tulostaa saadun merkkijonon, lukee käyttäjän antaman syötteen
ja tulostaa tämän näytölle. Valmiin ohjelman toiminnan näet esimerkkitulosteesta.


import java.io.*;

public class eka
{
    public static void main(String args[])
    {
        String merkkijono = "Anna merkkijono, jonka tulostan: ";
        KysyJaTulosta olio = new KysyJaTulosta();
        olio.teeHommasi(merkkijono);
    }
}

// Sinun koodisi tulee tähän...

Esimerkkituloste:
Anna merkkijono, jonka tulostan: Terve vaan kaikille!!
Terve vaan kaikille!!
 */

import java.io.*;

public class eka {
    public static void main(String args[]) {
        String merkkijono = "Anna merkkijono, jonka tulostan: ";
        KysyJaTulosta olio = new KysyJaTulosta();
        olio.teeHommasi(merkkijono);
    }
}

class KysyJaTulosta {
    protected void teeHommasi(String mj) {
        String mj2 = "";
        System.out.print(mj);
        BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));

        try {
            mj2 = lukija.readLine();
        } catch (Exception virhe) {
            System.out.println(virhe);
            System.exit(0);
        }
        System.out.println(mj2);
    }
}
