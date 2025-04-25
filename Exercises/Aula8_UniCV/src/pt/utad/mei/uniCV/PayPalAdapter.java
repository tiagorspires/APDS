/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class PayPalAdapter implements Pagamento {
    private PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void vendaCredito(double quantia) {
        paypal.pagar(quantia, "CREDITO");
    }

    @Override
    public void vendaDebito(double quantia) {
        paypal.pagar(quantia, "DEBITO");
    }
}
