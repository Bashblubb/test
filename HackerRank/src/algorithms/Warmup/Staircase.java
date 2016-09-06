package algorithms.Warmup;

import java.util.Scanner;

public class Staircase {

	static Scanner in = new Scanner(System.in);
	static int anzahl;

	public static void main(String[] args) {
		Staircase case1 = new Staircase();
		anzahl = case1.getAnzahl(in.nextInt());
		case1.drawStaircae(anzahl);
	}

	public int getAnzahl(int in) {
		return in;
	}

	public String drawStaircae(int anzahl) {
		String drawnStaircase = "";
		for (int i = 0; i < anzahl; i++) {
			drawnStaircase = "#";
		}
		return drawnStaircase;
	}
}