package basicexamples.exercises.model;

public class Prasa implements Zviera, SuperZviera {
    @Override
    public void vydavaZvuk() {
        System.out.println("kvik kvik");
    }

    @Override
    public void bezi() {
        System.out.println("bezi pomaly");
    }

    @Override
    public void zerie() {
        System.out.println("zerie vela");
    }

    @Override
    public void parisa() {
        System.out.println("nemá šancu, je samo :-)");
    }

    @Override
    public void jeCicavec() {
        System.out.println(cicavec);
    }

    public void nastavJatocnuHmotnost() {
        System.out.println("Nastavil som mu jatocnu hmotnost");
    }

    @Override
    public void plava() {
        System.out.println("plava");
    }
}
