package FactoryMethod;

public class VeiculoLigeiro implements Veiculo{
    @Override
    public void showMotor() {
        System.out.println("Motor 1.0 - 100cv (Veículo Ligeiro)");
    }
}
