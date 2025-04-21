package Prototype;

import java.util.Objects;

public class ConcretePrototype implements Prototype{
    String field1;

    public ConcretePrototype(String field) {
        this.field1 = field;
    }

    public ConcretePrototype(ConcretePrototype prototype){
        this.field1 = prototype.field1;
    }

    @Override
    public Prototype clone(){
        return new ConcretePrototype(this);
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcretePrototype that = (ConcretePrototype) o;
        return Objects.equals(field1, that.field1);
    }

}
