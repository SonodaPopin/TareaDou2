package main;

/**
 * Clase que representa una moneda
 */
public abstract class Moneda{
    /**
     * Método para obtener el valor de la moneda
     * @return - valor de la moneda
     */
    public abstract int getValor();
    
    public String toString(){
        return "Moneda: " + "\n" + "n° serie: " + this.hashCode() + " Valor: " + getValor() + ".";
    }
}
