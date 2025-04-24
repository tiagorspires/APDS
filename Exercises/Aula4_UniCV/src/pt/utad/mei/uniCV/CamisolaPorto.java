/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class CamisolaPorto extends Camisola{
    private String cor;
    public CamisolaPorto(boolean alternativo, int numero) {
        super.setNumero(numero);
        if(alternativo){
         this.cor="Laranja";
        }else{
        this.cor="Azul e branco";
        }
    }
        
    public String getCor() {
        return cor;
    }
}
