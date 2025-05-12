package Facade;

public class TV {
    public void on() { System.out.println("TV ligada."); }
    public void off() { System.out.println("TV desligada."); }
    public void setInput(String source) { System.out.println("Entrada da TV definida para: " + source); }
    public void volumeUp() { System.out.println("Volume da TV aumentado."); }
    public void volumeDown() { System.out.println("Volume da TV diminuído."); }
    public void setChannel(int channel) { System.out.println("Canal definido para: " + channel); }
}
