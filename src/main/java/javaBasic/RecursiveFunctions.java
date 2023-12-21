package javaBasic;

public class RecursiveFunctions {
    public static void main(String[] args) {
        System.out.println(factorialBetter(1));
        System.out.println(factorialBetter(2));
        System.out.println(factorialBetter(3));
        System.out.println(factorialBetter(4));
        System.out.println(factorialBetter(5));
        System.out.println(factorialBetter(6));
        System.out.println(factorialBetter(7));
        System.out.println(factorialBetter(8));
        System.out.println(factorialBetter(9));
    }

    static int factorialBetter(int x){
        int result=1;
        for (int i = 1; i <= x; i++)
        {
            result *= i;
        }
        return  result;
    }

    static int factorial(int x){

        if (x == 1){

            return 1;
        }
        return x * factorial(x - 1);
    }
}
