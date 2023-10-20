package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Expendedor;
import main.Moneda;
import main.Moneda100;
import main.Moneda500;
import main.Producto;

class getVueltoTest {

	@Test
	@DisplayName("Test getVuelto")
	public void testGetVuelto() throws Exception {
		Expendedor exp = new Expendedor(5);
		Moneda m = new Moneda500();
		Moneda m2 = new Moneda100();
		Producto p = exp.comprarProducto(m, 1);
		Moneda dou = exp.getVuelto();
		assertEquals(dou,dou);
	}
}
