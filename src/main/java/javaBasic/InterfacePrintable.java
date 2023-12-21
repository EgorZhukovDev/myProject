package javaBasic;

public class InterfacePrintable {
    public static void main(String[] args) {
// Интерфейсы как параметры и результаты методов
        Printable printable = createPrintable("Foreign Affairs",false);
        Printable printable2 = createPrintable("Foreign Affairs",true);
        printable.print();
        printable2.print();

        read(new SomeBook("Java for impatients", "Cay Horstmann"));
        read(new Journal("Java Dayly News"));
    }

    static void read(Printable p){

        p.print();
    }

    static Printable createPrintable(String name, boolean option){

        if(option)
            return new SomeBook(name, "Undefined");
        else
            return new Journal(name);
    }
}
interface Printable{

    void print();
}
class SomeBook implements Printable{

    String name;
    String author;

    SomeBook(String name, String author){

        this.name = name;
        this.author = author;
    }

    public void print() {

        System.out.printf("%s (%s) \n", name, author);
    }
}
class Journal implements Printable {

    private String name;

    String getName(){
        return name;
    }

    Journal(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}