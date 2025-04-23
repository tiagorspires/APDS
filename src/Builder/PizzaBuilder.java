package Builder;

interface PizzaBuilder {
    void reset();
    void buildMassa();
    void buildMolho();
    void buildCoberturas();
    Pizza getResult();
}
