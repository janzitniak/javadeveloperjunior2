package basicexamples;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        try {
            System.out.println(cars.get(4));
        } catch (Exception e) {
            //e.printStackTrace();
            // logika, resp. kod ktory bude pracovat, keby dany prikaz v try spravil chybu
            System.out.println("Prechádzaš záznamom, ktorý je za indexom poľa");
        }
    }
}
