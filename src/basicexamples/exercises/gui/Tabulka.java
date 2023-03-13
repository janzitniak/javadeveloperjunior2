package basicexamples.exercises.gui;

import basicexamples.exercises.model.KnihaSpravne;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.util.ArrayList;

public class Tabulka {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Zoznam kníh"); // vytvorime okno
        frame.setMinimumSize(new Dimension(400, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (cize vo frame) tak sa zatvori standardne


        frame.setLocationRelativeTo(null); // vycentrovanie okna


        // JFrame by mal obsahovat panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, cize prazdny
        frame.setContentPane(panel); // my dany panel pridame do frame

        int stlpcov = 2;
        DefaultTableModel tableModel = new DefaultTableModel(0,2);
        JTable table = new JTable(tableModel);


        KnihaSpravne kniha1 = new KnihaSpravne();
        kniha1.setNazov("Já, robot");
        kniha1.setAutor("Isaac Asimov");

        KnihaSpravne kniha2 = new KnihaSpravne();
        kniha2.setNazov("Duna");
        kniha2.setAutor("Frank Patrick Herbert");

        ArrayList<KnihaSpravne> knihy = new ArrayList<KnihaSpravne>();
        knihy.add(kniha1);
        knihy.add(kniha2);

        // Data to be displayed in the JTable
        for(KnihaSpravne kniha: knihy) {
            Object[] data = {kniha.getAutor(), kniha.getNazov()};
            tableModel.addRow(data);
        }

        // zmena hlavicky v tabulke
        JTableHeader th = table.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();

        tcm.getColumn(0).setHeaderValue( "Autor" );
        tcm.getColumn(1).setHeaderValue( "Názov knihy" );
        th.repaint(); // a prekreslenie tabulky, aby zmenu hlavicky prekre

        KnihaSpravne kniha3 = new KnihaSpravne();
        kniha3.setNazov("Programovanie v Jave");
        kniha3.setAutor("Ján Žitniak");

        Object[] data = {kniha3.getAutor(), kniha3.getNazov()};
        tableModel.addRow(data);




        // Initializing the JTable

        table.changeSelection(0, 0, false, false); // nastavi prvý riadok ako default, prve cislo je riadok

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(0, 100, 400, 100);
        panel.add(sp);


        // display it
        frame.pack();
        frame.setVisible(true);

    }
}
