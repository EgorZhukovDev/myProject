package study.serilization;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Tom Cat");
        Person person2 = new Person(2, "Max Pain");
        Person person3 = new Person(7,"Cristiano C.", 4);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.writeObject(person3);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
