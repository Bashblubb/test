package Programme;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Spiele FizzBuzz: Length gibt die Anzahl an Zahlen (0-length) an. Wenn firstDivider ganzzahlig teilbar durch Zahl ist dann nimm "F" statt der Zahl, wenn seconDivider dann "B", wenn beide dann "FB". 
public class FizzBuzz {

	public static void main(String[] args) throws IOException {
//		// für CodeEval
//		File file = new File(args[0]);
//		BufferedReader buffer = new BufferedReader(new FileReader(file));
//		String line;
//		while ((line = buffer.readLine()) != null) {
//			line = line.trim();
//			String[] arrayList = line.split(" ");
//			int firstDivider = Integer.valueOf(arrayList[0]);
//			int secondDivider = Integer.valueOf(arrayList[1]);
//			int length = Integer.valueOf(arrayList[2]);//
//			for (String ergebnis : FizzBuzz(firstDivider, secondDivider, length)) {
//				System.out.print(ergebnis);
//			}
//		}

		for (String ergebnis : FizzBuzz(5, 2, 15)) {
			System.out.println(ergebnis);
		}
	}

	static ArrayList<String> FizzBuzz(int firstDivider, int secondDivider,
			int length) {
		ArrayList<String> ergebnisse = new ArrayList();

		for (int i = 0; i < length + 1; i++) {
			if (i % firstDivider == 0 && i % secondDivider == 0) {
				ergebnisse.add("FB");

			} else if (i % firstDivider == 0) {
				ergebnisse.add("F");

			} else if (i % secondDivider == 0) {
				ergebnisse.add("B");
				;
			} else {
				ergebnisse.add(String.valueOf(i));
			}
		}
		return ergebnisse;

	}
}
