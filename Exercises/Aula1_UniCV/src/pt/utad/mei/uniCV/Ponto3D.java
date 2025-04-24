/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class Ponto3D extends Ponto{
    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Ponto3D() {
        this.z = 0;
    }

    public Ponto3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    protected Ponto3D(Ponto3D p) {
        super(p);
        this.z = p.getZ();
    }

    @Override
    public String toString() {
        return "Ponto3D{" + "x=" + super.getX() + ", y=" + super.getY() + ", z=" + z + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.z;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ponto3D other = (Ponto3D) obj;
        return this.z == other.z && super.equals(other);
    }

    @Override
    protected Object clone() {
        return new Ponto3D(this); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

    
}
