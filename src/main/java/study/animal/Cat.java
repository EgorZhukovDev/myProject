package study.animal;

public class Cat extends Animal{
    @Override
    void toSay() {
        System.out.println("MAY");
    }

    @Override
    void toRun() {
        System.out.println("30 km/h");
    }
}
