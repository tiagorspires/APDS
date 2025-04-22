package FactoryMethod;

public class FabricaVeiculosPesados extends FabricaVeiculos {
    @Override
    public Veiculo create() {
        return new VeiculoPesado();
    }
}
