package AbstractFactory;

public class TransportFactory implements VehicleFactory {
    public Chassi createChassi() {
        return new ChassiComercial();
    }
    public Motor createMotor() {
        return new MotorGasoleo();
    }

    public Roda createRoda() {
        return new Roda19();
    }
}
