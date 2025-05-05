package Flyweight;

public class Arvore {
    private int x;
    private int y;
    private int altura;
    private TipoArvore tipo;

    public Arvore(int x, int y, int altura, String nomeTipo, String cor, String textura) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.tipo = FabricaTipoArvore.getTipoArvore(nomeTipo, cor, textura);
    }

    public void renderizar() {
        tipo.renderizar(x, y, altura);
    }
}