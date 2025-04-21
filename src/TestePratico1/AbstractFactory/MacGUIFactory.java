package TestePratico1.AbstractFactory;

public class MacGUIFactory extends GUIFactory {
    @Override
    Button createButton() {
        return new MacButton();
    }

    @Override
    Textbox createTextbox() {
        return new MacTextbox();
    }
}
