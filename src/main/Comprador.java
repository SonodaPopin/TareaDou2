package main;

/**
 * Clase que representa un comprador
 */
public class Comprador{
    private String sabor;
    private int vuelto = 0;
    /**
     * Método constructor que intenta comprar un producto
     * @param m - moneda con la que paga
     * @param cual - producto que desea comprar
     * @param exp - expendedor del cual saca el producto
     * @throws Exception - transacción fallida
     */
    public Comprador(Moneda m, int cual, Expendedor exp)throws Exception{
    	Producto compra = exp.comprarProducto(m, cual);
    	Moneda vueltoMoneda;
    	while ((vueltoMoneda = exp.getVuelto()) != null) {
    	    vuelto += vueltoMoneda.getValor();
    	}
        sabor = compra.consumir();
    }
    /**
     * Método para calcular el vuelto total
     * @return - vuelto total
     */
    public int cuantoVuelto(){
        return vuelto;
    }
    /**
     * Método para saber que se compró
     * @return - nombre del producto comprado
     */
    public String queConsumiste(){
        return sabor;
    }
    public String toString() {
    	return "Producto: " + queConsumiste() + ", Vuelto: " + cuantoVuelto() + ".";
    }
}
