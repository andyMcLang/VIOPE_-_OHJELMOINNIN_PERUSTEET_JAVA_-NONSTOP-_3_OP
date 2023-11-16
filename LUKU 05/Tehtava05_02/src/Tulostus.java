/*
Tee ohjelma, joka kysyy ensin käyttäjän sukupuolen ja tämän jälkeen iän.
Lopuksi ohjelma tulostaa jonkin lausahduksen seuraavan ohjeen mukaisesti:
- Mies 0-55 vuotta: "Olet mies parhaassa iässä!"
- Mies 56-100 vuotta: "Olet viisas mies!"
- Nainen 0-55 vuotta: "Olet neito kauneimmillaan!"
- Nainen 56-100 vuotta: "Olet nuori ikäiseksesi!"
- muuten "Ohjelmassa tapahtunut virhe!"

Ikä käsitellään kokonaislukumuuttujana ja sukupuoli merkkimuuttujana (m/n). Isoja kirjaimia ei tarvitse huomioida.

Vihje:
Käytä riittävästi aikaa ohjelman suunnitteluun, ennen kuin ryhdyt kirjoittamaan ohjelmaa.
Käyttäjän syöttämän kirjaimen voit poimia String-muuttujan ensimmäisestä alkiosta.

Ohjelma kirjoitetaan luokkaan, jonka nimi on ŽTulostusŽ.

Esimerkkituloste:
Oletko mies vai nainen (m/n)?x
Anna ikäsi:166
Ohjelmassa tapahtunut virhe!
 */

import java.util.Objects;
import java.util.Scanner;

public class Tulostus {
    public static void main(String[] args) {
        Scanner skanneri = new Scanner(System.in);

        String sukupuoli;
        int ika;

        System.out.print("Oletko mies vai nainen (m/n)?");
        sukupuoli = skanneri.nextLine();

        System.out.print("Anna ikäsi:");
        ika = skanneri.nextInt();

        if ((ika >= 0 && ika <= 55) && Objects.equals(sukupuoli, "m")) {
            System.out.println("Olet mies parhaassa iässä!");
        } else if ((ika >= 56 && ika <= 100) && Objects.equals(sukupuoli, "m")) {
            System.out.println("Olet viisas mies!");
        } else if ((ika >= 0 && ika <= 55) && Objects.equals(sukupuoli, "n")) {
            System.out.println("Olet neito kauneimmillaan!");
        } else if ((ika >= 56 && ika <= 100) && Objects.equals(sukupuoli, "n")) {
            System.out.println("Olet nuori ikäiseksesi!");
        } else {
            System.out.println("Ohjelmassa tapahtunut virhe!");
        }
    }
}