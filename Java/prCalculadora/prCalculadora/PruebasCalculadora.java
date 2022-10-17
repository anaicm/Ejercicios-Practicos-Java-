package prCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebasCalculadora {

	@Test
	void suma() {
		Calculadora sm=new Calculadora(6,3);
		assertTrue(sm.Sumar()==9);
	}
	
	@Test
	void resta() {
		Calculadora res=new Calculadora (6,3);
		assertTrue(res.Restar()==3);
	}
	
	@Test
	void resta2() {
		Calculadora res=new Calculadora (6,3);
		assertFalse(res.Restar()==6);
	}

}
