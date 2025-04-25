/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class CartaoAdapter implements Pagamento {
    private CartaoPagamento cartao;

    public CartaoAdapter(CartaoPagamento cartao) {
        this.cartao = cartao;
    }

    @Override
    public void vendaCredito(double quantia) {
        cartao.pagarComCredito(quantia);
    }

    @Override
    public void vendaDebito(double quantia) {
        cartao.pagarComDebito(quantia);
    }
}
