/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.utad.mei.uniCV;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hparedes
 */
public class Aula2_UniCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Ponto p=new Ponto();
            System.out.println("Ponto: "+p);
            System.out.println("Qual a classe de p? "+p.getClass().getName());
            Class c=Class.forName("pt.utad.mei.uniCV.Ponto");
            System.out.println("Quem é c: "+c.getName());
            
            Ponto res=(Ponto) c.newInstance();
            System.out.println("Nova instancia de c: "+res); 
            
            Constructor cons[]=c.getConstructors();
            for (int i=0; i<cons.length;i++){
                if(cons[i].getParameterCount()==0){
                    Ponto ponto=(Ponto) cons[i].newInstance(null);
                    System.out.println(ponto);
                }
                System.out.println(cons[i].getName()+ " " + cons[i].getParameterCount());
            }
            Method m[]=c.getMethods();
            for (int i=0; i<m.length;i++){
                System.out.println(m[i].getName()+ " " + m[i].getParameterCount());
            }            
            
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Aula2_UniCV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Aula2_UniCV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Aula2_UniCV.class.getName()).log(Level.SEVERE, null, ex);
        
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Aula2_UniCV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(Aula2_UniCV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
