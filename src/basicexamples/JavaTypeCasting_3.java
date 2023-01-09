package basicexamples;

public class JavaTypeCasting_3 {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // String str = myInt; // Is not possible
        // System.out.println(str);

        float myFloat = 1.234f;

        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9

        double x = 5.0;
        double x2 = 5d;

        System.out.printf("%d",x);
        System.out.printf("%d",x2);

    }
}
