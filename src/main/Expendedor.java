package main;

import java.util.ArrayList;

public class Expendedor{
    Deposito<Moneda> monedas = new Deposito<>();
    Deposito<CocaCola> cocas = new Deposito<>();
    Deposito<Sprite> sprites = new Deposito<>();
    Deposito<Fanta> fantas = new Deposito<>();
    Deposito<Super8> superochos = new Deposito<>();
    Deposito<Snicker> snickers = new Deposito<>();
    private ArrayList<Deposito<? extends Producto>> stock;
    public Expendedor(int numProductos){
        stock = new ArrayList<>();
        for(int i = 0; i < numProductos; i++){
            cocas.addT(new CocaCola(i));
            sprites.addT(new Sprite(i));
            fantas.addT(new Fanta(i));
            superochos.addT(new Super8(i));
            snickers.addT(new Snicker(i));
        }
        stock.add(cocas);
        stock.add(sprites);
        stock.add(fantas);
        stock.add(superochos);
        stock.add(snickers);
    }   
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
    	for (int i=0; i<vuelto/100; i++) {
    		monedas.addT(new Moneda100());
    	}
    	return stock.get(cual).getT();
    }
    public Moneda getVuelto(){
    	if (monedas.getCantidad()>0) {
    	return monedas.getT();
    	}
    	else {
    		return null;
    	}
    }
}