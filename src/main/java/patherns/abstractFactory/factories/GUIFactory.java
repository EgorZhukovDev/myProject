package patherns.abstractFactory.factories;

import patherns.abstractFactory.buttons.Button;
import patherns.abstractFactory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
