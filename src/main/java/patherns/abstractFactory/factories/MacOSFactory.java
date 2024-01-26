package patherns.abstractFactory.factories;

import patherns.abstractFactory.buttons.Button;
import patherns.abstractFactory.buttons.MacOSButton;
import patherns.abstractFactory.checkboxes.Checkbox;
import patherns.abstractFactory.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
