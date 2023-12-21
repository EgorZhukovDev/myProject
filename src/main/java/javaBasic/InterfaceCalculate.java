package javaBasic;

public class InterfaceCalculate {

    public static void main(String[] args) {

        Calculatable c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 4));
        System.out.println(c.sumAll(1, 2, 4));

        Stateable stateable = new WaterPipe();
        stateable.printState(1);
        stateable.printState(2);
        stateable.printState(3);
    }
}
class Calculation implements Calculatable{

}
class WaterPipe implements Stateable{

    public void printState(int n){
        if(n==OPEN)
            System.out.println("Water is opened");
        else if(n==CLOSED)
            System.out.println("Water is closed");
        else
            System.out.println("State is invalid");
    }
}
interface Stateable{

    int OPEN = 1;
    int CLOSED = 0;

    void printState(int n);
}

interface Calculatable{

    default int sum(int a, int b){
        return sumAll(a, b);
    }
    default int sum(int a, int b, int c){
        return sumAll(a, b, c);
    }

    default int sumAll(int... values){
        int result = 0;
        for(int n : values){
            result += n;
        }
        return result;
    }
}