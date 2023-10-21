package main;

/**
 * Clase que representa un producto de tipo sprite
 */
public class Sprite extends Bebida{
    public String consumir(){
        return "sprite";
    }
    public String toString(){
        return super.toString() + ", Producto: " + consumir();
    }
}
