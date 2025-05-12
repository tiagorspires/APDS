package Facade;

public class Radio {
    public void on() { System.out.println("Rádio ligado."); }
    public void off() { System.out.println("Rádio desligado."); }
    public void setAM() { System.out.println("Rádio em modo AM."); }
    public void setFM() { System.out.println("Rádio em modo FM."); }
    public void setFrequency(double freq) { System.out.println("Frequência definida para " + freq + " MHz."); }
}


