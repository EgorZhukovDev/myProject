package study.serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("people.bin"))){
            Person person1 = (Person)objectInputStream.readObject();
            Person person2 = (Person)objectInputStream.readObject();
            Person person3 = (Person)objectInputStream.readObject();
            System.out.println(person1);
            System.out.println(person2);
            System.out.println(person3.toStringFull());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
