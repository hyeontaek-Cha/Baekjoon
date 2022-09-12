package No_25304;

import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("");
		int X = sc.nextInt();

		System.out.print("");
		int N = sc.nextInt();

		int sum_a = 0;

		for (int i = 1; i <= N; i++) {
			System.out.print("");
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum_a += a * b;
		}
		if (X == sum_a) {
			System.out.print("Yes");
		} else
			System.out.print("No");
	}
}