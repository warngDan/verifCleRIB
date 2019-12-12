package verifCleRIBTest;

import static org.junit.Assert.*;

import org.junit.Test;

import verifCleRIB.Guichet;

public class GuichetTest {
	
	private final String num = "00101";

	@Test
	public void testGuichet() {
		Guichet g = new Guichet();
		assertNotNull(g);
	}

	@Test
	public void testGuichetString() {
		Guichet g = new Guichet(num);
		assertNotNull(g);
	}

	@Test
	public void testGetNumGuichet() {
		Guichet g = new Guichet();
		g.setNumGuichet(num);
		String r = g.getNumGuichet();
		assertTrue(r.equals(num));
	}

	@Test
	public void testSetNumGuichet() {
		Guichet g = new Guichet();
		g.setNumGuichet(num);
		assertEquals(num, g.getNumGuichet());
		
	}

}
