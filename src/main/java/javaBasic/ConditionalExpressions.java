package javaBasic;

public class ConditionalExpressions {
    public static void main(String[] args) {

        int a = 5;
        a += 10;
        System.out.println(a); // 15
        a -= 3;
        System.out.println(a); // 12
        a *= 2;
        System.out.println(a); // 24
        a /= 6;
        System.out.println(a); // 4
        a <<= 4;
        System.out.println(a); // 64
        a >>= 2;      // 16
        System.out.println(a);  // 16

        System.out.println((5 > 6) || (4 < 6));// 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
        System.out.println((5 > 6) || (4 > 6)); // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
        System.out.println((5 > 6) && (4 < 6)); // 5 > 6 - false, поэтому возвращается false (4 < 6 - true, но не вычисляется)
        System.out.println((50 > 6) && (4 / 2 < 3)); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
        System.out.println((5 < 6) ^ (4 > 6)); // 5 < 6 - true, поэтому возвращается true (4 > 6 - false)
        System.out.println((50 > 6) ^ (4 / 2 < 3)); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false
    }
}
