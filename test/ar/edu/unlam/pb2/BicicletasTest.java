package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicicletasTest {

	@Test
	public void testCrearUnObjetoBicicletaConCambios() {
		BiciConCambios miBici = new BiciConCambios(2, 9);
		miBici.setPlato(2);
		miBici.setPinion(9);
		assertEquals(miBici.getPlato(), 2, 0);
		assertEquals(miBici.getPinion(), 9, 0);
	}

	@Test
	public void testCrearUnObjetoBicicletaPlayera() {
		Integer i = 0;
		Playera miPlayera = new Playera();
		for (i = 0; i < 10; i++) {
			miPlayera.acelerar();
		}
		miPlayera.frenar();
		assertEquals(miPlayera.getVelocidad(), i-2, 0);

	}

	@Test
	public void testCrearUnObjetoBicicletaRuta(){
		Ruta miRutera = new Ruta(2,9);
		miRutera.setPlato(2);
		miRutera.setPinion(3);
		miRutera.setAceleracion(4);
		miRutera.acelerar();
		assertEquals(miRutera.getPlato(), 2, 0);
		assertEquals(miRutera.getAceleracion(), 4, 0);
		assertEquals(miRutera.getVelocidad(),8,0);
		
	}

	@Test
	public void testCrearUnObjetoBicicletaTriatlon() {
		Triatlon miTriatlon = new Triatlon(3,12);
		miTriatlon.setPlato(3);
		miTriatlon.setPinion(11);
		miTriatlon.acelerar();
		miTriatlon.acelerar();
		assertEquals(miTriatlon.getPlato(), 3, 0);
		assertEquals(miTriatlon.getPinion(),11,0);
		assertEquals(miTriatlon.getVelocidad(), 2, 0);
	}

	@Test
	public void testCrearUnObjetoBicicletacon16piñones() {
		Triatlon miTriatlon = new Triatlon(2, 16);
		miTriatlon.setPlato(3);
		miTriatlon.setPinion(14);
		assertNotEquals(miTriatlon.getPlato(), 3, 0);
		assertEquals(miTriatlon.getPinion(), 14, 0);
	}
	
	@Test
	public void testCrearUnObjetoBiciMountain() {
		MountainBike miMountain = new MountainBike(2, 9);
		miMountain.setPlato(2);
		miMountain.setPinion(4);
		assertEquals(miMountain.getPlato(), 2, 0);
		//assertEquals(miMountain.getPinion(), 4, 0);
	}

}