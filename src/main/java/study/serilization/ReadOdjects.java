package study.serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadOdjects {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                Person[] people = (Person[]) ois.readObject();

                System.out.println(Arrays.toString(people)) ;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
