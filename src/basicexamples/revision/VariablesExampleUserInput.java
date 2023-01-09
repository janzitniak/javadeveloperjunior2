package basicexamples.revision;

/*
 Trieda vypíše nasledujúci text do konzoly, pričom hodnoty ako dátum, známka, rok a aktuálny dátum môže použivateľ meniť cez premenné.
 Text bude vyzerať nasledovne:
 Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
 V Bratislave dňa 18.06.2022
 */

import javax.sound.midi.SysexMessage;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class VariablesExampleUserInput {
    public static void main(String[] args) {
        String text1 = "Študent Jozef Mrkvička sa narodil ";
        String date = "";
        String text2 = ", z maturitnej skúšky má známku ";
        float grade = 0f; //TODO Print grade with comma
        //grade = grade + 0.5f; // Increasing grade to +0.5, also this is same: grade += 0.5f;

        String gradeWithComma = String.format("%.1f",grade); // Reformat grade to slovak format
        String text3 = " a od septembra ";
        int year = 0;
        String text4 = " nastúpi do nového zamestnania ako Java programátor.\n";
        String text5 = "\tV Bratislave dňa ";

        Scanner scn = new Scanner(System.in);
        System.out.println("Zadaj dátum: ");
        date = scn.nextLine();

        System.out.println("Zadaj známku: ");
        grade = scn.nextFloat();
        gradeWithComma = String.format("%.1f",grade);

        System.out.println("Zadaj rok: ");
        year = scn.nextInt();


        scn.close(); // At finnish we close the Scanner

        // Generate current date and reformat to Slovak one. Several steps how to do it:
        // STEP 1: for formatting Date and getting current date.
        /*
        Locale locale = new Locale("sk", "SR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String formattedCurrentDate = dateFormat.format(new Date());
        */

        // STEP 2:
        //String formattedCurrentDate = DateTimeFormatter.ofPattern("dd.MMM.yyyy").format(LocalDate.now());

        // STEP 3:
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy"); // Date format
        Date currentDate = new Date();// Get current Date and Time
        String formattedCurrentDate = dateFormat.format(currentDate); // Change currentDate*/

        String wholeText = text1 + date + text2 + gradeWithComma + text3 + year + text4 + text5 + formattedCurrentDate;
        System.out.printf(wholeText);

        System.out.println(); // Vloží nový riadok

        //TODO Ak má známku do 1,5 vrátane, tak vypíšem JE PRIJATÝ
        //TODO Ak má známku od 1,5 do 3 vrátane, tak vypíšem MOŽNO BUDE PRIJATÝ
        //TODO Ak má horšiu známku ako 3, tak vypíšem NIE JE PRIJATÝ
        if (grade <= 1.5f) {
            System.out.println("JE PRIJATÝ");
            System.out.println("SUPER!");
        } else if (grade > 1.5f && grade <=3f ) {
            System.out.println("MOŽNO BUDE PRIJATÝ");
            // Tu môže byť ďalší zdrojový kód
        } else {
            System.out.println("NIE JE PRIJATÝ");
            System.out.println("TO JE ŠKODA!");
        }

    }
}
