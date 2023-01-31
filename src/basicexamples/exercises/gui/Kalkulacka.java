package basicexamples.exercises.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// Kalkulacka bude pocitac 2 cisla po zatlaceni rovna sa (=). Samozrejme medzi cislami zadame spravny operator ako napr. + - * /

//TODO Doplnit tlacidla s jednotlivymi cislami a matematickymi operatormi * /
//TODO Doplnit matematicke operacie ako je nasobenie a delenie, ktore aj logicky vypocita a vysledok zobrazi na displeji kalkulacky
public class Kalkulacka {

    private static String operacia = "";
    private static double cislo1;
    private static boolean jeVysledok = false;
    private static String znamienko;

    public static void main(String[] args) {
        /*
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception ignored) {

         */

        JFrame okno = new JFrame("Hello World Swing"); // vytvorime okno
        okno.setMinimumSize(new Dimension(400, 300)); // nastavili sme oknu minimalne rozmery
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (cize vo okno) tak sa zatvori standardne

        // JFrame, resp. okno by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel(); // vytvorime objekt panel

        // layout pre panel bude null, cize prazdny, to znamena, ze pre kazdy vlozeny vizualny prvok /jLabel, jText, jButton/ je potrebne
        // nastavit presnu poziciu umiestnenia cez setBounds
        panel.setLayout(null);
        okno.setContentPane(panel); // my dany panel pridame do okno


        // JText
        JTextField textovePoleDisplejKalkulacky = new JTextField(); // vytvorili sme textove pole
        textovePoleDisplejKalkulacky.setBounds(100, 20, 200, 30); // nastavili sme jeho poziciu x, y     a     sirku, vysku
        textovePoleDisplejKalkulacky.setHorizontalAlignment(JTextField.RIGHT); // kurzor v displeji sme umiestnili vpravo
        panel.add(textovePoleDisplejKalkulacky); // umiestnili sme ho do panela


        JButton tlacidloC = new JButton("C"); // tlacidlo
        tlacidloC.setBounds(100, 100, 100, 20); // x, y, sirka, vyska

        tlacidloC.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                textovePoleDisplejKalkulacky.setText(""); // po stlaceni klavesy C vymaze textovePoleDisplejKalkulacky a zobrazi 0
            }
        });
        panel.add(tlacidloC);


        JButton tlacidlo1 = new JButton("1"); // tlacidlo
        tlacidlo1.setBounds(100, 150, 60, 20); // x, y, sirka, vyska

        tlacidlo1.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                // do pola displeja kalkulacky vpiseme hodnotu 1, ale predtym musime k nej pridat (scitat) aktualnu hodnotu,
                // ktora je zobrazena na displeji, cize textovePoleDisplejKalkulacky.getText()
                if (jeVysledok) { // pytame sa priamo ci premenna jeVysledok obsahuje true
                    textovePoleDisplejKalkulacky.setText(""); // ak true, tak vymazeme obsah displeja kalkulacky
                    jeVysledok = false; // a nasledne nastavime jeVysledok na false, aby pri dalsom tlacidle 1 az 0 nam displej nevymazal
                }
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "1");
            }
        });
        panel.add(tlacidlo1);


        JButton tlacidlo2 = new JButton("2"); // tlacidlo
        tlacidlo2.setBounds(180, 150, 60, 20); // x, y, sirka, vyska

        tlacidlo2.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                //textovePoleDisplejKalkulacky.setText(""); // "" reprezentuju prazdny retazec
                // do pola displeja kalkulacky vpiseme hodnotu 2, ale predtym musime k nej pridat (scitat) aktualnu hodnotu,
                // ktora je zobrazena na displeji, cize textovePoleDisplejKalkulacky.getText()
                if (jeVysledok) {
                    textovePoleDisplejKalkulacky.setText("");
                    jeVysledok = false;
                }
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "2");
            }
        });
        panel.add(tlacidlo2);


        
        // -START-  Tlacidlo pre scitanie
        JButton tlacidloPlus = new JButton("+"); // tlacidlo
        tlacidloPlus.setBounds(260, 150, 60, 20); // x, y, sirka, vyska

        tlacidloPlus.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "+");
                znamienko = "+";
            }
        });
        panel.add(tlacidloPlus);
        // -KONIEC-  Tlacidlo pre scitanie     


        
        
        // -START-  Tlacidlo pre odcitanie
        JButton tlacidloMinus = new JButton("-"); // tlacidlo
        tlacidloMinus.setBounds(260, 180, 60, 20); // x, y, sirka, vyska

        tlacidloMinus.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                textovePoleDisplejKalkulacky.setText(textovePoleDisplejKalkulacky.getText() + "-");
                znamienko = "-";
            }
        });
        panel.add(tlacidloMinus);
        // -KONIEC-  Tlacidlo pre odcitanie
        
        
        

        JButton tlacidloRovnasa = new JButton("="); // tlacidlo
        tlacidloRovnasa.setBounds(260, 210, 60, 20); // x, y, sirka, vyska

        tlacidloRovnasa.addActionListener(new ActionListener() { // sluzi na "odchytenie" cize spracovanie zatlacenia tlacidla
            public void actionPerformed(ActionEvent e) {
                String obsahDisplejaKalkulacky = textovePoleDisplejKalkulacky.getText();
                // dalsia logika bude taka, ze premennu obsahDisplejaLKalkulacky rozdelime
                
                String [] castiStringu = null;
                if (znamienko.equals("+")) castiStringu = obsahDisplejaKalkulacky.split("\\+"); // rozdeli obsahDisplejaKalkulacky
                else if (znamienko.equals("-")) castiStringu = obsahDisplejaKalkulacky.split("\\-"); // rozdeli obsahDisplejaKalkulacky
                
                double cislo1 = Double.parseDouble(castiStringu[0]); // prve cislo pred znamienkom, teda nalavo
                double cislo2 = Double.parseDouble(castiStringu[1]); // druhe cislo za znamienkom, teda napravo

                double vysledok = 0;
                if (znamienko.equals("+")) {
                    vysledok = cislo1 + cislo2;
                    // viac prikazov, pretoze sme pouzili blok, cize {}
                }
                else if (znamienko.equals("-")) {
                    vysledok = cislo1 - cislo2;
                    // viac prikazov, pretoze sme pouzili blok, cize {}
                }
                
                // premenna vysledok je dostupna aj v tejto casti kodu

                jeVysledok = true; // ak som nieco vypocital, tak som nasledne naplnil premennu jeVysledok=true, aby som ju mohol neskor otestovat

                textovePoleDisplejKalkulacky.setText(String.valueOf(vysledok));
                //textovePoleDisplejKalkulacky.setText(cislo1 + cislo2);

                System.out.println(obsahDisplejaKalkulacky);
                System.out.println(cislo1);
                System.out.println(cislo2);
                System.out.println(vysledok);

            }
        });
        panel.add(tlacidloRovnasa);



        // display it
        okno.pack();
        okno.setVisible(true);

    }
}
