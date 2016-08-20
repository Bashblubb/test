package algorithms.Warmup;

import java.util.Scanner;

public class PlusMinus {	
//https://www.hackerrank.com/challenges/plus-minus
	
private static int negZahlen = 0;
private static int posZahlen = 0;
private static int nullen = 0;
private static double ergebnisNeg = 0.00;
private static double ergebnisPos = 0.00;
private static double ergebnisNullen= 0.00;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int anzahl = in.nextInt();		
		int[] zahlen = new int[anzahl];
		
		//array mit zahlen füllen
		for (int i = 0; i<anzahl; i++){
			zahlen[i] = in.nextInt();
		}	
		
		for (int zahl : zahlen){
			if(zahl < 0){
				negZahlen++;
			}else if(zahl == 0){
				nullen ++;
			}else{
				posZahlen++;
			}			
		}
		ergebnisNeg = negZahlen/anzahl;
		ergebnisPos = posZahlen/anzahl;
		ergebnisNullen = nullen/anzahl;
		System.out.println(ergebnisNeg);
		System.out.println(ergebnisPos);
		System.out.println(ergebnisNullen);
	}

}
