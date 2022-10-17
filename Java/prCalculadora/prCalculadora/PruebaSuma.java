package prCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaSuma {

	@Test
	void Prueba1SumaCasoCorrecto() {
		Suma s1=new Suma (7,2);
		assertTrue(s1.Sumar()==9);
	}
	@Test
	void Prueba2SumaCasoFalso() {
		Suma s2=new Suma (2,5);
		assertFalse(s2.Sumar()==4);
	}
	

}
