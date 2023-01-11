package basicexamples;

public class ArraysExample_8 {
    public static void main(String[] args) {
        String cars[] = {"Honda", "Mazda", "Audi"}; // Add your favorite car vendor
        for (int i=0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        for (String car:cars) {
            System.out.println(car);
        }
    }
}
