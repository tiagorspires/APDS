/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.utad.mei.uniCV;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hparedes
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            String PESADO="pt.utad.mei.uniCV.CreatorVeiculoPesado";
            String LIGEIRO="pt.utad.mei.uniCV.CreatorVeiculoLigeiro";
            CreatorVeiculo cvl=(CreatorVeiculo) Class.forName(LIGEIRO).newInstance();
            CreatorVeiculo cvp=(CreatorVeiculo) Class.forName(PESADO).newInstance();
            Veiculo vl=cvl.createVeiculo();
            Veiculo vp=cvp.createVeiculo();
            vl.setMotor("motor ligeirinho");
            vp.setMotor("pesadão!");
            System.out.println(vl.getMotor());
            System.out.println(vp.getMotor());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
