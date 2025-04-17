
import AbstractFactory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Modelo C1 (Combustão) ====");
        VehicleFactory combustaoFactory = new CombustaoFactory();
        Carro c1 = new Carro(combustaoFactory);
        c1.exibir();

        System.out.println("\n==== Modelo Exclusive (Elétrico) ====");
        VehicleFactory eletricoFactory = new EletricoFactory();
        Carro exclusive = new Carro(eletricoFactory);
        exclusive.exibir();

        System.out.println("\n==== Modelo Transport (Gasoleo) ====");
        VehicleFactory transportFactory = new TransportFactory();
        Carro transport = new Carro(transportFactory);
        transport.exibir();
    }
}
