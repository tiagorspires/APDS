package Decorator;

abstract class EstampagemDecorator implements Estampavel {
    protected Estampavel estampavel;

    public EstampagemDecorator(Estampavel estampavel) {
        this.estampavel = estampavel;
    }

    @Override
    public String descrever() {
        return estampavel.descrever();
    }

    @Override
    public double calcularCusto() {
        return estampavel.calcularCusto();
    }
}