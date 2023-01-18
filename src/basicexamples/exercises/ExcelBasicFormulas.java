package basicexamples.exercises;

/*
Vytvorte triedu s názvom ExcelBasicFormulas, v ktorej budú 2 základné funkcie SUM a AVERAGE, ktoré budú počítať súčet (getSum), resp. priemer hodnôt (getAverage).
        Vstup hodnôt bude cez premenné, napr. value1 a value2.
*/
public class ExcelBasicFormulas {
    public static void main(String[] args) {
        int[] values = {10, 20, 100};
        int sum = 0;

        System.out.println("Počet prvkov v poli values je: " + values.length);

        for (int i = 0; i < values.length; i++) { // cyklus s pevnym poctom opakovani, i nadobuda hodnoty od 0 do 3
            //System.out.println(values[i]);
            sum = sum + values[i]; // Java interpretuje tento riadok najprv tak, ze zoberie alebo vypocita to, co je napravo od =
            // V 1. iteracii bude sum obsahovat hodnotu 10, pretoze 0 + 10
            // V 2. iteracii bude sum obsahovat hodnotu 30, pretoze 10 + 20
            // V 3. iteracii bude sum obsahovat hodnotu 60, pretoze 30 + 30
            // V 4. iteracii bude sum obsahovat hodnotu 100, pretoze 60 + 40

        }
        // V premennej sum zostanem posledny sucet, cize 100
        System.out.println("SUM " + sum);

        double average = sum / values.length;
        System.out.println("AVERAGE " + average);

    }
}
