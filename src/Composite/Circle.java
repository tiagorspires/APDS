package Composite;

public class Circle implements DiagramComponent {
    private String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando círculo com cor " + color);
    }
}
