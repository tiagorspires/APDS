package Decorator;

public class Caneca implements Estampavel {
    @Override
    public String descrever() {
        return "Caneca";
    }

    @Override
    public double calcularCusto() {
        return 3.0;
    }
}