/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class Singleton {

    private static Singleton instance;
    private Singleton() {
    }
    
    static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        
        return instance;
    } 
    
}
