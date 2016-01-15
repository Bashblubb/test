import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int counter = 0;
		int T = sc.nextInt();
		int ergebnis = 0;
		String ausgabe = "";
		
		do {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int N = sc.nextInt();

			for (int i = 0; i < N; i++) {				
				ergebnis += (int) (Math.pow(2, i) * b);					
				int endergebnis = ergebnis +a;
				ausgabe +=  endergebnis + " ";			
			}
			System.out.println(ausgabe);
			ausgabe = "";
            ergebnis =0;
			counter++;
		} while (counter <= T);
	}

}
