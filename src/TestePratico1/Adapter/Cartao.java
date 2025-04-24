package TestePratico1.Adapter;

public class Cartao {

    public void payWithDebit(double amount) {
        System.out.println("Pagamento via Cartão debito: " + amount);
    }

    public void payWithCredit(double amount) {
        System.out.println("Pagamento via Cartão credito: " + amount);
    }
}
