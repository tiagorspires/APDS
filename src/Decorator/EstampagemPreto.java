package Decorator;

public class EstampagemPreto extends EstampagemDecorator {
    public EstampagemPreto(Estampavel estampavel) {
        super(estampavel);
    }

    @Override
    public String descrever() {
        return super.descrever() + " com estampagem em preto";
    }

    @Override
    public double calcularCusto() {
        return super.calcularCusto() + 2.0;
    }
}
