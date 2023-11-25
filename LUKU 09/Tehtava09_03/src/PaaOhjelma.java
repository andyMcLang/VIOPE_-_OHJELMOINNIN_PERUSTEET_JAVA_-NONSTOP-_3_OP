/*
Olioiden välisiä toimintoja - 2

Tehtävässä on valmiina kaksi luokkaa: "PaaOhjelma"
ja "Laskin". Sinun tehtäväsi on tehdä luokka "Tulostaja",
joka kysyy käyttäjältä kaksi kokonaislukua,
kutsuu luokan "Laskin" metodia "Summa()" välittäen metodille syötteenä saadut kokonaisluvut.
Metodi "Summa()" laskee lukujen summan ja palauttaa tuloksen.
Lopuksi metodi "Tulosta()" tulostaa saadun summan näytölle.


import java.io.*;

public class PaaOhjelma
{
    public static void main(String args[])
    {
        Tulostaja olio = new Tulostaja();
        olio.Tulosta();
    }
}

// Sinun koodisi tulee tähän...

class Laskin
{
    static int Summa(int eka, int toka)
    {
        int summa = eka + toka;
        return summa;
    }
}

Esimerkkituloste:
Syötä ensimmäinen kokonaisluku: 49
Syötä toinen kokonaisluku: 72
Lukujen summa: 121
 */

import java.io.*;

public class PaaOhjelma
{
    public static void main(String[] args)
    {
        Tulostaja olio = new Tulostaja();
        olio.Tulosta();
    }
}

class Tulostaja
{
    int a, b, c;
    BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));
    Laskin laskuri;

    Tulostaja()
    {
        try
        {
            laskuri = new Laskin();
            System.out.print("Syötä ensimmäinen kokonaisluku: ");
            a = Integer.parseInt(lukija.readLine());
            System.out.print("Syötä toinen kokonaisluku: ");
            b = Integer.parseInt(lukija.readLine());
            c = laskuri.Summa(a,b);
        }
        catch (Exception virhe)
        {
            System.out.println(virhe);
        }
    }

    protected void Tulosta()
    {
        System.out.println("Lukujen summa: " + c);
    }
}
class Laskin
{
    static int Summa(int eka, int toka)
    {
        int summa = eka + toka;
        return summa;
    }
}