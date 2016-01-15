package thirtyDaysofCode;

import java.util.Scanner;

public class Day6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String ausgabe = "";
		int space = n -1;
		int hashtag = 1;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < space; j++) {
				ausgabe += " ";
		}
			space--;
			for(int h =0; h<hashtag;h++){
				ausgabe += "#";
			}			
			hashtag++;
			
			System.out.println(ausgabe);
			ausgabe = "";
		}

	}
}
