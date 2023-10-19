package main;

public abstract class Producto {
    private int serie;
    public Producto(int serie){
        this.serie = serie;
    }
    public  int getSerie(){
        return serie;
    }
    public abstract String consumir();
    public String toString() {
        return "Serie: " + getSerie() + " Que consumiste: " + consumir() + ".";
    }
}
