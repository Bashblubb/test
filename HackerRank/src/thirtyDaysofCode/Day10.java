package thirtyDaysofCode;

import java.util.Scanner;

public class Day10 {
	//Test Case 0: n=4 evaluates to 1×2^2+0×2^1+0×2^0=1×4+0+0=100
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int T = sc.nextInt();
		StringBuilder build; 
		
		for(int i =0; i<T; i++){
			int n = sc.nextInt();
			int laenge = 0;
			int zahl = 0;
			int counter = 0;
			int ergebnis = 0;
			build = new StringBuilder();
			
			//bestimmen der Länge der Binärzahl
			while(zahl < n){				
				zahl += Math.pow(2, counter);
				laenge++;
				counter++;				
			}
			build.append("1");					
			ergebnis += Math.pow(2, laenge -1);
			for (i = laenge - 2; i >= 0; i--) {
				if (ergebnis == n) {
					//wenn Zahl getroffen werden restliche Nullen zugefügt
					build.append("0");
					//wenn Zahl < n dann addieren wir die nächste Potenz hinzu
				} else if(ergebnis < n){					
					ergebnis += Math.pow(2, i );					
					//wurde sie danach getroffen kommt eine 1 hinzu
					if (ergebnis == n){
						build.append("1");
					//ist die Zahl nun größer als n, ziehen wir sie wieder ab und schreiben eine 0 hin
					}else if(ergebnis > n){
						build.append("0");
						ergebnis-=Math.pow(2, i);
					//ist die Zahl immernoch kleiner schreiben wir eine 1 hin und lassen das ergebnis so (weitere Iteration nötig)
					}else{
						build.append("1");
					}				
				}
			}
			System.out.println(build);
		}
		
	}

}
