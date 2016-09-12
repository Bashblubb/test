package test.testClasses;

import static org.junit.Assert.*;
import algorithms.Warmup.CompareTheTriplets;
import org.junit.Test;

public class CompareTheTripletsTest {
	int[] bobScores = { 5, 6, 7 };
	int[] aliceScores = { 3, 6, 10 };
	CompareTheTriplets bob = new CompareTheTriplets();
	CompareTheTriplets alice = new CompareTheTriplets();

	@Test
	public void test() {
		assertEquals(1, bob.getRating(bobScores, aliceScores));
		assertEquals(1, alice.getRating(aliceScores, bobScores));
	}

}
