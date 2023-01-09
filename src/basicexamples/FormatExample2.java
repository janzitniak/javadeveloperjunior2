package basicexamples;

public class FormatExample2 {
    public static void main(String[] args) {
        System.out.printf("Hello %s %s %n", "World", "in Java");
        System.out.println("Test - is it next line?");
        System.out.printf("baeldung%nline%nterminator");

        System.out.printf("%n%n"); // 2 empty lines

        System.out.printf("%b%n", null);
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 5.3);
        System.out.printf("%b%n", "random text");

        float number = 1.234f;
        System.out.printf("Number rounded to 2 decimal places %.2f", number);
    }
}
