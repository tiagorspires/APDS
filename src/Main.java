import TestePratico1.Adapter.*;


public class Main {
    public static void main(String[] args) {

        Target target = new PayPalAdapter();
        target.vendacredito(100);
        target.vendadebito(50);

        Target target2 = new CartaoAdapter();
        target2.vendacredito(200);
        target2.vendadebito(150);
    }
}