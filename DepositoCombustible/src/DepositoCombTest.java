import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

public class DepositoCombTest {
	private int depMax;
	private int depNivel;

	@Test
	public void testDepositoCombustible() {
		int res=depNivel;
		assertEquals(20,res);
	}
	
	@Test
	public void testGetDepositoNivel() {
		int res=depNivel;
		assertEquals(0,res);
	}
	@Test
	public void testgetDepositoMax() {
		int res=depMax;
		assertEquals(40,res);
	}
	@Test
	public void testEstaVacio() {
		int res=depNivel;
		assertEquals(0,res);
	}
	@Test
	public void testEstaLleno() {
		int res=depNivel;
		assertEquals(40,res);
	}
}
