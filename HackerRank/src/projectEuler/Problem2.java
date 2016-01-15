package projectEuler;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int ergebnis = 3;
			int speicher1 =1;
			int speicher2 =2;
			
			for (int j = 3; j < N; j++) {
															
				if(speicher1 + speicher2 == j ){
					ergebnis += j;
				}
				speicher1=speicher2;
				speicher2 =j;
				
			}
		}

	}

}
