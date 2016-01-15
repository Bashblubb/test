package projectEuler;

import java.util.Scanner;

public class Problem1 {

	//der Code läuft so zu langsam -> Performance-Review!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int ergebnis = 0;
			int N = sc.nextInt();

			for (int j = 0; j < N; j++) {
				if (j % 3 == 0 || j % 5 == 0) {
					ergebnis += j;
				}
			}
			System.out.println(ergebnis);

		}
	}

}
