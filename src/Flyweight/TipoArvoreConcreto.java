package Flyweight;

class TipoArvoreConcreto implements TipoArvore {
    private String nome;
    private String cor;
    private String textura;

    public TipoArvoreConcreto(String nome, String cor, String textura) {
        this.nome = nome;
        this.cor = cor;
        this.textura = textura;
        System.out.println("Criando novo tipo de árvore: " + nome);
    }

    @Override
    public void renderizar(int x, int y, int altura) {
        System.out.printf("Renderizando %s (cor: %s, textura: %s) em (%d,%d) com altura %d\n",
                nome, cor, textura, x, y, altura);
    }
}
