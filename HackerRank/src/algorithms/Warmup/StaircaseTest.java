package algorithms.Warmup;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Scanner;

import org.junit.Test;

import algorithms.Warmup.Staircase;

public class StaircaseTest {
	Staircase case1 = new Staircase();

	@Test
	public void testAnzahl() {
		assertThat("Test Anzahl Fälle", 5, is(equalTo(case1.getAnzahl(5))));
		assertEquals(10, case1.getAnzahl(10));
	}

	@Test
	public void testDrawStaircase() {
		assertEquals("#", case1.drawStaircae(1));
	}

}
