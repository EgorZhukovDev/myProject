package patherns.abstractFactory;

import patherns.abstractFactory.app.Application;
import patherns.abstractFactory.factories.GUIFactory;
import patherns.abstractFactory.factories.MacOSFactory;
import patherns.abstractFactory.factories.WindowsFactory;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */

public class Demo {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
