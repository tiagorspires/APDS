package FactoryMethod;

public class FabricaVeiculosLigeiros extends FabricaVeiculos {
    @Override
    public Veiculo create() {
        return new VeiculoLigeiro();
    }
}
