package ChainOfResponsability;

public class ATMDispenser {
    private Handler chain;

    public ATMDispenser() {
        // Criar a cadeia de responsabilidade
        this.chain = new FiveHundredDispenser();
        Handler h200 = new TwoHundredDispenser();
        Handler h100 = new OneHundredDispenser();
        Handler h50 = new FiftyDispenser();
        Handler h20 = new TwentyDispenser();
        Handler h10 = new TenDispenser();
        Handler h5 = new FiveDispenser();
        Handler h2 = new TwoDispenser();
        Handler h1 = new OneDispenser();
        Handler h05 = new FiftyCentDispenser();
        Handler h02 = new TwentyCentDispenser();
        Handler h01 = new TenCentDispenser();
        Handler h005 = new FiveCentDispenser();
        Handler h002 = new TwoCentDispenser();
        Handler h001 = new OneCentDispenser();

        // Configurar a cadeia
        chain.setNext(h200)
                .setNext(h100)
                .setNext(h50)
                .setNext(h20)
                .setNext(h10)
                .setNext(h5)
                .setNext(h2)
                .setNext(h1)
                .setNext(h05)
                .setNext(h02)
                .setNext(h01)
                .setNext(h005)
                .setNext(h002)
                .setNext(h001);
    }

    public void dispense(double amount) {
        System.out.println("\nDispensando " + String.format("%.2f", amount) + "€:");
        chain.handle(amount);
    }

}