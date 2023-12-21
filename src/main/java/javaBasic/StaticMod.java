package javaBasic;

import net.bytebuddy.utility.RandomString;

import java.util.Random;

public class StaticMod {
        public static void main(String[] args) {

            PersonForStaticMod tom = new PersonForStaticMod();
            PersonForStaticMod bob = new PersonForStaticMod();

            tom.displayId();    // Id = 1
            bob.displayId();    // Id = 2
            System.out.println(PersonForStaticMod.counter); // 3

            // изменяем Person.counter
            PersonForStaticMod.counter = 7;

            PersonForStaticMod sam = new PersonForStaticMod();
            sam.displayId();    // Id = 8
            bob.displayId();

            // using static constance
            int radius = 60;
            System.out.printf("Radius of circle: %d \n", radius);             // 60
            System.out.printf("Area of circle: %f \n", Math.PI * radius);     // 188,4

        }
    }

    class Math {
        public static final double PI = 3.14;
}
    class PersonForStaticMod {

        private int id;
        private String name;
        static int counter=1;

        PersonForStaticMod(){
            id = counter++;
            name = "EL " + RandomString.make(7).toUpperCase();
        }

        public void displayId(){

            System.out.printf("Id: %d Name %s \n", id, name);
        }
    }

