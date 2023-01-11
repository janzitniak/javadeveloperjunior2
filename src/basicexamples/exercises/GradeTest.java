package basicexamples.exercises;

import java.util.Scanner;

/*
Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad 90, tak vypíše známku A
        Ak je percento nad 75, tak vypíše známku B
        Ak je percento nad 65, tak vypíše známku C
        Použite metódu pre rozhodovanie.
*/


public class GradeTest {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in); // initialize console for input values by user
        System.out.println("Zadaj percento testu:");
        int percent = scn.nextInt(); // input value for percent is int


        // which if will be executed if percent is 78
        if (percent > 90) { // AltGr . >    AltGr ,  <
            System.out.println("Dostal si známku A");
        } else if (percent > 75) {
            System.out.println("Dostal si známku B");
        } else if (percent > 65) {
            System.out.println("Dostal si známku C");
        } else {
            System.out.println("Dostal si známku F. Nespravil si test.");
        }

        System.out.println("Koniec programu");
        System.out.println("Ján");

    }
}
