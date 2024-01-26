package patherns.abstractFactory.factories;

import patherns.abstractFactory.buttons.Button;
import patherns.abstractFactory.buttons.WindowsButton;
import patherns.abstractFactory.checkboxes.Checkbox;
import patherns.abstractFactory.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
