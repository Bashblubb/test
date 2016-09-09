package algorithms.Warmup;

import java.util.Scanner;

public class CompareTheTriplets {
	// https://www.hackerrank.com/challenges/compare-the-triplets
	static int[] bobScores = new int[3];
	static int[] aliceScores = new int[3];
	int bobRating = 0;
	int aliceRating = 0;

	// Konstruktor initialisiert Alice und Bob
	public CompareTheTriplets(int[] scores) {
		Scanner in = new Scanner(System.in);
		scores[0] = in.nextInt();
		scores[1] = in.nextInt();
		scores[2] = in.nextInt();
	}

	public static void main(String[] args) {
		CompareTheTriplets bob = new CompareTheTriplets(bobScores);
		CompareTheTriplets alice = new CompareTheTriplets(aliceScores);
		System.out.println(bob.bobScores);
	}

}
