package Builder;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaPepperoniBuilder implements PizzaBuilder {
    private Pizza pizza;

    @Override
    public void reset() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildMassa() {
        this.pizza.setMassa("tradicional");
    }

    @Override
    public void buildMolho() {
        this.pizza.setMolho("tomate com especiarias");
    }

    @Override
    public void buildCoberturas() {
        this.pizza.setCoberturas(Arrays.asList("pepperoni", "queijo mussarela", "orégano"));
    }

    @Override
    public Pizza getResult() {
        return this.pizza;
    }
}
