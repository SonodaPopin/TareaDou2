public class Expendedor{
    public Expendedor(int numProductos){
        cocas = new Deposito<CocaCola>();
        sprites = new Deposito<Sprite>();
        fantas = new Deposito<Fanta>();
        superochos = new Deposito<Super8>();
        snickers = new Deposito<Snicker>();
        vuelto = new Deposito<Moneda>();
        
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