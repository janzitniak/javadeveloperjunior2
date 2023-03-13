package basicexamples.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


/* Úloha č. 1
Vytvorte triedu Rectangle, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (getPerimeter), druhá na výpočet jeho obsahu (getArea).
Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom. Ak zadá príkaz s, tak program vyžiada od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí.
Úloha pre lektora: Vytvorte jUnit testy s niekoľkými vstupnými scenármi.
Update programu, vylepšená verzia by mohla robiť toto:
Popis programu:
Po spustení programu vypíše jednoduché menu, kde používateľa zadá možnosť:
s alebo q pričom písmeno s od používateľa bude žiadať zadanie strán a, b. Po zadaní týchto strán vypočíta obvod a obsah obdlžnika a zobrazí ho do konzoly. Toto bude opakovať dovtedy, kým v menu nezadáme písmeno q. Po zadaní písmena q, program ukončí svoju činnosť a vypíše Koniec programu.

*/
public class Rectangle {

    public static double getPerimeter(double a, double b) {
        return 2 * (a + b);
    }

    public static double getArea(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        double a;
        double b;
        String odpoved;

        while (true) {
            Scanner scn = new Scanner(System.in); // inicializacia "konzoly" pre pouzivatelsky vstup

            System.out.printf("%nZadaj:");
            System.out.println("(s) pre vstup hodnôt na výpočet obvodu a obsahu obdĺžnika");
            System.out.println("(q) pre ukončenie programu");

            odpoved = scn.nextLine(); // premenna odpoved bude obsahovat pismeno (moznost), ktore zadal pouzivatel

            if (odpoved.equals("s")) {
                System.out.println("Zadaj hodnotu strany a: ");
                a = scn.nextDouble();

                System.out.println("Zadaj hodnotu strany b: ");
                b = scn.nextDouble();

                double obvod = Rectangle.getPerimeter(a, b);
                double obsah = Rectangle.getArea(a, b);
                System.out.println("Obvod kruhu je: " + obvod);
                System.out.println("Obsah kruhu je:" + obsah);
            } else if (odpoved.equals("q")) {
                System.out.println("Koniec programu");
                break;
            } else {
                System.out.println("Zadali ste nesprávnu možnosť! Zopakujte výber.");
            }
        }

    }

/*
    @Tabulka
    public void testGetPerimeter() {
        assertEquals(10, getPerimeter(2,3));
        assertEquals(13, getPerimeter(2.5,4));
        assertEquals(0, getPerimeter(0,0));
    }

    @Tabulka
    public void testGetArea() {
        assertEquals(6, getArea(2, 3));
        assertEquals(10, getArea(2, 5));
    }
*/

    @Nested
    @DisplayName("Tests for my method")
    class MyMethodUseCases {
        @Test
        public void testGetPerimeter() {
            assertEquals(10, getPerimeter(2, 3));
            assertEquals(13, getPerimeter(2.5, 4));
        }

        @Test
        public void testGetArea() {
            assertEquals(6, getArea(2, 3));
            assertEquals(10, getArea(2.5, 4));
            assertEquals(5, getArea(1, 5));
        }
    }


}


