package test;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Expendedor;
import main.Moneda1500;
import main.NoHayProductoException;
import main.PagoIncorrectoException;
import main.Moneda;

class comprarProductoTest {

@Test
@DisplayName("Test PagoIncorrectoException")
public void testPagoIncorrectoException(){
	Expendedor exp = new Expendedor(2);
    Exception exception = Assert.assertThrows(PagoIncorrectoException.class,
            ()->{
            exp.comprarProducto(null, 0);
            });
    }
@Test
@DisplayName("Test NoHayProductoException")
public void testNoHayProductoException(){
	Expendedor exp = new Expendedor(2);
    Moneda m = new Moneda1500();
	Exception exception = Assert.assertThrows(NoHayProductoException.class,
            ()->{
            exp.comprarProducto(m, 5);
            });
}
@Test
@DisplayName("Test NoHayProductoException2")
public void testNoHayProductoException2(){
	Expendedor exp = new Expendedor(0);
	Moneda m = new Moneda1500();
	Exception exception = Assert.assertThrows(NoHayProductoException.class,
	         ()->{
	         exp.comprarProducto(m, 3);
	         });
	}
@Test
@DisplayName("Test PagoInsuficienteException")
public void testPagoInsuficienteException(){
	Expendedor exp = new Expendedor(0);
	Moneda m = new Moneda1500();
	Exception exception = Assert.assertThrows(NoHayProductoException.class,
	         ()->{
	         exp.comprarProducto(m, 3);
	         });
     }
}