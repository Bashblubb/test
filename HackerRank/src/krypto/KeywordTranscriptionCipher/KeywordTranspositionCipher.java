package krypto.KeywordTranscriptionCipher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import krypto.*;
//import krypto.Sorting;

public class KeywordTranspositionCipher implements KeywordTranscriptionCipherIF{
	
	static private String keyword = "";
	static private String keywordSorted = "";
	static private String keywordUnsorted = "";
	static private String cryptext = "";
	static private int keywordLength = 0;
	static private char index = 'a';
	static private HashMap<Character, Character> alphabet = new HashMap<>();
	static private int testcases = 0;
	static private StringBuilder decryptedText = new StringBuilder();
	static private Scanner in = new Scanner(System.in);
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	private static int iteration = 0;
	
	public static void main(String[] args) {	
		KeywordTranspositionCipher translator = new KeywordTranspositionCipher();
		testcases = in.nextInt();	
		for (int i = 0; i < testcases; i++) {
			translator.buildAlphabet();
			translator.translate();				
		}
			translator.writeOutput();
	}
		
	private void translate() {
		//Anzahl an F�llen				
			keyword = in.next().toLowerCase();	
			cryptext = in.next().toLowerCase();
			cryptext += in.nextLine().toLowerCase();
			// Keyword sortieren und Buchstaben eindeutig machen
			keywordSorted = sortKeyword(keyword, true);
			// Unsortiertes Keyword f�r Alphabet
			keywordUnsorted = sortKeyword(keyword, false);
			// KeywordL�nge
			keywordLength = keywordSorted.length();
			// EingangsKeyword zur�cksetzen
			keyword = "";
			// index zur�cksetzen
			index = 'a';
			// Aufbau des neuen Alphabets
			ArrayList<Character> alphabetNeu = new ArrayList<Character>();
			for (int m = 0; m < keywordLength; m++) {
				// Die ersten Buchstaben sind das unsortierte Keyword
				alphabetNeu.add(keywordUnsorted.charAt(m));
			}
			// Auf�llen der restlichen Buchstaben
			for (int m = 0; m < 26; m++) {
				if (!alphabetNeu.contains(index)) {
					alphabetNeu.add(index);
				}
				index++;
			}
			index = 'a';

			int zahl = 0;
			// Definition der Alphabet-Matrix
			char[][] matrix = new char[keywordLength][(int) Math.round((26 / keywordLength) + 0.5)];
			// Bef�llung der Alphabet-Matrix
			for (int j = 0; j < keywordLength; j++) {
				zahl = j;
				for (int k = 0; k < Math.round((26 / keywordLength) + 0.5); k++) {
					if (zahl < alphabetNeu.size()) {
						matrix[j][k] = alphabetNeu.get(zahl);
					}
					zahl += keywordLength;
				}
			}
			// die final bef�llte Alphabet-Matrix muss nun noch sortiert werden
			matrix = sortArray(matrix, keywordSorted, keywordLength);
			// das alphabetNeu-Array resetten und danach mit realen Werten der sortierten Matrix bef�llen (Eliminierung von Leereintr�gen)
			alphabetNeu.clear();
			for (int j = 0; j < keywordLength; j++) {
				for (int k = 0; k < Math.round((26 / keywordLength) + 0.5); k++) {
					// Leereintr�ge sollen nicht �bernommen werden
					alphabetNeu.add(matrix[j][k]);
				}
			}
			// hier kommt dann eine Schleife hin die die Values der Hashmap austauscht, damit hat man das vollst�ndige Krypto-Alphabet
			index = 'a';
			for (char buchstabe : alphabetNeu) {
				// die Leerstrings sollen nicht mit �bernommen werden
				if (alphabet.containsValue(buchstabe)) {
					alphabet.put(buchstabe,index);
					index++;
				}
			}
			// den �bermittelten Kryptotext anhand des neuen Alphabetes �bersetzen
			for (int j = 0; j < cryptext.length(); j++) {
				char buchstabe = cryptext.charAt(j);
				if (buchstabe == ' ') {
					decryptedText.append(' ');
				} else {
					decryptedText.append(alphabet.get(buchstabe));
				}
			}
			if(iteration+1<testcases){
				decryptedText.append(LINE_SEPARATOR);
			}
			iteration++;
		}
	
	
	private void buildAlphabet() {
		// Urspr�ngliches Alphabet als Hashmap
		for (char a = 'a'; a <= 'z'; a++) {
			alphabet.put(index, a);
			index++;
		}
	}	
	
	private void writeOutput() {
		String output = decryptedText.toString();
		//den entschl�sselten Text ausgeben
		System.out.println(output.toUpperCase());
	}
		
	private static char[][] sortArray(char[][] matrix, String keywordSorted, int keywordLength){
		
		return matrix = Sorting.sortArray(matrix, keywordSorted, keywordLength);
	}
	
	private static String sortKeyword(String keyword, boolean sort){
		return keyword = Sorting.sortKeyword(keyword,sort);
	}
	

}

