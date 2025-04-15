package Repository;

import java.util.LinkedList;

public class PoolConnections {
    private LinkedList<Connection> free;
    private LinkedList<Connection> inUse = new LinkedList<>();

    public PoolConnections(int size) {
        free = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            free.add(new Connection(i));
        }
    }

    public Connection getConnection() {
        if (!free.isEmpty()) {
            inUse.add(free.getFirst());
        }else{
            this.duplicate();
        }

        return free.removeFirst();
    }

    public void disconnect(Connection connection) {
        inUse.remove(connection);
        free.addLast(connection);
    }

    public void duplicate() {
        for (int i = inUse.size(); i < inUse.size()*2; i++) {
            free.addLast(new Connection(i));
        }
    }
}
