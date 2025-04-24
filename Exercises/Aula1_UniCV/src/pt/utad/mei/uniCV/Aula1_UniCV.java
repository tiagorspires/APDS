/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.utad.mei.uniCV;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hparedes
 */
public class Aula1_UniCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            Ponto p1 = new Ponto();
            Ponto p2 = new Ponto(1, 1);
            Ponto p3 = new Ponto(-2, -2);
            Ponto p4;
            //p4 = (Ponto) p1.clone();
            p4=new Ponto (p1);
            System.out.println("p1:" + p1);
            System.out.println("p2:" + p2);
            System.out.println("p3:" + p3);
            System.out.println("p4:" + p4);
            p4.setX(1);
            System.out.println("p1==p3?: " + (p1.equals(p3)));
            System.out.println("p1==p4?: " + (p1 == p4));
            
            Ponto3D p3D_1=new Ponto3D();
            Ponto3D p3D_2=new Ponto3D(1,1,1);
            Ponto3D p3D_3=new Ponto3D(p3D_2);
            p3D_3.setY(2);
            System.out.println("p3D_1:" + p3D_1);
            System.out.println("p3D_2:" + p3D_2);
            System.out.println("p3D_3:" + p3D_3);
            System.out.println("p3D_2==p3D_3?: " + (p3D_2.equals(p3D_3)));
            
            GestorPontos gp=new GestorPontos();
            gp.adicionaPonto(p1);
            gp.adicionaPonto(p2);
            gp.adicionaPonto(p3);
            gp.adicionaPonto(p4);
            System.out.println(gp);
            
        try {
            Class c=Class.forName("pt.utad.mei.uniCV.Ponto");
            Ponto p=(Ponto) c.newInstance();
            Method m[]=c.getMethods();
            for(int i=0;i<m.length;i++){
                System.out.println(m[i].getName());
            }
            
            System.out.println("p:" + p);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Aula1_UniCV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Aula1_UniCV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Aula1_UniCV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
