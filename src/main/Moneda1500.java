package main;

/**
 * Clase que representa una moneda de 1500
 */
public class Moneda1500 extends Moneda implements Comparable<Moneda>{
    public int getValor() {
        return 1500;
    }
    public int compareTo(Moneda o) {
    	if (this.getValor() > o.getValor()) {
    		return 1;
    		} else if (this.getValor() < o.getValor()) {
    		return -1;
    		} else {
    		return 0;
    		}
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
