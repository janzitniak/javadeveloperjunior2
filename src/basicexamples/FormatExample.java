// Package is initialize here
package basicexamples;

public class FormatExample {
    public static void main(String[] args) {
        String name = "sonoo";
        String sf1 = String.format("name is %s", name);
        String sf2 = String.format("value is %.2f", 32.33434);
        String sf3 = String.format("value is %12.20f", 12.33434);//returns 12 char fractional part filling with 0

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);

        sf2 = String.format("changed value is %s", sf2);
        System.out.println(sf2);

        System.out.println(); // empty line in console

        String str1 = String.format("Decimal number is %d", 101); // Integer value
        String str2 = String.format("%s", "Amar Singh"); // String value
        String str3 = String.format("%f", 101.00);       // Float value
        String str4 = String.format("%x", 101);          // Hexadecimal value
        String str5 = String.format("%c", 'c');          // Char value
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
