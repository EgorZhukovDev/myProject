package study.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/anduser/Desktop/TestText.txt";
        String path2 = "study/study/test2";
        try {

            Scanner input = new Scanner(path);
            File file = new File(input.nextLine());
            input = new Scanner(file);
            
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        } catch (Exception ex) {
            System.out.println("File is not found");
        }
    }
}

