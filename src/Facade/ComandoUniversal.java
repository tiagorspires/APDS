package Facade;

public class ComandoUniversal {
    private Radio radio;
    private DVD dvd;
    private Amplificador amp;
    private TV tv;

    public ComandoUniversal(){
        this.radio = new Radio();
        this.dvd = new DVD();
        this.amp = new Amplificador();
        this.tv = new TV();
    }

    public void verFilmeDVD() {
        System.out.println("\n[Comando: Ver Filme DVD]");
        amp.on();
        amp.setInput("DVD");
        amp.volumeUp();
        tv.on();
        tv.setInput("DVD");
        dvd.on();
        dvd.load();
        dvd.play();
    }

    public void verCanalTV(int canal) {
        System.out.println("\n[Comando: Ver Canal TV]");
        tv.on();
        tv.setInput("TV");
        tv.setChannel(canal);
        amp.on();
        amp.setInput("TV");
    }

    public void ouvirRadio(double frequencia) {
        System.out.println("\n[Comando: Ouvir Rádio]");
        radio.on();
        radio.setFM();
        radio.setFrequency(frequencia);
        amp.on();
        amp.setInput("Rádio");
    }

    public void desligarTudo() {
        System.out.println("\n[Comando: Desligar Tudo]");
        dvd.stop();
        dvd.off();
        tv.off();
        radio.off();
        amp.off();
    }
}
