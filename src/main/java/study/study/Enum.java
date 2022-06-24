package study.study;

public class Enum {
    private static final int DOG = 1;
    private static final int CAT = 2;
    private static final int BEAR = 3;

    public static void main(String[] args) {
        EnumAnimal animal = EnumAnimal.CAT;

        EnumSeason season = EnumSeason.SPRING;

        switch (animal){
            case DOG:
                System.out.println("It is a dog");
                break;
            case CAT:
                System.out.println("It is a cat");
                break;
            case BEAR:
                System.out.println("It is a bear");
                break;
            default:
                System.out.println("It is animal");
        }

        switch (season){
            case WINTER:
                System.out.println("It is frozen a bit");
                break;
            case SPRING:
                System.out.println("So many flowers are here");
                break;
            case SUMMER:
                System.out.println("It is rather hot today");
                break;
            case AUTUMN:
                System.out.println("All trees are in gold");
            default:
                System.out.println("It is animal");
        }
    }
}
