package javaBasic;

public class LambdaApp {
    public static void main(String[] args) {

        Operationable operation;
        operation = (x,y)->x+y;

        int result = operation.calculate(10, 20);
        System.out.println(result); //30

        Operationable operation1 = (int x, int y)-> x + y;
        Operationable operation2 = (int x, int y)-> x - y;
        Operationable operation3 = (int x, int y)-> x * y;
        Operationable operation4 = (int x, int y)-> {

            if(y==0)
                return 0;
            else
                return x/y;
        };

        System.out.println(operation1.calculate(20, 10)); //30
        System.out.println(operation2.calculate(20, 10)); //10
        System.out.println(operation3.calculate(20, 10)); //200
        System.out.println(operation4.calculate(20, 10)); //2
    }
}
interface Operationable{
    int calculate(int x, int y);
}
