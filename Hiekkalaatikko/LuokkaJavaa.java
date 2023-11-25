public class LuokkaJavaa
{
    public static void main(String[] args){
        String merkkijono = "Moi vaan kaikille";

        LuokkaYksi olio = new LuokkaYksi();
        merkkijono = olio.Tulosta(merkkijono);

        Tulosta(merkkijono);

        merkkijono = olio.olio2.Tulosta("Suoraan LuokkaKaksi. ");
        Tulosta(merkkijono);
    }

    static void Tulosta(String teksti){
        System.out.println("Luokasta LuokkaJavaa: " + teksti);
    }
}

class LuokkaYksi
{
    LuokkaKaksi olio2 = new LuokkaKaksi();
    String palautus;

    String Tulosta(String teksti){
        palautus = olio2.Tulosta(teksti);
        return palautus;
    }
}

class LuokkaKaksi
{
    String Tulosta(String teksti){
        System.out.println("Luokasta LuokkaKaksi: " + teksti);
        return "Tulostus onnistui... kuten huomasit";
    }
}