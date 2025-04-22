package FactoryMethod;

public class VeiculoPesado implements Veiculo {
    @Override
    public void showMotor() {
        System.out.println("Motor 5.0 - 500cv (Veículo Pesado)");
    }

}
