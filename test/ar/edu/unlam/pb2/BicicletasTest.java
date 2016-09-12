package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicicletasTest {

	@Test
	public void testCrearUnObjetoBicicleta()
	{
		Bicicleta miBici = new Bicicleta();
		assertEquals(miBici.getPlato(),1,0);
		//AssertEquals(miBici.getPlato(), 1,0);
	}
	
	@Test
	public void testCrearUnObjetoBicicletaPlayera()
	{
		Playera miBici = new Playera();
		assertEquals(miBici.getPlato(),1,0);
	}

	@Test
	public void testCrearUnObjetoBicicletaRuta()
	{
		Ruta miRutera = new Ruta();
		miRutera.setPlato(2);
		miRutera.acelerar();
		assertEquals(miRutera.getPlato(),1,0);
		assertEquals(miRutera.getVelocidad(), 2,0);
	}
	
	@Test
	public void testCrearUnObjetoBicicletaTriatlon()
	{
		Triatlon miTriatlon = new Triatlon();
		miTriatlon.setPlato(2);
		miTriatlon.acelerar();
		assertEquals(miTriatlon.getPlato(),1,0);
		assertEquals(miTriatlon.getVelocidad(), 2,0);
	}

}