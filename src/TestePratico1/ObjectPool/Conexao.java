package TestePratico1.ObjectPool;

public class Conexao {
    private final int id;

    public Conexao(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Conexao{" + "id=" + id + '}';
    }
}
