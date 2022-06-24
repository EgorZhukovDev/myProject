package study.animal;

public class Rabbit extends Animal implements Hide {
    public String color;
    public Rabbit(String color) {
        this.color = color;
    }

    @Override
    void toSay() {
        System.out.println("-silence-");
    }

    @Override
    void toRun() {
        System.out.println("120 km/h");
    }

    @Override
    public void toHide() {
        System.out.println("Hide in a hole");
    }

    @Override
    public void born(){
        System.out.println("Rabbit is born");
    }

    public void showColor(){
        System.out.println("Color of rabbit is " + this.color);
    }
}
