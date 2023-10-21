package main;

public class Moneda1500 extends Moneda implements Comparable<Moneda>{
    public Moneda1500(){
        super();
    }
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
        return "Moneda1500: " + "\n" + "n° serie: " + this.hashCode() + " Valor: " + getValor() + ".";
    }
}
