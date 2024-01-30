package patherns.builder;

import patherns.builder.builders.CarBuilder;
import patherns.builder.builders.CarManualBuilder;
import patherns.builder.cars.Car;
import patherns.builder.cars.Manual;
import patherns.builder.director.Director;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = builder.getResult();
        System.out.println("Car built by Car Type:\n" + car.getCarType());
        System.out.println("Car built by Car Fuel:\n" + car.getFuel());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
