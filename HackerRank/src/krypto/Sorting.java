package krypto;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
		
	public static String sortKeyword(String keyword,boolean sort) {
		//Ziel ist es das Keyword alpühabetisch zu sortieren und nur noch eindeutige Buchstaben drin zu haben
		ArrayList<String> sortedKeyword = new ArrayList<String>();
		for (int j = 1; j <= keyword.length(); j++) {
			//nur noch eindeutige Buchstaben
			if (!sortedKeyword.contains(keyword.substring(j - 1, j))) {
				sortedKeyword.add(keyword.substring(j - 1, j));
			}
		}
		if (sort) {
			//Array sortieren
			Collections.sort(sortedKeyword);
		}	
		//Keyword-String zurücksetzen und anschließend mit sortiertem/eindeutigen Array-Werten befüllen
		keyword = "";
		for (int k = 0; k < sortedKeyword.size(); k++) {
			keyword = keyword + sortedKeyword.get(k);
		}
		return keyword;
	}
	
	public static char[][] sortArray(char[][] matrix, String keywordSorted, int keywordLength){
		//Ziel ist es die befüllte Matrix mit dem neuen Alphabet final zu sortieren
		int keywordPosition = 0;
		int posiMatrix2 = 0;
		int iteration = 0;
		char[][] matrix2 = new char[keywordSorted.length()][(int) Math.round((26/keywordLength) +0.5)];
		//wiederhole solange, bis alle Einträge der ersten Array-Dimension abgearbeitet sind
		while(iteration <keywordLength){
			for (int i=0; i< keywordSorted.length();i++){
				//wenn die erste Dimension mit dem ersten Buchstaben identisch ist fülle die neue Matrix auf
				if(matrix[i][0] == keywordSorted.charAt(keywordPosition)){				
					for(int k = 0;k<(int) Math.round((26/keywordLength) +0.5); k++){
						matrix2[posiMatrix2][k] = matrix[i][k];
					}		
					//hochsetzen der keywordPosition, ersten Dimension der neuen Matrix und der Iteration
					keywordPosition++;
					posiMatrix2++;
					iteration ++;					
				}
			}
		}		
		return matrix2;
	}
}
