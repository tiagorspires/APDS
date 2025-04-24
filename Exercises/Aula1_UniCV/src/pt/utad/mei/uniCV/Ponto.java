/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt.utad.mei.uniCV;

/**
 *
 * @author hparedes
 */
public class Ponto {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x>=0){
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y>=0){
            this.y = y;
        }
    }

    public Ponto() {
        this.setX(0);
        this.setY(0);
    }

    public Ponto(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    protected Ponto(Ponto p) {
        this.setX(p.getX());
        this.setY(p.getY());
    }
    
    @Override
    public String toString() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.x;
        hash = 59 * hash + this.y;
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
        final Ponto other = (Ponto) obj;
        if (this.x != other.x) {
            return false;
        }
        return this.y == other.y;
    }

    @Override
    protected Object clone() {
        return new Ponto (this);
    }
  
    
}
