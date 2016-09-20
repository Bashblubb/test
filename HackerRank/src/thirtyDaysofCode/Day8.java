package thirtyDaysofCode;

import java.util.HashMap;
import java.util.Scanner;

public class Day8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		int N = in.nextInt();
		in.nextLine();

		// Telefonbuch
		for (int i = 0; i < N; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();

			map.put(name, phone);
		}
		// Queries
		while (in.hasNext()) {
			String s = in.nextLine();
			if (map.containsKey(s)) {
				System.out.println(s + "=" + map.get(s));
			} else {
				System.out.println("Not found");
			}

		}
		in.close();
		

	}

}
