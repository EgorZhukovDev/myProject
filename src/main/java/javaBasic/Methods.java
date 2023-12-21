package javaBasic;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        System.out.println(daytime(7));     // Good morning
        System.out.println(daytime(13));    // Good after noon
        System.out.println(daytime(18));    // Good evening
        System.out.println(daytime(2));     // Good night

        sum(1, 2);
        sum(1, 2, 3);
        sum(1, 2, 3, 4);
        sum(1, 2, 3, 4, 5);

        factorial(1);
        factorial(2);
        factorial(3);
    }
    static String daytime(int hour){

        if (hour >24 || hour < 0)
            return "Invalid data";
        else if(hour > 21 || hour < 6)
            return "Good night";
        else if(hour >= 15)
            return "Good evening";
        else if(hour >= 11)
            return "Good after noon";
        else
            return "Good morning";

    }
    static void sum(int ...nums){

        int result =0;
        for(int n: nums)
            result += n;
        System.out.println("Sum of "+ Arrays.toString(nums) +" is " + result);
        System.out.printf("Sum of %s is %d\n", Arrays.toString(nums), result);

    }

    static void factorial(int x){
        int result=1;
        for (int i = 1; i <= x; i++)
        {
            result *= i;
        }
        System.out.println("factorial of "+ x +" is " + result);
    }
}
