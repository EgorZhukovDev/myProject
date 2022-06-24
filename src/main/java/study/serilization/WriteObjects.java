package study.serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Tom"), new Person(2, "Max"), new Person(3, "Den")};
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(people);
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
