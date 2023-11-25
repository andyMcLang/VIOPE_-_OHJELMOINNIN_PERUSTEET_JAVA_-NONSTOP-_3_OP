/*
Viimeinen koitos

Viope Javan viimeisessä tehtävässä harjoitellaan periytyvän luokan laatimista.
Alla näet luokan "Ajoneuvo", jolla on ominaisuudet:
paino, huippunopeus ja ajetut_kilometrit.

Luokka "Ajoneuvo" sisältää saantimetodit anna_paino(), anna_huippunopeus(),
anna_ajetut_kilometrit(),
joiden avulla luokan "Ajoneuvo" muuttujien arvot voidaan lukea
periytetyssä luokassa.
Lisäksi "Ajoneuvo" sisältää metodin aja(matka kilometreinä),
joka kasvattaa ajoneuvolla ajettuja kilometrejä:


import java.io.*;
class Ajoneuvo
{
   private int paino;
   private int huippunopeus;
   private int ajetut_kilometrit;

   Ajoneuvo(int paino, int huippunopeus, int ajetut_kilometrit)
   {
      this.paino = paino;
      this.huippunopeus = huippunopeus;
      this.ajetut_kilometrit = ajetut_kilometrit;
   }

   protected void aja(int ajettava_matka)
   {
      this.ajetut_kilometrit += ajettava_matka;
   }

   protected int anna_paino()
   {
      return this.paino;
   }

   protected int anna_huippunopeus()
   {
      return this.huippunopeus;
   }

   protected int anna_ajetut_kilometrit()
   {
      return this.ajetut_kilometrit;
   }
}


Huomaa, että luokassa on vain yksi alustusmetodi, jossa
Ajoneuvon ominaisuudet viedään parametrina heti olion muodostamisen yhteydessä.

Sinun tehtävänä on laatia Ajoneuvo-luokasta periytyvä
luokka "Auto", jolla on seuraavat ominaisuudet:

String merkki
String malli
String rekisteri_nro
boolean kaynnissa

Lisäksi Auto-luokalla on seuraavat metodit:

kaynnista(), joka muuttaa kaynnissa-muuttujan arvoksi "true"
sammuta(), joka muuttaa käynnissä-muuttujan arvoksi "false"
katsasta(), joka tulostaa auton tiedot esimerkkitulostuksen mukaisesti.

Mikäli auto on käynnissä kun se katsatetaan, tulostetaan: "Auto on käynnissä".
Vastaavasti auton ollessa sammutettuna, tulostetaan: "Auto ei ole käynnissä".

Muuttujien arvoihin pääset käsiksi käyttämällä luokan "Ajoneuvo" saantimetodeja.

Alla näet luokan Autoilua, jossa muodostetaan olio "autoX"
laatimastasi luokasta ja jota ohjelmassa käytetään. Ohjelman
alussa kysytään käyttäjältä olion luomiseen tarvittavat tiedot.


public class Autoilua
{
   public static void main(String[] args)
   {

      BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));
      int paino, nopeus, km;
      String merkki, malli, rekkari;
      try
      {
         System.out.println("Anna auton merkki:");
         merkki = lukija.readLine();
         System.out.println("Anna auton malli:");
         malli = lukija.readLine();
         System.out.println("Anna auton rekisterinumero:");
         rekkari = lukija.readLine();
         System.out.println("Anna auton paino:");
         paino = Integer.parseInt(lukija.readLine());
         System.out.println("Anna auton huippunopeus:");
         nopeus = Integer.parseInt(lukija.readLine());
         System.out.println("Anna autolla ajetut kilometrit:");
         km = Integer.parseInt(lukija.readLine());
         System.out.println("\n");

         Auto autoX = new Auto(paino, nopeus, km, merkki, malli, rekkari, false);

         autoX.katsasta();
         autoX.kaynnista();
         autoX.aja(95);
         System.out.print("\n\n");

         autoX.katsasta();
      }
      catch (Exception e)
      {
         System.out.println("Virhetilanne!");
      }
   }
}

Esimerkkituloste:
Anna auton merkki:
Mazda
Anna auton malli:
323
Anna auton rekisterinumero:
TUY-555
Anna auton paino:
1010
Anna auton huippunopeus:
165
Anna autolla ajetut kilometrit:
250000


Auton tiedot:
Merkki: Mazda
Malli: 323
Ajokilometrit: 250000
Paino (kg): 1010
Huippunopeus (km/h): 165
Rekisterinumero: TUY-555
Auto ei ole käynnissä


Auton tiedot:
Merkki: Mazda
Malli: 323
Ajokilometrit: 250095
Paino (kg): 1010
Huippunopeus (km/h): 165
Rekisterinumero: TUY-555
Auto on käynnissä
 */

