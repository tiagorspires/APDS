/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class uniCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SistemaFaturacao sistema = new SistemaFaturacao();

        // Pagamento com cartão
        sistema.setPagamento(new CartaoAdapter(new CartaoPagamento()));
        sistema.faturarCredito(100.00);
        sistema.faturarDebito(50.00);

        // Pagamento com PayPal
        sistema.setPagamento(new PayPalAdapter(new PayPal()));
        sistema.faturarCredito(75.00);
        sistema.faturarDebito(25.00);
    }
    
}
