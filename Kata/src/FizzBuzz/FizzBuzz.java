package FizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		
		for (int i = 0; i< 100; i++){
			System.out.println(getAnswerFor(i));
		}

	}

	public static String getAnswerFor(int i) {

		if (i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		} else if (i % 3 == 0) {
			return "Fizz";
		} else if (i % 5 == 0) {
			return "Buzz";
		} else {
		}
		return String.valueOf(i);
	}

}
