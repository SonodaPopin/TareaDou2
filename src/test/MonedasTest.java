package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import main.Moneda;
import main.Moneda100;
import main.Moneda500;
import main.Moneda1000;
import main.Moneda1500;

class MonedasTest {

	@Test
	public void testMonedas100() {
		Moneda m = new Moneda100();
		assertEquals(100,m.getValor());
	}
	
	@Test
	public void testMonedas500() {
		Moneda m = new Moneda500();
		assertEquals(500,m.getValor());
	}
	
	@Test
	public void testMonedas1000() {
		Moneda m = new Moneda1000();
		assertEquals(1000,m.getValor());
	}
	
	@Test
	public void testMonedas1500() {
		Moneda m = new Moneda1500();
		assertEquals(1500,m.getValor());
	}
	
	@Test
	public void testInterfazComparable() {
		ArrayList<Moneda> m = new ArrayList<>();
		m.add(new Moneda500());
		m.add(new Moneda1500());
		m.add(new Moneda1000());
		m.add(new Moneda100());
		
		System.out.println(m);
		Collections.sort(m);
		assertNotNull(m);
		System.out.println(m);
	}
	

}
