package Prototype;

import java.util.Objects;

public class SubclassPrototype extends ConcretePrototype{
    String field2;

    public SubclassPrototype(String field1, String field2){
        super(field1);
        this.field2 = field2;
    }

    public SubclassPrototype(SubclassPrototype prototype){
        super(prototype);
        this.field2 = prototype.field2;
    }

    @Override
    public Prototype clone() {
        return new SubclassPrototype(this);
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SubclassPrototype that = (SubclassPrototype) o;
        return Objects.equals(field2, that.field2);
    }

}
