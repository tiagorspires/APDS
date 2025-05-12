package ChainOfResponsability;


import java.text.DecimalFormat;

abstract class AbstractDispenser implements Handler {
    private Handler nextHandler;
    protected double value;
    protected String name;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public AbstractDispenser(double value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return handler;
    }

    @Override
    public void handle(double amount) {
        if (amount >= this.value) {
            int count = (int) (amount / this.value);
            double remaining = amount % this.value;
            System.out.println(count + " " + name + " de " + df.format(value) + "€");

            if (remaining > 0 && nextHandler != null) {
                nextHandler.handle(remaining);
            }
        } else if (nextHandler != null) {
            nextHandler.handle(amount);
        } else if (amount > 0) {
            System.out.println("Não é possível dispensar o valor restante: " + df.format(amount) + "€");
        }
    }
}