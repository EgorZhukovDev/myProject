package car;

import mocks.car.Car;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.mockito.Mockito.when;


public class CarTests {

    @Test
    void createCarSimpleTest() {
        Car car = new Car("", "", 2017, "");
        Car newCar = Mockito.mock(Car.class);
        Assertions.assertEquals(0, newCar.getYear());
        Assertions.assertEquals(2017, car.getYear());
    }

    @Test
    void getOwnerSimpleTest() {
        Car newCar = Mockito.mock(Car.class);
        when(newCar.getOwner()).thenReturn("Oleg");
        Assertions.assertEquals("Oleg", newCar.getOwner());
    }
}
