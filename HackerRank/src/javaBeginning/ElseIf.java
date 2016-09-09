package javaBeginning;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/java-if-else
public class ElseIf {

	public static void main(String[] args) {
		// insert Code

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1)
			ans = "Weird";
		else {
			if (n >= 2 && n < 6) {
				ans = "Not Weird";
			} else if (n >= 6 && n < 21) {
				ans = "Weird";
			} else {
				ans = "Not Weird";
			}
		}
		System.out.println(ans);

	}

	// end Code

}
