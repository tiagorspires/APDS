package TestePratico1.Adapter;

public class PayPal {


    public void payWithDebit(double amount) {
        System.out.println("Pagamento via PayPal debito: " + amount);
    }

    public void payWithCredit(double amount) {
        System.out.println("Pagamento via PayPal credito: " + amount);
    }

}
