package Observer;

import java.util.ArrayList;
import java.util.List;

//Concrete Observable
public class Product implements ProductSubject {
    private String name;
    private int stock;
    private List<StockObserver> observers = new ArrayList<>();

    public Product(String name, int initialStock) {
        this.name = name;
        this.stock = initialStock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void restock(int quantity) {
        boolean wasOutOfStock = stock == 0;
        stock += quantity;
        System.out.println("Reposto stock de " + name + ". Novo stock: " + stock);

        if (wasOutOfStock && stock > 0) {
            notifyObservers();
        }
    }

    public void sell(int quantity) {
        if (quantity > stock) {
            System.out.println("Stock insuficiente de " + name + " para vender " + quantity);
            return;
        }
        stock -= quantity;
        System.out.println("Vendido " + quantity + " de " + name + ". Stock restante: " + stock);
    }

    @Override
    public void subscribe(StockObserver observer) {
        observers.add(observer);
        System.out.println("Cliente inscrito para notificações de " + name);
    }

    @Override
    public void unsubscribe(StockObserver observer) {
        observers.remove(observer);
        System.out.println("Cliente removido das notificações de " + name);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notificando clientes sobre reposição de " + name);
        for (StockObserver observer : observers) {
            observer.update(this);
        }
    }
}
