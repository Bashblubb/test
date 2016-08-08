import java.util.Scanner;


public class Datatypes {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		try {
			long a = sc.nextLong();

			if (a >= -128 && a <= 127){
				System.out.println( a+ " can be fitted in: \n*byte \n*short \n*int \n*long");
		
			
			}else if (a >= -32768 && a <= 32767){
				System.out.println( a+ " can be fitted in: \n*short \n*int \n*long");
			}else if(a >=-2147483648 && a <= 2147483647 ){
				System.out.println( a+ " can be fitted in: \n*int \n*long");
			}else {
				System.out.println( a+ " can be fitted in: \n*long");
			}
			
		} catch (Exception e) {
			
			System.out.println( sc.nextLine() + " can't be fitted anywhere.");
		}
		
		
		

		
		
	}

}
