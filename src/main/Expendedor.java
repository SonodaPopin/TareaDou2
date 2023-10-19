package main;

public class Expendedor{
    Deposito<Moneda> vuelto = new Deposito<>();
    Deposito<CocaCola> cocas = new Deposito<>();
    Deposito<Sprite> sprites = new Deposito<>();
    Deposito<Fanta> fantas = new Deposito<>();
    Deposito<Super8> superochos = new Deposito<>();
    Deposito<Snicker> snickers = new Deposito<>();
    public Expendedor(int numProductos){        
        for(int i = 0; i < numProductos; i++){
            cocas.addT(new CocaCola(i));
            sprites.addT(new Sprite(i));
            fantas.addT(new Fanta(i));
            superochos.addT(new Super8(i));
            snickers.addT(new Snicker(i));
        }
    }   
    public Producto comprarProducto(Moneda m, int cual) {
    	int valorMoneda = m.getValor();
    }
    public Moneda getVuelto(){
    	return vuelto.getT();
    }
}