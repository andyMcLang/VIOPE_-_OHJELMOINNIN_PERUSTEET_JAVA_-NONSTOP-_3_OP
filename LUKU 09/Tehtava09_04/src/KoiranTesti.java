/*
Alustajan käyttöä

Alla on luokka "Koira",
josta puuttuu olioden muodostamiseen tarvittava alustusmetodi,
sekä metodit tulosta_tiedot() ja annaAani().
Täydennä luokkaa niin, että luokasta voidaan muodostaa olioita.
Olion muodostamisen yhteydessä olio saa arvot: ika, nimi, rotu ja aani.

Alla oleva luokka KoiranTesti hyödyntää Koira-luokkaa
tulostaen näytölle esimerkkitulosteen näköisen tulosteen.


class Koira
{
  int ika;
  String nimi, rotu, aani;

  // muodostin
  // metodi tulosta_tiedot()
  // metodi annaAani()
}

public class KoiranTesti
{
  public static void main(String[] args)
  {
    Koira rekku = new Koira (2, "Rekku", "Dalmatialainen", "Hau!!!");
    System.out.println("Koiran tiedot:");
    rekku.tulosta_tiedot();
    System.out.println("\nKoira sanoo: " +rekku.annaAani());
  }
}

Esimerkkituloste:
Koiran tiedot:
Nimi: Rekku
Ikä: 2
Rotu: Dalmatialainen

Koira sanoo: Hau!!!
 */

class Koira {
    int ika;
    String nimi, rotu, aani;

    protected String annaAani() {
        return this.aani;
    }

    Koira(int ika_, String nimi_, String rotu_, String aani_) {
        this.ika = ika_;
        this.nimi = nimi_;
        this.rotu = rotu_;
        this.aani = aani_;
    }

    protected void tulosta_tiedot() {
        System.out.println("Nimi: " + this.nimi);
        System.out.println("Ikä: " + this.ika);
        System.out.println("Rotu: " + this.rotu);
    }
}

public class KoiranTesti {
    public static void main(String[] args) {
        Koira rekku = new Koira(2, "Rekku", "Dalmatialainen", "Hau!!!");

        System.out.println("Koiran tiedot:");
        rekku.tulosta_tiedot();
        System.out.println("\nKoira sanoo: " + rekku.annaAani());
    }
}