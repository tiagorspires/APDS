package AbstractFactory;

public class EletricoFactory implements VehicleFactory {
    public Chassi createChassi() { return new ChassiSUV(); }
    public Motor createMotor() { return new MotorEletrico(); }
    public Roda createRoda() { return new Roda19(); }
}

