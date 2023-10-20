package main;

public class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cual, Expendedor exp){
    	try {
    		exp.comprarProducto(m, cual);
        	Moneda vueltoMoneda = exp.getVuelto();
            while(vueltoMoneda != null) {
            	vuelto += vueltoMoneda.getValor();
            	vueltoMoneda = exp.getVuelto();
            }
    	}
    	catch (RuntimeException e) {
			exp.monedas.addT(m);
			System.out.println(e.getMessage());
			vuelto = exp.getVuelto().getValor();
		}
    	catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queconsumiste(){
        return sonido;
    }
}
