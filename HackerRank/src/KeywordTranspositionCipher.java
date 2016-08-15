import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import krypto.Sorting;

public class KeywordTranspositionCipher {
	static private String keyword = "";
	static private String keywordSorted = "";
	static private String keywordUnsorted = "";
	static private String cryptext = "";
	static private int keywordLength = 0;
	static private char index = 'a';
	
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();			
		//Ursprüngliches Alphabet als Hashmap
		HashMap<Character, Character> alphabet = new HashMap<>();
		for (char a = 'a'; a <= 'z';a++){			
			alphabet.put(index, a);
			index++;			
		}
		//decode Fälle
		for (int i = 0; i < testcases; i++) {
			keyword = in.next();
			cryptext = in.next();
			// Keyword sortieren und Buchstaben eindeutig machen
			keywordSorted = sortKeyword(keyword,true);
			//Unsortiertes Keyword für Alphabet
			keywordUnsorted = sortKeyword(keyword,false);
			//KeywordLänge
			keywordLength = keywordUnsorted.length();
			//EingangsKeyword zurücksetzen
			keyword = "";
			//index zurücksetzen
			index = 'a';
			//Aufbau des neuen Alphabets
			ArrayList<Character> alphabetNeu = new ArrayList<Character>();
			for (int m = 0; m < keywordLength; m ++){
				//Die ersten Buchstaben sind das unsortierte Keyword
				alphabetNeu.add(keywordUnsorted.charAt(m));
			}
			//Aufüllen der restlichen Buchstaben
			for (int m =0; m < 26; m++){
				if (!alphabetNeu.contains(index)){
						alphabetNeu.add(index);
				}
				index++;
			}
			index = 'a';
			
			int zahl = 0;
			//Definition der Alphabet-Matrix
			char[][] matrix = new char[keywordLength][(int) Math.round((26/keywordLength) +0.5)];
			//Befüllung der Alphabet-Matrix
			for(int j = 0; j< keywordLength; j ++){	
				zahl = j;
				for(int k = 0; k< Math.round((26/keywordLength) +0.5); k++){
					if(zahl< alphabetNeu.size()){
						matrix[j][k] = alphabetNeu.get(zahl);
					}					
					zahl+=keywordLength;
				}				
			}
			//die final befüllte Alphabet-Matrix muss nun noch sortiert werden
			matrix = sortArray(matrix,keywordSorted, keywordLength);
			//das alphabetNeu-Array resetten und danach mit realen Werten der sortierten Matrix befüllen (Eliminierung von Leereinträgen)
			alphabetNeu.clear();
			char dummy;
			for (int j = 0; j < keywordLength; j++) {
				for (int k = 0; k < Math.round((26 / keywordLength) + 0.5); k++) {
					dummy = matrix[j][k];
					//Leereinträge sollen nicht übernommen werden
					if (dummy != ' ') {
						alphabetNeu.add(matrix[j][k]);
					}
					
				}
			}
			//hier kommt dann eine Schleife hin die die Values der Hashmap austauscht, damit hat man das vollständige Krypto-Alphabet
			index = 'a';
			for (char buchstabe : alphabetNeu){			
				alphabet.put(index, buchstabe);
				index++;			
			}
			
		}
	}
	
	private static char[][] sortArray(char[][] matrix, String keywordSorted, int keywordLength ){
		return matrix = Sorting.sortArray(matrix, keywordSorted, keywordLength);
	}
	
	private static String sortKeyword(String keyword, boolean sort){
		return keyword = Sorting.sortKeyword(keyword,sort);
	}
	
	
}
