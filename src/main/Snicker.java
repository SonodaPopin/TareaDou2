package main;

/**
 * Clase que representa un producto de tipo snicker
 */
public class Snicker extends Dulce{
    public String consumir(){
        return "snicker";
    }
    public String toString(){
        return super.toString() + ", Producto: " + consumir();
    }
}
