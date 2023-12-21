package javaBasic;

public class ForDoWhile {
    public static void main(String[] args) {
        //for
        for (int i = 1; i < 9; i++){
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        }
        //do while
        int j = 10;
        do{
            System.out.printf("До взрыва бомбы осталось %d секунд \n", j);
            j--;
        }
        while (j > 0);
        System.out.println("BOOOOOOMMM!!! ");

        // while
        int w = 6;
        while (w > 0){

            System.out.println("Now number is " + w + " . When it will be 0 - the end!");
            w--;
        }
        System.out.println("THE END");

        //for - if - break/continue;
        for (int i = 0; i < 10; i++){
            if (i == 5)
                break;
            System.out.println("Now number is " + i + " . When it will be 5 - it will be break!");
        }
        System.out.println("WE JUST BREAK THIS SCHET!!!");
    }
}
