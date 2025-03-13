
package personaTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import persona.Persona;
import persona.invalidadEdadException;
import persona.pesoInvalidoException;



	class testing { 
		
			private static Persona p1 = new Persona();;
			private static Persona p2 = new Persona("Pepe",24,'H');
			private static Persona p3 = new Persona("pili",17,'H');
			private static Persona p4 = new Persona("Koi",-2,'M');
			private static Persona p5 = new Persona("Luca",24,'H',120,1.5);
			private static Persona p6 = new Persona("Andi",17,'H',40,1.55);
			private static Persona p7 = new Persona("Juanjo",25,'M',78,1.85);
			private static Persona p8 = new Persona("Andi",17,'H',9,1.55);
			private static Persona p9 = new Persona("Lucius",20,'M',78,0.90);
			private static Persona p10 = new Persona("Harry",17,'H',9,1.55);

		
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
	
	@Test
	void testCreaccionConstructor() {
		assertThrows("el peso introducido no es valido",p9);
		assertThrows("La altura que has introducido no es valida",p10);
	}
	
	
	@Test
	void testCalcularIMC() {
		assertEquals(p5.SOBREPESO,p5.calcularIMC());
		assertEquals(p6.INFRAPESO,p6.calcularIMC());
		assertEquals(p7.PESO_IDEAL,p7.calcularIMC());
		assertNotEquals(p5.PESO_IDEAL,p5.calcularIMC());
		assertNotEquals(p6.PESO_IDEAL,p6.calcularIMC());
		assertNotEquals(p7.INFRAPESO,p7.calcularIMC());
		}
	
	
}
