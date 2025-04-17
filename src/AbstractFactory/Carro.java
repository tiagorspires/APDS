package AbstractFactory;

public class Carro {
    private Chassi chassi;
    private Motor motor;
    private Roda roda;

    public Carro(VehicleFactory factory) {
        this.chassi = factory.createChassi();
        this.motor = factory.createMotor();
        this.roda = factory.createRoda();
    }

    public void exibir() {
        System.out.println("Carro com:");
        System.out.println("- Chassi: " + chassi.tipo());
        System.out.println("- Motor: " + motor.tipo());
        System.out.println("- Roda: " + roda.medida());
    }
}

