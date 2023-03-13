package basicexamples.exercises;

public class ConditionalOperator {
    public static void main(String[] args) {

        int a = 10;
        String odpoved;

        if (a >= 10) {
            odpoved = "Áno, je";
        } else {
            odpoved =  "Nie, nie je";
        }

        System.out.println("Odpoveď z IF je: " + odpoved);


        String odpovedConditionalOperator = a >= 10? "Áno, je" : "Nie, nie je";
        System.out.println(odpovedConditionalOperator);


    }
}
