package study.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Octopus");
        Animal animal = new Dog("Max");
        Rabbit rabbit = new Rabbit("gray");
        Cat cat = new Cat();
        animal.toRun();
        animal.born();
        animal.toSay();

        System.out.println("=====");
        test(animal);
        test(dog);
        test(rabbit);
        test(cat);

    }

    public static void test (Animal animal){
        animal.born();
    }
}
