/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class FactoryBenfica extends AbstractFactory{

    @Override
    public Calcoes criaCalcoes(boolean alternativo) {
         return new CalcoesBenfica();
    }

    @Override
    public Camisola criaCamisola(boolean alternativo, int numero) {
        return new CamisolaBenfica(alternativo, numero);
    }    
}
