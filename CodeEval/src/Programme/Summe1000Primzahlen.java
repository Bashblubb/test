package Programme;
//Printe die Summe der ersten 1000 Primzahlen
public class Summe1000Primzahlen {

	public static void main(String[] args) {
		SummePrimzahlen();
	}

	static void SummePrimzahlen() {
		int anzahlPrimzahl = 0;
		int summe = 0;

		for (int i = 1; anzahlPrimzahl < 1000; i++) {
			int counterTeilbar = 0;
			for (int j = 1; j < i + 1; j++) {
				if (i % j == 0) {
					counterTeilbar++;
				}
			}
			if (counterTeilbar == 2) {
				summe += i;
				anzahlPrimzahl++;
			}

		}
		System.out.println(summe);
	}

}
