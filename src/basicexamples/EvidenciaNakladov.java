package sk.tmconsulting;

import sk.tmconsulting.model.NakladyStruktura;
import sk.tmconsulting.model.NakladyUtility;
import sk.tmconsulting.model.Obdobie;

import java.util.ArrayList;
import java.util.Scanner;

/*
Vytvorte aplikáciu na evidenciu nákladov v domácnosti. Využitie zapúzdrenia (encapsulation) a objektového programovania v Jave.

        Čo by mohla obsahovať informácie o nákladovej položke?
        Popis nákladu (čo), kategória, kto zadal, cena, dátum (aktuálny dátum).

        Menu s možnosťami
        1. Zadaj novú nákladovú položku *
        2. Zobraz všetky nákladové položky *
        3. Spočítaj sumu nákladov *
        4. Vyhľadaj náklad podľa názvu
        9. Koniec aplikácie *
        * povinná funkcionalita

        Dodatočná úloha: Vyhľadaj náklady podľa dátumu od, do a zároveň by sčítalo výšku nákladov.
*/
public class EvidenciaNakladov {
    public static void main(String[] args) {

        //ArrayList<NakladyStruktura> zoznamNakladov = new ArrayList<NakladyStruktura>(); // vytvorili sme PRAZDNE dynamicke pole

        //NakladyUtility testovacieNakladyObjekt = new NakladyUtility(); // vytvorili sme objekt NakladyUtility
        ArrayList<NakladyStruktura> zoznamNakladov = NakladyUtility.naplnTestovacimiUdajmi();
        //ArrayList<NakladyStruktura> zoznamNakladov = new ArrayList<NakladyStruktura>(); // prazdny ArrayList

        while(true) { // tu zacina cyklus while

            NakladyUtility.zobrazMenu(); // zobrazi menu, ktore sa nachadza NakladyUtility


            Scanner scn = new Scanner(System.in); // inicializacia konzoly, teda Run dialogu v Intellij IDEA
            int cisloMenu = scn.nextInt(); // priamy vstup od pouzivatela, vyzaduje cislo, t.j. prikaz nextInt()

            // ak pouzivame prikaz if, tak je to obycajne 3-kombinacia if, else if, else
            if (cisloMenu == 1) {
                // Ak zadame 1, tak aplikacia zobrazi otazky ohladom zadania konkretnych udajov: popis, cena, mesiac
                Scanner scn2 = new Scanner(System.in); // inicializacia konzoly pre menu cislo 1

                NakladyUtility.vypisText("Zadaj popis nákladu");
                String popis = scn2.nextLine();

                NakladyUtility.vypisText("Zadaj cenu");
                //double cena = Double.parseDouble(scn2.nextLine()); // cenu sice precitame ako text, ale nasledne prekonvertuje cez Double.parseDouble na double
                double cena = scn2.nextDouble(); // toto sposobi v dalsom prikaze nextXXX, ze nebude ocakavat vstup od pouzivatela
                scn2.nextLine(); // opravuje chybu pre dalsi vstup, ktory uz nebude prazdny, resp. funkcny ako ma byt = cize ocakava od pouzivatela vsstupnu hodnotu

                System.out.println("Zadaj deň záznamu");
                int den = Integer.parseInt(scn2.nextLine());

                System.out.println("Zadaj mesiac záznamu");
                int mesiac = scn2.nextInt();

                System.out.println("Zadaj rok záznamu");
                int rok = scn2.nextInt();

                NakladyStruktura nakladyStruktura = new NakladyStruktura(); // vytvorili sme prazdny objekt, teda instanciu triedy NakladyStruktura
                nakladyStruktura.setPopis(popis);
                nakladyStruktura.setCena(cena);

                Obdobie obdobie = new Obdobie(); // vytvarame objekt obdobie
                obdobie.setDen(den);
                obdobie.setMesiac(mesiac);
                obdobie.setRok(rok);

                nakladyStruktura.setObdobie(obdobie); // naplnime objekt nakladyStruktura objektom obdobie, ktore je uz naplnene cez settery

                // v tomto momente je naplneny objekt nakladyStruktura
                zoznamNakladov.add(nakladyStruktura); // pridanie premennej nakladyStruktura do ArrayListu, teda zoznamu
            } else if (cisloMenu == 2) {
                for(NakladyStruktura vystup:zoznamNakladov) {
                    System.out.println(vystup);
/*                    System.out.println("Popis: " + vystup.getPopis());
                    System.out.println("Cena: " + vystup.getCena());
                    System.out.println("Deň: " + vystup.getObdobie().getDen());
                    System.out.println("Mesiac: " + vystup.getObdobie().getMesiac());
                    System.out.println("Rok: " + vystup.getObdobie().getRok());*/
                }
            } else if (cisloMenu == 3) {
                double sum = 0;
                for(NakladyStruktura vystup:zoznamNakladov) {
                    //System.out.println(vystup.getCena());
                    //sum = sum + vystup.getCena();
                    sum += vystup.getCena(); // identicka logika ako riadok vyssie
                }
                System.out.println("Výsledný súčet všetkých nákladov je: " + sum);
            } else if (cisloMenu == 4) {
                System.out.println("Počet záznamov: ");
                System.out.println(zoznamNakladov.size());
                System.out.println(NakladyUtility.pocetZaznamov(zoznamNakladov));
            } else if (cisloMenu == 9) {
                // logika pre menu cislo 9
            } else {
                // logika ak nezvolime ziadnu moznost z menu
            }


        } // tu konci cyklus while


    }
}
