package personaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import persona.Persona;

class testing {

	private static Persona p1 = new Persona();;
	private static Persona p2 = new Persona("Pepe",24,'H');
	private static Persona p3 = new Persona("pili",17,'H');
	


	@Test
	void testNombre() {
		p3.setNombre("Javier");
		assertEquals("Pepe",p2.getNombre());
		assertEquals("Javier",p3.getNombre());
		assertNotEquals("pili",p3.getNombre());
		
	}

}
