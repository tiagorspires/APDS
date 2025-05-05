package Decorator;

public class Camisola implements Estampavel {
    @Override
    public String descrever() {
        return "Camisola";
    }

    @Override
    public double calcularCusto() {
        return 5.0;
    }
}