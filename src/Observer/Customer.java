package Observer;

//Concrete Observer
public class Customer implements StockObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Product product) {
        System.out.println("Notificação para " + name + ": " + product.getName() +
                " está disponível novamente. Stock atual: " + product.getStock());
    }

    public void subscribeToProduct(Product product) {
        product.subscribe(this);
    }

    public void unsubscribeFromProduct(Product product) {
        product.unsubscribe(this);
    }
}