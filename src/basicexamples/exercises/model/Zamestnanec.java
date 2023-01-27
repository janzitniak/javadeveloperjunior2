package basicexamples.exercises.model;

public class Zamestnanec {
    private String meno;
    private String priezvisko;
    private char pohlavie;
    private int rokNarodenia;

    // prazdny konstruktor
    public Zamestnanec() {
    }

    public Zamestnanec(String meno, String priezvisko, int rokNarodenia) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.rokNarodenia = rokNarodenia;
    }

    // konstruktor
    public Zamestnanec(String meno, String priezvisko, char pohlavie, int rokNarodenia) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.pohlavie = pohlavie;
        this.rokNarodenia = rokNarodenia;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public char getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(char pohlavie) {
        this.pohlavie = pohlavie;
    }

    // TODO Upravit toString aby vypisal údaje o zamestnancovi pod sebou v tvare Meno: Priezvisko: Pohlavie: RokNarodenia:
    @Override
    public String toString() {
        return "Údaje zamestnanca: \n\tMeno: " + meno + "\n\tPriezvisko: " + priezvisko + "\n\tpohlavie: " + pohlavie + "\n\trokNarodenia: " + rokNarodenia;
    }

    public int getRokNarodenia() {
        return rokNarodenia;
    }

    public void setRokNarodenia(int rokNarodenia) {
        this.rokNarodenia = rokNarodenia;
    }


}
