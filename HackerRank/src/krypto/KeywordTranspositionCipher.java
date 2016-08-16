package krypto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import krypto.KeywordTranscriptionCipherIF;
import krypto.Sorting;

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
	
	public static void main(String[] args) {
		buildAlphabet();		
		translate();
		writeOutput();
	}
	
	
	public static void buildAlphabet() {
		// Ursprüngliches Alphabet als Hashmap
		for (char a = 'a'; a <= 'z'; a++) {
			alphabet.put(index, a);
			index++;
		}
	}
	
	public static void translate() {
		//Anzahl an Fällen
		testcases = in.nextInt();
		for (int i = 0; i < testcases; i++) {
			keyword = in.next().toLowerCase();
			cryptext = in.next().toLowerCase();
			// Keyword sortieren und Buchstaben eindeutig machen
			keywordSorted = sortKeyword(keyword, true);
			// Unsortiertes Keyword für Alphabet
			keywordUnsorted = sortKeyword(keyword, false);
			// KeywordLänge
			keywordLength = keywordUnsorted.length();
			// EingangsKeyword zurücksetzen
			keyword = "";
			// index zurücksetzen
			index = 'a';
			// Aufbau des neuen Alphabets
			ArrayList<Character> alphabetNeu = new ArrayList<Character>();
			for (int m = 0; m < keywordLength; m++) {
				// Die ersten Buchstaben sind das unsortierte Keyword
				alphabetNeu.add(keywordUnsorted.charAt(m));
			}
			// Aufüllen der restlichen Buchstaben
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
			// Befüllung der Alphabet-Matrix
			for (int j = 0; j < keywordLength; j++) {
				zahl = j;
				for (int k = 0; k < Math.round((26 / keywordLength) + 0.5); k++) {
					if (zahl < alphabetNeu.size()) {
						matrix[j][k] = alphabetNeu.get(zahl);
					}
					zahl += keywordLength;
				}
			}
			// die final befüllte Alphabet-Matrix muss nun noch sortiert werden
			matrix = sortArray(matrix, keywordSorted, keywordLength);
			// das alphabetNeu-Array resetten und danach mit realen Werten der sortierten Matrix befüllen (Eliminierung von Leereinträgen)
			alphabetNeu.clear();
			for (int j = 0; j < keywordLength; j++) {
				for (int k = 0; k < Math.round((26 / keywordLength) + 0.5); k++) {
					// Leereinträge sollen nicht übernommen werden
					alphabetNeu.add(matrix[j][k]);
				}
			}
			// hier kommt dann eine Schleife hin die die Values der Hashmap austauscht, damit hat man das vollständige Krypto-Alphabet
			index = 'a';
			for (char buchstabe : alphabetNeu) {
				// die Leerstrings sollen nicht mit übernommen werden
				if (alphabet.containsKey(buchstabe)) {
					alphabet.put(index, buchstabe);
					index++;
				}
			}
			// den übermittelten Kryptotext anhand des neuen Alphabetes übersetzen
			for (int j = 0; j < cryptext.length(); j++) {
				char buchstabe = cryptext.charAt(j);
				if (buchstabe == ' ') {
					decryptedText.append(' ');
				} else {
					decryptedText.append(alphabet.get(buchstabe));
				}
			}
			if(i+1<testcases){
				decryptedText.append(LINE_SEPARATOR);
			}
		}
	}
	
	
	public static void writeOutput() {
		//den entschlüsselten Text ausgeben
		System.out.println(decryptedText);
	}
		
	private static char[][] sortArray(char[][] matrix, String keywordSorted, int keywordLength ){
		return matrix = Sorting.sortArray(matrix, keywordSorted, keywordLength);
	}
	
	private static String sortKeyword(String keyword, boolean sort){
		return keyword = Sorting.sortKeyword(keyword,sort);
	}
	
	
}
