package study.study;

import java.util.ArrayList;
import java.util.List;

public class Generic <T>{
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog"); //1
        animals.add("frog");
        String animal = animals.get(1);
        System.out.println(animal);
        System.out.println("====");

    }
    private T id;
    private int sum;

    Generic(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}