import java.util.Scanner;

public class KaprekarNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long zahl1 = in.nextInt();
		long zahl2 = in.nextInt();
		StringBuffer ausgabe = new StringBuffer();
	
		if (zahl1 < zahl2 && zahl2 < 100000) {

			for (long i = zahl1; i <= zahl2; i++) {
				long quadrat = i * i;
				int laenge = String.valueOf(quadrat).length();
				String quadratString = String.valueOf(quadrat);				

				if (quadrat > 9) {
					String wert1 = quadratString.substring(0, laenge / 2);
					String wert2 = quadratString.substring(laenge / 2, laenge);
					int ergebnis = Integer.valueOf(wert1) + Integer.valueOf(wert2);
					if (ergebnis == i) {			
						ausgabe.append(String.valueOf(i) + " ");
					}
				} else {
					if (i == quadrat) {
						ausgabe.append(String.valueOf(i) + " ");
					}
				}
			}
			System.out.println(ausgabe);

		} else {
			System.out.println("INVALID RANGE");
		}
	}
}
