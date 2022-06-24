package study.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/anduser/Desktop/TestText2.txt");
        PrintWriter pw = new PrintWriter(file);   
        pw.println("This is the end");
        pw.close();

    }
}
