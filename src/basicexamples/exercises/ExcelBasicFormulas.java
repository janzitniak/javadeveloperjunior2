package basicexamples.exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Vytvorte triedu s názvom ExcelBasicFormulas, v ktorej budú 2 základné funkcie SUM a AVERAGE, ktoré budú počítať súčet (getSum), resp. priemer hodnôt (getAverage).
        Vstup hodnôt bude cez premenné, napr. value1 a value2.
*/
public class ExcelBasicFormulas {

    public static double getSum(double [] values2) {
        // tu musi byt logika vypoctu
        double sum = 0;
        for (int i = 0; i < values2.length; i++) { // cyklus s pevnym poctom opakovani, i nadobuda hodnoty od 0 do 3
            sum = sum + values2[i]; // Java interpretuje tento riadok najprv tak, ze zoberie alebo vypocita to, co je napravo od =
        }
        return sum;
    }

    public static double getAverage(double sum, int count) {
        double average = sum / count;
        return average;
    }

    public static double getAverageFromArray(double [] values) {
        double sum = getSum(values);
        int count = values.length;
        double average = sum / count;
        return average;
    }

    public static double getAverageFromArrayWithoutSumMethod(double [] values) {
        // tato metoda vypocita aritmeticky priemer, vstupom je pole s hodnotami [] values
        double sum = 0;
        for (int i = 0; i < values.length; i++) { // cyklus s pevnym poctom opakovani, i nadobuda hodnoty od 0 do 3
            sum = sum + values[i]; // Java interpretuje tento riadok najprv tak, ze zoberie alebo vypocita to, co je napravo od =
        }
        int count = values.length;
        double average = sum / count;
        return average;
    }

    public static int getCount(double [] values) {
        int count = values.length;
        return count;
    }

    public static double getMax(double [] values) {
        Arrays.sort(values);
        double max = values[values.length-1];
        return max;
    }

    public static double getMin (double [] values) {
        Arrays.sort(values); // pole values je zoradene
        double min = values[0];
        return min;
    }

    public static void main(String[] args) {
        // Chceme vypisat vysledky nasledujucich Excel funkcii v poradi: SUM, AVERAGE, COUNT, MAX, MIN
        double[] values = {1, 2, 3}; // naplname pole s nazvom values hodnotami
        
        
        // V premennej sum zostanem posledny sucet
        System.out.println("SUM " + getSum(values));
        System.out.println("AVERAGE " + getAverageFromArrayWithoutSumMethod(values));
        System.out.println("COUNT " + getCount(values));
        System.out.println("MAX " + getMax(values));
        System.out.println("MIN " + getMin(values));

    }


    @Test
    public void testGetSum() {
        double[] values = {1, 2, 3}; // naplname pole s nazvom values hodnotami
        assertEquals(6, getSum(values));

        double[] values2 = {3,8,10,100};
        assertEquals(121, getSum(values2));
    }

    @Test
    public void testGetAverage() {
        double[] values = {1, 2, 3}; // naplname pole s nazvom values hodnotami
        assertEquals(2, getAverageFromArrayWithoutSumMethod(values));

        double[] values2 = {1,1,1};
        assertEquals(1, getAverageFromArrayWithoutSumMethod(values2));
    }

}
