package basicexamples.exercises.gui;

public class Test {
    public static void main(String[] args) {
        String vzorec = "2+3-1*10";
        String regex = "\\" + "+";
        String[] castiStringu = vzorec.split(regex);

        for (String castStringu:castiStringu) {
            System.out.println(castStringu);
        }
    }
}
