import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-static-initializer-block
public class StaticBlocks {

	// insert Code
	static boolean flag = true;
	static int B, H;

	static {

		Scanner sc = new Scanner(System.in);

		B = sc.nextInt();
		H = sc.nextInt();
		try {

			if (B <= 0 || H <= 0)
				throw new Exception("Breadth and height must be positive");

		} catch (Exception e) {

			System.out.println(e);
			System.exit(0);
		}
	}

	// end Code

	// gegeben und darf nicht editiert werden
	public static void main(String[] args) {

		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}

}
