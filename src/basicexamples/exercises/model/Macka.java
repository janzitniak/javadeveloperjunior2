package basicexamples.exercises.model;

public class Macka implements Zviera {
    @Override
    public void vydavaZvuk() {
        System.out.println("Mňau mňau");
    }

    @Override
    public void bezi() {
        System.out.println("Beží rýchlo");
    }

    @Override
    public void zerie() {
        System.out.println("Žerie málo");
    }

    @Override
    public void parisa() {
        System.out.println("Často");
    }

    @Override
    public void jeCicavec() {
        System.out.println(cicavec);
    }
}
