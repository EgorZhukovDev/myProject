package patherns.factory.factory;

import patherns.factory.buttons.Button;
import patherns.factory.buttons.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
