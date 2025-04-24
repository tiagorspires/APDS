/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class SingletonTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3=Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Igual s1==s2"+ (s1==s2));
        System.out.println("Igual s2==s3"+ (s2==s3));
        System.out.println("Igual s1==s3"+ (s1==s3));
        
        
        DBconnectionPool pool=DBconnectionPool.getInstance();
        DBConnection d1=pool.get();
        DBConnection d2=pool.get();
        DBConnection d3=pool.get();
        DBConnection d4=pool.get();
        DBConnection d5=pool.get();
        DBConnection d6=pool.get();
        DBConnection d7=pool.get();
//        DBConnection d8=pool.get();
//        DBConnection d9=pool.get();
//        DBConnection d10=pool.get();
//        DBConnection d11=pool.get();
//        DBConnection d12=pool.get();
        
        System.out.println("Igual d1==d2"+ (d1==d2));
        System.out.println("Igual d2==d3"+ (d2==d3));
        System.out.println("Igual d1==d3"+ (d1==d3)); 
    }
    
}
