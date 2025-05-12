package ChainOfResponsability;

interface Handler {
    Handler setNext(Handler handler);
    void handle(double amount);
}
