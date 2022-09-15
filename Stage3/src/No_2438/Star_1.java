package No_2438;

import java.util.Scanner;

public class Star_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("");
		int s = sc.nextInt();
		String c = "*";
		for (int i = 1; i <= s; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c);
			}
			System.out.println("");
		}
	}
}