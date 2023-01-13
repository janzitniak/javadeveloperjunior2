package basicexamples.exercises;

/*
Vytvorte program, ktorý na základe textového zadania známky, napr. výborný, chválitebný, dobrý, dostatočný, nedostatočný vypíše zodpovedajúcu známku.
        Hint: Porovnanie textov sa cez IF robí ináč ako porovnanie s číslom. Nemôžeme použiť.equals(
        Hint č. 2: Namiesto IF môžeme použiť SWITCH, CASE.
        Bonusová úloha: Program pôjde do “nekonečna”, kým nezadáme príkaz: koniec
        Bonusová úloha č. 2: Skúsme “ošetriť” používateľský vstup tak, aby reagoval na vstup text bez ohľadu na diakritiku.

Popis programu.
Ako bude program fungovať z pohľadu používateľa: Program ho vyzve otázkou: “Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný). Program bude od používateľa čakať textovú odpoveď v “konzole”. Odpoveď bude alikvótna číselná známka, ktorú program vypíše.
Program bude ďalej pokračovať vypísaním otázky na zadanie slovnej známky, kým používateľ nepreruší program zadaním slova: koniec
Program po zadaní koniec ukončí svoju činnosť a nevypíše nič.


*/

import java.text.Normalizer;
import java.util.Scanner;

public class GradeConverterSwitchCase {

    public static String stripAccents(String s)
    {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }

    public static void main(String[] args) {

        String gradeAsText = "";
        Scanner scn = new Scanner(System.in); // initialization of console, inicializacia konzoly
        // Štart cyklu
        while (!gradeAsText.equals("koniec")) { // while(true) reprezentuje nekonecny cyklus, kym niekde nenapiseme prikaz break
            System.out.println("\nZadaj známku slovne, máš na výber: výborný, chválitebný, dobrý, dostatočný, nedostatočný");
            System.out.println("Ukončenie programu, zadaj slovo: koniec");

            // int  znamka  = scn.nextInt(); // toto by nepreslo, alebo nedava zmysel, lebo chceme text
            gradeAsText = scn.nextLine(); // od pouzivatela program caka napisat text (textovu znamku) a tu ulozime do gradeAsText
            System.out.println("Vstupný text známky od používateľa bol nasledujúci: " + gradeAsText); // gradeAsText obsahuje povodny text bez zmien

            // my sa musime nejakym sposobom zbavit diakritiky v premennej gradeAsText
            // to znamena, ze premenna gradeAsText nebude obsahovat dlzne ani makcene a preto mozem zmenit IF na nieco taketo
            gradeAsText = stripAccents(gradeAsText); // tu uz skutocne zmenime obsah premennej gradeAsText tak, ze bude bez diakritiky
            gradeAsText = gradeAsText.toLowerCase(); // tu uz zmenime text na male pismena
            gradeAsText = gradeAsText.trim(); // odstranime medzery na zaciatku a na konci textu v premennej gradeAsText a vratime spat do premennej gradeAsText
            System.out.println("Napísaný text už bez diakritiky je: " + gradeAsText);

            // Vypiseme cislo znamky ak nie je zadany text koniec
            if (!gradeAsText.equals("koniec")) System.out.print("Výsledná známka po konverzii z textového zadania je: ");

            switch (gradeAsText) {
                case "vyborny":
                    System.out.println("1");
                    break;
                case "chvalitebny":
                    System.out.println("2");
                    break;
                case "dobry":
                    System.out.println("3");
                    break;
                case "dostatocny":
                    System.out.println("1");
                    break;
                case "nedostatocny":
                    System.out.println("2");
                    break;
                default:
                    break;
            }

        }
        // Koniec cyklu

    }
}
