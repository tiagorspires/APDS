package TestePratico1.AbstractFactory;

public class WindowsGUIFactory extends GUIFactory {

    @Override
    Button createButton() {
        return new WindowsButton();
    }

    @Override
    Textbox createTextbox() {
        return new WindowsTextbox();
    }
}
