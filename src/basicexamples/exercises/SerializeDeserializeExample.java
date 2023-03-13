package basicexamples.exercises;

import basicexamples.exercises.model.KnihaSpravne;

import java.io.*;

public class SerializeDeserializeExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        KnihaSpravne knihaSpravne1 = new KnihaSpravne();
        knihaSpravne1.setNazov("Motýľ");
        knihaSpravne1.setAutor("Anna Schonn");
        knihaSpravne1.setZaner("Ženský román");

        FileOutputStream fileOutputStream = new FileOutputStream("yourfile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(knihaSpravne1);
        objectOutputStream.flush();
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("yourfile.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        KnihaSpravne knihaSpravneZoSuboru = (KnihaSpravne) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(knihaSpravneZoSuboru.getNazov());
        System.out.println(knihaSpravneZoSuboru.getAutor());
        System.out.println(knihaSpravneZoSuboru.getZaner());

    }
}
