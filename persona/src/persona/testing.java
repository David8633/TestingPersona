package personaTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import persona.Persona;
import persona.invalidadEdadException;

class testing {

	private static Persona p1 = new Persona();;
	private static Persona p2 = new Persona("Pepe",24,'H');
	private static Persona p3 = new Persona("pili",17,'H');
	private static Persona p4 = new Persona("Koi",-2,'M');
	


	@Test
	void testNombre() {
		p3.setNombre("Javier");
		assertEquals("Pepe",p2.getNombre());
		assertEquals("Javier",p3.getNombre());
		assertNotEquals("pili",p3.getNombre());
		
	}

	
	@Test
	void testEsMayorEdad() throws invalidadEdadException {
		assertFalse(p3.esMayorDeEdad());
		//assertFalse(p1.esMayorDeEdad());
		assertTrue(p2.esMayorDeEdad());
		assertThrows("la edad introducidad es unda edad invalida",p4.esMayorDeEdad());
		
	}
	
	
}
