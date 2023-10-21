package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.Comprador;
import main.Expendedor;
import main.Moneda;
import main.Moneda1500;
import main.Producto;

class CompradorTest {
	
	@Test
	public void testComprador() throws Exception {
		Expendedor exp = new Expendedor(5);
		
		Exception exception = Assert.assertThrows(Exception.class,
	            ()->{
	            Comprador Dou = new Comprador(null, 2, exp);
	            });
		
		System.out.println(exception);
	}
	
	@Test
	public void testCuantoVuelto() throws Exception  {
		Moneda m = new Moneda1500();
		Expendedor exp = new Expendedor(2);
		Comprador Dou = new Comprador(m, 2, exp);
		
		assertEquals(1100,Dou.cuantoVuelto());
		

		System.out.println(Dou.cuantoVuelto());
	}
	
	@Test
	public void testqueConsumiste() throws Exception  {
		Moneda m = new Moneda1500();
		Expendedor exp = new Expendedor(5);
		Comprador Dou = new Comprador(m, 2, exp);
		Producto compra = exp.comprarProducto(m, 2);
		
		assertEquals(compra.consumir(),Dou.queConsumiste());
		
		System.out.println(Dou.queConsumiste());
	}
}
