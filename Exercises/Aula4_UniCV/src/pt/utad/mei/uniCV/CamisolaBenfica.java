/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class CamisolaBenfica extends Camisola{
    private String cor;
    public CamisolaBenfica() {
        this.cor="Vermelho";
    }
    
    public CamisolaBenfica(boolean alternativo, int numero) {
        super.setNumero(numero);
        if(alternativo){
            this.cor="Rosita";
        }else{
            this.cor="Vermelho";
        }
    }    
        
    public String getCor() {
        return cor;
    } 
}
