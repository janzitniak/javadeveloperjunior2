package basicexamples.exercises;

import basicexamples.exercises.model.Macka;
import basicexamples.exercises.model.Prasa;

public class DomaceZvierata {
    public static void main(String[] args) {
        Prasa prasaObjekt = new Prasa(); // vytvorime objekt Prasa
        prasaObjekt.vydavaZvuk();
        prasaObjekt.jeCicavec();
        prasaObjekt.plava();

        Macka mackaObjekt = new Macka();
        mackaObjekt.vydavaZvuk();
        mackaObjekt.jeCicavec();
    }
}
