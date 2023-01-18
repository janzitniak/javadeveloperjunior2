package basicexamples;

public class ArrayExample {
    public static void main(String[] args) {
        int [] values = {8, 7, 3, 999};

        // odkazujeme sa na poziciu (index) pola, zapisujeme nazovPola[index], pricom index zacina vzdy 0 a konci poctom prvkov - 1
        // System.out.println(values[3]);

        // chceme vypisat vsetky hodnoty pola values EFEKTIVNE!!!
        // System.out.println(values);

        for (int i = 0; i <=3; i++) {
            System.out.println(values[i]); // vypiseme obsah pola prostrednictvom kombinacie nazovPola[i]
        }


    }
}
