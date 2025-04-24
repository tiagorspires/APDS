package TestePratico1.Adapter;

public class CartaoAdapter implements Target {
    private Cartao cartao;

    @Override
    public void vendacredito(double amount) {
        cartao = new Cartao();
        cartao.payWithCredit(amount);
    }

    @Override
    public void vendadebito(double amount) {
        cartao = new Cartao();
        cartao.payWithDebit(amount);
    }
}
