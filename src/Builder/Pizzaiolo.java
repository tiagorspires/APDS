package Builder;

public class Pizzaiolo {
    private PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder){
        this.builder = builder;
    }

    public void makePizza() {  // Remove o parâmetro 'tipo'
        builder.reset();
        builder.buildMassa();
        builder.buildMolho();
        builder.buildCoberturas();
    }


}
