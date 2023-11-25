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

import java.io.*;

public class Tulostus {
    public static void main(String[] args) {
        String mj = "abba";
        char sex;
        int age = 0;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader lukija = new BufferedReader(input);

        try {
            System.out.print("Oletko mies vai nainen (m/n)?");
            mj = lukija.readLine();
            System.out.print("Anna ikäsi:");
            age = Integer.parseInt(lukija.readLine());
        } catch (Exception e) {
            System.out.println("Virhe: " + e);
        }
        sex = mj.charAt(0);

        switch (sex) {
            case 'm':
                if (age >= 0 && age <= 55) {
                    System.out.print("Olet mies parhaassa iässä!");
                } else if (age > 55 && age <= 100) {
                    System.out.print("Olet viisas mies!");
                } else {
                    System.out.println("Ohjelmassa tapahtunut virhe!");
                }
                break;
            case 'n':
                if (age >= 0 && age <= 55) {
                    System.out.print("Olet neito kauneimmillaan!");
                } else if (age > 55 && age <= 100) {
                    System.out.print("Olet nuori ikäiseksesi!");
                } else {
                    System.out.println("Ohjelmassa tapahtunut virhe!");
                }
                break;
            default:
                System.out.println("Ohjelmassa tapahtunut virhe!");
        }
        System.out.println("");
    }
}