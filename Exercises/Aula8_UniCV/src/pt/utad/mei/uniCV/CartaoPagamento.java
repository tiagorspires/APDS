/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.utad.mei.uniCV;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hparedes
 */
public class CartaoPagamento {
    public void pagarComCredito(double valor) {
        System.out.println("Pagamento com cartão de crédito: €" + valor);
    }

    public void pagarComDebito(double valor) {
        System.out.println("Pagamento com cartão de débito: €" + valor);
    }    
}
