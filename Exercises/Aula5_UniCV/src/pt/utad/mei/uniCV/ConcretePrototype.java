/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class ConcretePrototype implements Prototype{
    private String field1="";
    
    public ConcretePrototype(ConcretePrototype p){
        this.field1=p.field1;
    }

    public ConcretePrototype() {
        //this.field1="";
    }
    
    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" + "field1=" + field1 + '}';
    }
    
}
