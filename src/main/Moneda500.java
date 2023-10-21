package main;

public class Moneda500 extends Moneda implements Comparable<Moneda>{
    public Moneda500(){
        super();
    }
    public Moneda getSerie() {
    	return this;
    }
    public int getValor(){
        return 500;
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
    public String toString(){
        return super.toString();
    }
}
