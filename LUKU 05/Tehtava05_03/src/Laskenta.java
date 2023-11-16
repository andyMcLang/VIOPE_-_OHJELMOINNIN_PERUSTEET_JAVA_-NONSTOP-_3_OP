/*
Laskutoimituksia

Täydennä aikaisemmin laatimaasi laskinohjelmaa niin, että käyttäjä voi valita,
mikä laskutoimitus suoritetaan.
Ohjelma kysyy ensin mikä laskutoimitus suoritetaan.
Tämän jälkeen ohjelma kysyy kokonaisluvut, suorittaa laskutoimituksen
ja tulostaa saadun tuloksen.
Ohjelman valinta on tehtävä käyttämällä switch()-lausetta.

Ohjelma kirjoitetaan luokkaan, jonka nimi on Laskenta.

Esimerkkituloste:
Käytössäsi on seuraavat laskutoimitukset:
1: vähennyslasku
2: yhteenlasku
3: kertolasku
4: osamäärä
5: jakojäännös

Valitse laskutoimitus:
2
Anna eka luku:4354
Anna toka luku:
432432
4354+432432 = 436786
 */

import java.util.Scanner;

public class Laskenta {
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);

        int valinta;
        int luku1;
        int luku2;

        System.out.println("Käytössäsi on seuraavat laskutoimitukset:");
        System.out.println("1: vähennyslasku");
        System.out.println("2: yhteenlasku");
        System.out.println("3: kertolasku");
        System.out.println("4: osamäärä");
        System.out.println("5: jakojäännös\n");

        System.out.println("Valitse laskutoimitus:");
        valinta = skanneri.nextInt();
        System.out.print("Anna eka luku:");
        luku1 = skanneri.nextInt();
        System.out.println("Anna toka luku:");
        luku2 = skanneri.nextInt();

        switch (valinta) {
            case 1:
                System.out.println(luku1+"-"+luku2+" = "+(luku1-luku2));
                break;
            case 2:
                System.out.println(luku1+"+"+luku2+" = "+(luku1+luku2));
                break;
            case 3:
                System.out.println(luku1+"*"+luku2+" = "+(luku1*luku2));
                break;
            case 4:
                System.out.println(luku1+"/"+luku2+" = "+(luku1/luku2));
                break;
            case 5:
                System.out.println(luku1+"%"+luku2+" = "+(luku1%luku2));
                break;
            default:
                System.out.println("Ei onnistu!");
        }
    }
}
