package basicexamples.exercises.model;

import java.util.Base64;

public class Prihlasenie {
    private String login;
    private String heslo;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHeslo() {
        Base64.Decoder dec = Base64.getDecoder(); // na desifrovanie pouzijeme sifru Base64
        String decodedPassword = new String(dec.decode(this.heslo));  // a jej metodu decode
        return decodedPassword; // desifrovane heslo vratime
    }

    /**
     * Nastaví heslo zašifrované prostredníctvom stavaného algoritmu Base64 z balíčka (package) java.util
     * Viac o šifre sa môžete dozvedieť na adrese <a href="https://cs.wikipedia.org/wiki/Base64">Base64 na Wikipédii</a>.
     * Argumentom je heslo (typu String), ktoré sa zašifruje.
     * <p>
     * Metóda nevracia žiadnu hodnotu
     *
     * @param heslo je text, ktorý sa bude šifrovať
     * @return nevracia nič
     */
    public void setHeslo(String heslo) {
        Base64.Encoder enc = Base64.getEncoder(); // na zasifrovanie pouzijeme sifru Base64
        String encodedPassword = enc.encodeToString(heslo.getBytes()); // a jej metodu encodeToString
        this.heslo = encodedPassword; // zasifrovane heslo ulozime do premennej password tejto triedy (teda triedy Prihlasenie)
    }

    public void setHesloBezDesifrovania(String heslo) {
        this.heslo = heslo;
    }

    public String getHesloBezDesifrovania() {
        return this.heslo;
    }
}
