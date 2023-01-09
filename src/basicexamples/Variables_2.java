package basicexamples;

public class Variables_2 {
    public static void main(String[] args) {
        // Definovanie premennych robime na zaciatku!
        float myFloatNum = 10.99f;
        char myLetter = 'D'; // AltGr + p reprezentuje apostrof '
        boolean myBool = true;
        final double conversionRate = 30.126; // konstantu definujeme klucovym slovom final a je nemenna
        //conversionRate = 24.123; // tato cast skonci s chybou!!! kedze sa jedna o konstantu (final)
        int myNum;
        myNum = 15;
        String name = "John";

        System.out.println("Konverzný kurz Eur / Sk je " + conversionRate + " ku dňu 21.12.2022.");
        System.out.println("Moje meno je " + name);
        System.out.println("Vypisujem celé číslo " + myNum);
        System.out.println("Vypisujem desatinné číslo " + myFloatNum);
        System.out.println("Vypsiujem písmeno, ktoré je toto: " + myLetter);
        System.out.println("A toto je hodnota typu boolean premennej myBool " + myBool);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName; // Spoji obsah 2 premennych a to firstName a lastName a vysledok vrati do premennej fullName
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        int result = x + y;
        System.out.println("Výsledok súčtu je: " + result); // Scita hodnoty v premennych x a y, cize vysledok bude 11

        // Zadanie: Vypis text Vysledok scitanie 3 premennych (a, b, c) je:
        // a k tomu vysledok tych 3 premennych.
        int a = 1, b = 2, c = 50;
        System.out.println("Výsledok sčítania 3 premenných (a=" + a + ", b=" + b + ", c=" + c + ") je: " + (a + b + c));

        String cas = "16.30"; // cas skolenia sa moze menit, chcem o tom informovat oznamom
        System.out.println("Dnes o " + cas + " hod. začal kurz Java Developer Junior.");

        String meno = "Ján";
        String priezvisko = "Žitniak";
        System.out.println("Meno zamestnanca je: " + meno + " " + priezvisko);

    }

}
