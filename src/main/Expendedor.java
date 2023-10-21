package main;

import java.util.ArrayList;

/**
 * Clase que representa un expendedor de dulces y bebidas
 */
public class Expendedor{
	private int cual;
    Deposito<Moneda> monedas = new Deposito<>();
    Deposito<CocaCola> cocas = new Deposito<>();
    Deposito<Sprite> sprites = new Deposito<>();
    Deposito<Fanta> fantas = new Deposito<>();
    Deposito<Super8> superochos = new Deposito<>();
    Deposito<Snicker> snickers = new Deposito<>();
    private ArrayList<Deposito<? extends Producto>> stock;
    
    /**
     * Método constructor que crea un expendedor y le añade productos para vender
     * @param numProductos - cantidad de cada producto para vender
     */
    public Expendedor(int numProductos){
        stock = new ArrayList<>();
        for(int i = 0; i < numProductos; i++){
            cocas.addT(new CocaCola());
            sprites.addT(new Sprite());
            fantas.addT(new Fanta());
            superochos.addT(new Super8());
            snickers.addT(new Snicker());
        }
        stock.add(cocas);
        stock.add(sprites);
        stock.add(fantas);
        stock.add(superochos);
        stock.add(snickers);
    }
    /**
     * Método para comprar un producto del expendedor
     * @param m - moneda con la que se paga
     * @param cual - producto que se desea
     * @return - producto comprado
     * @throws Exception - transacción fallida
     */
    public Producto comprarProducto(Moneda m, int cual)throws Exception {
    	if (m == null) {
    		throw new PagoIncorrectoException("Moneda no válida");
    	}
    	else if (cual < 0 || cual > 4) {
    		throw new NoHayProductoException("Producto no válido");
    	}
    	else if (stock.get(cual).getCantidad() == 0) {
    		throw new NoHayProductoException("No quedan productos");
    	}
    	else if (m.getValor()<Inventario.getPrecio(cual)) {
    		throw new PagoInsuficienteException("No tienes suficiente dinero");
    	}
    	int vuelto = m.getValor() - Inventario.getPrecio(cual);
    	this.cual = cual;
    	for (int i=0; i<vuelto/100; i++) {
    		monedas.addT(new Moneda100());
    	}
    	return stock.get(cual).getT();
    }
    
    /**
     * Método para obtener vuelto
     * @return - entrega una moneda
     */
    public Moneda getVuelto(){
    	if (monedas.getCantidad()>0) {
    	return monedas.getT();
    	}
    	else {
    		return null;
    	}
    }
public String toString() {
		return "Producto: " + stock.get(cual).getT() + ", Vuelto: " + getVuelto() + ".";
   }
    
}