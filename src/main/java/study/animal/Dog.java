package study.animal;

public class Dog extends Animal implements Hide {
    public String name;
    public Dog(String name) {
        this.name = name;
    }

    @Override
    void toSay() {
        System.out.println("GAV!");
    }

    @Override
    void toRun() {
        System.out.println("50 km/h");
    }

    @Override
    public void born(){
        System.out.println("Dog is born");
    }

    @Override
    public void toHide() {
        System.out.println("Hide in a booth");
    }
}
