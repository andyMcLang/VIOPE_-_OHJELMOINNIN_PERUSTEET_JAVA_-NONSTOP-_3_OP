/*
Työaikalaskin

Tee ohjelma, joka laskee tietyn ajanjakson aikana tehtyjen työtuntien määrän
sekä tulostaa tuntien yhteismäärän, keskimääräisen työpäivän pituuden
ja syötetyt tunnit eriteltynä.
Ohjelman tulee aluksi kysyä, kuinka monen työpäivän tiedot syötetään (max. 30 päivää).
Tämän jälkeen ohjelma kysyy päivittäiset työtunnit.

Vihje:
Ohjelman toteutus onnnistuu helpoimmin käyttämällä apuna taulukkoa, jonka koko on 30 alkiota.

Ohjelma kirjoitetaan luokkaan, jonka nimi on Tunnit.

Esimerkkituloste:
Ohjelma laskee yhteen haluamasi ajanjakson aikana
tehdyt työtunnit sekä keskimääräisen työpäivän pituuden.

Kuinka monta päivää:15
Anna 1. päivän työtunnit:6.7
Anna 2. päivän työtunnit:6.7
Anna 3. päivän työtunnit:4.5
Anna 4. päivän työtunnit:7.8
Anna 5. päivän työtunnit:6.8
Anna 6. päivän työtunnit:5.9
Anna 7. päivän työtunnit:4.6
Anna 8. päivän työtunnit:10.5
Anna 9. päivän työtunnit:12.1
Anna 10. päivän työtunnit:10.1
Anna 11. päivän työtunnit:4.9
Anna 12. päivän työtunnit:13.2
Anna 13. päivän työtunnit:7.5
Anna 14. päivän työtunnit:6.7
Anna 15. päivän työtunnit:8.7

Tehdyt työtunnit yhteensä: 116.7
Keskimääräinen työpäivän pituus: 7.78
Syötetyt tunnit: 6.7 6.7 4.5 7.8 6.8 5.9 4.6 10.5 12.1 10.1 4.9 13.2 7.5 6.7 8.7
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tunnit {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


        int paivia;
        double tyotunnit;
        double tyotunnitYhteensa = 0;

        System.out.println("Ohjelma laskee yhteen haluamasi ajanjakson aikana");
        System.out.println("tehdyt työtunnit sekä keskimääräisen työpäivän pituuden.\n");
        System.out.print("Kuinka monta päivää:");
        paivia = Integer.parseInt(in.readLine());

        double[] taulukko = new double[paivia];

        for (int i = 0; i < paivia; i++) {
            System.out.print("Anna " + (i+1) +". päivän työtunnit:");
            taulukko[i] = Double.parseDouble(in.readLine());
            tyotunnitYhteensa += taulukko[i];
        }

        System.out.println("Tehdyt työtunnit yhteensä: " + tyotunnitYhteensa);
        System.out.println("Keskimääräinen työpäivän pituus: " + tyotunnitYhteensa /paivia);
        System.out.print("Syötetyt tunnit: ");

        for (double tunnit : taulukko) {
            System.out.print(tunnit + " ");
        }
    }
}
