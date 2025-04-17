package Reflection;

// Composição
public class Dono {
    private String nome;
    private Animal animal;

    public Dono(String nome, Animal animal) {
        this.nome = nome;
        this.animal = animal;
    }

    public void interagirComAnimal() {
        System.out.println(nome + " está com " + animal.getNome());
        animal.emitirSom();
    }
}

