package main;

public class Comprador{
    private String sabor;
    private int vuelto;
    public Comprador(Moneda m, int cual, Expendedor exp)throws Exception{
    	Producto compra = exp.comprarProducto(m, cual);
        Moneda vueltoMoneda = exp.getVuelto();
        while(vueltoMoneda != null) {
            vuelto += vueltoMoneda.getValor();
            vueltoMoneda = exp.getVuelto();
        }
        sabor = compra.consumir();
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queConsumiste(){
        return sabor;
    }
}