import java.io.*;

class Ajoneuvo {

    private int paino;
    private int huippunopeus;
    private int ajetut_kilometrit;

    Ajoneuvo(int paino, int huippunopeus, int ajetut_kilometrit) {
        this.paino = paino;
        this.huippunopeus = huippunopeus;
        this.ajetut_kilometrit = ajetut_kilometrit;
    }

    protected void aja(int ajettava_matka) {
        this.ajetut_kilometrit += ajettava_matka;
    }

    protected int anna_paino() {
        return this.paino;
    }

    protected int anna_huippunopeus() {
        return this.huippunopeus;
    }

    protected int anna_ajetut_kilometrit() {
        return this.ajetut_kilometrit;
    }
}

class Auto extends Ajoneuvo {
    String merkki;
    String malli;
    String rekisteri_nro;
    boolean kaynnissa;

    public void kaynnista() {
        this.kaynnissa = true;
    }

    Auto(int paino_, int nopeus_, int km_, String merkki_, String malli_, String rekkari_, boolean kaynnissa_) {
        super(paino_, nopeus_, km_);
        this.merkki = merkki_;
        this.malli = malli_;
        this.rekisteri_nro = rekkari_;
        this.kaynnissa = kaynnissa_;
    }

    protected void katsasta() {
        System.out.println("Auton tiedot:");
        System.out.println("Merkki: " + this.merkki);
        System.out.println("Malli: " + this.malli);
        System.out.println("Ajokilometrit: " + super.anna_ajetut_kilometrit());
        System.out.println("Paino (kg): " + super.anna_paino());
        System.out.println("Huippunopeus (km/h): " + super.anna_huippunopeus());
        System.out.println("Rekisterinumero: " + this.rekisteri_nro);
        if (kaynnissa) {
            System.out.println("Auto on käynnissä");
        } else {
            System.out.println("Auto ei ole käynnissä");
        }
    }
}

public class Autoilua {
    public static void main(String[] args) {

        BufferedReader lukija = new BufferedReader(new InputStreamReader(System.in));
        int paino, nopeus, km;
        String merkki, malli, rekkari;
        try {
            System.out.println("Anna auton merkki:");
            merkki = lukija.readLine();
            System.out.println("Anna auton malli:");
            malli = lukija.readLine();
            System.out.println("Anna auton rekisterinumero:");
            rekkari = lukija.readLine();
            System.out.println("Anna auton paino:");
            paino = Integer.parseInt(lukija.readLine());
            System.out.println("Anna auton huippunopeus:");
            nopeus = Integer.parseInt(lukija.readLine());
            System.out.println("Anna autolla ajetut kilometrit:");
            km = Integer.parseInt(lukija.readLine());
            System.out.println("\n");

            Auto autoX = new Auto(paino, nopeus, km, merkki, malli, rekkari, false);

            autoX.katsasta();
            autoX.kaynnista();
            autoX.aja(95);
            System.out.print("\n\n");

            autoX.katsasta();
        } catch (Exception e) {
            System.out.println("Virhetilanne!");
        }
    }
}
