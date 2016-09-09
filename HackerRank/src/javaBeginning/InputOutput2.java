package javaBeginning;
import java.util.Scanner;


public class InputOutput2 {
//https://www.hackerrank.com/challenges/java-stdin-stdout
	public static void main(String[] args) {
		
		//insert Code
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		sc.nextLine();
		String s = sc.nextLine();		
		
		//end Code
		
	    System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
	}

}
