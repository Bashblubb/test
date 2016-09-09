package algorithms.Warmup;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/staircase
public class Staircase {

	static Scanner in = new Scanner(System.in);
	static int anzahl;

	public static void main(String[] args) {
		try{
		Staircase case1 = new Staircase();
		anzahl = case1.getAnzahl(in.nextInt());
		System.out.println(case1.drawStaircae(anzahl));
		}catch (Exception e) {
			System.out.println("");
		}
	}

	public int getAnzahl(int in) {
		return in;
	}

	public StringBuilder drawStaircae(int anzahl) {
		StringBuilder drawnStaircase = new StringBuilder();
		int länge = anzahl;
		int raute = 1;

		while (länge > 0) {
			// Leerzeichen hinzufügen
			for (int j = 0; j < länge - 1; j++) {
				drawnStaircase.append(" ");
			}
			// Rauten hinzufügen
			for (int i = 0; i < raute; i++) {
				drawnStaircase.append("#");
			}
			länge--;
			if (länge > 0) {
				raute++;
				drawnStaircase.append("\n");
			}
		}

		return drawnStaircase;
	}
}