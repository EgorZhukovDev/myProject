package patherns.builder.builders;

import patherns.builder.cars.CarType;
import patherns.builder.components.Engine;
import patherns.builder.components.GPSNavigator;
import patherns.builder.components.Transmission;
import patherns.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
