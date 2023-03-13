package basicexamples.exercises.model;

import java.io.Serializable;

public class KnihaSpravne implements Serializable {
    // fields, cize premenne triedy
    // private static final long serialVersionUID = 1L; // odporuca sa pouzivat, Intellij IDEA si serialVersionUID generuje sam, moze vsak nastat konflikt
    private String obsah;
    private String zaner;
    private String nazov;
    private String autor;
    private int pocetStran;
    private double cena;
    private int rok;

    public String getZaner() {
        return zaner;
    }

    public void setZaner(String zaner) {
        this.zaner = zaner;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }
// getters, setters


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public String getObsah() {
        // logika, ktora nejakym sposobom moze ovplyvnit "vydanie" alebo "navrat" hodnoty, cize return hodnoty
        return obsah;
    }

    public void setObsah(String obsah) {
        this.obsah = obsah; // this vlastne je "nazov triedy", cize v tomto pripade KnihaSpravne
    }



}
