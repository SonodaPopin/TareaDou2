package test;

import static org.junit.Assert.assertTrue;
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
		exp.comprarProducto(m, 1);
		Moneda dou = exp.getVuelto();
		assertTrue(dou instanceof Moneda100);
	}
}
