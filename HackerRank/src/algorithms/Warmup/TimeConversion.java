package algorithms.Warmup;

import java.util.Scanner;

public class TimeConversion {
	//https://www.hackerrank.com/challenges/time-conversion	
	static Scanner in = new Scanner(System.in);
	static String uhrzeit = in.nextLine();
	
	public static void main(String[] args) {		
		TimeConversion time = new TimeConversion();
		System.out.println(time.convertTime(uhrzeit));
	}
	
	public String convertTime(String time){				
		//AM
		if (time.contains("AM")) {
			if (time.substring(0, 2).equals("12")) {
				time = "00" + time.replace("AM", "").substring(2, 8);
			} else {
				time = time.replace("AM", "");
			}
		}//PM
		else {
			if (time.substring(0, 2).equals("12")) {
				time = "12" + time.replace("AM", "").substring(2, 8);
			} else {
				time = parseIntToString(parseStringToInt(time.substring(0, 2)) + 12) + time.substring(2, 8);
			}
		}
		return time;
	}
	
	private int parseStringToInt(String zahl){		
		return Integer.parseInt(zahl);
	}
	
	private String parseIntToString(int zahl){
		return Integer.toString(zahl);
	}
	
	

}
