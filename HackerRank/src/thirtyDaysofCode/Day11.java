package thirtyDaysofCode;

import java.util.Scanner;

public class Day11 {

	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		int summe1 = 0;	
		int summeFinal = 0;
		int zahl1, zahl2, zahl3, zahl4, zahl5, zahl6, zahl7;
		int test;
		int counter=0;
		boolean positive = false;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();				
				if(arr[i][j] >0){
					positive = true;
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				zahl1 = arr[i][j];
				zahl2 = arr[i][j + 1];
				zahl3 = arr[i ][j+ 2];
				zahl4 = arr[i + 1][j + 1];
				zahl5 = arr[i+ 2][j ];
				zahl6 = arr[i  + 2][j+1];
				zahl7 = arr[i + 2][j + 2];				
				summe1 = zahl1+ zahl2 + zahl3 + zahl4 + zahl5 + zahl6 + zahl7;					
				if(summe1<0 && counter==0){
					summeFinal=summe1;
				}else{
					summeFinal = Math.max(summe1, summeFinal);
				}
				counter++;
				
			}
		}

			System.out.println(summeFinal);
	
		
	}
}
