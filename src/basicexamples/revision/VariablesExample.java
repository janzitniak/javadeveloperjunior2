package basicexamples.revision;

/*
 Trieda vypíše nasledujúci text do konzoly, pričom hodnoty ako dátum, známka, rok a aktuálny dátum môže použivateľ meniť cez premenné.
 Text bude vyzerať nasledovne:
 Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do nového zamestnania ako Java programátor.
 V Bratislave dňa 18.06.2022
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class VariablesExample {
    public static void main(String[] args) {
        String text1 = "Študent Jozef Mrkvička sa narodil ";
        String date = "03.03.2000";
        String text2 = ", z maturitnej skúšky má známku ";
        float grade = 1.5f; //TODO Print grade with comma
        grade = grade + 0.5f; // Increasing grade to +0.5, also this is same: grade += 0.5f;

        String gradeWithComma = String.format("%.1f",grade); // Reformat grade to slovak format
        String text3 = " a od septembra ";
        int year = 2022;
        String text4 = " nastúpi do nového zamestnania ako Java programátor.\n";
        String text5 = "\tV Bratislave dňa ";

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

    }
}
