package krypto;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	
	public static String sortKeyword(String keyword) {
		ArrayList<String> sortedKeyword = new ArrayList<String>();
		for (int j = 1; j <= keyword.length(); j++) {
			if (!sortedKeyword.contains(keyword.substring(j - 1, j))) {
				sortedKeyword.add(keyword.substring(j - 1, j));
			}
		}
		Collections.sort(sortedKeyword);
		keyword = "";
		for (int k = 0; k < sortedKeyword.size(); k++) {
			keyword = keyword + sortedKeyword.get(k);
		}
		return keyword;
	}
}
