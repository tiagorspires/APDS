package AbstractFactory;

public interface VehicleFactory {
    Chassi createChassi();
    Motor createMotor();
    Roda createRoda();
}
