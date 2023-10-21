package main;

public class Comprador{
    private String sabor;
    private int vuelto = 0;
    public Comprador(Moneda m, int cual, Expendedor exp)throws Exception{
    	Producto compra = exp.comprarProducto(m, cual);
    	Moneda vueltoMoneda;
    	while ((vueltoMoneda = exp.getVuelto()) != null) {
    	    vuelto += vueltoMoneda.getValor();
    	}
        sabor = compra.consumir();
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queConsumiste(){
        return sabor;
    }
    public String toString() {
    	return "Producto: " + queConsumiste() + ", Vuelto: " + cuantoVuelto() + ".";
    }
}
