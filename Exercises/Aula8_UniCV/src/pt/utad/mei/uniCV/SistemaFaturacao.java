/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class SistemaFaturacao {

    private Pagamento pagamento;

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void faturarCredito(double valor) {
        pagamento.vendaCredito(valor);
    }

    public void faturarDebito(double valor) {
        pagamento.vendaDebito(valor);
    }    
}
