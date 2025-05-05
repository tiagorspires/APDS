package Composite;

import java.util.ArrayList;
import java.util.List;

public class Diagram implements DiagramComponent {
    private List<DiagramComponent> components = new ArrayList<>();
    private String color;

    public void add(DiagramComponent component) {
        components.add(component);
    }

    public void remove(DiagramComponent component) {
        components.remove(component);
    }

    public List<DiagramComponent> getChildren() {
        return new ArrayList<>(components);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        // Aplica a cor a todos os componentes filhos
        for (DiagramComponent component : components) {
            component.setColor(color);
        }
    }

    @Override
    public void draw() {
        System.out.println("Desenhando diagrama com cor " + color);
        for (DiagramComponent component : components) {
            component.draw();
        }
    }
}