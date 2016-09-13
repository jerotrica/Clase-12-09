package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicicletasTest {

	@Test
	public void testCrearUnObjetoBicicletaConCambios()
	{
		BiciConCambios miBici = new BiciConCambios();
		miBici.setPinion(4);
		assertEquals(miBici.getPlato(),4,0);	}
	
//	@Test
//	public void testCrearUnObjetoBicicletaPlayera()
//	{
//		Playera miPlayera = new Playera();
//	}

	@Test
	public void testCrearUnObjetoBicicletaRuta()
	{
		Ruta miRutera = new Ruta();
		miRutera.setPlato(2);
		miRutera.acelerar();
		assertEquals(miRutera.getPlato(),2,0);
		assertEquals(miRutera.getVelocidad(), 2,0);
	}
	
	@Test
	public void testCrearUnObjetoBicicletaTriatlon()
	{
		Triatlon miTriatlon = new Triatlon();
		miTriatlon.setPlato(2);
		miTriatlon.acelerar();
		assertEquals(miTriatlon.getPlato(),2,0);
		assertEquals(miTriatlon.getVelocidad(), 2,0);
	}
	
	@Test
	public void testCrearUnObjetoBicicletacon16piñones()
	{
		Triatlon miTriatlon = new Triatlon(2,16);
		miTriatlon.setPlato(3);
		miTriatlon.setPinion(14);
		assertNotEquals(miTriatlon.getPlato(),3,0);
		assertEquals(miTriatlon.getPinion(), 14,0);
	}

}