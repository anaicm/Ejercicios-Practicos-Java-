package claseSuma_Resta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
	void pruebaSuma1() {
		Suma s=new Suma(3,4);
		assertTrue (s.Sumar()==7);
	}
	@Test
	void pruebaSuma2() {
		Suma s1=new Suma(4,5);
		assertFalse(s1.Sumar()==6);
	}

}
