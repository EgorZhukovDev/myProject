package javaBasic;

public class ObjectMethods {

    public static void main(String[] args) {

        LinkedListPerson tom = new LinkedListPerson("Tom");
        System.out.println(tom.toString()); //
        System.out.println(tom.hashCode());
        System.out.println(tom.getClass());
    }
}
class Person {

    private String name;

    public Person(String name){

        this.name=name;
    }

    @Override
    public String toString(){

        return "Person " + name;
    }

    @Override
    public int hashCode(){

        return 10 * name.hashCode() + 20456;
    }
}
