package study.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Stream{

    public static void main(String[] args) {
        // применим Stream API:
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println(count);
        System.out.println("=================================================================");

        // Создание потока данных
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        cities.stream() // получаем поток
                .filter(s->s.length()==6) // применяем фильтрацию по длине строки (лямбда)
                .forEach(s->System.out.println(s)); // выводим отфильтрованные строки на консоль
        System.out.println("=================================================================");

        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P",
                "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
                "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6",
                "Pixel 2");

        phones.stream()
                .filter(p->p.length()<12)
                .sorted() // сортировка по возрастанию
                .forEach(s->System.out.println(s));
        System.out.println("=================================================================");

        // лямбда выражение
        Operationable operation1 = (int x, int y)-> x + y;
        Operationable operation2 = (int x, int y)-> x - y;
        Operationable operation3 = (int x, int y)-> x * y;

        System.out.println(operation1.calculate(20, 10)); //30
        System.out.println(operation2.calculate(20, 10)); //10
        System.out.println(operation3.calculate(20, 10)); //200

        System.out.println("=================================================================");
        // Mногопоточность
        Thread t = Thread.currentThread(); // получаем главный поток
        System.out.println(t.getName()); // main
    };
}