package basicexamples.exercises;

import java.util.Random;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args)
    {
        int answer, guess;
        final int MAX = 100;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        boolean correct = false;

        System.out.println("correct " + !correct);

        answer = rand.nextInt(MAX) + 1;

        while (!correct) {
            System.out.println(
                    "Guess a number between 1 and 100: ");
            guess = in.nextInt();
            if (guess > answer) {
                System.out.println("Too high, try again");
            }
            else if (guess < answer) {
                System.out.println("Too low, try again");
            }
            else {
                System.out.println(
                        "Yes, you guessed the number.");
                correct = true;
            }
        }
        System.exit(0);
    }
}