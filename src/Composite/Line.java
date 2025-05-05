package Composite;

public class Line implements DiagramComponent {
    private String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando linha com cor " + color);
    }
}