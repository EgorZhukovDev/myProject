package study.study;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("eating...");
            }
        };

        System.out.println("=====");
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog"); //1
        animals.add("frog");
        String animal = (String) animals.get(1);
        System.out.println(animal);
        System.out.println(animals);
        ableToEat.eat();
    }
}
interface AbleToEat{
    public void eat();
}
