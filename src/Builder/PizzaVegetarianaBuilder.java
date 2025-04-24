package Builder;

import java.util.Arrays;

public class PizzaVegetarianaBuilder implements PizzaBuilder {
    Pizza pizza;

    @Override
    public void reset() {
        pizza = new Pizza();
    }

    @Override
    public void buildMassa() {
        this.pizza.setMassa("fina");
    }

    @Override
    public void buildMolho() {
        this.pizza.setMolho("tomate");
    }

    @Override
    public void buildCoberturas() {
        this.pizza.setCoberturas(Arrays.asList("pimentao","cebola","azeitona","cogumelos"));
    }

    @Override
    public Pizza getResult() {
        return this.pizza;
    }
}
