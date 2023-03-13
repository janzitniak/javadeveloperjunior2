package basicexamples;

public class VnutornaTrieda {
    public static void main(String[] args) {
        int i = 1;
        TriedaPreVnutornaTrieda test = new TriedaPreVnutornaTrieda() {
            public void vypis() {
                System.out.println(i);
                System.out.println("Hello World z VnutornaTrieda");
            }
        };
        test.vypis();
    }
}
