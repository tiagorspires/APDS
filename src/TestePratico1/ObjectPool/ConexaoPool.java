package TestePratico1.ObjectPool;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConexaoPool {
    private LinkedList<Conexao> pool;
    private LinkedList<Conexao> inUse;


    public ConexaoPool (int n){
        pool = new LinkedList<>();
        inUse = new LinkedList<>();
        for(int i = 0; i<n; i++){
            pool.addLast(new Conexao(i));
        }
    }

    public Conexao pegar() {
        if(!pool.isEmpty()) {
            inUse.addLast(pool.removeFirst());
            return inUse.getLast();
        }
        System.out.println("Nenhuma conexão disponível no pool.");
        return null;
    }

    public void devolver(Conexao conexao) {
        if (inUse.remove(conexao)) {
            pool.addLast(conexao);
        } else {
            System.out.println("A conexão fornecida não pertence ao pool.");
        }
    }

}
