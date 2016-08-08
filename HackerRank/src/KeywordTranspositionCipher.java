import java.util.HashMap;
import java.util.Scanner;

import krypto.Sorting;

public class KeywordTranspositionCipher {
	static String keyword = "";
	static String cryptext = "";
	static char index = 'a';
	
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
		for (int i = 0; i <= testcases; i++) {
			keyword = in.next();
			cryptext = in.next();
			// Keyword sortieren und Buchstaben eindeutig machen
			keyword = Sorting.sortKeyword(keyword);
			System.out.println(keyword);			
		}
	}
}
