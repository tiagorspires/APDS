package Facade;

public class Amplificador {
    public void on() { System.out.println("Amplificador ligado."); }
    public void off() { System.out.println("Amplificador desligado."); }
    public void setInput(String source) { System.out.println("Entrada do amplificador definida para: " + source); }
    public void volumeUp() { System.out.println("Volume aumentado."); }
    public void volumeDown() { System.out.println("Volume diminuído."); }
}

