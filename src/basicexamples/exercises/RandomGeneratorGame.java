package basicexamples.exercises;

import java.util.Random;
import java.util.Scanner;
// Generator nahodnych cisiel od 1 do 10. Uzivatel hada cislo, ktore vymysli pocitac.
// Vytvorte program, kde Java vygeneruje náhodné číslo od 1 do 10.
// Používateľ musí uhádnuť číslo. Ak uhádne menšie, tak mu Java vypíše
// Neuhádol si, moje číslo je menšie,  analogicky Neuhádol si, moje číslo je
// väčšie a pri úspešnom uhádnutí BINGO! Uhádol si!
// Bonusová úloha:
// Ak si trúfate, doplňte algoritmus hádania dovtedy, kým neuhádne.
public class RandomGeneratorGame {
    public static void main(String[] args) {

        //START Generator nahodnych cisiel od min do max
/*        int min = 100;
        int max = 110;
        int range = (max - min) + 1;
        int randomValue = (int) (Math.random()*range+min);*/

/*        double min = 1;
        double max = 10;
        double randomValue = Math.random() * max;
        System.out.println(randomValue);*/

        //START  Vygeneruj cislo od 1 do 10
        int min = 1;
        int max = 10;
        int range = (max - min) + 1;
        Random randomObject = new Random();
        int randomValue = randomObject.nextInt(range) + min; // vygeneruje cislo od 1 do 10 ako int
        //END Generator nahodnych cisiel od min do max

        System.out.println("Ahoj, ja som umelá inteligencia :), myslím si číslo od 1 do 10. Skús ho uhádnuť!");
        System.out.println("Toto je náhodne vygenerované číslo " + randomValue);

        int inputUserNumber = 0;
        // START cyklus s podmienkou je prikaz while(podmienka kym nie je splnena) { dalsie prikazy }
        while(inputUserNumber != randomValue) {
            System.out.println("Zadaj číslo");

            Scanner objectScanner = new Scanner(System.in); // Trieda Scanner sluzi na inicializaciu uzivatelskeho vstupu, System.in priamo na vstup z konzoly (okna Run)
            inputUserNumber = objectScanner.nextInt(); // Priamy uzivatelsky vstup, vyzaduje cele cislo

            if (inputUserNumber > randomValue) {
                System.out.println("Neuhádol si. Moje číslo je menšie.");
            } else if (inputUserNumber < randomValue) {
                System.out.println("Neuhádol si. Moje číslo je väčšie.");
            } else {
                System.out.println("Bingo! Uhádol si!");
            }
        }
        // END cyklus s podmienkou
    }
}
