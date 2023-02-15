package basicexamples.exercises;

import basicexamples.exercises.model.Vozidlo;

public class ZnackaVozidla extends Vozidlo {
    public static void main(String[] args) {
        ZnackaVozidla znackaVozidlaObjekt = new ZnackaVozidla();
        znackaVozidlaObjekt.trubi();
        System.out.println("Implicitná farba vozidla je: " + znackaVozidlaObjekt.farba);
    }
}
