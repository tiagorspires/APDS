/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class SubClassPrototype extends ConcretePrototype{
    private String field2;

    public SubClassPrototype() {
        super();
        this.field2="";
    }
    
    public SubClassPrototype(SubClassPrototype p) {
        super(p);
        this.field2=p.field2;
    }
    public Prototype clone() {
        return new SubClassPrototype(this);
    }

//    @Override
//    public String toString() {
//        return "SubClassPrototype{" + "field2=" + field2 + '}';
//    }
    
}
