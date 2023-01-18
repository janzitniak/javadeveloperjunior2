package basicexamples.exercises;

/*
Popis programu
        Program Circle bude od používateľa vyžadovať vstupnú hodnotu a to polomer kruhu, ktorý bude v centimetroch.
        Výsledkom bude obsah a obvod kruhu, ktorý vypíše používateľovi do “konzoly”. Program pôjde dovtedy, kým nezadáme hodnotu: -1.
        Hint:
        Vzorec na výpočet obsahu kruhu je nasledujúci:
        S = π.r²
        Vzorec na výpočet obvodu kruhu je:
        o = 2.π.r
        Bonusová úloha: vytvorte metódy z daných vzorcoch.
*/

import java.util.Scanner;

public class Circle {

    public static double getAreaOfCircle(double r) {
        double areaOfCircle = Math.PI * Math.pow(r, 2);
        return areaOfCircle;
    }

    public static double getCircumferenceOfCircle(double r) {
        double circumferenceOfCircle = 2 * Math.PI * r;
        return circumferenceOfCircle;
    }

    public static void printText(String str) {
        //System.out.println("*****************");
        System.out.println(str);
        System.out.println();
    }

    public static void main(String[] args) {
        double r, circumferenceOfCircle, areaOfCircle; // polomer, obvod, obsah

        Scanner scn = new Scanner(System.in); // inicializacia skeneru, potrebneho pre vstup

        while(true) {
            System.out.println("Zadaj polomer (r)");
            r = scn.nextDouble();
            if (r <= 0) { // Pri zadani 0 alebo zaporneho cisla, program sa ukonci. Poznamka: podmienky pri IF mozu vyzerat pri cislach nasledovne: ==   !=    >    <    >=    <=
                printText("Koniec");
                break; // ak polomer bude -1 tak ukonci cyklus s podmienkou, cize uz sa program nebude opakovat
            }
            areaOfCircle = getAreaOfCircle(r); // vypocet obsahu kruhu
            circumferenceOfCircle = getCircumferenceOfCircle(r); // obvod kruhu

            printText("Zadaný polomer: " + r);
            printText("Obsahu kruhu: " + areaOfCircle);
            printText("Obvod kruhu: " + circumferenceOfCircle);
        }
    }
}
