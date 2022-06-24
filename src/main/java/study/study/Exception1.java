package study.study;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x !=0){
               throw  new ScannerException("You put number is not null");
            }
        }
    }
}
