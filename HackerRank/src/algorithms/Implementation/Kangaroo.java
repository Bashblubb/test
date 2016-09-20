package algorithms.Implementation;

import java.util.Scanner;

public class Kangaroo {
	//https://www.hackerrank.com/challenges/kangaroos		
	static Scanner in = new Scanner(System.in);	
	static boolean entscheidung = true;
	int start;	
	int pace;
	
	
	public static void main(String[] args) {		
		Kangaroo kang1 = new Kangaroo();
		Kangaroo kang2 = new Kangaroo();		
		kang1.start = in.nextInt();		
		kang1.pace = in.nextInt();
		kang2.start = in.nextInt();
		kang2.pace = in.nextInt();
		in.close();
		System.out.println(getEntscheidung(kang1.start, kang2.start, kang1.pace, kang2.pace));			
	}

	public static String getEntscheidung(int startKang1, int startKang2, int paceKang1, int paceKang2) {
		int jumps = 0;
		while (entscheidung) {
			if (startKang1 == startKang2) {
				entscheidung = false;
				return "YES";
			}
			startKang1 = startKang1 + paceKang1;
			startKang2 = startKang2 + paceKang2;
			jumps++;
			if (jumps > 10000) {
				entscheidung = false;
			}
		}
		return "NO";
	}
}
