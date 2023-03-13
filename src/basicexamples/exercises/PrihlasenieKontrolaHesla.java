package basicexamples.exercises;

import basicexamples.exercises.model.Prihlasenie;

public class PrihlasenieKontrolaHesla {

    public static void main(String[] args) {
        String login = "jan.zitniak";
        String heslo = "mojeheslo";

        Prihlasenie prihlasenieObjekt = new Prihlasenie();
        prihlasenieObjekt.setLogin(login); // nastavenie (ulozenie) login-u do prihlasenieObjekt
        prihlasenieObjekt.setHeslo(heslo); // nastavenie (ulozenie so zasifrovanim) hesla do prihlasenieObjekt

        System.out.println("Zašifrované a hneď aj dešifrované heslo je: " + prihlasenieObjekt.getHeslo());

        prihlasenieObjekt.setHesloBezDesifrovania(heslo);
        System.out.println("Vypíš heslo bez dešifrovania: " + prihlasenieObjekt.getHesloBezDesifrovania());

        // prihlasenieObjekt.heslo = heslo;
        // System.out.println("Priamy pristup k heslu: " + prihlasenieObjekt.heslo);

    }
}
