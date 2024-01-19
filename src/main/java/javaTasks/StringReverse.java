package javaTasks;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("### StringBuilder для переворота строки ###");
        String st = "Задача1";
        StringBuilder stB = new StringBuilder();
        stB.append(st);
        stB = stB.reverse();       // используем StringBuilder для переворота строки
        System.out.println(stB);

        System.out.println("### Cтроку в массив символов, затем выводим символы на экран в обратном порядке ###");
        String st2 = "Учимся программировать";
        char symbols[] = st2.toCharArray();  // конвертируем строку в массив символов, затем выводим символы на экран в обратном порядке
        for(int x= symbols.length-1; x>=0; x--) {
            System.out.print(symbols [x]);
        }

        System.out.println("### Используем метод split для вывода строки в обратном порядке ###");
        String st3;
        Scanner scannerQ = new Scanner(System.in);
        System.out.println("Введите вашу строку:");
        st3 = scannerQ.nextLine();
        String[] temp = st3.split("");    //используем метод split для вывода строки в обратном порядке
        for(int x= temp.length-1; x>=0; x--)
        {
            System.out.print(temp [x] + "");
        }

        System.out.println("### Сделать обмен значениями a и b ###");
        int a, b, temp2;
        System.out.println("Введите значения a и b");
        Scanner scannerQQ = new Scanner(System.in);
        a = scannerQQ.nextInt();
        b = scannerQQ.nextInt();
        System.out.println("До обмена значениями " + a + b);
        temp2 = a;
        a = b;
        b = temp2;
        System.out.println("После обмена значениями " + a + b);
    }
}
