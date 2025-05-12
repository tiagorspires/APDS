
import Observer.*;

public class Main {
    public static void main(String[] args) {

        Product laptop = new Product("Laptop Gamer", 0);
        Product smartphone = new Product("Smartphone Premium", 2);


        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");
        Customer charlie = new Customer("Charlie");


        alice.subscribeToProduct(laptop);
        bob.subscribeToProduct(laptop);
        charlie.subscribeToProduct(smartphone);


        System.out.println("\n--- Situação 1: Tentativa de vender laptop ---");
        laptop.sell(1);

        System.out.println("\n--- Situação 2: Repor laptop ---");
        laptop.restock(5);

        System.out.println("\n--- Situação 3: Vender smartphones ---");
        smartphone.sell(1);
        smartphone.sell(1);

        System.out.println("\n--- Situação 4: Bob se inscreve para smartphone ---");
        bob.subscribeToProduct(smartphone);

        System.out.println("\n--- Situação 5: Repor smartphone ---");
        smartphone.restock(3);
    }
}



