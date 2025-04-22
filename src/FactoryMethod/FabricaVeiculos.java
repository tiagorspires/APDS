package FactoryMethod;

public abstract class FabricaVeiculos {
    public abstract Veiculo create();

    public void deliver(){
        Veiculo vehicle = create();
        vehicle.showMotor();
    }

}
