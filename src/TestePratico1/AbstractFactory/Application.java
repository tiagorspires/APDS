package TestePratico1.AbstractFactory;

public class Application {
    private final Button button;
    private final Textbox textbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.textbox = factory.createTextbox();
    }

    public void renderUI() {
        System.out.println("Factory with:");
        System.out.println("- Button: " + button.render());
        System.out.println("- Textbox: " + textbox.render());
    }
}
