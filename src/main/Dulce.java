package main;

public abstract class Dulce extends Producto{
    public Dulce(int serie){
        super(serie);
    }
    public String toString(){
        return "Dulce: " + super.toString() + ".";
    }
}
