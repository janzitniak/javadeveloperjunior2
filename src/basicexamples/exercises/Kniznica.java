package basicexamples.exercises;

import basicexamples.exercises.model.Kniha;
import basicexamples.exercises.model.KnihaSpravne;

import java.util.ArrayList;

public class Kniznica {
    public static void main(String[] args) {


        Kniha kniha1 = new Kniha(); // vytvorili sme premennu kniha1 = (instancia alebo objekt) pomocou triedy Kniha
        Kniha kniha2 = new Kniha(); // vytvorili sme dalsiu knihu s nazvom kniha2

        // Toto je nespravny pristup k premenným, teda fields, nemalo by sa pouzivat!!!
        kniha1.nazov = "Já, robot";
        kniha1.autor = "Isaac Asimov";
        kniha1.rok = 1965;
        kniha1.cena = 12.50;
        kniha1.obsah = "Kniha ohľadom 3 zákonov robotiky";
        kniha1.pocetStran = 230;
        kniha1.zaner = "SCI-FI";


        System.out.println("Názov knihy: " + kniha1.nazov);
        System.out.println("Autor: " + kniha1.autor);
        System.out.println("Rok vydania: " + kniha1.rok);
        System.out.println("Cena: " + kniha1.cena);
        System.out.println("Obsah: " + kniha1.obsah);
        System.out.println("Počet strán: " + kniha1.pocetStran);
        System.out.println("Žáner: " + kniha1.zaner);

        // Toto je nespravny pristup k premenným, teda fields, nemalo by sa pouzivat!!!
        kniha2.nazov = "Duna";
        kniha2.autor = "Frank Herbert";
        kniha2.rok = 1970;
        kniha2.zaner = "SCI-FI";

        System.out.println("\n\nNázov knihy: " + kniha2.nazov);
        System.out.println("Autor: " + kniha2.autor);
        System.out.println("Rok vydania: " + kniha2.rok);
        System.out.println("Cena: " + kniha2.cena);
        System.out.println("Obsah: " + kniha2.obsah);
        System.out.println("Počet strán: " + kniha2.pocetStran);
        System.out.println("Žáner: " + kniha2.zaner);


        // Toto je SPRAVNY pristup
        KnihaSpravne knihaSpravne1 = new KnihaSpravne();
        knihaSpravne1.setNazov("Motýľ");
        knihaSpravne1.setAutor("Anna Schonn");
        knihaSpravne1.setZaner("Ženský román");

        System.out.println("\n\nVypisanie knihy tak, ako by sa mala spravne vypisovať.");
        System.out.println("Názov knihy: " + knihaSpravne1.getNazov());
        System.out.println("Autor knihy: " + knihaSpravne1.getAutor());
        System.out.println("Žáner: " + knihaSpravne1.getZaner());

        KnihaSpravne knihaSpravne2 = new KnihaSpravne();
        knihaSpravne2.setNazov("Ako správne žiť");
        knihaSpravne2.setAutor("James Holiday");

        // Vytvorenie zoznamu knih cez dynamicke pole (ArrayList)
        ArrayList<KnihaSpravne> zoznamKnihSpravne = new ArrayList<KnihaSpravne>(); // vytvorenie dynamickeho pola zoznamKnihSpravne
        zoznamKnihSpravne.add(knihaSpravne1); // naplnenie premennej zoznamKnihSpravne prvou knihou
        zoznamKnihSpravne.add(knihaSpravne2); // naplnenie premennej zoznamKnihSpravne druhou knihou


        // vypisanie niekolkych udajov zo dynamickeho pola zoznamKnihSpravne
        System.out.println("\n\nVýpis knih z dynamického poľa zoznamKnihSpravne");
        for(KnihaSpravne vystup:zoznamKnihSpravne) {
            System.out.println("Názov knihy je: " + vystup.getNazov());
            System.out.println("Autor knihy: " + vystup.getAutor());
            System.out.println("Žáner: " + vystup.getZaner());
        }

/*        System.out.println("Nejaký text");
        System.out.println("\n\nNejaký text 2");
        System.out.println("Nejaký text 3");*/
    }
}
