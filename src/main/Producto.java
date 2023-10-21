package main;

/**
 * Clase que representa un producto
 */
public abstract class Producto {
    /**
     * Método para saber el tipo de producto
     * @return - (String) cual producto se consumió 
     */
    public abstract String consumir();
    public String toString() {
        return "Serie: " + this.hashCode();
    }
}
