package study.animal;

public abstract class Animal {

    abstract void toSay();
    abstract void toRun();

    public void born(){
        System.out.println("Animal is born");
    }
}
