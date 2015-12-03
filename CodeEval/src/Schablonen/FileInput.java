package Schablonen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {

	    public static void main (String[] args) throws IOException {
	        File file = new File(args[0]);
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	        	// Beispiel für eine Textdatei mit 2 Werten in einer Zeile die durch ein Komma getrennt sind!
				//Der Parser geht jede Zeile ab und schreibt die beiden Werte in ein Array --> damit kann man dann arbeiten!
	        	line = line.trim();	          
	            String[] lineArray = line.split(",");
				if (lineArray.length > 0) { 					
					int n = Integer.parseInt(lineArray[0]);
					int m = Integer.parseInt(lineArray[1]);
					
				}
	        }
	    
}
}