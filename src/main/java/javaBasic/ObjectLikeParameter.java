package javaBasic;

public class ObjectLikeParameter {
    public static void main(String[] args) {
        PersonObjLikePar person1 = new PersonObjLikePar("Olga");
        PersonObjLikePar person2 = new PersonObjLikePar("Lera");
        PersonObjLikePar person3 = new PersonObjLikePar();
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());
        changeName(person1);
        changePerson(person2);
        changePerson(person3);
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());

    }

    public static void changePerson(PersonObjLikePar p){
        p = new PersonObjLikePar("Katerina");    // p указывает на новый объект
        p.setName("Ann");
    }
    static void changeName(PersonObjLikePar person){
        person.setName("Alizee");
    }
}
class PersonObjLikePar {
    String name;

    public PersonObjLikePar(String name) {
        this.name = name;
    }

    public PersonObjLikePar() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
