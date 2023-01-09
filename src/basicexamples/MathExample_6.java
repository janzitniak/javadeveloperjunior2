package basicexamples;

public class MathExample_6 {
    public static void main(String[] args) {
        double maxValue = Math.max(5.2, 10.8);
        System.out.println(maxValue);

        //double randomValue = Math.random();
        //System.out.println(randomValue);


        double randomValue = 0.0000001;

        int randomIntegerNum = (int)(randomValue * 101);  // 0 to 100
        System.out.println(randomIntegerNum);


        int min = 2;
        int max = 10;
        int range = (max - min) + 1;
        int result = (int)(Math.random() * range) + min;
        System.out.println(result);

    }
}
