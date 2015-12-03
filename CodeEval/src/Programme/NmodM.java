package Programme;

//Programmiere den Modulo-Operator!
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NmodM {

	public static void main(String[] args) throws IOException {
		{
//			//für CodeEval
//			File file = new File(args[0]);
//			BufferedReader buffer = new BufferedReader(new FileReader(file));
//			String line;
//
//			while ((line = buffer.readLine()) != null) {
//				String[] lineArray = line.split(",");
//				if (lineArray.length > 0) { 
//					// das man den Arraybereich direkt anspricht geht nur weil es pro Zeilen nur 2 Zeilen mit einem Komma gibt!
//					int n = Integer.parseInt(lineArray[0]);
//					int m = Integer.parseInt(lineArray[1]);
//					System.out.println(modulo(n, m));
//				}
//			}
			System.out.println(modulo(3, 2));
			System.out.println(modulo(3, 5));
			System.out.println(modulo(10, 3));
			System.out.println(modulo(15, 13));
		}
	}

	public static int modulo(int zahl1, int zahl2) {
		int rest = 0;
		int letzteZahl = 0;
		int zahlContainer = zahl2;

		if (zahl1 == zahl2) {
			return 0;
		} else if (zahl1 < zahl2) {
			return zahl1;
		} else {
			while (zahl1 > zahl2 || zahl1 == zahl2) {
				letzteZahl = zahl2;
				zahl2 += zahlContainer;
			}

			if (zahl1 == zahl2) {
				return 0;
			} else {
				rest = zahl1 - letzteZahl;
				return rest;
			}

		}

	}

}
