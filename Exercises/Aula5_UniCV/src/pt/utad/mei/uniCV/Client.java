/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prototype p1=new ConcretePrototype();
        Prototype p2=new SubClassPrototype();
        Prototype p3=p2.clone();
        
        
        
        
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p2.equals(p3));
        System.out.println(p1.clone());
        System.out.println(p2.clone());
    }
    
}
