package TestePratico1.Adapter;

public class PayPalAdapter implements Target {
    private PayPal payPal;

    @Override
    public void vendacredito(double amount) {
        payPal = new PayPal();
        payPal.payWithCredit(amount);
    }

    @Override
    public void vendadebito(double amount) {
        payPal = new PayPal();
        payPal.payWithDebit(amount);
    }

}
