package TestePratico1.POO;

import java.util.ArrayList;

public class Dono {
    private String name;
    private ArrayList<Animal> animals;

    public Dono(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void mostrarAnimais(){
        for (Animal animal : animals){
            animal.fazerSom();
        }
    }

    public void adicionarAnimal(Animal animal) {
        this.animals.add(animal);
    }

}
