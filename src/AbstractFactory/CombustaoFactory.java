package AbstractFactory;

public class CombustaoFactory implements VehicleFactory {
    public Chassi createChassi() { return new ChassiCitadino(); }
    public Motor createMotor() { return new MotorGasolina(); }
    public Roda createRoda() { return new Roda17(); }
}
