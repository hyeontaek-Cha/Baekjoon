package No_2439;

import java.util.Scanner;

public class Star_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("");
		int s = sc.nextInt();
		String c = "*";
		for (int i = 1; i <= s; i++) {
			for (int j = s; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else
					System.out.print(c);
			}
			System.out.println("");
		}
	}
}