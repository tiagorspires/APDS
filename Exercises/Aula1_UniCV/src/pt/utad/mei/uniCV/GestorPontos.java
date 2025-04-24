/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

import java.util.ArrayList;

/**
 *
 * @author hparedes
 */
public class GestorPontos {
    private ArrayList<Ponto> pontos;

    public GestorPontos(ArrayList<Ponto> pontos) {
        this.pontos = pontos;
    }

    public GestorPontos() {
            pontos=new ArrayList<Ponto>();
    }
    
    void adicionaPonto(Ponto p){
        pontos.add(p);
    }

    @Override
    public String toString() {
        return "GestorPontos{" + "pontos=" + pontos + '}';
    }
    
}
