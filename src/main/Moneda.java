package main;

public abstract class Moneda{
    public Moneda(){
    }
    
    public abstract int getValor();
    
    public String toString(){
        return "Moneda: " + "\n" + "n° serie: " + this.hashCode() + " Valor: " + getValor() + ".";
    }
}
