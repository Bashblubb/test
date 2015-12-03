package Tests;
import Programme.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class NmodMTest extends NmodM {

	@Test
	public void testModulo() {
	assertEquals(0, modulo(4,2));
	assertEquals(1, modulo(4,3));
	assertEquals(10, modulo(10,100));
	assertEquals(0, modulo(50,10));
	}

}
