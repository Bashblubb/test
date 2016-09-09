package test.testClasses;

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
		// Anzahl = 1
		System.out.println(case1.drawStaircae(1));
		assertEquals("#", case1.drawStaircae(1).toString());
		// Anzahl = 2
		System.out.println(case1.drawStaircae(2));
		assertEquals(" #" + "\n" + "##", case1.drawStaircae(2).toString());
		// Anzahl = 6
		System.out.println(case1.drawStaircae(6));
		assertEquals("     #" + "\n" + "    ##" + "\n" + "   ###" + "\n" + "  ####" + "\n" + " #####" + "\n" + "######", case1.drawStaircae(6).toString());
	
		//Negativ-Prüfung:
		// Anzahl = -1
		System.out.println(case1.drawStaircae(-1));
		assertEquals("", case1.drawStaircae(-1).toString());	
	}

}
