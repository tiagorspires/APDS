import FactoryMethod.*;

public class Main {
    public static void main(String[] args) {
        FabricaVeiculos fabricaLigeiros = new FabricaVeiculosLigeiros();
        Veiculo carro = fabricaLigeiros.create();
        carro.showMotor();
        fabricaLigeiros.deliver();

        FabricaVeiculos fabricaPesados = new FabricaVeiculosPesados();
        Veiculo caminhao = fabricaPesados.create();
        caminhao.showMotor();
    }
}