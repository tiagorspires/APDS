package TestePratico1.AbstractFactory;

public class LinuxGUIFactory extends GUIFactory{

    @Override
    Button createButton() {
        return new LinuxButton();
    }

    @Override
    Textbox createTextbox() {
        return new LinuxTextbox();
    }
}
