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

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        System.out.println("Zadaj známku slovne, máš na výber: výborný, chválitebný, dobrý, dostatočný, nedostatočný");
        Scanner scn = new Scanner(System.in); // initialization of console, inicializacia konzoly
        // int  znamka  = scn.nextInt(); // toto by nepreslo, alebo nedava zmysel, lebo chceme text
        String gradeAsText = scn.nextLine(); // od pouzivatela program caka napisat text (textovu znamku) a tu ulozime do gradeAsText

        System.out.println("Napísal si známku " + gradeAsText);

        if (gradeAsText.equals("výborný"))
            System.out.println("1");
        else if (gradeAsText.equals("chválitebný"))
            System.out.println("2");
        else if (gradeAsText.equals("dobrý"))
            System.out.println("3");
        else if (gradeAsText.equals("dostatočný"))
            System.out.println("4");
        else if (gradeAsText.equals("nedostatočný"))
            System.out.println("5");
        else
            System.out.println("Nezadal si slovnú známku správne!");


    }
}
