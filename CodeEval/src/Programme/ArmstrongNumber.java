package Programme;

public class ArmstrongNumber {

	public static void main(String[] args) {
	int zahl = 153;

		boolean isNumber = validateNumbers(zahl);
		
		if (isNumber == true){
			System.out.println(zahl + " ist eine Armstrongzahl!");
		}else{
			System.out.println(zahl +" ist keine Armstrongzahl!");
		}
	}
	
	
	
	static boolean validateNumbers(int zahl){
		int ergebnis = 0;
		String s = String.valueOf(zahl);
		int[] zahlen = new int[s.length()];
		for (int i = 0; i< zahlen.length;i++){
			zahlen[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		
		for(int j = 0; j<zahlen.length;j++){
		ergebnis += Math.pow(zahlen[j], zahlen.length);
		}
		
		if(ergebnis == zahl){
			return true;
		}else{
			return false;
		}
		
	
		
		
	}

}
