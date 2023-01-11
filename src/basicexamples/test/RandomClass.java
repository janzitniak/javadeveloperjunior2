package basicexamples.test;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random randomObject = new Random();
        int randomValue = randomObject.nextInt(10) + 1;
        System.out.println(randomValue);
    }
}
