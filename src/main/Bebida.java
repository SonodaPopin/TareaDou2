package main;

public abstract class Bebida extends Producto{
    public Bebida(int serie){
        super(serie);
    }
    public String toString(){
        return "Bebida: " + super.toString() + ".";
    }
}
