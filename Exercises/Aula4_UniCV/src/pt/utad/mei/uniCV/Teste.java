/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class Teste {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory fab=new FactoryPorto();
        System.out.println("Calcoes cor " + fab.criaCalcoes(false).getCor());
        System.out.println("Camisola cor " + fab.criaCamisola(true, 22).getCor());
        
    } 
}
