package Repository;

public class Connection {
    private final int id;

    public Connection(int id) {
        this.id = id;
        System.out.println("Connection ID: " + id);
    }

    public void use(String user) {
        System.out.println("User: " + user + " used connection " + id);
    }
}
