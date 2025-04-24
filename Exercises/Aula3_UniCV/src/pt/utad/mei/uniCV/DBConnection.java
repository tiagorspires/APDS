/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class DBConnection {

    public DBConnection() {
        System.out.println("Connected");
    }
    
    public void query(String s){
        System.out.println("QUERY DB: "+s);
    }
    
}
