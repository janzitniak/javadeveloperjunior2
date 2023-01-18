package basicexamples;

public class LoopExample {
    public static void main(String[] args) {
        // vypis cisla od 1 do 10
        // vyuzijeme cyklus(prikaz) for

        // vypiseme neparne cisla
        for (int i = 1; i <= 10; i+=2) { // i+=2 je to iste ako i=i+2
            System.out.println(i);
        }

        System.out.println();

        // vypise cisla 1, 2, 4, 8 ako nasobky 2-och
        for (int i = 1; i <= 10; i*=2) { // i*=2 je to iste ako i=i*2
            System.out.println(i);
        }

        System.out.println();

        // vypiseme parne cisla
        for (int i = 0; i <= 10; i+=2) { // i*=2 je to iste ako i=i*2
            System.out.println(i);
        }


    }
}
