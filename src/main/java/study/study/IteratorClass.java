package study.study;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(9);
        System.out.println(list.size());
        System.out.println("=====");
        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator.next());
        System.out.println("=====");
        System.out.println(iterator.hasNext());
        System.out.println("=====");
        System.out.println();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
