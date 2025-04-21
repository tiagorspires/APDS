package TestePratico1.AbstractFactory;

public class WindowsTextbox implements Textbox {
    @Override
    public String render() {
        return "Windows Textbox";
    }
}
