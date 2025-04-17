package Reflection;

// Abstração e Herança
public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom(); // Polimorfismo (método abstrato)

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

