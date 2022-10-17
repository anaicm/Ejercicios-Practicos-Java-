package prCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaResta {

	@Test
	void PruebaCorrecta() {
		Resta re=new Resta(7,2);
		assertTrue(re.Restar()==5);
	}

}
