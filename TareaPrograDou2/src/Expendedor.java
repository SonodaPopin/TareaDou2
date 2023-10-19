public class Expendedor{
    public Expendedor(int numProductos){
        Deposito cocas = new Deposito<CocaCola>();
        Deposito sprites = new Deposito<Sprite>();
        Deposito fantas = new Deposito<Fanta>();
        Deposito superochos = new Deposito<Super8>();
        Deposito snickers = new Deposito<Snicker>();
        Deposito vuelto = new Deposito<Moneda>();
        
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
    	public Moneda getVuelto(){
    		return vuelto.getT();
    	}
    }
}