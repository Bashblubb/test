package algorithms.Warmup;

import java.util.Scanner;

public class CompareTheTriplets {
	// https://www.hackerrank.com/challenges/compare-the-triplets
	int[] bobScores = new int[3];
	int[] aliceScores = new int[3];
	int bobRating = 0;
	int aliceRating = 0;
	Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		CompareTheTriplets bob = new CompareTheTriplets();
		CompareTheTriplets alice = new CompareTheTriplets();
		bob.setScanner(bob.bobScores);
		alice.setScanner(alice.aliceScores);
		bob.bobRating = bob.getRating(bob.bobScores, alice.aliceScores);
		alice.aliceRating = alice.getRating(alice.aliceScores, bob.bobScores);
		System.out.println(bob.bobRating + " " + alice.aliceRating);
	}
	
	public void setScanner(int[] scores){		
		scores[0] = in.nextInt();
		scores[1] = in.nextInt();
		scores[2] = in.nextInt();
	}

	public int getRating(int[] scorePersonRated, int[] scorePerson2) {
		int rating = 0;
		for (int i = 0; i < scorePersonRated.length; i++) {
			if (scorePersonRated[i] > scorePerson2[i]) {
				rating++;
			}
		}
		return rating;
	}

}
