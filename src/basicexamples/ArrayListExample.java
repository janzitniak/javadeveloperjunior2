package basicexamples;

import java.util.ArrayList;
import java.util.Collections;


// ArrayListExample bude sluzit na pridavanie lubovolneho poctu knih a ich vypis
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> poleKnih = new ArrayList<String>(); // vytvorili sme dynamicke pole s nazvom poleKnih

        String kniha1 = "Hobbit";
        String kniha2 = "Portrét Doriana Greya";
        String kniha3 = "Motýľ";
        String kniha4 = "Učebnica jazyka Java. Pavol Herout";

        poleKnih.add(kniha1);
        poleKnih.add(kniha2);
        poleKnih.add(kniha3);
        poleKnih.add(kniha4);
        poleKnih.add("Já, robot. Isaac Asimov");

        poleKnih.set(4, "Já, človek. Ján Žitniak"); // zmením 5-knihu (čiže index = 4) na inú

        poleKnih.remove(2); // odstranenie poleKnih s indexom 2
        poleKnih.remove(0); // odstranenie poleKnih s indexom 0

        Collections.sort(poleKnih); // zoradime ArrayList poleKnih od A po Z

        // vypiseme knihu v poradi prvu, cize s indexom 0
        System.out.println("Prvá kniha v zozname");
        System.out.println("--------------------");
        System.out.println(poleKnih.get(0));

        // vypiseme poslednu knihu v dynamickom poli
        System.out.println("\nPosledná kniha v zozname");
        System.out.println("--------------------");

        int indexPoslednejKnihy = poleKnih.size() - 1;
        System.out.println( poleKnih.get(indexPoslednejKnihy) );
        // poleKnih.lastIndexOf();

        System.out.println("\n\nVšetky vypísané poleKnih");
        System.out.println("---------------------");

        // prechadzame vsetkymi prvkami dynamickeho pola poleKnih
        for (int i = 0; i < poleKnih.size(); i++) {
            System.out.println(poleKnih.get(i) + "."); // pridal som zaroven bodku (.)
            //System.out.println(poleKnih);
        }

        System.out.println("\n\nVšetky vypísané poleKnih, SPOSOB c.2");
        System.out.println("---------------------");
        // prechadzame vsetkymi prvkami dynamickeho pola poleKnih, SPOSOB c.2, teda for-each
        for (String vystup:poleKnih) {
            System.out.println(vystup);
        }

        ArrayList<Integer> poleCisielNoh = new ArrayList<Integer>();

        Integer cisloNohy1 = 40;
        Integer cisloNohy2 = 41;
        Integer cisloNohy3 = 42;

        poleCisielNoh.add(cisloNohy1);
        poleCisielNoh.add(cisloNohy2);
        poleCisielNoh.add(cisloNohy3);

        System.out.println("\n\nVšetky vypísané čísla nohy");
        System.out.println("---------------------");
        // vypiseme vsetky cisla noh
        for (int i = 0; i < poleCisielNoh.size(); i++) {
            System.out.println("Zadané číslo nohy: " + poleCisielNoh.get(i));
        }

        System.out.println("\n\nVšetky vypísané čísla nohy, SPOSOB 2");
        System.out.println("---------------------");
        // vypiseme vsetky cisla noh, sposob c.2, teda for-each
        for (Integer vystup:poleCisielNoh) {
            System.out.println("Zadané číslo nohy: " + vystup);
        }


    }
}
