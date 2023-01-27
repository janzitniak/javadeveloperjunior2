package basicexamples.exercises;

import basicexamples.exercises.model.Zamestnanec;

public class ZamestnanciEvidencia {
    public static void main(String[] args) {
        Zamestnanec zamestnanec1 = new Zamestnanec();
        zamestnanec1.setMeno("Ján");
        zamestnanec1.setPriezvisko("Žitniak");
        zamestnanec1.setPohlavie('m'); // AltGr + p
        zamestnanec1.setRokNarodenia(2000);

        System.out.println("Pohlavie 1.zamestnanca je cez gettery: " + zamestnanec1.getPohlavie());
        System.out.println("\nVšetky údaje 1.zamestnanca cez toString()");
        System.out.println(zamestnanec1);


        Zamestnanec zamestnanec2 = new Zamestnanec("Ivan", "Mrkvička", 'm', 2005); // vytvorenie objektu priamym naplnenim, pretoze obsah dany konstruktor
        System.out.println("\nVšetky údaje 2.zamestnanca cez gettery");
        System.out.println("Meno " + zamestnanec2.getMeno());
        System.out.println("Priezvisko " + zamestnanec2.getPriezvisko());
        System.out.println("Pohlavie " + zamestnanec2.getPohlavie());
        System.out.println("Rok narodenia " + zamestnanec2.getRokNarodenia());

        System.out.println("\nVšetky údaje 2.zamestnanca cez toString()");
        System.out.println(zamestnanec2);

        Zamestnanec zamestnanec3 = new Zamestnanec("Eva", "Pekná", 2001);
        System.out.println("\nVšetky údaje 3.zamestnanca cez toString()");
        System.out.println(zamestnanec3);

        Zamestnanec zamestnanec4 = new Zamestnanec("Zuzana", "Vysoká", 1980);
        System.out.println("\nVšetky údaje 4.zamestnanca cez toString()");
        System.out.println(zamestnanec4);

        Zamestnanec zamestnanec5 = new Zamestnanec(null, null, 'i',0);
        System.out.println("\nVšetky údaje 5.zamestnanca cez toString()");
        System.out.println(zamestnanec5);



    }
}
