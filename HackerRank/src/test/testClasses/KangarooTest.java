package test.testClasses;

import static org.junit.Assert.*;
import algorithms.Implementation.Kangaroo;

import org.junit.Test;

public class KangarooTest {

	
	@Test
	public void testKangaroos() {	
		assertEquals("YES", Kangaroo.getEntscheidung(0, 4, 3, 2));
		assertEquals("NO", Kangaroo.getEntscheidung(0, 5, 2, 3));
	}

}
