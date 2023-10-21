package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.CocaCola;
import main.Deposito;

class DepositoTest {
	
	@Test
	public void testDeposito() {
		Deposito<CocaCola> coca = new Deposito<>();
		for(int i = 0; i < 4; i++){
	        coca.addT(new CocaCola());
		}
		assertEquals(4,coca.getCantidad());
		
		coca.getT();
		coca.getT();
		
		assertEquals(2,coca.getCantidad());
		
	}
}
