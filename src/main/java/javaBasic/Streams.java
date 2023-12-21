package javaBasic;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println(count);

        IntStream intStream = IntStream.of(1,2,4,5,7);
        intStream.forEach(i->System.out.println(i));

        LongStream longStream = LongStream.of(100,250,400,5843787,237);
        longStream.forEach(l->System.out.println(l));

        DoubleStream doubleStream = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
        doubleStream.forEach(d->System.out.println(d));

        // Перебор элементов. Метод forEach
        Stream <String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream.forEach(s->System.out.println(s));
        citiesStream.close();

        // Перебор элементов. Метод forEach + ::
//        Stream<String> citiesStream2 = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
//        citiesStream2.forEach(System.out::println);
//        citiesStream2.close();

        //Фильтрация. Метод filter
        Stream<String> citiesStream3 = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream3.filter(s->s.length()==6).forEach(s->System.out.println("Фильтрация по 6ти символам (filter) " + s));
        citiesStream3.close();
    }
}
