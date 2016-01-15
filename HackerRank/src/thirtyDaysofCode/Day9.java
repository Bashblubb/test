package thirtyDaysofCode;

import java.util.Scanner;

public class Day9 {

	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		
	        int a = sc.nextInt();
	        int b = sc.nextInt();	        
	        int gcd=find_gcd(a,b);
	        System.out.println(gcd);
	   
	    }
	   static  int find_gcd(int a,int b){		  
		  int speichera =a;
		  int speicherb = b;
		   if(a==b){
	    	   //Austrittspunkt der Rekursion	    	   
	    	   return a;
	       }else{	    	    
	    	   a = Math.max(a,b) - Math.min(a, b);	 
	    	   b = Math.min(speichera,speicherb);	
	    	   //Rekursiver Aufruf der Funktion	 
	    	   return find_gcd(a,b);	    	  
	    	  
	       }
	  
	      }
	}


