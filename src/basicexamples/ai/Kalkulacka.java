package basicexamples.ai;

import java.util.Scanner;

public class Kalkulacka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Zadaj prvé číslo:");
        double prveCislo = input.nextDouble();

        System.out.println("Zadaj operáciu (+, -, *, /):");
        char operator = input.next().charAt(0);

        System.out.println("Zadaj druhé číslo:");
        double druheCislo = input.nextDouble();

        double vysledok;

        if (operator == '+') {
            vysledok = prveCislo + druheCislo;
        } else if (operator == '-') {
            vysledok = prveCislo - druheCislo;
        } else if (operator == '*') {
            vysledok = prveCislo * druheCislo;
        } else if (operator == '/') {
            vysledok = prveCislo / druheCislo;
        } else {
            System.out.println("Neplatná operácia!");
            return;
        }

        System.out.println(prveCislo + " " + operator + " " + druheCislo + " = " + vysledok);

        input.close();
    }
}
