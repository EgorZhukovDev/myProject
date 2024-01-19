package javaBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterators1 {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        Iterator<String> iter = states.iterator();
        while(iter.hasNext()){

            System.out.println(iter.next());
        }

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Kiev");
        cities.add("Odessa");
        cities.add("Chernihiv");
        cities.add("Lviv");

        ListIterator<String> listIter = cities.listIterator();

        while(listIter.hasNext()){

            System.out.println(listIter.next());
        }
        // сейчас текущий элемент - Испания
        // изменим значение этого элемента
        listIter.set("Португалия");
        // пройдемся по элементам в обратном порядке
        while(listIter.hasPrevious()){

            System.out.println(listIter.previous());
        }
    }
}