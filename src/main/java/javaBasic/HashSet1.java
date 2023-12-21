package javaBasic;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {

        HashSet<String> states = new HashSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        // пытаемся добавить элемент, который уже есть в коллекции
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);    // false

        System.out.printf("Set contains %d elements \n", states.size());    // 3

        for(String state : states){

            System.out.println(state);
        }
        // удаление элемента
        states.remove("Germany");

        // хеш-таблица объектов Person
        HashSet<HashSetPerson> people = new HashSet<HashSetPerson>();
        people.add(new HashSetPerson("Mike"));
        people.add(new HashSetPerson("Tom"));
        people.add(new HashSetPerson("Nick"));
        for(HashSetPerson p : people){

            System.out.println(p.getName());
        }
    }
}
class HashSetPerson {

    private String name;
    public HashSetPerson(String value){

        name=value;
    }
    String getName(){return name;}
}