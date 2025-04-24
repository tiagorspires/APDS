/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public abstract class AbstractFactory {
    public abstract Calcoes criaCalcoes(boolean alternativo);
    public abstract Camisola criaCamisola(boolean alternativo, int numero);
}
