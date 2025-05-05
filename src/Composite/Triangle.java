package Composite;

public class Triangle implements DiagramComponent {
    private String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando triângulo com cor " + color);
    }
}