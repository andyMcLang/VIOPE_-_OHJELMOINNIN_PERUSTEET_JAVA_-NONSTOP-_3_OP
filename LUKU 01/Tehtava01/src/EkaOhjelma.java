/*
Tämän tehtävän tarkoituksena on tutustuttaa sinut Java-kielisten ohjelmien kirjoittamiseen. Alapuolella näet Java-kielisen ohjelman. Tehtäväsi on kirjoittaa ohjelma uudelleen. Seuraavassa luvussa opit, miten ohjelma toimii ja mitä se tekee.

import java.io.*;

public class EkaOhjelma
{
   public static void main (String [] args)
   {
      int luku;
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      try
      {
         System.out.print("Anna kokonaisluku:");
         luku = Integer.parseInt(in.readLine());

         System.out.println("Luku oli: " + luku);
      }

      catch (Exception e)
      {
         System.out.println("Syöttämäsi luku oli väärin.");
      }

   }
}

Esimerkkituloste:
Anna kokonaisluku:78
Luku oli: 78
*/

import java.io.*;

public class EkaOhjelma
{
    public static void main (String [] args)
    {
        int luku;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            System.out.print("Anna kokonaisluku:");
            luku = Integer.parseInt(in.readLine());

            System.out.println("Luku oli: " + luku);
        }

        catch (Exception e)
        {
            System.out.println("Syöttämäsi luku oli väärin.");
        }

    }
}