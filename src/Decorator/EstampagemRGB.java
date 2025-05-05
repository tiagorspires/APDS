package Decorator;

public class EstampagemRGB extends EstampagemDecorator {
    public EstampagemRGB(Estampavel estampavel) {
        super(estampavel);
    }

    @Override
    public String descrever() {
        return super.descrever() + " com estampagem colorida (RGB)";
    }

    @Override
    public double calcularCusto() {
        return super.calcularCusto() + 5.0;
    }
}
