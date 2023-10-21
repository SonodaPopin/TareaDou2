package main;

public abstract class Moneda{
    public Moneda(){
    }
    public abstract Moneda getSerie();
    
    public abstract int getValor();
    
    public String toString(){
        return "Moneda: " + "\n" + "n° serie: " + getSerie() + " Valor: " + getValor() + ".";
    }
}
