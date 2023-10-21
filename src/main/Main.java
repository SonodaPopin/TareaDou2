package main;

public class Main {
    public static void main(String[] args) {
        Moneda m = new Moneda1500();
        Expendedor exp = new Expendedor(5);
        try{
        	Comprador Pepito = new Comprador(m, 2, exp);
        	System.out.println("Transacción exitosa, " + Pepito); 	
        }
        catch(RuntimeException e){
        	exp.monedas.addT(m);
        	System.out.println(e.getMessage());
        	exp.getVuelto();
        }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}
